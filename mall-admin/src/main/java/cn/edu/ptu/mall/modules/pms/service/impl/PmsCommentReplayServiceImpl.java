package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsCommentReplayMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsCommentReplay;
import cn.edu.ptu.mall.modules.pms.service.PmsCommentReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 产品评价回复表(PmsCommentReplay)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayMapper, PmsCommentReplay> implements PmsCommentReplayService {
}
