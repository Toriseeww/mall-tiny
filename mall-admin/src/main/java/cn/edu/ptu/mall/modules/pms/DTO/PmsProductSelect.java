package cn.edu.ptu.mall.modules.pms.DTO;

import lombok.Data;

@Data
public class PmsProductSelect {
    private Long brandId;
    private String keyword;
    private String productSn;
    private Integer publishStatus;
    private Integer verifyStatus;
    private Long productCategoryId;
}
