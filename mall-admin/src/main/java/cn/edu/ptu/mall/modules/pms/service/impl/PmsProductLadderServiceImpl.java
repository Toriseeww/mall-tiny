package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductLadderMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductLadder;
import cn.edu.ptu.mall.modules.pms.service.PmsProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 产品阶梯价格表(只针对同商品)(PmsProductLadder)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductLadderService")
public class PmsProductLadderServiceImpl extends ServiceImpl<PmsProductLadderMapper, PmsProductLadder> implements PmsProductLadderService {
}
