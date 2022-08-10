package cn.edu.ptu.mall.modules.oms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 订单设置表(OmsOrderSetting)表实体类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_setting")
public class OmsOrderSetting  {
    @TableId
    private Long id;

    //秒杀订单超时关闭时间(分)
    private Integer flashOrderOvertime;
    //正常订单超时时间(分)
    private Integer normalOrderOvertime;
    //发货后自动确认收货时间（天）
    private Integer confirmOvertime;
    //自动完成交易时间，不能申请售后（天）
    private Integer finishOvertime;
    //订单完成后自动好评时间（天）
    private Integer commentOvertime;



}
