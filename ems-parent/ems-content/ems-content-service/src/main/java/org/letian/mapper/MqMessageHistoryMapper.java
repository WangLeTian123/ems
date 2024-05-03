package org.letian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.letian.model.po.MqMessageHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author letian
 */
@Mapper
public interface MqMessageHistoryMapper extends BaseMapper<MqMessageHistory> {

}
