package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsCommentMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsComment;
import cn.edu.ptu.mall.modules.pms.service.PmsCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品评价表(PmsComment)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:59
 */
@Service("pmsCommentService")
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentMapper, PmsComment> implements PmsCommentService {

}
