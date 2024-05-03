package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.CourseTeacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程-教师关系表 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface CourseTeacherMapper extends BaseMapper<CourseTeacher> {

}
