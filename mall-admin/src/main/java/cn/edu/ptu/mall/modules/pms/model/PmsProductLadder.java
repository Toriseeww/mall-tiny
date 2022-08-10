package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 产品阶梯价格表(只针对同商品)(PmsProductLadder)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_ladder")
public class PmsProductLadder  {
    @TableId
    private Long id;

    
    private Long productId;
    //满足的商品数量
    private Integer count;
    //折扣
    private Double discount;
    //折后价格
    private Double price;



}
