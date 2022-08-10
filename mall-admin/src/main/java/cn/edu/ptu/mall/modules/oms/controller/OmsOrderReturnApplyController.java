package cn.edu.ptu.mall.modules.oms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrderReturn;
import cn.edu.ptu.mall.modules.oms.DTO.OmsWebReturn;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnApply;
import cn.edu.ptu.mall.modules.oms.service.impl.OmsOrderReturnApplyServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@Api(tags = "OmsOrderReturnApplyController", description = "退货申请管理")
@RequestMapping("/returnApply")
public class OmsOrderReturnApplyController {
    @Autowired
    private OmsOrderReturnApplyServiceImpl omsOrderReturnApplyService;

    @ApiOperation("退货申请分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OmsOrderReturnApply>> list(OmsWebReturn omsWebOrder,
                                                              @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<OmsOrderReturnApply> BrandList = omsOrderReturnApplyService.list(omsWebOrder,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(BrandList));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderReturnApply> getList(@PathVariable("id") Long id) {
        OmsOrderReturnApply BrandList = omsOrderReturnApplyService.getList(id);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/status/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateList(@PathVariable("id") Long id,
                                            @RequestBody OmsWebOrderReturn omsWebOrderReturn) {
        Integer BrandList = omsOrderReturnApplyService.updateList(id,omsWebOrderReturn);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateList(@RequestParam Collection<Long> ids) {
        Integer BrandList = omsOrderReturnApplyService.deleteList(ids);
        return CommonResult.success(BrandList);
    }
}
