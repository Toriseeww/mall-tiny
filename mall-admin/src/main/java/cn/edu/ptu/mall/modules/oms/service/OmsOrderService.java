package cn.edu.ptu.mall.modules.oms.service;

import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrder;
import cn.edu.ptu.mall.modules.oms.DTO.OrderDe;
import cn.edu.ptu.mall.modules.oms.model.OmsOrder;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * 订单表(OmsOrder)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsOrderService extends IService<OmsOrder> {
    Page<OmsOrder> list(OmsWebOrder omsWebOrder, Integer pageSize, Integer pageNum);
    OmsOrder oder(Integer pageSize, Integer pageNum, Long id);
    Integer delete(Collection<Long> ids);
    Boolean updateClose(List<Long> ids, String note);
    Boolean updateDelivery(ArrayList<OrderDe> list);
}
