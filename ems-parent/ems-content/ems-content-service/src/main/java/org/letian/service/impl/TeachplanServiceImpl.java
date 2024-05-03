package org.letian.service.impl;

import org.letian.model.po.Teachplan;
import org.letian.mapper.TeachplanMapper;
import org.letian.service.TeachplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程计划 服务实现类
 * </p>
 *
 * @author letian
 */
@Slf4j
@Service
public class TeachplanServiceImpl extends ServiceImpl<TeachplanMapper, Teachplan> implements TeachplanService {

}
