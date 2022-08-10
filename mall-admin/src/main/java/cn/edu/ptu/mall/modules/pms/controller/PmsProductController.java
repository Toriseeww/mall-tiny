package cn.edu.ptu.mall.modules.pms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.pms.DTO.PmsProductSelect;
import cn.edu.ptu.mall.modules.pms.model.PmsProduct;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsProductServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "PmsProductController", description = "商品列表管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private PmsProductServiceImpl pmsProductService;

    @ApiOperation("根据商品品牌分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> list(PmsProductSelect pmsproductselect,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<PmsProduct> ProductList = pmsProductService.getList(pmsproductselect, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(ProductList));
    }

    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProduct> updateInfo(@PathVariable("id") Long id) {
        PmsProduct pmsProduct=pmsProductService.getById(id);
        return CommonResult.success(pmsProduct);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateList(@PathVariable("id") Long id,
                                            @RequestBody PmsProduct pmsProduct) {
        Integer pmsProduct1=pmsProductService.updateList(pmsProduct);
        return CommonResult.success(pmsProduct1);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> create(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
                                                       ){
        Page<PmsProduct> pmsProduct1=pmsProductService.create(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(pmsProduct1));
    }

    @RequestMapping(value = "/update/deleteStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> delete(@RequestParam List<Long> ids,
                                        @RequestParam Integer deleteStatus) {
        boolean pmsProduct=pmsProductService.deleteById(ids,deleteStatus);
        return CommonResult.success(pmsProduct);
    }

    @RequestMapping(value = "/update/publishStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> publishStatus(@RequestParam List<Long> ids,
                                                  @RequestParam Integer publishStatus) {
        boolean BrandList = pmsProductService.publishStatus(ids,publishStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/newStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> newStatus(@RequestParam List<Long> ids,
                                              @RequestParam Integer newStatus) {
        boolean BrandList = pmsProductService.newStatus(ids,newStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/recommendStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> recommendStatus(@RequestParam List<Long> ids,
                                                 @RequestParam Integer recommendStatus) {
        boolean BrandList = pmsProductService.recommendStatus(ids,recommendStatus);
        return CommonResult.success(BrandList);
    }
}
