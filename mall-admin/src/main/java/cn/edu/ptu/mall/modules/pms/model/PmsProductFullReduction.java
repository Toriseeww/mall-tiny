package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 产品满减表(只针对同商品)(PmsProductFullReduction)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_full_reduction")
public class PmsProductFullReduction  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private Double fullPrice;
    
    private Double reducePrice;



}
