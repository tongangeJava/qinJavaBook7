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
 * 商品类型实体类
 *
 * @author qinzhengying
 * @since 1.7 2016/12/9
 */
@Entity
@Table(name = "qin_goodsType7")
public class GoodsType implements SuperEntity7<Long>
{
    //region 构造函数
    public GoodsType()
    {

    }

    public GoodsType(String goodsTypeName)
    {
        this.goodsTypeName = goodsTypeName;
    }
    //endregion

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

    //region 类型编号
    /**
     * 类型编号
     */
    private Long goodsTypeId;

    @Column(unique = true)
    public Long getGoodsTypeId()
    {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId)
    {
        this.goodsTypeId = goodsTypeId;
    }
    //endregion

    //region 类型名称
    /**
     * 类型名称
     */
    private String goodsTypeName;

    @Column(unique = true, length = 400)
    public String getGoodsTypeName()
    {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName)
    {
        this.goodsTypeName = goodsTypeName;
    }
    //endregion

    //region 对应商品
    /**
     * 对应商品
     */
    private Set<Goods> goodsTypeSet = new HashSet<>();

    @OneToMany(targetEntity = Goods.class)
    @JoinTable
            (
                    name = "goodsType_goodsSet7",
                    joinColumns = @JoinColumn(name = "joinColumn_goodsSet", foreignKey = @ForeignKey(name = "fk_goodsSet"))
            )
    public Set<Goods> getGoodsTypeSet()
    {
        return goodsTypeSet;
    }

    public void setGoodsTypeSet(Set<Goods> goodsTypeSet)
    {
        this.goodsTypeSet = goodsTypeSet;
    }
    //endregion

    //region 下级分类
    /**
     * 下级分类
     */
    private Set<GoodsType> goodsType_childrenSet = new HashSet<>();

    @OneToMany(targetEntity = GoodsType.class, cascade = CascadeType.REMOVE)
    @JoinTable
            (
                    name = "goodstype_childrenSet7",
                    joinColumns = @JoinColumn(name = "joinColumn_children", foreignKey = @ForeignKey(name = "fk_children"))
            )
    public Set<GoodsType> getGoodsType_childrenSet()
    {
        return goodsType_childrenSet;
    }

    public void setGoodsType_childrenSet(Set<GoodsType> goodsType_childrenSet)
    {
        this.goodsType_childrenSet = goodsType_childrenSet;
    }
    //endregion

    //region 上级分类
    /**
     * 上级分类
     */
    private GoodsType goodsTypeParent;

    @ManyToOne(targetEntity = GoodsType.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "joinColumn_parent", foreignKey = @ForeignKey(name = "fk_parent"))
    public GoodsType getGoodsTypeParent()
    {
        return goodsTypeParent;
    }

    public void setGoodsTypeParent(GoodsType goodsTypeParent)
    {
        this.goodsTypeParent = goodsTypeParent;
    }
    //endregion

}