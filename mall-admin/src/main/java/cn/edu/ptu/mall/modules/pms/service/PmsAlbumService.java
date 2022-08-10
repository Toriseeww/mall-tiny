package cn.edu.ptu.mall.modules.pms.service;;

import cn.edu.ptu.mall.modules.pms.model.PmsAlbum;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.domain.PageRequest;


/**
 * 相册表(PmsAlbum)表服务接口
 *
 * @author makejava
 * @since 2022-06-15 15:55:54
 */

public interface PmsAlbumService extends IService<PmsAlbum> {

    Object queryByPage(PmsAlbum pmsAlbum, PageRequest pageRequest);
}
