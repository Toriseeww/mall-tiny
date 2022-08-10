package cn.edu.ptu.mall.modules.oms.DTO;

import lombok.Data;

@Data
public class OmsWebOrderReturn {
    //收货地址表id
    private Long companyAddressId;
    //退款金额
    private Double returnAmount;
    //申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
    private Integer status;
    //处理备注
    private String handleNote;
    //处理人员
    private String handleMan;
    //收货人
    private String receiveMan;
    //收货备注
    private String receiveNote;
}
