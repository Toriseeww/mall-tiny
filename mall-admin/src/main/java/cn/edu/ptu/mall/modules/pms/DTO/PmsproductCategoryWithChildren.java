package cn.edu.ptu.mall.modules.pms.DTO;

import cn.edu.ptu.mall.modules.pms.model.PmsProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class PmsproductCategoryWithChildren extends PmsProductCategory {
    @Getter
    @Setter
    private List<PmsProductCategory> children;
}
