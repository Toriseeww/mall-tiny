package cn.edu.ptu.mall.modules.pms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 产品评价回复表(PmsCommentReplay)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_comment_replay")
public class PmsCommentReplay  {
    @TableId
    private Long id;

    
    private Long commentId;
    
    private String memberNickName;
    
    private String memberIcon;
    
    private String content;
    
    private Date createTime;
    //评论人员类型；0->会员；1->管理员
    private Integer type;



}
