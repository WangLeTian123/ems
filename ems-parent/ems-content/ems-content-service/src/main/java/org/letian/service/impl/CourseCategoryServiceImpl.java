package org.letian.service.impl;

import org.letian.model.po.CourseCategory;
import org.letian.mapper.CourseCategoryMapper;
import org.letian.service.CourseCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程分类 服务实现类
 * </p>
 *
 * @author letian
 */
@Slf4j
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory> implements CourseCategoryService {

}
