package cn.edu.ptu.mall.modules.oms.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class OmsWebReturn {
    //订单编号
    private Long id;
    //申请时间
    private Date createTime;
    //申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
    private Integer status;
    //处理时间
    private Date handleTime;
    //处理人员
    private String handleMan;
}
