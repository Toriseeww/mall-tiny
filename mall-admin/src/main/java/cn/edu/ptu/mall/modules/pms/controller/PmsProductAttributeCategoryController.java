package cn.edu.ptu.mall.modules.pms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.pms.DTO.PmsproductCategoryWithChildren;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttribute;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttributeCategory;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsProductAttributeCategoryServiceImpl;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsProductAttributeServiceImpl;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsProductCategoryServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@Api(tags = "PmsProductAttributeCategoryController", description = "商品类型管理")
@RequestMapping("/productAttribute")
public class PmsProductAttributeCategoryController {
    @Autowired
    private PmsProductAttributeCategoryServiceImpl pmsProductAttributeCategoryService;

    @Autowired
    private PmsProductCategoryServiceImpl pmsProductCategoryService;

    @Autowired
    private PmsProductAttributeServiceImpl pmsProductAttributeService;

    @RequestMapping(value = "/category/list/withAttr", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult<List<PmsproductCategoryWithChildren>> listWithChildren() {
        List<PmsproductCategoryWithChildren> Children = pmsProductCategoryService.listWithChildren();
        return CommonResult.success(Children);
    }

    @RequestMapping(value = "/category/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductAttributeCategory>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<PmsProductAttributeCategory> AttrList = pmsProductAttributeCategoryService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(AttrList));
    }

    @RequestMapping(value = "/attrInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductAttributeCategory> attrInfo(@PathVariable("id") Long id) {
        PmsProductAttributeCategory AttrList = pmsProductAttributeCategoryService.attrInfo(id);
        return CommonResult.success(AttrList);
    }



    @RequestMapping(value = "/category/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductAttributeCategory>> SetName(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                         @PathVariable("id") Long id,
                                                                         @RequestParam String name) {
        Page<PmsProductAttributeCategory> AttrList = pmsProductAttributeCategoryService.SetName(pageSize, pageNum,id,name);
        return CommonResult.success(CommonPage.restPage(AttrList));
    }

    @RequestMapping(value = "/category/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Integer> Delete(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                         @PathVariable("id") Long id) {
        Integer AttrList = pmsProductAttributeCategoryService.Delete(pageSize, pageNum,id);
        return CommonResult.success(AttrList);
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductAttribute>> Delete2(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                 @RequestParam Long ids) {
        Page<PmsProductAttribute> AttrList = pmsProductAttributeService.Delete(pageSize, pageNum,ids);
        return CommonResult.success(CommonPage.restPage(AttrList));
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult<CommonPage<PmsProductAttributeCategory>> getList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<PmsProductAttributeCategory> pmsProduct=pmsProductAttributeCategoryService.getById(pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(pmsProduct));
    }

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult<CommonPage<PmsProductAttribute>> getList1(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                   @PathVariable("id") Integer id,
                                                                   @RequestParam Integer type) {
        Page<PmsProductAttribute> pmsProduct=pmsProductAttributeService.getById(pageSize,pageNum,type);
        return CommonResult.success(CommonPage.restPage(pmsProduct));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult<PmsProductAttribute> getProductAttr(@PathVariable("id") Long id) {
        PmsProductAttribute pmsProduct=pmsProductAttributeService.getProductAttr(id);
        return CommonResult.success(pmsProduct);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public  CommonResult<Integer> updateProductAttr(@PathVariable("id") Long id,
                                                    @RequestBody PmsProductAttribute pmsProductAttribute) {
        Integer pmsProduct=pmsProductAttributeService.updateProductAttr(pmsProductAttribute);
        return CommonResult.success(pmsProduct);
    }
}
