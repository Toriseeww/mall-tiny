package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.model.PmsSkuStock;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * sku的库存(PmsSkuStock)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:56:01
 */
public interface PmsSkuStockService extends IService<PmsSkuStock> {
    List<PmsSkuStock> getByProductId(String keyword, Integer pageSize, Integer pageNum, Long productId);
    Integer updateList(List<PmsSkuStock> pmsSkuStock);
}
