package com.cbs.service.impl;

import com.cbs.entity.User;
import com.cbs.mapper.UserMapper;
import com.cbs.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anonymous
 * @since 2022-03-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
