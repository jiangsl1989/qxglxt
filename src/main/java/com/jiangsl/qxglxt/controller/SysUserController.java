package com.jiangsl.qxglxt.controller;


import com.jiangsl.qxglxt.dao.SysUserMapper;
import com.jiangsl.qxglxt.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author jiangsl
 * @since 2020-06-24
 */
@Controller
@RequestMapping("//sys-user")
public class SysUserController {
    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public List<SysUser> searchList(){
        List<SysUser> list = sysUserMapper.selectList(null);
        return list;
    }

}
