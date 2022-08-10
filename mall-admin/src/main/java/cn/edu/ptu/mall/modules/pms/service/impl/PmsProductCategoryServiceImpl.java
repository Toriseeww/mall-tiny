package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.DTO.PmsproductCategoryWithChildren;
import cn.edu.ptu.mall.modules.pms.mapper.PmsProductCategoryMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import cn.edu.ptu.mall.modules.pms.service.PmsProductCategoryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品分类(PmsProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductCategoryService")
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements PmsProductCategoryService {
    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public Page<PmsProductCategory> list(String keyword, Integer pageSize, Integer pageNum, Integer parentId) {
        Page<PmsProductCategory> page = new Page<>(pageNum, pageSize);
        QueryWrapper<PmsProductCategory> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsProductCategory> lambda = wrapper.lambda();
        lambda.eq(PmsProductCategory::getParentId, parentId);
        return page(page, wrapper);
    }

    @Override
    public List<PmsproductCategoryWithChildren> listWithChildren() {
        List<PmsproductCategoryWithChildren> list = pmsProductCategoryMapper.selectChildrenList();
        return list;
    }

    @Override
    public PmsProductCategory getList(Long id) {
        return pmsProductCategoryMapper.selectById(id);
    }

    @Override
    public Page<PmsProductCategory> delete(Integer pageSize, Integer pageNum, Long id) {
        Page<PmsProductCategory> page = new Page<>(pageNum, pageSize);
        QueryWrapper<PmsProductCategory> wrapper = new QueryWrapper<>();
        pmsProductCategoryMapper.deleteById(id);
        return page(page, wrapper);
    }

    @Override
    public PmsProductCategory showStatus(Long ids, Integer showStatus) {
        PmsProductCategory brand= pmsProductCategoryMapper.selectById(ids);
        brand.setShowStatus(showStatus);
        pmsProductCategoryMapper.updateById(brand);
        return brand;
    }

    @Override
    public PmsProductCategory navStatus(Long ids, Integer navStatus) {
        PmsProductCategory brand= pmsProductCategoryMapper.selectById(ids);
        brand.setNavStatus(navStatus);
        pmsProductCategoryMapper.updateById(brand);
        return brand;
    }

    @Override
    public Integer updateList(PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryMapper.updateById(pmsProductCategory);
    }
}
