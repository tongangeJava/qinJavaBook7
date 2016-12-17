package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save11 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "新鲜水果",
                  "海鲜水产",
                  "肉禽蛋品",
                  "新鲜蔬菜",
                  "冷饮冻食",
                  "中外名酒",
                  "进口食品",
                  "休闲食品",
                  "地方特产",
                  "茗茶",
                  "饮料冲调",
                  "粮油调味_"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '新鲜水果'").list().get(0);
        String[] children =
                  {
                            "进口水果",
                            "国产水果",
                            "苹果",
                            "奇异果",
                            "车厘子",
                            "橙子",
                            "牛油果",
                            "火龙果",
                            "榴莲",
                            "柠檬",
                            "芒果",
                            "时令水果"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '海鲜水产'").list().get(0);
        String[] children =
                  {
                            "虾类",
                            "鱼类",
                            "蟹类",
                            "贝类",
                            "海参",
                            "海产干货",
                            "三文鱼",
                            "北极甜虾",
                            "扇贝",
                            "黄花鱼",
                            "大闸蟹",
                            "鲜活水产"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '肉禽蛋品'").list().get(0);
        String[] children =
                  {
                            "牛肉",
                            "猪肉",
                            "羊肉",
                            "鸡肉",
                            "特色禽类",
                            "牛排",
                            "牛腩",
                            "牛腱",
                            "肋排",
                            "鸡翅",
                            "冷鲜肉",
                            "咸鸭蛋",
                            "鸡蛋"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '新鲜蔬菜'").list().get(0);
        String[] children =
                  {
                            "根茎类",
                            "茄瓜果类",
                            "叶菜类",
                            "葱姜蒜椒",
                            "鲜菌菇",
                            "半加工蔬菜",
                            "西红柿",
                            "玉米",
                            "山药"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '冷饮冻食'").list().get(0);
        String[] children =
                  {
                            "水饺",
                            "面点",
                            "速冻半成品",
                            "火锅丸串",
                            "奶酪/黄油",
                            "汤圆",
                            "冰激凌",
                            "低温奶"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '中外名酒'").list().get(0);
        String[] children =
                  {
                            "白酒",
                            "葡萄酒",
                            "洋酒",
                            "啤酒",
                            "黄酒/养生酒",
                            "收藏酒/陈年老酒"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '进口食品'").list().get(0);
        String[] children =
                  {
                            "牛奶",
                            "饼干蛋糕",
                            "糖果/巧克力",
                            "休闲零食",
                            "冲调饮品",
                            "粮油调味_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '休闲食品'").list().get(0);
        String[] children =
                  {
                            "休闲零食_",
                            "坚果炒货",
                            "肉干肉脯",
                            "熟食腊味",
                            "蜜饯果干",
                            "糖果/巧克力_",
                            "饼干蛋糕_",
                            "无糖食品",
                            "月饼"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '地方特产'").list().get(0);
        String[] children =
                  {
                            "新疆",
                            "四川",
                            "云南",
                            "湖南",
                            "内蒙",
                            "北京",
                            "山西",
                            "福建",
                            "东北",
                            "其他"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '茗茶'").list().get(0);
        String[] children =
                  {
                            "铁观音",
                            "普洱",
                            "龙井",
                            "绿茶",
                            "红茶",
                            "乌龙茶",
                            "花草茶",
                            "花果茶",
                            "黑茶",
                            "白茶",
                            "养生茶",
                            "其他茶"
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
    public void saveChildren10()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '饮料冲调'").list().get(0);
        String[] children =
                  {
                            "饮料",
                            "饮用水",
                            "咖啡/奶茶",
                            "蜂蜜/柚子茶",
                            "冲饮谷物",
                            "成人奶粉"
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
    public void saveChildren11()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '粮油调味'").list().get(0);
        String[] children =
                  {
                            "米面杂粮",
                            "食用油",
                            "调味品",
                            "南北干货",
                            "方便食品",
                            "烘焙原料",
                            "有机食品"
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
        //        saveChildren0();
        //        saveChildren1();
        //        saveChildren2();
        //        saveChildren3();
        //        saveChildren4();
        //        saveChildren5();
        //        saveChildren6();
        //        saveChildren7();
        //        saveChildren8();
        saveChildren9();
        saveChildren10();
        saveChildren11();
            /*
                                        saveChildren12();
                                        */

        transaction.commit();
    }
}