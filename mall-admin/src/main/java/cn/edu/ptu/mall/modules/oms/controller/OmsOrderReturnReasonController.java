package cn.edu.ptu.mall.modules.oms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnReason;
import cn.edu.ptu.mall.modules.oms.service.impl.OmsOrderReturnReasonServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@Api(tags = "OmsOrderReturnReasonController", description = "退货原因管理")
@RequestMapping("/returnReason")
public class OmsOrderReturnReasonController {
    @Autowired
    private OmsOrderReturnReasonServiceImpl omsOrderReturnReasonService;

    @ApiOperation("退货原因分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OmsOrderReturnReason>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<OmsOrderReturnReason> BrandList = omsOrderReturnReasonService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(BrandList));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderReturnReason> getMe(@PathVariable("id") Long id) {
        OmsOrderReturnReason BrandList = omsOrderReturnReasonService.getMe(id);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateMe(@PathVariable("id") Long id,
                                          @RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        Integer BrandList = omsOrderReturnReasonService.updateMe(id,omsOrderReturnReason);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateStatus(@RequestParam Long ids,
                                              @RequestParam Integer status) {
        Integer BrandList = omsOrderReturnReasonService.updateStatus(ids,status);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> deleteMe(@RequestParam Collection<Long> ids) {
        Integer BrandList = omsOrderReturnReasonService.deleteMe(ids);
        return CommonResult.success(BrandList);
    }
}
