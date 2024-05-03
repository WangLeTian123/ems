package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.CourseCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

}
