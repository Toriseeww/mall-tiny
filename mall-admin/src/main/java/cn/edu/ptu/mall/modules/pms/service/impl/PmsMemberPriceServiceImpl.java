package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsMemberPriceMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsMemberPrice;
import cn.edu.ptu.mall.modules.pms.service.PmsMemberPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格表(PmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 16:09:21
 */
@Service("pmsMemberPriceService")
public class PmsMemberPriceServiceImpl extends ServiceImpl<PmsMemberPriceMapper, PmsMemberPrice> implements PmsMemberPriceService {

}
