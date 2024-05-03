package org.letian.controller;

import org.letian.model.PageParams;
import org.letian.model.PageResult;
import org.letian.model.dto.QueryCourseParamsDto;
import org.letian.model.po.CourseBase;
import org.letian.service.CourseBaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程基本信息 前端控制器
 * </p>
 *
 * @author letian
 */
@Slf4j
@RestController
public class CourseBaseController {

    @Autowired
    private CourseBaseService courseBaseService;

    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {
        return courseBaseService.queryCourseBaseList(pageParams, queryCourseParamsDto);
    }
}
