package com.gx.springbootmybatis.controller;

import com.gx.springbootmybatis.entity.User;
import com.gx.springbootmybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-06-30 14:08:03
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(@RequestParam("id") Integer id) {
        return this.userService.queryById(id);
    }

}
