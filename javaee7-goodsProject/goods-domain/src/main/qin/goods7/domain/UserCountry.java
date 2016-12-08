package qin.goods7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * 国家实体类
 *
 * @author qinzhengying
 * @since 1.7 2016-12-8
 */
@Entity
@Table(name = "qin_userCountry7")
@SuppressWarnings("all")
public class UserCountry implements SuperEntity7<Long>
{
    private static final long serialVersionUID = 1949335136356543560L;

    //region 主键

    private Long id;

    @Id
    @GeneratedValue
    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region 上级部门
    private UserCountry parent;

    @ManyToOne(targetEntity = UserCountry.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "col_parent_id", foreignKey = @ForeignKey(name = "fk_parent_id"))
    @JoinTable(name = "qin_usercountry_parent7")
    public UserCountry getParent()
    {
        return parent;
    }

    public void setParent(UserCountry parent)
    {
        this.parent = parent;
    }
    //endregion

    //region 对应子部门
    private Set<UserCountry> childrenSet = new HashSet<>();

    @OneToMany(targetEntity = UserCountry.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "col_children_set", foreignKey = @ForeignKey(name = "fk_children_set"))
    @JoinTable(name = "qin_userCountry_children_set7")
    public Set<UserCountry> getChildrenSet()
    {
        return childrenSet;
    }

    public void setChildrenSet(Set<UserCountry> childrenSet)
    {
        this.childrenSet = childrenSet;
    }
    //endregion

    //region 国家名称
    private String name;

    @Column(name = "country_name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //endregion

    //region 与用户关联
    private Set<User> userSet = new HashSet<>();

    @OneToMany(targetEntity = User.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "col_user_set", foreignKey = @ForeignKey(name = "fk_user_set"))
    @JoinTable(name = "qin_userCountry_user_set7")
    public Set<User> getUserSet()
    {
        return userSet;
    }

    public void setUserSet(Set<User> userSet)
    {
        this.userSet = userSet;
    }
    //endregion

    //region 构造函数
    public UserCountry()
    {

    }

    public UserCountry(String name)
    {
        this.name = name;
    }
    //endregion
}