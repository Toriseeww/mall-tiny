package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.DTO.PmsProductSelect;
import cn.edu.ptu.mall.modules.pms.DTO.PmsWebProduct;
import cn.edu.ptu.mall.modules.pms.mapper.PmsProductMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProduct;
import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import cn.edu.ptu.mall.modules.pms.service.PmsProductService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * 商品信息(PmsProduct)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@Service("pmsProductService")
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService {
    @Autowired
    private PmsProductMapper pmsProductMapper;

    @Override
    public Page<PmsProduct> getList(PmsProductSelect pmsproductselect, Integer pageSize, Integer pageNum) {
        Page<PmsProduct> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProduct> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<PmsProduct> lambda = wrapper.lambda();
        lambda.like(Objects.nonNull(pmsproductselect.getKeyword()),PmsProduct::getKeywords,pmsproductselect.getKeyword());
        lambda.eq(Objects.nonNull(pmsproductselect.getBrandId()),PmsProduct::getBrandId,pmsproductselect.getBrandId());
        lambda.eq(Objects.nonNull(pmsproductselect.getProductCategoryId()),PmsProduct::getProductCategoryId,pmsproductselect.getProductCategoryId());
        lambda.eq(Objects.nonNull(pmsproductselect.getProductSn()),PmsProduct::getProductSn,pmsproductselect.getProductSn());
        lambda.eq(Objects.nonNull(pmsproductselect.getVerifyStatus()),PmsProduct::getVerifyStatus,pmsproductselect.getVerifyStatus());
        lambda.eq(Objects.nonNull(pmsproductselect.getPublishStatus()),PmsProduct::getPublishStatus,pmsproductselect.getPublishStatus());
        return page(page,wrapper);
    }

    @Override
    public PmsProduct getById(Long id) {
        return pmsProductMapper.selectById(id);
    }

    @Override
    public Integer updateList(PmsProduct pmsProduct) {
        return pmsProductMapper.updateById(pmsProduct);
    }

    @Override
    public Page<PmsProduct> create(Integer pageSize, Integer pageNum) {
        Page<PmsProduct> page = new Page<>(pageNum,pageSize);
        QueryWrapper<PmsProduct> wrapper = new QueryWrapper<>();
        return page(page,wrapper);
    }

    @Override
    public boolean deleteById(List<Long> ids,Integer deleteStatus) {
        for (int i = 0; i < ids.size(); i++) {
            PmsProduct pmsProduct = pmsProductMapper.selectById(ids.get(i));
            pmsProduct.setDeleteStatus(0);
            pmsProductMapper.updateById(pmsProduct);
        }
        return true;
    }

    @Override
    public boolean publishStatus(List<Long> ids, Integer publishStatus) {
        for (int i = 0; i < ids.size(); i++) {
            PmsProduct brand= pmsProductMapper.selectById(ids.get(i));
            brand.setPublishStatus(publishStatus);
            pmsProductMapper.updateById(brand);
        }
        return true;
    }

    @Override
    public boolean newStatus(List<Long> ids, Integer newStatus) {
        for (int i = 0; i < ids.size(); i++) {
            PmsProduct brand= pmsProductMapper.selectById(ids.get(i));
            brand.setNewStatus(newStatus);
            pmsProductMapper.updateById(brand);
        }
        return true;
    }

    @Override
    public boolean recommendStatus(List<Long> ids, Integer recommendStatus) {
        for (int i = 0; i < ids.size(); i++) {
            PmsProduct brand= pmsProductMapper.selectById(ids.get(i));
            brand.setRecommandStatus(recommendStatus);
            pmsProductMapper.updateById(brand);
        }
        return true;
    }
}
