package org.letian.service.impl;

import org.letian.model.po.CourseTeacher;
import org.letian.mapper.CourseTeacherMapper;
import org.letian.service.CourseTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程-教师关系表 服务实现类
 * </p>
 *
 * @author letian
 */
@Slf4j
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher> implements CourseTeacherService {

}
