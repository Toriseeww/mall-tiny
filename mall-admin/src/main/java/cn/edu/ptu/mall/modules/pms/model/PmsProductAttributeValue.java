package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_attribute_value")
public class PmsProductAttributeValue  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private Long productAttributeId;
    //手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    private String value;



}
