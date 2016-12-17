package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save13 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "音像",
                  "少儿",
                  "教育",
                  "文艺",
                  "经管励志",
                  "人文社科",
                  "生活",
                  "科技",
                  "刊/原版",
                  "电子书",
                  "数字音乐"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '音像'").list().get(0);
        String[] children =
                  {
                            "音乐",
                            "影视",
                            "教育音像",
                            "游戏_",
                            "影视/动漫周边"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '少儿'").list().get(0);
        String[] children =
                  {
                            "0-2岁",
                            "3-6岁",
                            "7-10岁",
                            "11-14岁",
                            "儿童文学",
                            "绘本",
                            "科普",
                            "幼儿启蒙",
                            "手工游戏",
                            "智力开发"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '教育'").list().get(0);
        String[] children =
                  {
                            "教材",
                            "中小学教辅",
                            "考试",
                            "外语学习",
                            "字典词典"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '文艺'").list().get(0);
        String[] children =
                  {
                            "小说",
                            "文学",
                            "青春文学",
                            "传记",
                            "动漫",
                            "艺术",
                            "摄影",
                            "书法",
                            "音乐_",
                            "绘画"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '经管励志'").list().get(0);
        String[] children =
                  {
                            "管理",
                            "金融与投资",
                            "经济",
                            "励志与成功_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '人文社科'").list().get(0);
        String[] children =
                  {
                            "历史",
                            "心理学",
                            "政治/军事",
                            "国学/古籍",
                            "哲学/宗教",
                            "社会科学",
                            "法律",
                            "文化"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '生活'").list().get(0);
        String[] children =
                  {
                            "育儿/家教",
                            "孕产/胎教",
                            "健身保健",
                            "旅游/地图",
                            "美食",
                            "时尚美妆",
                            "家居",
                            "手工DIY",
                            "两性",
                            "体育"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '科技'").list().get(0);
        String[] children =
                  {
                            "计算机与互联网",
                            "科普_",
                            "建筑",
                            "工业技术",
                            "电子/通信",
                            "医学",
                            "科学与自然",
                            "农林"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '刊/原版'").list().get(0);
        String[] children =
                  {
                            "杂志/期刊",
                            "英文原版书",
                            "港台图书"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电子书'").list().get(0);
        String[] children =
                  {
                            "畅读VIP",
                            "小说_",
                            "励志与成功=",
                            "经济金融",
                            "文学_",
                            "社科",
                            "婚恋两性",
                            "外文原版",
                            "免费"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '数字音乐'").list().get(0);
        String[] children =
                  {
                            "通俗流行",
                            "古典音乐",
                            "摇滚说唱",
                            "爵士蓝调",
                            "乡村民谣",
                            "有声读物"
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
//        saveChildren9();
        saveChildren10();
      /*  saveChildren11();
        saveChildren12();*/
        transaction.commit();
    }
}