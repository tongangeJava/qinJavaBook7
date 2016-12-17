package qin.goods7.test;

import org.junit.Test;

/**
 * Created by Administrator on 2016/12/8 12-008-08.<br/>
 */
public class JavaTest
{
    @Test
    public void jsp1()
    {

    }

    @Test
    public void make1()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("供应" + i + "\n");
        }
    }

    @Test
    public void make2()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("商品子类" + i);
        }
    }

    @Test
    public void make3()
    {
        Object session = 0;

        String[] objectGoodsType =
                  {
                            "家用电器", "手机/运营商/数码", "电脑办公", "家居/家具/家装/厨具", "男装/ 女装/ 童装/ 内衣", "个护化妆/ 清洁用品/ 宠物", "鞋靴/ 箱包/ 珠宝/ 奢侈品", "运动/ 户外/ 钟表", "汽车/ 汽车用品", "母婴/ 玩具乐器", "食品/ 酒类/ 生鲜/ 特产", "医药保健", "图书/ 音像/ 电子书", "机票/ 酒店/ 旅游/ 生活", "理财/ 众筹/ 白条/ 保险"
                  };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < objectGoodsType.length; i++)
        {
            sb.append(" GoodsType goodsType" + i + " = new GoodsType(\"" + objectGoodsType[i] + "\");\n" +
                                "        goodsType" + i + ".setGoodsTypeId(" + i + "l);\n" +
                                "        session.save(goodsType" + i + ");");
        }

        System.out.println(sb.toString());
    }

    @Test
    public void make4()
    {
        Object session = 0;

        String[] objectGoodsType =
                  {
                            "电视", "空调", "洗衣机", "冰箱", "厨卫大电", "厨房小电", "生活电器", "个护健康", "家庭影音", "进口电器"
                  };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < objectGoodsType.length; i++)
        {
        }

        System.out.println(sb.toString());
    }

    /*

        "电视",
        "空调",
        "洗衣机",
        "冰箱",
        "厨卫大电",
        "厨房小电",
        "生活电器",
        "个护健康",
        "家庭影音",
        "进口电器"

     */
}


















