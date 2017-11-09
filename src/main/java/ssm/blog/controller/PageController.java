package ssm.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 主页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 页面跳转
     * @param page
     * @return
     */
    @RequestMapping("/admin/{page}")
    public String toPage(@PathVariable String page){
        return page;
    }
}
