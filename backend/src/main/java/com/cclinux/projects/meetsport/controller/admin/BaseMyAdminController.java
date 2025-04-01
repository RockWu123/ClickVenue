package com.cclinux.projects.meetsport.controller.admin;

import com.cclinux.framework.core.platform.controller.BaseAdminController;
import com.cclinux.projects.meetsport.service.admin.AdminMgrService;

import javax.annotation.Resource;

/**
 * @Notes: 本项目管理系统控制器基类
 */
public class BaseMyAdminController extends BaseAdminController {
    @Resource(name = "MeetSportAdminMgrService")
    private AdminMgrService adminMgrService;

}
