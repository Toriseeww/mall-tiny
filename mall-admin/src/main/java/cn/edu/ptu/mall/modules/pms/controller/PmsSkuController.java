package cn.edu.ptu.mall.modules.pms.controller;

import cn.edu.ptu.mall.common.api.CommonPage;
import cn.edu.ptu.mall.common.api.CommonResult;
import cn.edu.ptu.mall.modules.pms.model.PmsSkuStock;
import cn.edu.ptu.mall.modules.pms.service.impl.PmsSkuStockServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "PmsSkuController", description = "商品库存管理")
@RequestMapping("/sku")
public class PmsSkuController {
    @Autowired
    private PmsSkuStockServiceImpl skuStockService;

    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<List<PmsSkuStock>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @PathVariable("id") Long productId) {
        List<PmsSkuStock> PmsSkuStockList = skuStockService.getByProductId(keyword,pageSize,pageNum,productId);
        return CommonResult.success(PmsSkuStockList);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> updateList(@PathVariable("id") Long id,
                                            @RequestBody List<PmsSkuStock> pmsSkuStock) {
        Integer pmsSkuStock1=skuStockService.updateList(pmsSkuStock);
        return CommonResult.success(pmsSkuStock1);
    }
}
