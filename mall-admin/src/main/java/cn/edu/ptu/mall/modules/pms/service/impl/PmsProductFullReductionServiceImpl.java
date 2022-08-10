package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductFullReductionMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductFullReduction;
import cn.edu.ptu.mall.modules.pms.service.PmsProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 产品满减表(只针对同商品)(PmsProductFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductFullReductionService")
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements PmsProductFullReductionService {
}
