package cn.edu.ptu.mall.modules.oms.service;;

import cn.edu.ptu.mall.modules.oms.model.OmsCompanyAddress;
import cn.edu.ptu.mall.modules.oms.model.OmsOrderReturnApply;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 公司收发货地址表(OmsCompanyAddress)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsCompanyAddressService extends IService<OmsCompanyAddress> {
    List<OmsCompanyAddress> list(Integer pageSize, Integer pageNum);
}
