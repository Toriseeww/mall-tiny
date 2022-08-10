package cn.edu.ptu.mall.modules.oms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 公司收发货地址表(OmsCompanyAddress)表实体类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_company_address")
public class OmsCompanyAddress  {
    @TableId
    private Long id;

    //地址名称
    private String addressName;
    //默认发货地址：0->否；1->是
    private Integer sendStatus;
    //是否默认收货地址：0->否；1->是
    private Integer receiveStatus;
    //收发货人姓名
    private String name;
    //收货人电话
    private String phone;
    //省/直辖市
    private String province;
    //市
    private String city;
    //区
    private String region;
    //详细地址
    private String detailAddress;



}
