package org.letian.service;

import org.letian.model.PageParams;
import org.letian.model.PageResult;
import org.letian.model.dto.QueryCourseParamsDto;
import org.letian.model.po.CourseBase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author letian
 * @since 2024-05-01
 */
public interface CourseBaseService extends IService<CourseBase> {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
