package cn.edu.ptu.mall.modules.oms.service;;

import cn.edu.ptu.mall.modules.oms.model.OmsOrderSetting;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 订单设置表(OmsOrderSetting)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsOrderSettingService extends IService<OmsOrderSetting> {
    OmsOrderSetting get(Integer id);
    Integer updateList(OmsOrderSetting omsOrderSetting);
}
