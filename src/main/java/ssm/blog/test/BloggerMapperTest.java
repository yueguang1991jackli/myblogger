package ssm.blog.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.blog.dao.BloggerMapper;
import ssm.blog.entity.Blogger;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml")//设置Spring配置文件路径
public class BloggerMapperTest {
    @Resource//注入对象
    private BloggerMapper bloggerMapper;
    @Test
    public void getBloggerData(){
        List<Blogger> bloggers = bloggerMapper.selectAll();
        System.out.println(bloggers);
    }
}
