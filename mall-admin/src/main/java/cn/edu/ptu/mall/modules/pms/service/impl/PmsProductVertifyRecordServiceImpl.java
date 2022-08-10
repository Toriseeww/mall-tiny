package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductVertifyRecordMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductVertifyRecord;
import cn.edu.ptu.mall.modules.pms.service.PmsProductVertifyRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品审核记录(PmsProductVertifyRecord)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductVertifyRecordService")
public class PmsProductVertifyRecordServiceImpl extends ServiceImpl<PmsProductVertifyRecordMapper, PmsProductVertifyRecord> implements PmsProductVertifyRecordService {
}
