package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 商品属性参数表(PmsProductAttribute)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_attribute")
public class PmsProductAttribute  {
    @TableId
    private Long id;

    
    private Long productAttributeCategoryId;
    
    private String name;
    //属性选择类型：0->唯一；1->单选；2->多选
    private Integer selectType;
    //属性录入方式：0->手工录入；1->从列表中选取
    private Integer inputType;
    //可选值列表，以逗号隔开
    private String inputList;
    //排序字段：最高的可以单独上传图片
    private Integer sort;
    //分类筛选样式：1->普通；1->颜色
    private Integer filterType;
    //检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
    private Integer searchType;
    //相同属性产品是否关联；0->不关联；1->关联
    private Integer relatedStatus;
    //是否支持手动新增；0->不支持；1->支持
    private Integer handAddStatus;
    //属性的类型；0->规格；1->参数
    private Integer type;



}
