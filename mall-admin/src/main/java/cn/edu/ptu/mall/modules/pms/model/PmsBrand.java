package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 品牌表(PmsBrand)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:56
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_brand")
public class PmsBrand  {
    @TableId
    private Long id;

    
    private String name;
    //首字母
    private String firstLetter;
    
    private Integer sort;
    //是否为品牌制造商：0->不是；1->是
    private Integer factoryStatus;
    
    private Integer showStatus;
    //产品数量
    private Integer productCount;
    //产品评论数量
    private Integer productCommentCount;
    //品牌logo
    private String logo;
    //专区大图
    private String bigPic;
    //品牌故事
    private String brandStory;



}
