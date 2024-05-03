package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.Teachplan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface TeachplanMapper extends BaseMapper<Teachplan> {

}
