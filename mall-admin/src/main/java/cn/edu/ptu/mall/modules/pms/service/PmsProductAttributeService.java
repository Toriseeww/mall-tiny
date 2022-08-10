package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.model.PmsProductAttribute;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 商品属性参数表(PmsProductAttribute)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
public interface PmsProductAttributeService extends IService<PmsProductAttribute> {
    Page<PmsProductAttribute> list(String keyword, Integer pageSize, Integer pageNum);
    PmsProductAttribute getProductAttr(Long id);
    Integer updateProductAttr(PmsProductAttribute pmsProductAttribute);
    Page<PmsProductAttribute> getById(Integer pageSize, Integer pageNum,Integer type);
    Page<PmsProductAttribute> Delete(Integer pageSize, Integer pageNum, Long ids);
}
