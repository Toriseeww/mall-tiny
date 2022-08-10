package cn.edu.ptu.mall.modules.oms.service.impl;;

import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderItemMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderItem;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单中所包含的商品(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
