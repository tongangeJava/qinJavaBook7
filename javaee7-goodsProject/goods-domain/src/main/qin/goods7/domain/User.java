package qin.goods7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 用户实体类
 *
 * @author qinzhengying
 * @since 1.7 2016/12/06
 */
@Entity
@Table(name = "qin_user7")
@SuppressWarnings("all")
public class User implements SuperEntity7<Integer>
{
    private static final long serialVersionUID = -6403413433375206577L;

    //region 主键
    private Integer id;

    @Id
    @GeneratedValue
    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
    //endregion

    //region 首姓名
    /**
     * 首姓名
     */
    private String firstName;

    @Column(name = "user_firstName", length = 6)
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    //endregion

    //region 尾姓名
    /**
     * 尾姓名
     */
    private String lastName;

    @Column(name = "user_lastName", length = 16)
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    //endregion

    //region 真实姓名
    /**
     * 真实姓名
     */
    private String realName;

    @Column(name = "user_realName", length = 9)
    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }
    //endregion

    //region 登录名
    /**
     * 登录名
     */
    private String loginName;

    @Column(name = "user_loginName", length = 30)
    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    //endregion

    //region 密码
    /**
     * 密码
     */
    private String password;

    @Column(name = "user_password", length = 30)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    //endregion

    //region 确认密码
    /**
     * 确认密码
     */
    private String surePassword;

    @Transient
    public String getSurePassword()
    {
        return surePassword;
    }

    public void setSurePassword(String surePassword)
    {
        this.surePassword = surePassword;
    }
    //endregion

    //region 性别
    /**
     * 性别
     */
    private UserGender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender")
    public UserGender getGender()
    {
        return gender;
    }

    public void setGender(UserGender gender)
    {
        this.gender = gender;
    }
    //endregion

    //region 所属国家
    /**
     * 所属国家
     */
    private UserCountry userCountry;

    @ManyToOne(targetEntity = UserCountry.class, cascade = CascadeType.REMOVE)
    @JoinTable(name = "qin_user_join_country7", foreignKey = @ForeignKey(name = "fk_user_country_id"))
    public UserCountry getUserCountry()
    {
        return userCountry;
    }

    public void setUserCountry(UserCountry userCountry)
    {
        this.userCountry = userCountry;
    }
    //endregion

    //region 籍贯
    /**
     * 籍贯
     */
    private String nation;

    @Column(name = "user_nation", length = 5)
    public String getNation()
    {
        return nation;
    }

    public void setNation(String nation)
    {
        this.nation = nation;
    }
    //endregion

    //region 出生年月
    /**
     * 出生年月
     */
    private Date birthdate;

    @Temporal(value = TemporalType.DATE)
    public Date getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
    }
    //endregion

    //region 联系方式
    /**
     * 联系方式
     */
    private String phone;

    @Column(name = "user_phone", length = 30)
    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    //endregion

    //region 邮箱
    /**
     * 邮箱
     */
    private String email;

    @Column(name = "user_email", length = 60)
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    //endregion

    //region 昵称
    /**
     * 昵称
     */
    private String username;

    @Column(name = "user_myName", length = 60)
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    //endregion


}