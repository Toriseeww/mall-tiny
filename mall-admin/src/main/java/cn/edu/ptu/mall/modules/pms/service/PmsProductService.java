package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.DTO.PmsProductSelect;
import cn.edu.ptu.mall.modules.pms.DTO.PmsWebProduct;
import cn.edu.ptu.mall.modules.pms.model.PmsProduct;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 商品信息(PmsProduct)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
public interface PmsProductService extends IService<PmsProduct> {
    Page<PmsProduct> getList(PmsProductSelect pmsproductselect, Integer pageSize, Integer pageNum);
    PmsProduct getById(Long id);
    Integer updateList(PmsProduct pmsProduct);
    Page<PmsProduct> create(Integer pageSize, Integer pageNum);
    boolean deleteById(List<Long> id,Integer deleteStatus);
    boolean publishStatus(List<Long> ids, Integer publishStatus);
    boolean newStatus(List<Long> ids, Integer newStatus);
    boolean recommendStatus(List<Long> ids, Integer recommendStatus);
}
