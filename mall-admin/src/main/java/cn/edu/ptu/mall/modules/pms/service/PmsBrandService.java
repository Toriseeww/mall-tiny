package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.model.PmsBrand;
import cn.edu.ptu.mall.modules.ums.model.UmsRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 品牌表(PmsBrand)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:55:56
 */
public interface PmsBrandService extends IService<PmsBrand> {
    Page<PmsBrand> list(String keyword, Integer pageSize, Integer pageNum);
    boolean showStatus(List<Long> ids, Integer showStatus);
    PmsBrand factorStatus(Long ids,Integer factoryStatus);
    Page<PmsBrand> delete(String keyword, Integer pageSize, Integer pageNum, Long id);
}
