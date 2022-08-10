package cn.edu.ptu.mall.modules.pms.service.impl;

import cn.edu.ptu.mall.modules.pms.mapper.PmsAlbumPicMapper;
import cn.edu.ptu.mall.modules.pms.model.PmsAlbumPic;
import cn.edu.ptu.mall.modules.pms.service.PmsAlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 画册图片表(PmsAlbumPic)表服务实现类
 *
 * @author makejava
 * @since 2022-06-15 15:55:56
 */
@Service("pmsAlbumPicService")
public class PmsAlbumPicServiceImpl extends ServiceImpl<PmsAlbumPicMapper, PmsAlbumPic> implements PmsAlbumPicService {
}
