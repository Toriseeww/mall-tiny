package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 产品分类(PmsProductCategory)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_category")
public class PmsProductCategory  {
    @TableId
    private Long id;

    //上机分类的编号：0表示一级分类
    private Long parentId;
    
    private String name;
    //分类级别：0->1级；1->2级
    private Integer level;
    
    private Integer productCount;
    
    private String productUnit;
    //是否显示在导航栏：0->不显示；1->显示
    private Integer navStatus;
    //显示状态：0->不显示；1->显示
    private Integer showStatus;
    
    private Integer sort;
    //图标
    private String icon;
    
    private String keywords;
    //描述
    private String description;



}
