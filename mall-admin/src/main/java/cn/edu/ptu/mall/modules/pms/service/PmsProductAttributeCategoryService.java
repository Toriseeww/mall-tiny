package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.model.PmsProductAttributeCategory;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 产品属性分类表(PmsProductAttributeCategory)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
public interface PmsProductAttributeCategoryService extends IService<PmsProductAttributeCategory> {
    Page<PmsProductAttributeCategory> list(String keyword, Integer pageSize, Integer pageNum);
    Page<PmsProductAttributeCategory> getById(Integer pageSize, Integer pageNum);
    Page<PmsProductAttributeCategory> SetName(Integer pageSize, Integer pageNum, Long id, String name);
    Integer Delete(Integer pageSize, Integer pageNum, Long id);
    PmsProductAttributeCategory attrInfo(Long id);
}
