package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsSkuStockMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsSkuStock;
import cn.edu.ptu.mall.modules.pms.service.PmsSkuStockService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * sku的库存(PmsSkuStock)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:01
 */
@Service("pmsSkuStockService")
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper pmsSkuStockMapper;

    @Override
    public List<PmsSkuStock> getByProductId(String keyword, Integer pageSize, Integer pageNum, Long productId) {
        return pmsSkuStockMapper.selectByProductId(productId);
    }

    @Override
    public Integer updateList(List<PmsSkuStock> pmsSkuStock) {
        for (int i = 0; i < pmsSkuStock.size(); i++) {
            pmsSkuStockMapper.updateById(pmsSkuStock.get(i));
        }
        return 1;
    }
}
