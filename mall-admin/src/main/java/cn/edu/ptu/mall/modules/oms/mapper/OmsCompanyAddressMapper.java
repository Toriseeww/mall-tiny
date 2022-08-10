package cn.edu.ptu.mall.modules.oms.mapper;;

import cn.edu.ptu.mall.modules.oms.model.OmsCompanyAddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 公司收发货地址表(OmsCompanyAddress)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
public interface OmsCompanyAddressMapper extends BaseMapper<OmsCompanyAddress> {
    @Select("select * from oms_company_address")
    List<OmsCompanyAddress> SelectAll();
}
