package cn.edu.ptu.mall.modules.pms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.pms.model.PmsBrand;
import cn.edu.ptu.mall.modules.pms.service.PmsBrandService;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsBrandServiceImpl;
import cn.edu.ptu.mall.modules.ums.model.UmsRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandServiceImpl pmsBrandService;

    @ApiOperation("根据商品品牌分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<PmsBrand> BrandList = pmsBrandService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(BrandList));
    }

    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> showStatus(@RequestParam List<Long> ids ,
                                             @RequestParam Integer showStatus) {
        boolean BrandList = pmsBrandService.showStatus(ids,showStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/factoryStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PmsBrand> factorStatus(@RequestParam Long ids,
                                               @RequestParam Integer factoryStatus) {
        PmsBrand BrandList = pmsBrandService.factorStatus(ids,factoryStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> delete(@RequestParam(value = "keyword", required = false) String keyword,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @PathVariable("id") Long id) {
        Page<PmsBrand> BrandList = pmsBrandService.delete(keyword, pageSize, pageNum,id);
        return CommonResult.success(CommonPage.restPage(BrandList));
    }
}
