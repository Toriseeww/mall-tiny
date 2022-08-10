package cn.edu.ptu.mall.modules.oms.controller;

import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.oms.model.OmsCompanyAddress;
import cn.edu.ptu.mall.modules.oms.service.impl.OmsCompanyAddressServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "OmsCompanyAddressController", description = "退货公司管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    @Autowired
    private OmsCompanyAddressServiceImpl omsCompanyAddressService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmsCompanyAddress>> list(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsCompanyAddress> BrandList = omsCompanyAddressService.list(pageSize, pageNum);
        return CommonResult.success(BrandList);
    }
}
