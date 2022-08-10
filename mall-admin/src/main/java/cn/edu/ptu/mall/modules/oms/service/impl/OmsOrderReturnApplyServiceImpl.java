package cn.edu.ptu.mall.modules.oms.service.impl;;

import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrderReturn;
import cn.edu.ptu.mall.modules.oms.DTO.OmsWebReturn;
import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderReturnApplyMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrder;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnApply;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderReturnApplyService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyMapper, OmsOrderReturnApply> implements OmsOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

    @Override
    public Page<OmsOrderReturnApply> list(OmsWebReturn omsWebOrder, Integer pageSize, Integer pageNum) {
        Page<OmsOrderReturnApply> page = new Page<>(pageNum,pageSize);
        QueryWrapper<OmsOrderReturnApply> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<OmsOrderReturnApply> lambda = wrapper.lambda();
        lambda.eq(Objects.nonNull(omsWebOrder.getId()), OmsOrderReturnApply::getId,omsWebOrder.getId());
        lambda.eq(Objects.nonNull(omsWebOrder.getCreateTime()), OmsOrderReturnApply::getCreateTime,omsWebOrder.getCreateTime());
        lambda.eq(Objects.nonNull(omsWebOrder.getStatus()), OmsOrderReturnApply::getStatus,omsWebOrder.getStatus());
        lambda.eq(Objects.nonNull(omsWebOrder.getHandleTime()), OmsOrderReturnApply::getHandleTime,omsWebOrder.getHandleTime());
        lambda.eq(Objects.nonNull(omsWebOrder.getHandleMan()), OmsOrderReturnApply::getHandleMan,omsWebOrder.getHandleMan());
        return page(page,wrapper);
    }

    @Override
    public OmsOrderReturnApply getList(Long id) {
        return omsOrderReturnApplyMapper.selectById(id);
    }

    @Override
    public Integer updateList(Long id, OmsWebOrderReturn omsWebOrderReturn) {
        OmsOrderReturnApply omsOrderReturnApply = omsOrderReturnApplyMapper.selectById(id);
        omsOrderReturnApply.setCompanyAddressId(omsWebOrderReturn.getCompanyAddressId());
        omsOrderReturnApply.setReturnAmount(omsWebOrderReturn.getReturnAmount());
        omsOrderReturnApply.setStatus(omsWebOrderReturn.getStatus());
        omsOrderReturnApply.setHandleNote(omsWebOrderReturn.getHandleNote());
        omsOrderReturnApply.setHandleMan(omsWebOrderReturn.getHandleMan());
        omsOrderReturnApply.setReceiveNote(omsWebOrderReturn.getReceiveNote());
        omsOrderReturnApply.setReceiveMan(omsWebOrderReturn.getReceiveMan());
        return omsOrderReturnApplyMapper.updateById(omsOrderReturnApply);
    }

    @Override
    public Integer deleteList(Collection<Long> ids) {
        return omsOrderReturnApplyMapper.deleteBatchIds(ids);
    }
}
