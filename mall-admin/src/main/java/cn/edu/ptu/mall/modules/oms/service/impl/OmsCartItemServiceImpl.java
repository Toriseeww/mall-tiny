package cn.edu.ptu.mall.modules.oms.service.impl;;

import cn.edu.ptu.mall.modules.oms.mapper.OmsCartItemMapper;
import cn.edu.ptu.mall.modules.oms.model.OmsCartItem;
import cn.edu.ptu.mall.modules.oms.service.OmsCartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 购物车表(OmsCartItem)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:20:38
 */
@Service("omsCartItemService")
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem> implements OmsCartItemService {

}
