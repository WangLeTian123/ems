package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.CourseBase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程基本信息 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface CourseBaseMapper extends BaseMapper<CourseBase> {

}
