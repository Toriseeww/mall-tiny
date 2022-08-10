package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsBrandMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsBrand;
import cn.edu.ptu.mall.modules.pms.service.PmsBrandService;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 品牌表(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:56
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public Page<PmsBrand> list(String keyword, Integer pageSize, Integer pageNum) {
        Page<PmsBrand> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsBrand> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsBrand> lambda = wrapper.lambda();
        if(StrUtil.isNotEmpty(keyword)){
            lambda.like(PmsBrand::getName,keyword);
        }
        return page(page,wrapper);
    }

    @Override
    public boolean showStatus(List<Long> ids, Integer showStatus) {
        for (int i = 0; i < ids.size(); i++) {
            PmsBrand brand= pmsBrandMapper.selectById(ids.get(i));
            brand.setShowStatus(showStatus);
            pmsBrandMapper.updateById(brand);
        }
        return true;
    }

    @Override
    public PmsBrand factorStatus(Long ids,Integer factoryStatus) {
        PmsBrand brand= pmsBrandMapper.selectById(ids);
        brand.setFactoryStatus(factoryStatus);
        pmsBrandMapper.updateById(brand);
        return brand;
    }

    @Override
    public Page<PmsBrand> delete(String keyword, Integer pageSize, Integer pageNum, Long id) {
        Page<PmsBrand> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsBrand> wrapper = new QueryWrapper<>();
        pmsBrandMapper.deleteById(id);
        return page(page,wrapper);
    }
}
