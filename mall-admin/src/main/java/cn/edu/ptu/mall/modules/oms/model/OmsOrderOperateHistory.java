package cn.edu.ptu.mall.modules.oms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 订单操作历史记录(OmsOrderOperateHistory)表实体类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_operate_history")
public class OmsOrderOperateHistory  {
    @TableId
    private Long id;

    //订单id
    private Long orderId;
    //操作人：用户；系统；后台管理员
    private String operateMan;
    //操作时间
    private Date createTime;
    //订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    private Integer orderStatus;
    //备注
    private String note;



}
