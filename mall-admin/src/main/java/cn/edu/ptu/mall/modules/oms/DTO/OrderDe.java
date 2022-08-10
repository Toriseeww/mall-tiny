package cn.edu.ptu.mall.modules.oms.DTO;

import lombok.Data;

@Data
public class OrderDe {
    private Long orderId;
    //订单编号
    private String orderSn;
    //物流公司(配送方式)
    private String deliveryCompany;
    //物流单号
    private String deliverySn;
    //收货人姓名
    private String receiverName;
    //收货人电话
    private String receiverPhone;
    //收货人邮编
    private String receiverPostCode;
    //详细地址
    private String address;
}
