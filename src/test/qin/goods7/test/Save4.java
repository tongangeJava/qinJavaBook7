package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
public class Save4 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "厨具",
                  "家纺",
                  "生活日用",
                  "家装软饰",
                  "灯具",
                  "家具",
                  "家装建材"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '厨具'").list().get(0);
        String[] children =
                  {
                            "烹饪锅具",
                            "刀剪菜板",
                            "厨房配件",
                            "水具酒具",
                            "餐具",
                            "茶具/咖啡具"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家纺'").list().get(0);
        String[] children =
                  {
                            "床品套件",
                            "被子",
                            "枕芯",
                            "蚊帐",
                            "凉席",
                            "毛巾浴巾",
                            "床单被罩",
                            "床垫/床褥",
                            "毯子",
                            "抱枕靠垫",
                            "窗帘/窗纱",
                            "电热毯",
                            "布艺软饰"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '生活日用'").list().get(0);
        String[] children =
                  {
                            "收纳用品",
                            "雨伞雨具",
                            "净化除味",
                            "浴室用品",
                            "洗晒/熨烫",
                            "缝纫/针织用品",
                            "清洁工具"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家装软饰'").list().get(0);
        String[] children =
                  {
                            "家居3免1",
                            "桌布/罩件",
                            "地毯地垫",
                            "沙发垫套/椅垫",
                            "装饰字画",
                            "装饰摆件",
                            "手工/十字绣",
                            "相框/照片墙",
                            "墙贴/装饰贴",
                            "花瓶花艺",
                            "香薰蜡烛",
                            "节庆饰品",
                            "钟饰",
                            "帘艺隔断",
                            "创意家居",
                            "保暖防护"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '灯具'").list().get(0);
        String[] children =
                  {
                            "台灯",
                            "吸顶灯_",
                            "筒灯射灯",
                            "LED灯",
                            "节能灯",
                            "落地灯",
                            "五金电器",
                            "应急灯/手电",
                            "装饰灯",
                            "吊灯",
                            "氛围照明"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家具'").list().get(0);
        String[] children =
                  {
                            "卧室家具",
                            "客厅家具",
                            "餐厅家具",
                            "书房家具",
                            "儿童家具",
                            "储物家具",
                            "阳台/户外",
                            "商业办公",
                            "床",
                            "床垫",
                            "沙发",
                            "电脑椅",
                            "衣柜",
                            "茶几",
                            "电视柜",
                            "餐桌",
                            "电脑桌",
                            "鞋架/衣帽架"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家装建材'").list().get(0);
        String[] children =
                  {
                            "家装3免1",
                            "灯饰照明",
                            "厨房卫浴",
                            "五金工具",
                            "电工电料",
                            "墙地面材料",
                            "装饰材料",
                            "装修服务",
                            "吸顶灯",
                            "淋浴花洒",
                            "开关插座",
                            "油漆涂料",
                            "龙头",
                            "智能马桶盖",
                            "监控安防",
                            "门铃"
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

    @Test public void all() {
        saveChildren0();
        saveChildren1();
        saveChildren2();
        saveChildren3();
        saveChildren4();
        saveChildren5();
        saveChildren6();

        transaction.commit();
    }
}