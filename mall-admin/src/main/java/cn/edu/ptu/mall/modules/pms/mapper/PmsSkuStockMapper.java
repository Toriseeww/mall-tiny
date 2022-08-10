package cn.edu.ptu.mall.modules.pms.mapper;;

import cn.edu.ptu.mall.modules.pms.model.PmsSkuStock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * sku的库存(PmsSkuStock)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-15 15:56:01
 */
public interface PmsSkuStockMapper extends BaseMapper<PmsSkuStock> {
    List<PmsSkuStock> selectByProductId(Long productId);
}
