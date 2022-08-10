package cn.edu.ptu.mall.modules.pms.model;;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 商品审核记录(PmsProductVertifyRecord)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_product_vertify_record")
public class PmsProductVertifyRecord  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private Date createTime;
    //审核人
    private String vertifyMan;
    
    private Integer status;
    //反馈详情
    private String detail;



}
