package qin.goods7.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import qin.goods7.controller.IniData;
import qin.goods7.domain.GoodsType;

@ContextConfiguration(value = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@SuppressWarnings("all")
public class SpringTest
{
    public
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    /**
     * 开启事务
     */
    public Transaction transaction = session.beginTransaction();

    @Test
    public void make()
    {
        IniData i = (IniData) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("iniData");
        i.doMainView();
    }

    //region 保存所有上级分类
    @Test
    public void makeGoodsType_allParent()
    {
        GoodsType goodsType0 = new GoodsType("家用电器");
        goodsType0.setGoodsTypeId(0l);
        session.save(goodsType0);
        GoodsType goodsType1 = new GoodsType("手机/运营商/数码");
        goodsType1.setGoodsTypeId(1l);
        session.save(goodsType1);
        GoodsType goodsType2 = new GoodsType("电脑办公");
        goodsType2.setGoodsTypeId(2l);
        session.save(goodsType2);
        GoodsType goodsType3 = new GoodsType("家居/家具/家装/厨具");
        goodsType3.setGoodsTypeId(3l);
        session.save(goodsType3);
        GoodsType goodsType4 = new GoodsType("男装/ 女装/ 童装/ 内衣");
        goodsType4.setGoodsTypeId(4l);
        session.save(goodsType4);
        GoodsType goodsType5 = new GoodsType("个护化妆/ 清洁用品/ 宠物");
        goodsType5.setGoodsTypeId(5l);
        session.save(goodsType5);
        GoodsType goodsType6 = new GoodsType("鞋靴/ 箱包/ 珠宝/ 奢侈品");
        goodsType6.setGoodsTypeId(6l);
        session.save(goodsType6);
        GoodsType goodsType7 = new GoodsType("运动/ 户外/ 钟表");
        goodsType7.setGoodsTypeId(7l);
        session.save(goodsType7);
        GoodsType goodsType8 = new GoodsType("汽车/ 汽车用品");
        goodsType8.setGoodsTypeId(8l);
        session.save(goodsType8);
        GoodsType goodsType9 = new GoodsType("母婴/ 玩具乐器");
        goodsType9.setGoodsTypeId(9l);
        session.save(goodsType9);
        GoodsType goodsType10 = new GoodsType("食品/ 酒类/ 生鲜/ 特产");
        goodsType10.setGoodsTypeId(10l);
        session.save(goodsType10);
        GoodsType goodsType11 = new GoodsType("医药保健");
        goodsType11.setGoodsTypeId(11l);
        session.save(goodsType11);
        GoodsType goodsType12 = new GoodsType("图书/ 音像/ 电子书");
        goodsType12.setGoodsTypeId(12l);
        session.save(goodsType12);
        GoodsType goodsType13 = new GoodsType("机票/ 酒店/ 旅游/ 生活");
        goodsType13.setGoodsTypeId(13l);
        session.save(goodsType13);
        GoodsType goodsType14 = new GoodsType("理财/ 众筹/ 白条/ 保险");
        goodsType14.setGoodsTypeId(14l);
        session.save(goodsType14);

        transaction.commit();
    }
    //endregion

    //region 保存子类(1)
    @Test
    public void saveParent2()
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
        saveChildren10();
        saveChildren11();
        saveChildren12();
        saveChildren13();
        saveChildren14();

        transaction.commit();
    }
    //endregion

    //region 家用电器
    @Test
    public void _家用电器电视()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电视'").list().get(0);

        String[] s =
                  {
                            "合资品牌", "国产品牌", "互联网品牌"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器空调()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '空调'").list().get(0);

        String[] s =
                  {
                            "壁挂式空调", "柜式空调", "中央空调", "空调配件"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器洗衣机()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '洗衣机'").list().get(0);

        String[] s =
                  {
                            "滚筒洗衣机", "洗烘一体机", "波轮洗衣机", "洗衣机配件"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器冰箱()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '冰箱'").list().get(0);

        String[] s =
                  {
                            "多门", "对开门", "三门", "双门", "冷柜/冰吧", "酒柜", "冰箱配件"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器厨卫大电()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '厨卫大电'").list().get(0);

        String[] s =
                  {
                            "油烟机", "燃气灶", "烟灶套装", "消毒柜", "洗碗机", "电热水器", "燃气热水器", "嵌入式厨电"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器厨房小电()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '厨房小电'").list().get(0);

        String[] s =
                  {
                            "厨房小电_", "电饭煲", "微波炉", "电烤箱", "电磁炉", "电压力锅", "豆浆机", "咖啡机", "面包机", "榨汁机", "料理机", "电饼铛", "养生壶/煎药壶", "酸奶机", "煮蛋器", "电水壶/热水瓶", "电炖锅", "多用途锅", "电烧烤炉", "电热饭盒", "其它厨房电器"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器生活电器()
    {
        GoodsType parent = (GoodsType) session
                  .createQuery("from GoodsType where goodsTypeName = '生活电器'").list().get(0);

        String[] s =
                  {
                            "取暖电器", "吸尘器", "净化器", "扫地机器人", "加湿器", "挂烫机/熨斗", "电风扇", "冷风扇", "插座", "电话机", "饮水机", "净水器", "除湿机", "干衣机", "清洁机", "收录/音机", "其它生活电器", "生活电器配件"
                  };

        doSave(parent, s);
    }

    @Test
    public void _家用电器个护健康()//
    {
        GoodsType parent = (GoodsType) session
                  .createQuery("from GoodsType where goodsTypeName = '个护健康'").list().get(0);

        String[] s =
                  {
                            "剃须刀", "口腔护理_", "电吹风", "美容器", "卷/直发器", "理发器", "剃/脱毛器", "足浴盆", "健康秤/厨房秤", "按摩器", "按摩椅", "计步器/脂肪检测仪", "其它健康电器"
                  };

        for (int i = 0; i < s.length; i++)
        {
            GoodsType goodsType = new GoodsType(s[i]);
            goodsType.setGoodsTypeParent(parent);
            parent.getGoodsType_childrenSet().add(goodsType);
            session.save(goodsType);
            session.update(parent);
        }

        //doSave(parent, s);
    }

    @Test
    public void _家用电器家庭影音()
    {
        GoodsType parent = (GoodsType) session
                  .createQuery("from GoodsType where goodsTypeName = '家庭影音'").list().get(0);

        String[] s =
                  {
                            "家庭影院", "迷你音响", "dvd", "电视影音插件"
                  };

        doSave(parent, s);
    }

    //endregion

    //region save家用电器
    @Test
    public void save家用电器()
    {
        _家用电器个护健康();
        _家用电器冰箱();
        _家用电器厨卫大电();
        _家用电器厨房小电();
        _家用电器家庭影音();
        _家用电器洗衣机();
        _家用电器生活电器();
        _家用电器电视();
        _家用电器空调();

        transaction.commit();
    }
    //endregion

    //region 提交事务
    //@org.junit.AfterClass
    public static void _zCommit()
    {
        new SpringTest().transaction.commit();
    }
    //endregion

    //region 手机
    @Test
    public void makeCode2()
    {
        String[] s =
                  {
                            "手机通讯", "运营商", "手机配件", "摄影摄像", "数码配件", "影音娱乐", "智能设备", "电子教育"
                  };
        makeCode(s);
    }


    //endregion

    private void doSave(GoodsType parent, String[] typeNames)
    {
        for (int i = 0; i < typeNames.length; i++)
        {
            GoodsType goodsType = new GoodsType(typeNames[i]);
            parent.getGoodsType_childrenSet().add(goodsType);
            goodsType.setGoodsTypeParent(parent);

            session.save(goodsType);
            session.update(parent);
        }
    }

    @Test
    public void saveSome()
    {
        String[] names =
                  {
                            "家用电器", "手机/运营商/数码", "电脑办公", "家居/家具/家装/厨具", "男装/ 女装/ 童装/ 内衣", "个护化妆/ 清洁用品/ 宠物", "鞋靴/ 箱包/ 珠宝/ 奢侈品", "运动/ 户外/ 钟表", "汽车/ 汽车用品", "母婴/ 玩具乐器", "食品/ 酒类/ 生鲜/ 特产", "医药保健", "图书/ 音像/ 电子书", "机票/ 酒店/ 旅游/ 生活", "理财/ 众筹/ 白条/ 保险"
                  };

        makeCode(names);
    }

    /**
     * @param children
     * @param goodsTypeNameParent 上级商品名称
     */
    public void makeCode(String[] goodsTypeNameParent)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < goodsTypeNameParent.length; i++)
        {
            sb.append("\n\n//region 保存\n @Test public void saveChildren" + i + "(){");

            sb.append("GoodsType parent = (GoodsType) session" +
                                "                .createQuery(\"from GoodsType where goodsTypeName = '" + goodsTypeNameParent[i] + "'\")" +
                                "                .list()" +
                                "                .get(0);" +
                                "" +
                                "        for (int i = 0; i < children.length; i++)" +
                                "        {" +
                                "            GoodsType goodsType = new GoodsType(children[i]);" +
                                "            goodsType.setGoodsTypeParent(parent);" +
                                "            parent.getGoodsType_childrenSet().add(goodsType);" +
                                "" +
                                "            session.save(goodsType);" +
                                "            session.update(parent);" +
                                "        }");

            sb.append("}\n//endregion");
        }


        System.out.println(sb.toString());
    }

    //region 保存
    @Test
    public void saveChildren0()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家用电器'").list().get(0);

        String[] children =
                  {
                            "电视", "空调", "洗衣机", "冰箱", "厨卫大电", "厨房小电", "生活电器", "个护健康", "家庭影音", "进口电器"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '手机/运营商/数码'").list().get(0);

        String[] children =
                  {
                            "手机通讯", "运营商", "手机配件", "摄影摄像", "数码配件", "影音娱乐", "智能设备", "电子教育"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '电脑办公'").list().get(0);

        String[] children =
                  {
                            "电脑整机", "电脑配件", "外设产品", "游戏设备", "网络产品", "办公设备", "文具耗材", "服务产品"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '家居/家具/家装/厨具'").list().get(0);

        String[] children =
                  {
                            "厨具", "家纺", "生活日用", "家装软饰", "灯具", "家具", "家装建材"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '男装/ 女装/ 童装/ 内衣'").list().get(0);

        String[] children =
                  {
                            "女装", "男装", "内衣", "配饰", "童装童鞋"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '个护化妆/ 清洁用品/ 宠物'").list().get(0);

        String[] children =
                  {
                            "面部护肤", "洗发护发", "身体护理", "口腔护理", "女性护理", "香水彩妆", "清洁用品", "宠物生活"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '鞋靴/ 箱包/ 珠宝/ 奢侈品'").list().get(0);

        String[] children =
                  {
                            "时尚女鞋", "流行男鞋", "潮流女包", "精品男包", "功能箱包", "奢侈品", "精选大牌", "礼品", "珠宝首饰", "金银投资"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '运动/ 户外/ 钟表'").list().get(0);

        String[] children =
                  {
                            "运动鞋包", "运动服饰", "健身训练", "骑行运动", "体育用品", "户外鞋服", "户外装备", "垂钓用品", "游泳用品", "钟表"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '汽车/ 汽车用品'").list().get(0);

        String[] children =
                  {
                            "汽车车型", "汽车价格", "汽车品牌", "维修保养", "车载电器", "美容清洗", "汽车装饰", "安全自驾", "赛事改装", "汽车服务"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '母婴/ 玩具乐器'").list().get(0);

        String[] children =
                  {
                            "奶粉", "营养辅食", "尿裤湿巾", "喂养用品", "洗护用品", "寝居服饰", "妈妈专区", "童车童床", "玩具", "乐器"
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
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '食品/ 酒类/ 生鲜/ 特产'").list().get(0);

        String[] children =
                  {
                            "新鲜水果", "海鲜水产", "肉禽蛋品", "新鲜蔬菜", "冷饮冻食", "中外名酒", "进口食品", "休闲食品", "地方特产", "茗茶", "饮料冲调", "粮油调味"
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
    public void saveChildren11()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '医药保健'").list().get(0);

        String[] children =
                  {
                            "中西药品",
                            "营养健康",
                            "营养成分",
                            "滋补养生",
                            "成人用品",
                            "保健器械",
                            "护理护具"
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
    public void saveChildren12()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '图书/ 音像/ 电子书'").list().get(0);

        String[] children =
                  {
                            "音像", "少儿", "教育", "文艺", "经管励志", "人文社科", "生活", "科技", "刊/原版", "电子书", "数字音乐"
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
    public void saveChildren13()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '机票/ 酒店/ 旅游/ 生活'").list().get(0);

        String[] children =
                  {
                            "交通出行", "酒店预订", "旅游度假", "商旅服务", "演出票务", "生活缴费", "生活服务", "教育培训", "彩票", "游戏", "海外生活"
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
    public void saveChildren14()
    {
        GoodsType parent = (GoodsType) session.createQuery("from GoodsType where goodsTypeName = '理财/ 众筹/ 白条/ 保险'").list().get(0);

        String[] children =
                  {
                            "理财", "众筹", "东家", "白条", "钱包", "保险"
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

}




















