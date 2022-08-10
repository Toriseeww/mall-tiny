package cn.edu.ptu.mall.modules.pms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (PmsProductOperateLog)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_operate_log")
public class PmsProductOperateLog  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private Double priceOld;
    
    private Double priceNew;
    
    private Double salePriceOld;
    
    private Double salePriceNew;
    //赠送的积分
    private Integer giftPointOld;
    
    private Integer giftPointNew;
    
    private Integer usePointLimitOld;
    
    private Integer usePointLimitNew;
    //操作人
    private String operateMan;
    
    private Date createTime;



}
