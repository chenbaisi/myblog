package com.cbs.service.impl;

import com.cbs.entity.Blog;
import com.cbs.mapper.BlogMapper;
import com.cbs.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
