package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
public class Save5 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "女装",
                  "男装",
                  "内衣",
                  "配饰",
                  "童装童鞋"
        };

        makeCode(s);
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '女装'").list().get(0);
        String[] children =
                  {
                            "女装3免1", "毛呢大衣", "羽绒服", "连衣裙", "针织衫", "卫衣", "牛仔裤", "风衣", "T恤", "衬衫", "短外套", "打底衫", "打底裤", "棉服", "皮草", "羊毛衫", "羊绒衫", "真皮皮衣", "小西装", "休闲裤", "大码女装", "中老年女装", "设计师/潮牌", "半身裙", "仿皮皮衣", "马甲", "正装裤", "加绒裤", "婚纱", "礼服", "旗袍/唐装", "雪纺衫", "吊带/背心", "短裤"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '男装'").list().get(0);
        String[] children =
                  {
                            "男装3免1",
                            "羽绒服_",
                            "棉服_",
                            "针织衫_",
                            "夹克",
                            "羊毛衫_",
                            "加绒裤_",
                            "真皮皮衣_",
                            "卫衣_",
                            "T恤_",
                            "马甲/背心_",
                            "西服套装_",
                            "牛仔裤_",
                            "休闲裤_",
                            "衬衫_",
                            "毛呢大衣_",
                            "风衣_",
                            "仿皮皮衣_",
                            "西服_",
                            "西裤_",
                            "卫裤/运动裤_",
                            "POLO衫_",
                            "短裤_",
                            "中老年男装_",
                            "大码男装_",
                            "羊绒衫_",
                            "设计师/潮牌_",
                            "工装_",
                            "唐装/中山装_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '内衣'").list().get(0);
        String[] children =
                  {
                            "保暖内衣_",
                            "秋衣秋裤_",
                            "男式内裤_",
                            "女式内裤_",
                            "休闲棉袜_",
                            "商务男袜_",
                            "吊带/背心_",
                            "大码内衣_",
                            "打底衫_",
                            "睡衣/家居服_",
                            "文胸_",
                            "打底裤袜_",
                            "连裤袜/丝袜_",
                            "文胸套装_",
                            "情侣睡衣_",
                            "少女文胸_",
                            "抹胸_",
                            "内衣配件_",
                            "塑身美体_",
                            "美腿袜_",
                            "泳衣_",
                            "情趣内衣_"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '配饰'").list().get(0);
        String[] children =
                  {
                            "女士丝巾/围巾/披肩_",
                            "男士腰带/礼盒_",
                            "太阳镜_",
                            "光学镜架/镜片_",
                            "防辐射眼镜_",
                            "棒球帽_",
                            "贝雷帽_",
                            "鸭舌帽_",
                            "男士丝巾/围巾_",
                            "真皮手套_",
                            "毛线手套_",
                            "围巾/手套/帽子套装_",
                            "老花镜_",
                            "礼帽_",
                            "遮阳帽_",
                            "口罩_",
                            "游泳镜_",
                            "毛线帽_",
                            "女士腰带/礼盒_",
                            "遮阳伞/雨伞_",
                            "毛线/布面料_",
                            "领带/领结/领带夹_",
                            "耳罩/耳包_",
                            "袖扣_",
                            "钥匙扣"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '童装童鞋'").list().get(0);
        String[] children =
                  {
                            "羽绒服/棉服=",
                            "套装=",
                            "上衣=",
                            "裤子=",
                            "内衣=",
                            "配饰=",
                            "运动鞋=",
                            "靴子=",
                            "皮鞋/帆布鞋=",
                            "功能鞋=",
                            "亲子装=",
                            "运动服=",
                            "演出服=",
                            "裙子=",
                            "凉鞋="
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
        boolean flag = true;

        try
        {
            saveChildren0();
            saveChildren1();
            saveChildren2();
            saveChildren3();
            saveChildren4();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            flag = false;
        }
        finally
        {
            if (flag)
            {
                transaction.commit();
            }
            else
            {
                System.out.println("failed");
            }
        }
                /*
                saveChildren5();
                saveChildren6();
                saveChildren7();
                saveChildren8();
                saveChildren9();
                saveChildren10();
                saveChildren11();
                saveChildren12();
                */


    }
}