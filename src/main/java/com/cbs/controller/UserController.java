package com.cbs.controller;


import com.cbs.common.lang.Result;
import com.cbs.entity.User;
import com.cbs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author anonymous
 * @since 2022-03-28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/index")
    public  Object index(){
        User user = userService.getById(1L);
        return Result.succ(user);
    }
}
