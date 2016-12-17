package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
public class Save6 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "面部护肤",
                  "洗发护发",
                  "身体护理",
                  "口腔护理",
                  "女性护理",
                  "香水彩妆",
                  "清洁用品",
                  "宠物生活"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '面部护肤'").list().get(0);
        String[] children =
                  {
                            "卸妆",
                            "洁面",
                            "爽肤水",
                            "乳液面霜",
                            "精华",
                            "眼霜",
                            "防晒",
                            "面膜",
                            "剃须",
                            "套装"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren1()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '洗发护发'").list().get(0);
        String[] children =
                  {
                            "洗发",
                            "护发",
                            "染发",
                            "造型",
                            "假发",
                            "美发工具",
                            "套装_"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren2()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '身体护理'").list().get(0);
        String[] children =
                  {
                            "沐浴",
                            "润肤",
                            "精油",
                            "颈部",
                            "手足",
                            "纤体塑形",
                            "美胸",
                            "套装=="
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren3()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '口腔护理'").list().get(0);
        String[] children =
                  {
                            "牙膏/牙粉",
                            "牙刷/牙线",
                            "漱口水",
                            "套装==="
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren4()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '女性护理'").list().get(0);
        String[] children =
                  {
                            "卫生巾",
                            "卫生护垫",
                            "私密护理",
                            "脱毛膏"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren5()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '香水彩妆'").list().get(0);
        String[] children =
                  {
                            "女士香水",
                            "男士香水",
                            "底妆",
                            "眉笔",
                            "睫毛膏",
                            "眼线",
                            "眼影",
                            "唇膏/彩",
                            "腮红",
                            "美甲",
                            "美妆工具",
                            "套装===="
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren6()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '清洁用品'").list().get(0);
        String[] children =
                  {
                            "纸品湿巾",
                            "衣物清洁",
                            "清洁工具_",
                            "家庭清洁",
                            "一次性用品",
                            "驱虫用品",
                            "皮具护理"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
    }
    //endregion

    //region 保存
    @Test
    public void saveChildren7()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '宠物生活'").list().get(0);
        String[] children =
                  {
                            "水族用品",
                            "宠物主粮",
                            "宠物零食",
                            "猫砂/尿布",
                            "洗护美容",
                            "家居日用",
                            "医疗保健",
                            "出行装备",
                            "宠物玩具",
                            "宠物牵引",
                            "宠物驱虫"
                  };
        for (int i = 0; i < children.length; i++)
        {
            GoodsType goodsType = new GoodsType(children[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        transaction.commit();
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
        /*
                saveChildren8();
                saveChildren9();
                saveChildren10();
                saveChildren11();
                saveChildren12();
                */
    }
}