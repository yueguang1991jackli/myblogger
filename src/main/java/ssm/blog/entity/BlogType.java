package ssm.blog.entity;

import javax.persistence.*;

@Table(name = "t_blogtype")
public class BlogType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String typeName;
    @Column
    private Integer orderNum;

    public BlogType() {
    }

    public BlogType(Integer id, String typeName, Integer orderNum) {
        this.id = id;
        this.typeName = typeName;
        this.orderNum = orderNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
