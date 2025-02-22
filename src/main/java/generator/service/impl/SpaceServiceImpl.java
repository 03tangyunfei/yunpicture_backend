package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Space;
import generator.service.SpaceService;
import generator.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

/**
* @author tangyunfei
* @description 针对表【space(空间)】的数据库操作Service实现
* @createDate 2025-02-22 13:10:05
*/
@Service
public class SpaceServiceImpl extends ServiceImpl<SpaceMapper, Space>
    implements SpaceService{

}




