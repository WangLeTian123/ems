package org.letian.service.impl;

import org.letian.model.po.CourseMarket;
import org.letian.mapper.CourseMarketMapper;
import org.letian.service.CourseMarketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程营销信息 服务实现类
 * </p>
 *
 * @author letian
 */
@Slf4j
@Service
public class CourseMarketServiceImpl extends ServiceImpl<CourseMarketMapper, CourseMarket> implements CourseMarketService {

}
