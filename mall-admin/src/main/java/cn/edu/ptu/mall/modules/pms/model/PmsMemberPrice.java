package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 商品会员价格表(PmsMemberPrice)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_member_price")
public class PmsMemberPrice  {
    @TableId
    private Long id;

    
    private Long productId;
    
    private Long memberLevelId;
    //会员价格
    private Double memberPrice;
    
    private String memberLevelName;



}
