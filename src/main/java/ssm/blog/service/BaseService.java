package ssm.blog.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public abstract class BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    //···········select方法············//

    /**
     * 查询全部结果
     * @return
     */
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    /**
     * 根据主键查询结果
     * @param id
     * @return
     */
    public T selectByPrimaryKey(Object id){
       return  mapper.selectByPrimaryKey(id);
    }

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     * @param record
     * @return
     */
    public List<T> select(T record){
        return mapper.select(record);
    }

    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果抛出异常，查询条件使用等号
     * @param record
     * @return
     */
    public T selectOne(T record){
        return mapper.selectOne(record);
    }

    /**
     * 根据实体中的属性查询总数，查询条件使用等号
     * @param record
     * @return
     */
    public int selectCount(T record){
        return mapper.selectCount(record);
    }
    //````````````insert方法`````````````//

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     * @param record
     * @return
     */
    public int insert(T record){
       return mapper.insert(record);
    }

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     * @param record
     * @return
     */
    public int insertSelective(T record){
       return mapper.insertSelective(record);
    }
    //````````````update方法`````````````````//

    /**
     * 根据主键更新实体全部字段，null值会被更新
     * @param record
     * @return
     */
    public int updateByPrimaryKey(T record){
        return mapper.updateByPrimaryKey(record);
    }
    public int updateByPrimaryKeySelective(T record){
        return mapper.updateByPrimaryKeySelective(record);
    }
    //````````````delete方法`````````````````//
    public int delete(T record){
        return mapper.delete(record);
    }
    public int deleteByPrimaryKey(Object key){
        return mapper.deleteByPrimaryKey(key);
    }
    //`````````````分页``````````````````````//
    /**
     * 单表分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<T> selectPage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = mapper.selectAll();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo;
    }
}
