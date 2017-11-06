package ssm.blog.dao;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;
import tk.mybatis.mapper.common.Mapper;

/**
 * 持久层接口
 */

@Repository
public interface BloggerMapper extends Mapper<Blogger>{
    /**
     * 查询博主信息
     * @return
     */
//    Blogger getBloggerData();

}
