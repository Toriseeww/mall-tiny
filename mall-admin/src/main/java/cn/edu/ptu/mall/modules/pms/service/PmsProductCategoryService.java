package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.DTO.PmsproductCategoryWithChildren;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;


/**
 * 产品分类(PmsProductCategory)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
public interface PmsProductCategoryService extends IService<PmsProductCategory> {
    Page<PmsProductCategory> list(String keyword, Integer pageSize, Integer pageNum,Integer parentId);
    List<PmsproductCategoryWithChildren> listWithChildren();
    PmsProductCategory getList(Long id);
    Page<PmsProductCategory> delete(Integer pageSize, Integer pageNum, Long id);
    PmsProductCategory showStatus(Long ids, Integer showStatus);
    PmsProductCategory navStatus(Long ids, Integer navStatus);
    Integer updateList(PmsProductCategory pmsProductCategory);
}
