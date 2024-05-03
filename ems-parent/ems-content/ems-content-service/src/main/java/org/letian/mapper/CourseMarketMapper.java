package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.CourseMarket;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程营销信息 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface CourseMarketMapper extends BaseMapper<CourseMarket> {

}
