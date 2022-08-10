package cn.edu.ptu.mall.modules.oms.controller;

import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderSetting;
import cn.edu.ptu.mall.modules.oms.service.impl.OmsOrderSettingServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "OmsOrderSettingController", description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingServiceImpl omsOrderSettingService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderSetting> get(@PathVariable("id") Integer id) {
        OmsOrderSetting BrandList = omsOrderSettingService.get(id);
        return CommonResult.success(BrandList);
    }

    @RequestMapping(value = "/update/{ids}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> update(@RequestBody OmsOrderSetting omsOrderSetting,
                                        @PathVariable("ids") Long ids)
    {
        Integer result = omsOrderSettingService.updateList(omsOrderSetting);
        return CommonResult.success(result);
    }
}
