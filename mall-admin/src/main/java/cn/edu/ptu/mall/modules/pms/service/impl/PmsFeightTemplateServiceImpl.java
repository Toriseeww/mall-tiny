package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsFeightTemplateMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsFeightTemplate;
import cn.edu.ptu.mall.modules.pms.service.PmsFeightTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 运费模版(PmsFeightTemplate)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@Service("pmsFeightTemplateService")
public class PmsFeightTemplateServiceImpl extends ServiceImpl<PmsFeightTemplateMapper, PmsFeightTemplate> implements PmsFeightTemplateService {
}
