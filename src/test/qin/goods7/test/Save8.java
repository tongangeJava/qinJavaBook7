package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save8 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "运动鞋包",
                  "运动服饰",
                  "健身训练",
                  "骑行运动",
                  "体育用品",
                  "户外鞋服",
                  "户外装备",
                  "垂钓用品",
                  "游泳用品",
                  "钟表"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '运动鞋包'").list().get(0);
        String[] children =
                  {
                            "跑步鞋",
                            "休闲鞋==",
                            "篮球鞋",
                            "帆布鞋==",
                            "板鞋",
                            "拖鞋",
                            "运动包",
                            "足球鞋",
                            "乒羽网鞋",
                            "训练鞋",
                            "专项运动鞋"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '运动服饰'").list().get(0);
        String[] children =
                  {
                            "运动3免1",
                            "T恤==",
                            "运动裤",
                            "健身服",
                            "运动套装",
                            "运动背心",
                            "羽绒服==",
                            "卫衣/套头衫",
                            "棉服==",
                            "夹克/风衣",
                            "运动配饰",
                            "乒羽网服",
                            "毛衫/线衫"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '健身训练'").list().get(0);
        String[] children =
                  {
                            "健身3免1",
                            "跑步机",
                            "健身车/动感单车",
                            "哑铃",
                            "仰卧板/收腹机",
                            "甩脂机",
                            "踏步机",
                            "运动护具",
                            "瑜伽舞蹈",
                            "武术搏击",
                            "综合训练器",
                            "其他大型器械",
                            "其他中小型器材"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '骑行运动'").list().get(0);
        String[] children =
                  {
                            "山地车/公路车",
                            "折叠车",
                            "电动车",
                            "平衡车",
                            "其他整车",
                            "骑行装备",
                            "骑行服"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '体育用品'").list().get(0);
        String[] children =
                  {
                            "乒乓球",
                            "羽毛球",
                            "篮球",
                            "足球",
                            "轮滑滑板",
                            "网球",
                            "高尔夫",
                            "台球",
                            "排球",
                            "棋牌麻将",
                            "_其它"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '户外鞋服'").list().get(0);
        String[] children =
                  {
                            "户外风衣",
                            "徒步鞋",
                            "T恤===",
                            "冲锋衣裤",
                            "速干衣裤",
                            "越野跑鞋",
                            "滑雪服",
                            "羽绒服/棉服",
                            "休闲衣裤",
                            "抓绒衣裤",
                            "溯溪鞋",
                            "沙滩/凉拖",
                            "休闲鞋===",
                            "软壳衣裤",
                            "功能内衣",
                            "军迷服饰",
                            "登山鞋",
                            "工装鞋==",
                            "户外袜"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '户外装备'").list().get(0);
        String[] children =
                  {
                            "户外3免1",
                            "帐篷/垫子",
                            "望远镜",
                            "野餐烧烤",
                            "便携桌椅床",
                            "背包",
                            "户外配饰",
                            "军迷用品",
                            "睡袋/吊床",
                            "救援装备",
                            "户外照明",
                            "旅游用品",
                            "户外工具",
                            "户外仪表",
                            "登山攀岩",
                            "极限户外",
                            "冲浪潜水",
                            "滑雪装备"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '垂钓用品'").list().get(0);
        String[] children =
                  {
                            "鱼竿鱼线",
                            "浮漂鱼饵",
                            "钓鱼桌椅",
                            "钓鱼配件",
                            "钓箱鱼包"
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
    public void saveChildren8()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '游泳用品'").list().get(0);
        String[] children =
                  {
                            "泳镜",
                            "男士泳衣",
                            "女士泳衣",
                            "比基尼",
                            "泳帽",
                            "游泳包防水包",
                            "其它类型"
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
    public void saveChildren9()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '钟表'").list().get(0);
        String[] children =
                  {
                            "钟表3免1",
                            "瑞表",
                            "国表",
                            "日韩表",
                            "欧美表",
                            "德表",
                            "儿童手表",
                            "智能手表_",
                            "闹钟",
                            "座钟挂钟",
                            "钟表配件"
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