package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save12 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "中西药品",
                  "营养健康",
                  "营养成分",
                  "滋补养生",
                  "成人用品",
                  "保健器械",
                  "护理护具"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '中西药品'").list().get(0);
        String[] children =
                  {
                            "感冒咳嗽",
                            "补肾壮阳",
                            "补气养血",
                            "止痛镇痛",
                            "耳鼻喉用药",
                            "眼科用药",
                            "口腔用药",
                            "皮肤用药",
                            "肠胃消化",
                            "风湿骨外伤",
                            "男科/泌尿",
                            "妇科用药",
                            "儿科用药",
                            "心脑血管",
                            "肝胆用药"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '营养健康'").list().get(0);
        String[] children =
                  {
                            "保健3免1",
                            "调节免疫",
                            "调节三高",
                            "缓解疲劳",
                            "美体塑身",
                            "美容养颜",
                            "肝肾养护",
                            "肠胃养护",
                            "明目益智",
                            "骨骼健康",
                            "改善睡眠",
                            "抗氧化",
                            "耐缺氧"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '营养成分'").list().get(0);
        String[] children =
                  {
                            "维生素/矿物质",
                            "蛋白质",
                            "鱼油/磷脂",
                            "螺旋藻",
                            "番茄红素",
                            "叶酸",
                            "葡萄籽",
                            "左旋肉碱",
                            "辅酶Q10",
                            "益生菌",
                            "玛咖",
                            "膳食纤维",
                            "牛初乳",
                            "胶原蛋白",
                            "大豆异黄酮",
                            "芦荟提取",
                            "酵素"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '滋补养生'").list().get(0);
        String[] children =
                  {
                            "阿胶",
                            "蜂蜜/蜂产品",
                            "枸杞",
                            "燕窝",
                            "海参_",
                            "冬虫夏草",
                            "人参/西洋参",
                            "三七",
                            "鹿茸",
                            "雪蛤",
                            "青钱柳",
                            "石斛/枫斗",
                            "灵芝/孢子粉",
                            "当归",
                            "养生茶饮",
                            "药食同源"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '成人用品'").list().get(0);
        String[] children =
                  {
                            "安全避孕",
                            "验孕测孕",
                            "人体润滑",
                            "男用延时",
                            "男用器具",
                            "女用器具",
                            "情趣内衣"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '保健器械'").list().get(0);
        String[] children =
                  {
                            "器械3免1",
                            "血压计",
                            "血糖仪",
                            "血氧仪",
                            "体温计",
                            "体重秤",
                            "胎心仪",
                            "呼吸制氧",
                            "雾化器",
                            "助听器",
                            "轮椅",
                            "拐杖",
                            "中医保健",
                            "养生器械",
                            "理疗仪",
                            "家庭护理",
                            "智能健康"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '护理护具'").list().get(0);
        String[] children =
                  {
                            "隐形眼镜",
                            "护理液",
                            "口罩",
                            "眼罩/耳塞",
                            "跌打损伤",
                            "暖贴",
                            "鼻喉护理",
                            "眼部保健",
                            "美体护理"
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
           /* saveChildren7();
            saveChildren8();
            saveChildren9();
            saveChildren10();
            saveChildren11();
            saveChildren12();
    */
        transaction.commit();
    }
}