package cn.edu.ptu.mall.modules.oms.service;;

import cn.edu.ptu.mall.modules.oms.DTO.OmsWebOrderReturn;
import cn.edu.ptu.mall.modules.oms.DTO.OmsWebReturn;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnApply;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;


/**
 * 订单退货申请(OmsOrderReturnApply)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApply> {
    Page<OmsOrderReturnApply> list(OmsWebReturn omsWebOrder, Integer pageSize, Integer pageNum);
    OmsOrderReturnApply getList(Long id);
    Integer updateList(Long id, OmsWebOrderReturn omsWebOrderReturn);
    Integer deleteList(Collection<Long> ids);
}
