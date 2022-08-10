package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * sku的库存(PmsSkuStock)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:56:01
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_sku_stock")
public class PmsSkuStock  {
    @TableId
    private Long id;

    private Long productId;
    //sku编码
    private String skuCode;
    
    private Double price;
    //库存
    private Integer stock;
    //预警库存
    private Integer lowStock;
    //销售属性1
    private String sp1;
    
    private String sp2;
    
    private String sp3;
    //展示图片
    private String pic;
    //销量
    private Integer sale;
    //单品促销价格
    private Double promotionPrice;
    //锁定库存
    private Integer lockStock;



}
