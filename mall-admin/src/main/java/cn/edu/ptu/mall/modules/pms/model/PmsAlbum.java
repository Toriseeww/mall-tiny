package cn.edu.ptu.mall.modules.pms.model;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 相册表(PmsAlbum)表实体类
 *
 * @author makejava
 * @since 2022-06-15 15:55:53
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("pms_album")
public class PmsAlbum  {
    @TableId
    private Long id;

    
    private String name;
    
    private String coverPic;
    
    private Integer picCount;
    
    private Integer sort;
    
    private String description;



}
