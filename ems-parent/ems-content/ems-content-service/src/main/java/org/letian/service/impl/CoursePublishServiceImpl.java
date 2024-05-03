package org.letian.service.impl;

import org.letian.model.po.CoursePublish;
import org.letian.mapper.CoursePublishMapper;
import org.letian.service.CoursePublishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程发布 服务实现类
 * </p>
 *
 * @author letian
 */
@Slf4j
@Service
public class CoursePublishServiceImpl extends ServiceImpl<CoursePublishMapper, CoursePublish> implements CoursePublishService {

}
