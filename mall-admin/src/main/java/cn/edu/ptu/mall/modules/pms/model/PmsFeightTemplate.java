package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 运费模版(PmsFeightTemplate)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_feight_template")
public class PmsFeightTemplate  {
    @TableId
    private Long id;

    
    private String name;
    //计费类型:0->按重量；1->按件数
    private Integer chargeType;
    //首重kg
    private Double firstWeight;
    //首费（元）
    private Double firstFee;
    
    private Double continueWeight;
    
    private Double continmeFee;
    //目的地（省、市）
    private String dest;



}
