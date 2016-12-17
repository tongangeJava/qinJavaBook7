package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
public class SaveComputer extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "电脑整机",
                  "电脑配件",
                  "外设产品",
                  "游戏设备",
                  "网络产品",
                  "办公设备",
                  "文具耗材",
                  "服务产品"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电脑整机'").list().get(0);
        String[] children =
                  {
                            "笔记本",
                            "游戏本",
                            "平板电脑",
                            "平板电脑配件",
                            "台式机",
                            "一体机",
                            "服务器/工作站",
                            "笔记本配件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电脑配件'").list().get(0);
        String[] children =
                  {
                            "显示器",
                            "CPU",
                            "主板",
                            "硬盘",
                            "内存",
                            "机箱",
                            "电源",
                            "散热器",
                            "刻录机/光驱",
                            "声卡/扩展卡",
                            "装机配件",
                            "显卡",
                            "SSD固态硬盘",
                            "组装电脑"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '外设产品'").list().get(0);
        String[] children =
                  {
                            "鼠标",
                            "键盘",
                            "键鼠套装",
                            "网络仪表仪器",
                            "U盘",
                            "移动硬盘",
                            "鼠标垫",
                            "摄像头",
                            "线缆",
                            "手写板",
                            "硬盘盒",
                            "电脑工具",
                            "电脑清洁",
                            "UPS电源",
                            "插座_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '游戏设备'").list().get(0);
        String[] children =
                  {
                            "游戏机",
                            "游戏耳机",
                            "手柄/方向盘",
                            "游戏软件",
                            "游戏周边"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '网络产品'").list().get(0);
        String[] children =
                  {
                            "路由器",
                            "网络机顶盒",
                            "交换机",
                            "网络存储",
                            "网卡",
                            "4G/3G上网",
                            "网络配件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '办公设备'").list().get(0);
        String[] children =
                  {
                            "投影机",
                            "投影配件",
                            "多功能一体机",
                            "打印机",
                            "传真设备",
                            "验钞/点钞机",
                            "扫描设备",
                            "复合机",
                            "碎纸机",
                            "考勤机",
                            "收银机",
                            "会议音频视频",
                            "保险柜",
                            "装订/封装机",
                            "安防监控",
                            "办公家具",
                            "白板"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '文具耗材'").list().get(0);
        String[] children =
                  {
                            "硒鼓/墨粉",
                            "墨盒",
                            "色带",
                            "纸类",
                            "办公文具",
                            "学生文具",
                            "文件管理",
                            "本册/便签",
                            "计算器",
                            "笔类",
                            "画具画材",
                            "财会用品",
                            "刻录碟片/附件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '服务产品'").list().get(0);
        String[] children =
                  {
                            "延保服务",
                            "上门安装",
                            "维修保养_",
                            "电脑软件"
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

        transaction.commit();
    }
}