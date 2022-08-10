package cn.edu.ptu.mall.modules.pms.mapper;

import cn.edu.ptu.mall.modules.pms.DTO.PmsproductCategoryWithChildren;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * 产品分类(PmsProductCategory)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {
    List<PmsproductCategoryWithChildren> selectChildrenList();
}
