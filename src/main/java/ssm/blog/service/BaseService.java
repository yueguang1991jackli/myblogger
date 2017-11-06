package ssm.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service
public class BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

}
