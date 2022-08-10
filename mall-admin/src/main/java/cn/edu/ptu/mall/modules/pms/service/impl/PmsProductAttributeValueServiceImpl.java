package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductAttributeValueMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductAttributeValue;
import cn.edu.ptu.mall.modules.pms.service.PmsProductAttributeValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductAttributeValueService")
public class PmsProductAttributeValueServiceImpl extends ServiceImpl<PmsProductAttributeValueMapper, PmsProductAttributeValue> implements PmsProductAttributeValueService {
}
