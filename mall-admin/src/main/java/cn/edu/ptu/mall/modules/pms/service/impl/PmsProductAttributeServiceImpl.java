package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductAttributeMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttribute;
import cn.edu.ptu.mall.modules.pms.service.PmsProductAttributeService;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品属性参数表(PmsProductAttribute)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductAttributeService")
public class PmsProductAttributeServiceImpl extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements PmsProductAttributeService {
    @Autowired
    private PmsProductAttributeMapper pmsProductAttributeMapper;

    @Override
    public Page<PmsProductAttribute> list(String keyword, Integer pageSize, Integer pageNum) {
        Page<PmsProductAttribute> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttribute> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsProductAttribute> lambda = wrapper.lambda();
        if(StrUtil.isNotEmpty(keyword)){
            lambda.like(PmsProductAttribute::getName,keyword);
        }
        return page(page,wrapper);
    }

    @Override
    public PmsProductAttribute getProductAttr(Long id) {
        return pmsProductAttributeMapper.selectById(id);
    }

    @Override
    public Integer updateProductAttr(PmsProductAttribute pmsProductAttribute) {
        return pmsProductAttributeMapper.updateById(pmsProductAttribute);
    }

    @Override
    public Page<PmsProductAttribute> getById(Integer pageSize, Integer pageNum,Integer type) {
        Page<PmsProductAttribute> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttribute> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsProductAttribute> lambda = wrapper.lambda();
        lambda.eq(PmsProductAttribute::getType,type);
        return page(page,wrapper);
    }

    @Override
    public Page<PmsProductAttribute> Delete(Integer pageSize, Integer pageNum, Long ids) {
        Page<PmsProductAttribute> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProductAttribute> wrapper = new QueryWrapper<>();
        System.out.println(pmsProductAttributeMapper.selectById(ids));
        pmsProductAttributeMapper.deleteById(ids);
        return page(page,wrapper);
    }
}
