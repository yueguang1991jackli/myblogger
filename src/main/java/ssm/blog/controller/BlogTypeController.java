package ssm.blog.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.blog.entity.BlogType;
import ssm.blog.service.impl.BlogTypeServiceImpl;
import ssm.blog.utils.jsonBean.DataGrid;

import java.util.List;

@Controller
@RequestMapping("/blogType")
public class BlogTypeController {
    @Autowired
    private BlogTypeServiceImpl baseService;
    @RequestMapping("/datagrid")
    @ResponseBody
    public DataGrid<BlogType> listBlogtype(@Param(value = "page")int  page,@Param(value = "rows") int rows){
        PageInfo<BlogType> blogTypePageInfo = baseService.selectPage(page, rows);
        DataGrid<BlogType> dataGrid = new DataGrid<>();
        dataGrid.setTotal(blogTypePageInfo.getTotal());
        dataGrid.setRows(blogTypePageInfo.getList());
        return dataGrid;
    }
}
