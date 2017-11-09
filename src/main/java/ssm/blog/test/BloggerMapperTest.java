package ssm.blog.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.blog.dao.BlogTypeMapper;
import ssm.blog.dao.BloggerMapper;
import ssm.blog.entity.BlogType;
import ssm.blog.entity.Blogger;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml")//设置Spring配置文件路径
public class BloggerMapperTest {

    @Resource//注入对象
    private BloggerMapper bloggerMapper;
    @Resource
    private BlogTypeMapper blogTypeMapper;

    @Test
    public void getBloggerData(){
        Blogger blogger = new Blogger("jack","yueguang1991","didi","diid","hha",null);
        bloggerMapper.insert(blogger);
        List<Blogger> bloggers = bloggerMapper.selectAll();
        System.out.println(bloggers);
    }
    @Test
    public void testBlogType(){
//        int jishu = blogTypeMapper.insert(new BlogType("jishu", 2));
//        System.out.println(jishu);
    }
}
