package cn.edu.ptu.mall.modules.oms.service.impl;

import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrder;
import cn.edu.ptu.mall.modules.oms.DTO.OrderDe;
import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrder;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderService;
import cn.edu.ptu.mall.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * 订单表(OmsOrder)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService {
    @Autowired
    private OmsOrderMapper omsOrderMapper;

    @Override
    public Page<OmsOrder> list(OmsWebOrder omsWebOrder, Integer pageSize, Integer pageNum) {
            Page<OmsOrder> page = new Page<>(pageNum,pageSize);
            QueryWrapper<OmsOrder> wrapper = new QueryWrapper<>();
            LambdaQueryWrapper<OmsOrder> lambda = wrapper.lambda();
            lambda.eq(Objects.nonNull(omsWebOrder.getOrderSn()), OmsOrder::getOrderSn,omsWebOrder.getOrderSn());
            lambda.eq(Objects.nonNull(omsWebOrder.getCreateTime()), OmsOrder::getCreateTime,omsWebOrder.getCreateTime());
            lambda.like(Objects.nonNull(omsWebOrder.getReceiverKeyword()), OmsOrder::getReceiverName,omsWebOrder.getReceiverKeyword());
            lambda.like(Objects.nonNull(omsWebOrder.getReceiverKeyword()), OmsOrder::getReceiverPhone,omsWebOrder.getReceiverKeyword());
            lambda.eq(Objects.nonNull(omsWebOrder.getStatus()), OmsOrder::getStatus,omsWebOrder.getStatus());
            lambda.eq(Objects.nonNull(omsWebOrder.getOrderType()), OmsOrder::getOrderType,omsWebOrder.getOrderType());
            lambda.eq(Objects.nonNull(omsWebOrder.getSourceType()), OmsOrder::getSourceType,omsWebOrder.getSourceType());
            return page(page,wrapper);
    }

    @Override
    public OmsOrder oder(Integer pageSize, Integer pageNum, Long id) {
        return omsOrderMapper.selectById(id);
    }

    @Override
    public Integer delete(Collection<Long> ids) {
        return omsOrderMapper.deleteBatchIds(ids);
    }

    @Override
    public Boolean updateClose(List<Long> ids, String note) {
        for (int i = 0; i < ids.size(); i++) {
            OmsOrder omsOrder = omsOrderMapper.selectById(ids.get(i));
            omsOrder.setNote(note);
            omsOrder.setStatus(4);
            omsOrderMapper.updateById(omsOrder);
        }
        return true;
    }

    @Override
    public Boolean updateDelivery(ArrayList<OrderDe> list) {
        for (int i = 0; i < list.size(); i++) {
            OmsOrder omsOrder = omsOrderMapper.selectById(list.get(i).getOrderId());
            omsOrder.setStatus(2);
            omsOrder.setOrderSn(list.get(i).getOrderSn());
            omsOrder.setDeliveryCompany(list.get(i).getDeliveryCompany());
            omsOrder.setDeliverySn(list.get(i).getDeliverySn());
            omsOrder.setReceiverDetailAddress(list.get(i).getAddress());
            omsOrder.setReceiverName(list.get(i).getReceiverName());
            omsOrder.setReceiverPhone(list.get(i).getReceiverPhone());
            omsOrder.setReceiverPostCode(list.get(i).getReceiverPostCode());
            omsOrderMapper.updateById(omsOrder);
        }
        return true;
    }
}
