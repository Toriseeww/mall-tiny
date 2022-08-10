package cn.edu.ptu.mall.modules.oms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 退货原因表(OmsOrderReturnReason)表实体类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_return_reason")
public class OmsOrderReturnReason  {
    @TableId
    private Long id;

    //退货类型
    private String name;
    
    private Integer sort;
    //状态：0->不启用；1->启用
    private Integer status;
    //添加时间
    private Date createTime;



}
