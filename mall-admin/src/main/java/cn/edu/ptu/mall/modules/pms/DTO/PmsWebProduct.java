package cn.edu.ptu.mall.modules.pms.DTO;

import cn.edu.ptu.mall.modules.pms.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsWebProduct {
    private Long brandId;//1

    private Long productCategoryId;//1

    private Long feightTemplateId;//1

    private Long productAttributeCategoryId;//1

    private String name;//1

    private String pic;//1
    //货号
    private String productSn;//1
    //删除状态：0->未删除；1->已删除
    private Integer deleteStatus;//1
    //上架状态：0->下架；1->上架
    private Integer publishStatus;//1
    //新品状态:0->不是新品；1->新品
    private Integer newStatus;//1
    //推荐状态；0->不推荐；1->推荐
    private Integer recommandStatus;//1
    //审核状态：0->未审核；1->审核通过
    private Integer verifyStatus;//1
    //排序
    private Integer sort;//1
    //销量
    private Integer sale;//1

    private Double price;//1
    //促销价格
    private Double promotionPrice;//1
    //赠送的成长值
    private Integer giftGrowth;//1
    //赠送的积分
    private Integer giftPoint;//1
    //限制使用的积分数
    private Integer usePointLimit;//1
    //副标题
    private String subTitle;//1
    //商品描述
    private String description;//1
    //市场价
    private Double originalPrice;//1
    //库存
    private Integer stock;//1
    //库存预警值
    private Integer lowStock;//1
    //单位
    private String unit;//1
    //商品重量，默认为克
    private Double weight;//1
    //是否为预告商品：0->不是；1->是
    private Integer previewStatus;//1
    //以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
    private String serviceIds;//1

    private String keywords;//1

    private String note;//1
    //画册图片，连产品图片限制为5张，以逗号分割
    private String albumPics;//1

    private String detailTitle;//1

    private String detailDesc;//1
    //产品详情网页内容
    private String detailHtml;//1
    //移动端网页详情
    private String detailMobileHtml;//1
    //促销开始时间
    private Date promotionStartTime;//1
    //促销结束时间
    private Date promotionEndTime;//1
    //活动限购数量
    private Integer promotionPerLimit;//1
    //促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
    private Integer promotionType;//1
    //品牌名称
    private String brandName;//1
    //商品分类名称
    private String productCategoryName;//1

    private PmsSkuStock skuStockList;//1

    private Integer flashPromotionCount;//1
    private Integer flashPromotionId;//1
    private Integer flashPromotionPrice;//1
    private Integer flashPromotionSort;//1

    private PmsMemberPrice memberPriceList;//1

    private PmsProductFullReduction productFullReductionList;//1

    private PmsProductLadder productLadderList;//1
    private PmsProductAttributeValue productAttributeValueList;//1
}
