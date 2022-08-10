package cn.edu.ptu.mall.modules.pms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.pms.DTO.PmsproductCategoryWithChildren;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsProductCategoryServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "PmsProductCategoryController", description = "商品分类管理")
@RequestMapping("/productCategory")
public class PmsProductCategoryController {
    @Autowired
    private PmsProductCategoryServiceImpl pmsProductCategoryService;

    @GetMapping("/list/{id}")
    public CommonResult<CommonPage<PmsProductCategory>> lastList(@RequestParam(value = "keyword", required = false) String keyword,
                                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                             @PathVariable("id") Integer parentId) {
        Page<PmsProductCategory> CateList = pmsProductCategoryService.list(keyword, pageSize, pageNum,parentId);
        return CommonResult.success(CommonPage.restPage(CateList));
    }

    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult<List<PmsproductCategoryWithChildren>> listWithChildren() {
        List<PmsproductCategoryWithChildren> Children = pmsProductCategoryService.listWithChildren();
        return CommonResult.success(Children);
    }

    @GetMapping("/{id}")
    public CommonResult<PmsProductCategory> getList(@PathVariable("id") Long id) {
        PmsProductCategory CateList = pmsProductCategoryService.getList(id);
        return CommonResult.success(CateList);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public  CommonResult<CommonPage<PmsProductCategory>> delete(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                @PathVariable("id") Long id) {
        Page<PmsProductCategory> pmsProduct=pmsProductCategoryService.delete(pageSize,pageNum,id);
        return CommonResult.success(CommonPage.restPage(pmsProduct));
    }

    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PmsProductCategory> showStatus(@RequestParam Long ids,
                                                                    @RequestParam Integer showStatus) {
        PmsProductCategory BrandList = pmsProductCategoryService.showStatus(ids,showStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/navStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PmsProductCategory> factorStatus(@RequestParam Long ids,
                                                         @RequestParam Integer navStatus) {
        PmsProductCategory BrandList = pmsProductCategoryService.navStatus(ids,navStatus);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/{ids}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateList(@PathVariable("ids") Long ids,
                                            @RequestBody PmsProductCategory pmsProductCategory) {
        Integer BrandList = pmsProductCategoryService.updateList(pmsProductCategory);
        return CommonResult.success(BrandList);
    }
}
