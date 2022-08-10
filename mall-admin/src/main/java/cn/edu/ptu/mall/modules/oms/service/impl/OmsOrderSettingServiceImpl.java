package cn.edu.ptu.mall.modules.oms.service.impl;

import cn.edu.ptu.mall.modules.oms.mapper.OmsOrderSettingMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderSetting;
import cn.edu.ptu.mall.modules.oms.service.OmsOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单设置表(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper omsOrderSettingMapper;

    @Override
    public OmsOrderSetting get(Integer id) {
        return omsOrderSettingMapper.selectById(id);
    }

    @Override
    public Integer updateList(OmsOrderSetting omsOrderSetting) {
        return omsOrderSettingMapper.updateById(omsOrderSetting);
    }
}
