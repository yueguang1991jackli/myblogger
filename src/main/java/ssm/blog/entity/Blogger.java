package ssm.blog.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * 博主信息实体类
 */
@Table(name = "blogger")
public class Blogger implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name="profile")
    private String profile;
    @Column(name = "nickname")
    private String nickName;
    @Column(name = "sign")
    private String sign;
    @Column(name = "imagename")
    private String imageName;

    public Blogger(Integer id, String userName, String password, String profile, String nickName, String sign, String imageName) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.profile = profile;
        this.nickName = nickName;
        this.sign = sign;
        this.imageName = imageName;
    }

    public Integer getId() {

        return id;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sign='" + sign + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProfile() {
        return profile;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSign() {
        return sign;
    }

    public String getImageName() {
        return imageName;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
