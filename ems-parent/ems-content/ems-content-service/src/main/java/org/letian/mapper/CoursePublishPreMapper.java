package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.CoursePublishPre;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程发布 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface CoursePublishPreMapper extends BaseMapper<CoursePublishPre> {

}
