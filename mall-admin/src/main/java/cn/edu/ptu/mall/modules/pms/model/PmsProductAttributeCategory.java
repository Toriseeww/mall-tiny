package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 产品属性分类表(PmsProductAttributeCategory)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_attribute_category")
public class PmsProductAttributeCategory  {
    @TableId
    private Long id;

    
    private String name;
    //属性数量
    private Integer attributeCount;
    //参数数量
    private Integer paramCount;



}
