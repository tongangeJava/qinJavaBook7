package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

@SuppressWarnings("all")
public class SaveMobile extends SpringTest
{
    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '手机通讯'").list().get(0);

        String[] children =
                  {
                            "手机",
                            "对讲机",
                            "以旧换新",
                            "手机维修"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '运营商'").list().get(0);
        String[] children =
                  {
                            "充话费/流量",
                            "170选号",
                            "合约机",
                            "办套餐",
                            "选号码",
                            "固话宽带",
                            "京东通信",
                            "中国移动",
                            "中国联通",
                            "中国电信"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '手机配件'").list().get(0);
        String[] children =
                  {
                            "手机壳",
                            "贴膜",
                            "手机存储卡",
                            "数据线",
                            "充电器",
                            "手机耳机",
                            "创意配件",
                            "手机饰品",
                            "手机电池",
                            "苹果周边",
                            "移动电源",
                            "蓝牙耳机",
                            "手机支架",
                            "车载配件",
                            "拍照配件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '摄影摄像'").list().get(0);
        String[] children =
                  {
                            "数码相机",
                            "单电/微单相机",
                            "单反相机",
                            "拍立得",
                            "运动相机",
                            "摄像机",
                            "镜头",
                            "户外器材",
                            "影棚器材",
                            "冲印服务",
                            "数码相框"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '数码配件'").list().get(0);
        String[] children =
                  {
                            "存储卡",
                            "三脚架/云台",
                            "相机包",
                            "滤镜",
                            "闪光灯/手柄",
                            "相机清洁/贴膜",
                            "机身附件",
                            "镜头附件",
                            "读卡器",
                            "支架",
                            "电池/充电器"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '影音娱乐'").list().get(0);
        String[] children =
                  {
                            "耳机/耳麦",
                            "音箱/音响",
                            "便携/无线音箱",
                            "收音机",
                            "麦克风",
                            "MP3/MP4",
                            "专业音频"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '智能设备'").list().get(0);
        String[] children =
                  {
                            "智能手环",
                            "智能手表",
                            "智能眼镜",
                            "智能机器人",
                            "运动跟踪器",
                            "健康监测",
                            "智能配饰",
                            "智能家居",
                            "体感车",
                            "无人机",
                            "其他配件"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电子教育'").list().get(0);
        String[] children =
                  {
                            "学生平板",
                            "点读机/笔",
                            "早教益智",
                            "录音笔",
                            "电纸书",
                            "电子词典",
                            "复读机 "
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
        saveChildren7();

        transaction.commit();
    }

}