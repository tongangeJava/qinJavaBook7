package qin.goods7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * 商品实体类
 *
 * @author qinzhengying
 * @since 1.7 2016/12/9
 */
@Entity
@Table(name = "qin_goods7")
public class Goods implements SuperEntity7<Long>
{
    //region 构造函数
    public Goods()
    {

    }

    public Goods(String goodsName)
    {
        this.goodsName = goodsName;
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

    //region 商品分类
    /**
     * 商品分类
     */
    private GoodsType goodsType;

    @ManyToOne(targetEntity = GoodsType.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "joinColumn_goods_goodsType", foreignKey = @ForeignKey(name = "fk_goods_goodsType"))
    public GoodsType getGoodsType()
    {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType)
    {
        this.goodsType = goodsType;
    }
    //endregion

    //region 商品名称
    /**
     * 商品名称
     */
    private String goodsName;

    @Column(length = 300)
    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }
    //endregion

    //region 商品价格
    /**
     * 商品价格
     */
    private Double goodsPrice;

    @Column
    public Double getGoodsPrice()
    {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice)
    {
        this.goodsPrice = goodsPrice;
    }
    //endregion

    //region 商品库存
    /**
     * 商品库存
     */
    private Long goodsAmount;

    @Column
    public Long getGoodsAmount()
    {
        return goodsAmount;
    }

    public void setGoodsAmount(Long goodsAmount)
    {
        this.goodsAmount = goodsAmount;
    }
    //endregion

    //region 商品详情
    /**
     * 商品详情
     */
    private String goodsDetails;

    @Column(length = 20000)
    public String getGoodsDetails()
    {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails)
    {
        this.goodsDetails = goodsDetails;
    }
    //endregion

    //region 添加时间
    /**
     * 添加时间
     */
    private Date goodsAddDate;

    @Temporal(TemporalType.DATE)
    public Date getGoodsAddDate()
    {
        return goodsAddDate;
    }

    public void setGoodsAddDate(Date goodsAddDate)
    {
        this.goodsAddDate = goodsAddDate;
    }
    //endregion

}