package cn.edu.ptu.mall.modules.oms.service.impl;;

import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderOperateHistoryMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderOperateHistory;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

}
