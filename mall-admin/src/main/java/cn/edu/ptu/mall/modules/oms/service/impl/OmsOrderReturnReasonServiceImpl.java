package cn.edu.ptu.mall.modules.oms.service.impl;;

import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderReturnReasonMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnReason;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderReturnReasonService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 退货原因表(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason> implements OmsOrderReturnReasonService {
    @Autowired
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    @Override
    public Page<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum) {
        Page<OmsOrderReturnReason> page = new Page<>(pageNum,pageSize);
        QueryWrapper<OmsOrderReturnReason> wrapper = new QueryWrapper<>();
        return page(page,wrapper);
    }

    @Override
    public OmsOrderReturnReason getMe(Long id) {
        return omsOrderReturnReasonMapper.selectById(id);
    }

    @Override
    public Integer updateMe(Long id, OmsOrderReturnReason omsOrderReturnReason) {
        omsOrderReturnReason.setId(id);
        return omsOrderReturnReasonMapper.updateById(omsOrderReturnReason);
    }

    @Override
    public Integer updateStatus(Long id, Integer status) {
        OmsOrderReturnReason omsOrderReturnReason = omsOrderReturnReasonMapper.selectById(id);
        omsOrderReturnReason.setStatus(status);
        return omsOrderReturnReasonMapper.updateById(omsOrderReturnReason);
    }

    @Override
    public Integer deleteMe(Collection<Long> id) {
        return omsOrderReturnReasonMapper.deleteBatchIds(id);
    }
}
