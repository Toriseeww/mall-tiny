package cn.edu.ptu.mall.modules.pms.service.impl;;

import cn.edu.ptu.mall.modules.pms.mapper.PmsAlbumMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsAlbum;
import cn.edu.ptu.mall.modules.pms.service.PmsAlbumService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * 相册表(PmsAlbum)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:54
 */
@Service("pmsAlbumService")
public class PmsAlbumServiceImpl extends ServiceImpl<PmsAlbumMapper, PmsAlbum> implements PmsAlbumService {


    @Override
    public Object queryByPage(PmsAlbum pmsAlbum, PageRequest pageRequest) {
        return new Object();
    }
}
