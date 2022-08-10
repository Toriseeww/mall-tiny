package cn.edu.ptu.mall.modules.oms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrder;
import cn.edu.ptu.mall.modules.oms.DTO.OrderDe;
import cn.edu.ptu.mall.modules.oms.model.OmsOrder;
import cn.edu.ptu.mall.modules.oms.service.impl.OmsOrderServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
@Api(tags = "OmsOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsOrderController {
    @Autowired
    private OmsOrderServiceImpl omsOrderService;

    @ApiOperation("订单分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OmsOrder>> list(OmsWebOrder omsWebOrder,
                                                   @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<OmsOrder> BrandList = omsOrderService.list(omsWebOrder,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(BrandList));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrder> oder(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                       @PathVariable Long id) {
        OmsOrder BrandList = omsOrderService.oder(pageSize, pageNum,id);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> delete(@RequestParam Collection<Long> ids) {
        Integer result = omsOrderService.delete(ids);
        return CommonResult.success(result);
    }

    @RequestMapping(value = "/update/close", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> updateClose(@RequestParam List<Long> ids,
                                             @RequestParam String note) {
        Boolean result = omsOrderService.updateClose(ids,note);
        return CommonResult.success(result);
    }

    @RequestMapping(value = "/update/delivery", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Boolean> updateDelivery(@RequestBody ArrayList<OrderDe> list) {
        Boolean result = omsOrderService.updateDelivery(list);
        return CommonResult.success(result);
    }
}
