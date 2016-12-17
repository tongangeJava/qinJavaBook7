package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
public class Save7 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "时尚女鞋",
                  "流行男鞋",
                  "潮流女包",
                  "精品男包",
                  "功能箱包",
                  "奢侈品",
                  "精选大牌",
                  "礼品",
                  "珠宝首饰",
                  "金银投资"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '时尚女鞋'").list().get(0);
        String[] children =
                  {
                            "鞋包3免1",
                            "女靴",
                            "单鞋",
                            "休闲鞋_",
                            "高跟鞋",
                            "内增高",
                            "坡跟鞋",
                            "松糕鞋",
                            "防水台",
                            "鱼嘴鞋",
                            "布鞋/绣花鞋",
                            "拖鞋/人字拖_",
                            "马丁靴",
                            "踝靴",
                            "雪地靴",
                            "妈妈鞋",
                            "帆布鞋_",
                            "雨鞋/雨靴_",
                            "凉鞋",
                            "鞋配件_"

                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren1()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '流行男鞋'").list().get(0);
        String[] children =
                  {
                            "休闲鞋",
                            "商务休闲鞋",
                            "正装鞋",
                            "工装鞋",
                            "男靴",
                            "帆布鞋",
                            "功能鞋",
                            "增高鞋",
                            "定制鞋",
                            "拖鞋/人字拖",
                            "凉鞋/沙滩鞋",
                            "雨鞋/雨靴",
                            "传统布鞋",
                            "鞋配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren2()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '潮流女包'").list().get(0);
        String[] children =
                  {
                            "单肩包",
                            "手提包",
                            "斜挎包",
                            "双肩包_",
                            "钱包_",
                            "手拿包",
                            "卡包/零钱包",
                            "钥匙包_",
                            "真皮包",
                            "帆布包",
                            "小方包",
                            "水桶包",
                            "链条包",
                            "贝壳包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren3()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '精品男包'").list().get(0);
        String[] children =
                  {
                            "男士钱包",
                            "单肩/斜挎包",
                            "商务公文包",
                            "双肩包",
                            "男士手包",
                            "卡包名片夹",
                            "钥匙包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren4()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '功能箱包'").list().get(0);
        String[] children =
                  {
                            "拉杆箱",
                            "拉杆包",
                            "旅行包",
                            "电脑包",
                            "休闲运动包",
                            "书包",
                            "登山包",
                            "腰包/胸包",
                            "旅行配件",
                            "相机包_",
                            "妈咪包"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren5()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '奢侈品'").list().get(0);
        String[] children =
                  {
                            "奢品3免1",
                            "箱包",
                            "钱包=",
                            "服饰",
                            "腰带",
                            "鞋靴",
                            "太阳镜/眼镜框",
                            "饰品",
                            "配件"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren6()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '精选大牌'").list().get(0);
        String[] children =
                  {
                            "GUCCI",
                            "COACH",
                            "雷朋",
                            "施华洛世奇",
                            "MK",
                            "阿玛尼",
                            "菲拉格慕",
                            "VERSACE",
                            "普拉达",
                            "巴宝莉",
                            "万宝龙"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren7()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '礼品'").list().get(0);
        String[] children =
                  {
                            "电子烟",
                            "火机烟具",
                            "军刀军具",
                            "美妆礼品",
                            "工艺礼品",
                            "礼盒礼券",
                            "礼品文具",
                            "收藏品",
                            "古董文玩",
                            "礼品定制",
                            "创意礼品",
                            "电子礼品",
                            "婚庆节庆",
                            "鲜花",
                            "绿植",
                            "熏香",
                            "京东卡"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren8()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '珠宝首饰'").list().get(0);
        String[] children =
                  {
                            "珠宝3免1",
                            "黄金",
                            "K金",
                            "时尚饰品",
                            "钻石",
                            "翡翠玉石",
                            "银饰",
                            "水晶玛瑙",
                            "彩宝",
                            "铂金",
                            "木手串/把件",
                            "珍珠"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren9()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '金银投资'").list().get(0);
        String[] children =
                  {
                            "投资金",
                            "投资银",
                            "投资收藏",
                            "黄金托管"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }
    }
    //endregion

    @Test
    public void all()
    {
        saveChildren0();
        saveChildren1();
        saveChildren2();
        saveChildren3();
        saveChildren4();
        saveChildren5();
        saveChildren6();
        saveChildren7();
        saveChildren8();
        saveChildren9();
        /*
                    saveChildren10();
                    saveChildren11();
                    saveChildren12();
                    */

        transaction.commit();
    }
}