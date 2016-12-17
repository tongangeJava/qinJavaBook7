package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save10 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "奶粉",
                  "营养辅食",
                  "尿裤湿巾",
                  "喂养用品",
                  "洗护用品",
                  "寝具服饰",
                  "妈妈专区",
                  "童车童床",
                  "玩具",
                  "乐器"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '奶粉'").list().get(0);
        String[] children =
                  {
                            "1段",
                            "2段",
                            "3段",
                            "4段",
                            "孕妈奶粉",
                            "特殊配方奶粉",
                            "有机奶粉"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '营养辅食'").list().get(0);
        String[] children =
                  {
                            "米粉/菜粉",
                            "面条/粥",
                            "果泥/果汁",
                            "益生菌/初乳",
                            "DHA",
                            "钙铁锌/维生素",
                            "清火/开胃",
                            "宝宝零食"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '尿裤湿巾'").list().get(0);
        String[] children =
                  {
                            "NB",
                            "S",
                            "M",
                            "L",
                            "XL",
                            "XXL",
                            "拉拉裤",
                            "成人尿裤",
                            "婴儿湿巾"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '喂养用品'").list().get(0);
        String[] children =
                  {
                            "奶瓶奶嘴",
                            "吸奶器",
                            "暖奶消毒",
                            "辅食料理机",
                            "牙胶安抚",
                            "食物存储",
                            "儿童餐具",
                            "水壶/水杯",
                            "围兜/防溅衣"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '洗护用品'").list().get(0);
        String[] children =
                  {
                            "宝宝护肤",
                            "日常护理",
                            "洗发沐浴",
                            "洗澡用具",
                            "洗衣液/皂",
                            "理发器_",
                            "婴儿口腔清洁",
                            "坐便器",
                            "驱蚊防晒"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '寝居服饰'").list().get(0);
        String[] children =
                  {
                            "睡袋/抱被",
                            "家居床品",
                            "安全防护",
                            "爬行垫",
                            "婴儿内衣",
                            "婴儿礼盒",
                            "婴儿鞋帽袜",
                            "婴儿外出服"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '妈妈专区'").list().get(0);
        String[] children =
                  {
                            "防辐射服",
                            "孕妈装",
                            "孕妇护肤",
                            "妈咪包/背婴带",
                            "待产护理",
                            "产后塑身",
                            "文胸/内裤",
                            "防溢乳垫",
                            "孕期一样"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '童车童床'").list().get(0);
        String[] children =
                  {
                            "安全座椅_",
                            "婴儿推车",
                            "婴儿床",
                            "婴儿床垫",
                            "餐椅",
                            "学步车",
                            "三轮车",
                            "自行车",
                            "扭扭车",
                            "滑板车",
                            "电动车_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '玩具'").list().get(0);
        String[] children =
                  {
                            "适用年龄",
                            "遥控/电动",
                            "益智玩具",
                            "积木拼插",
                            "动漫玩具",
                            "毛绒布艺",
                            "模型玩具",
                            "健身玩具",
                            "娃娃玩具",
                            "DIY玩具",
                            "创意减压"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '乐器'").list().get(0);
        String[] children =
                  {
                            "钢琴",
                            "电子琴/电钢琴",
                            "吉他/尤克里里",
                            "打击乐器",
                            "西洋管弦",
                            "民族乐器",
                            "乐器配件"
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