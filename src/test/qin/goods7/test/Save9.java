package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save9 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "汽车车型",
                  "汽车价格",
                  "汽车品牌",
                  "维修保养",
                  "车载电器",
                  "美容清洗",
                  "汽车装饰",
                  "安全自驾",
                  "赛事改装",
                  "汽车服务"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车车型'").list().get(0);
        String[] children =
                  {
                            "微型车",
                            "小型车",
                            "紧凑型车",
                            "中型车",
                            "中大型车",
                            "豪华车",
                            "MPV",
                            "SUV",
                            "跑车"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车价格'").list().get(0);
        String[] children =
                  {
                            "5万以下",
                            "5-8万",
                            "8-10万",
                            "10-15万",
                            "15-25万",
                            "25-40万",
                            "40万以上"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车品牌'").list().get(0);
        String[] children =
                  {
                            "宝马",
                            "上汽大众",
                            "陆风",
                            "一汽奔腾",
                            "东风标致",
                            "比亚迪",
                            "华晨汽车"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '维修保养'").list().get(0);
        String[] children =
                  {
                            "养护3免1",
                            "机油",
                            "添加剂",
                            "防冻液",
                            "滤清器",
                            "火花塞",
                            "雨刷",
                            "车灯",
                            "减震器",
                            "轮胎",
                            "轮毂",
                            "刹车片/盘",
                            "维修配件",
                            "蓄电池",
                            "底盘装甲/护板",
                            "贴膜_",
                            "汽修工具",
                            "改装配件",
                            "正时皮带",
                            "汽车喇叭",
                            "汽车玻璃"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '车载电器'").list().get(0);
        String[] children =
                  {
                            "车品3免1",
                            "行车记录仪",
                            "导航仪",
                            "电源_",
                            "电器配件",
                            "净化器_",
                            "车载影音",
                            "冰箱_",
                            "安全预警仪",
                            "倒车雷达",
                            "蓝牙设备",
                            "智能驾驶",
                            "车载电台",
                            "吸尘器_",
                            "智能车机",
                            "汽车音响",
                            "车载生活电器"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '美容清洗'").list().get(0);
        String[] children =
                  {
                            "车蜡",
                            "镀晶镀膜",
                            "补漆笔",
                            "玻璃水",
                            "清洁剂",
                            "洗车机",
                            "洗车水枪",
                            "洗车配件",
                            "毛巾掸子"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车装饰'").list().get(0);
        String[] children =
                  {
                            "装饰3免1",
                            "脚垫",
                            "座垫",
                            "座套",
                            "后备箱垫",
                            "方向盘套",
                            "头枕腰靠",
                            "香水",
                            "空气净化",
                            "功能小件",
                            "车衣",
                            "挂件摆件",
                            "车身装饰件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '安全自驾'").list().get(0);
        String[] children =
                  {
                            "安全座椅",
                            "胎压监测",
                            "充气泵",
                            "防盗设备",
                            "应急救援",
                            "保温箱",
                            "储物箱",
                            "自驾野营",
                            "摩托车装备",
                            "摩托车"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '赛事改装'").list().get(0);
        String[] children =
                  {
                            "赛事服装",
                            "赛事用品",
                            "制动系统",
                            "悬挂系统",
                            "进气系统",
                            "排气系统",
                            "电子管理",
                            "车身强化"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车服务'").list().get(0);
        String[] children =
                  {
                            "清洗美容",
                            "功能升级",
                            "保养维修",
                            "驾驶培训",
                            "ETC",
                            "加油卡",
                            "油卡充值"
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