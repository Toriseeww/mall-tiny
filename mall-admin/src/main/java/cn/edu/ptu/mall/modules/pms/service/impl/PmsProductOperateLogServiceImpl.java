package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsProductOperateLogMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsProductOperateLog;
import cn.edu.ptu.mall.modules.pms.service.PmsProductOperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * (PmsProductOperateLog)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:56:00
 */
@Service("pmsProductOperateLogService")
public class PmsProductOperateLogServiceImpl extends ServiceImpl<PmsProductOperateLogMapper, PmsProductOperateLog> implements PmsProductOperateLogService {
}
