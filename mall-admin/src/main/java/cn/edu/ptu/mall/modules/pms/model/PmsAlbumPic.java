package cn.edu.ptu.mall.modules.pms.model;;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 画册图片表(PmsAlbumPic)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:56
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_album_pic")
public class PmsAlbumPic  {
    @TableId
    private Long id;

    
    private Long albumId;
    
    private String pic;



}
