package cn.edu.ptu.mall.modules.oms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 订单中所包含的商品(OmsOrderItem)表实体类
 *
 * @author makejava
 * @since 2022-06-19 10:20:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_item")
public class OmsOrderItem  {
    @TableId
    private Long id;

    //订单id
    private Long orderId;
    //订单编号
    private String orderSn;
    
    private Long productId;
    
    private String productPic;
    
    private String productName;
    
    private String productBrand;
    
    private String productSn;
    //销售价格
    private Double productPrice;
    //购买数量
    private Integer productQuantity;
    //商品sku编号
    private Long productSkuId;
    //商品sku条码
    private String productSkuCode;
    //商品分类id
    private Long productCategoryId;
    //商品的销售属性
    private String sp1;
    
    private String sp2;
    
    private String sp3;
    //商品促销名称
    private String promotionName;
    //商品促销分解金额
    private Double promotionAmount;
    //优惠券优惠分解金额
    private Double couponAmount;
    //积分优惠分解金额
    private Double integrationAmount;
    //该商品经过优惠后的分解金额
    private Double realAmount;
    
    private Integer giftIntegration;
    
    private Integer giftGrowth;
    //商品销售属性
    private String productAttr;



}
