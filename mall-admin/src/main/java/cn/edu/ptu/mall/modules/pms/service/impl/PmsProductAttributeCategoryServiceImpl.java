package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductAttributeCategoryMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttribute;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttributeCategory;
import cn.edu.ptu.mall.modules.pms.service.PmsProductAttributeCategoryService;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductAttributeCategoryService")
public class PmsProductAttributeCategoryServiceImpl extends ServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory> implements PmsProductAttributeCategoryService {
    @Autowired
    private PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    @Override
    public Page<PmsProductAttributeCategory> list(String keyword, Integer pageSize, Integer pageNum) {
        Page<PmsProductAttributeCategory> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttributeCategory> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsProductAttributeCategory> lambda = wrapper.lambda();
        if(StrUtil.isNotEmpty(keyword)){
            lambda.like(PmsProductAttributeCategory::getName,keyword);
        }
        return page(page,wrapper);
    }

    @Override
    public Page<PmsProductAttributeCategory> getById(Integer pageSize, Integer pageNum) {
        Page<PmsProductAttributeCategory> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttributeCategory> wrapper = new QueryWrapper<>();
        return page(page,wrapper);
    }

    @Override
    public Page<PmsProductAttributeCategory> SetName(Integer pageSize, Integer pageNum, Long id, String name) {
        Page<PmsProductAttributeCategory> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttributeCategory> wrapper = new QueryWrapper<>();
        PmsProductAttributeCategory pmsProductAttributeCategory = pmsProductAttributeCategoryMapper.selectById(id);
        pmsProductAttributeCategory.setName(name);
        pmsProductAttributeCategoryMapper.updateById(pmsProductAttributeCategory);
        return page(page,wrapper);
    }

    @Override
    public Integer Delete(Integer pageSize, Integer pageNum, Long id) {
        return pmsProductAttributeCategoryMapper.deleteById(id);
    }

    @Override
    public PmsProductAttributeCategory attrInfo(Long id) {
        return pmsProductAttributeCategoryMapper.selectById(id);
    }
}
