package cn.edu.ptu.mall.modules.oms.service.impl;

import cn.edu.ptu.mall.modules.oms.mapper.OmsCompanyAddressMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsCompanyAddress;
import cn.edu.ptu.mall.modules.oms.service.OmsCompanyAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公司收发货地址表(OmsCompanyAddress)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@Service("omsCompanyAddressService")
public class OmsCompanyAddressServiceImpl extends ServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress> implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper omsCompanyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list(Integer pageSize, Integer pageNum) {
        return omsCompanyAddressMapper.SelectAll();
    }
}
