package cn.edu.ptu.mall.modules.oms.service;;

import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnReason;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;


/**
 * 退货原因表(OmsOrderReturnReason)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReason> {
    Page<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);
    OmsOrderReturnReason getMe(Long id);
    Integer updateMe(Long id, OmsOrderReturnReason omsOrderReturnReason);
    Integer updateStatus(Long id, Integer status);
    Integer deleteMe(Collection<Long> id);
}
