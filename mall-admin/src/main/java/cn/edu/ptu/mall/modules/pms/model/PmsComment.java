package cn.edu.ptu.mall.modules.pms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 商品评价表(PmsComment)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:57
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_comment")
public class PmsComment  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private String memberNickName;
    
    private String productName;
    //评价星数：0->5
    private Integer star;
    //评价的ip
    private String memberIp;
    
    private Date createTime;
    
    private Integer showStatus;
    //购买时的商品属性
    private String productAttribute;
    
    private Integer collectCouont;
    
    private Integer readCount;
    
    private String content;
    //上传图片地址，以逗号隔开
    private String pics;
    //评论用户头像
    private String memberIcon;
    
    private Integer replayCount;



}
