package com.jiangsl.qxglxt.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jiangsl.qxglxt.model.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户管理 Mapper 接口
 * </p>
 *
 * @author jiangsl
 * @since 2020-06-24
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> selectList(Wrapper<SysUser> queryWrapper);


}
