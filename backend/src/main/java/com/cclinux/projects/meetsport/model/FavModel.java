package com.cclinux.projects.meetsport.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cclinux.framework.core.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Notes: 收藏表
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("meetsport_fav")

public class FavModel extends BaseModel {

    @TableId(value = "FAV_ID", type = IdType.AUTO)
    private Long favId;

    @TableField("FAV_USER_ID")
    private long favUserId;

    @TableField("FAV_TITLE")
    private String favTitle;

    @TableField("FAV_TYPE")
    private String favType;

    @TableField("FAV_OID")
    private long favOid;

    @TableField("FAV_PATH")
    private String favPath;


}
