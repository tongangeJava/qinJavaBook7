package qin.goods7.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import qin.goods7.domain.UserCountry;
import qin.javaee7.core.JavaEE7BaseSupport;

/**
 * 恢复表中的所有数据
 *
 * @author qinzhengying
 * @since 1.7 2016-12-8
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/iniMyData")
@SuppressWarnings("all")
public class IniData implements JavaEE7BaseSupport
{
    private static final long serialVersionUID = 3617317651311928638L;

    private boolean actionFlag = false;

    private
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    @RequestMapping(value = "/doMainView")
    /** 恢复所有数据 */
    public void doMainView()
    {
        Transaction transaction = session.beginTransaction();

        saveBeiJing();
        saveShangHai();
        saveGuangZhou();
        saveShenZhen();
        saveTianJing();
        saveSuZhou();
        saveChongQin();
        saveNanJing();
        saveHangZhou();
        saveDaLian();
        saveChengDu();
        saveWuHan();
        saveGuangDong();
        saveFuJian();
        saveAnHui();
        saveJiangSu();
        saveZheJiang();
        saveGuangXi();
        saveGuiZhou();
        saveHaiNan();
        saveHeBei();
        saveHeNan();
        saveHeiLongJiang();
        saveHuBei();
        saveHuNan();
        saveJiLin();
        saveJiangXi();
        saveLiaoNing();
        saveNeiMengGu();
        saveNingXia();
        saveQingHai();
        saveShanDong();
        saveShanXi();
        saveShanXi2();
        saveSiChuan();
        saveXiZang();
        saveXinJiang();
        saveYunNan();
        saveGanSu();

        transaction.commit();
    }

    //region saveData

    //region 流行城市

    //region 保存北京

    private void saveBeiJing()
    {
        UserCountry beijingSuper = new UserCountry("北京");

        UserCountry uc0 = new UserCountry("东城区");
        uc0.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("西城区");
        uc1.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("朝阳区");
        uc2.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("海淀区");
        uc3.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("石景山");
        uc4.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("门头沟");
        uc5.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("丰台区");
        uc6.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("房山区");
        uc7.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("大兴区");
        uc8.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("通州区");
        uc9.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("顺义区");
        uc10.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("平谷区");
        uc11.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("昌平区");
        uc12.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("怀柔区");
        uc13.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("延庆县");
        uc14.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("密云县");
        uc15.setParent(beijingSuper);
        beijingSuper.getChildrenSet().add(uc15);
        session.save(uc15);

        session.save(beijingSuper);


    }
    //endregion

    //region 保存上海

    private void saveShangHai()
    {
        UserCountry shanghaiSuper = new UserCountry("上海");
        UserCountry uc0 = new UserCountry("浦东新区");
        uc0.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("徐汇区");
        uc1.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("长宁区");
        uc2.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("普陀区");
        uc3.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("闸北区");
        uc4.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("虹口区");
        uc5.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("杨浦区");
        uc6.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("黄浦区");
        uc7.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("静安区");
        uc8.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("宝山区");
        uc9.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("闵行区");
        uc10.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("嘉定区");
        uc11.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("金山区");
        uc12.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("松江区");
        uc13.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("青浦区");
        uc14.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("奉贤区");
        uc15.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("崇明县");
        uc16.setParent(shanghaiSuper);
        shanghaiSuper.getChildrenSet().add(uc16);
        session.save(uc16);

        session.save(shanghaiSuper);


    }
    //endregion

    //region 保存广州

    private void saveGuangZhou()
    {
        UserCountry guangzhouSuper = new UserCountry("广州");
        UserCountry uc0 = new UserCountry("白云区");
        uc0.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("天河区");
        uc1.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("越秀区");
        uc2.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("海珠区");
        uc3.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("黄埔区");
        uc4.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("荔湾区");
        uc5.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("番禺区");
        uc6.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("花都区");
        uc7.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("萝岗区");
        uc8.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("南沙区");
        uc9.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("从化区");
        uc10.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("增城区");
        uc11.setParent(guangzhouSuper);
        guangzhouSuper.getChildrenSet().add(uc11);
        session.save(uc11);

        session.save(guangzhouSuper);


    }
    //endregion


    private void saveShenZhen()
    {
        UserCountry shenzhenSuper = new UserCountry("深圳");
        UserCountry uc0 = new UserCountry("罗湖区");
        uc0.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("福田区");
        uc1.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("南山区");
        uc2.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("宝安区");
        uc3.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("龙岗区");
        uc4.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("盐田区");
        uc5.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("光明新区");
        uc6.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("坪山新区");
        uc7.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("大鹏新区");
        uc8.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("龙华新区");
        uc9.setParent(shenzhenSuper);
        shenzhenSuper.getChildrenSet().add(uc9);
        session.save(uc9);

        session.save(shenzhenSuper);


    }


    private void saveTianJing()
    {
        UserCountry tianjingSuper = new UserCountry("天津");
        UserCountry uc0 = new UserCountry("和平区");
        uc0.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("河东区");
        uc1.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("河西区");
        uc2.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("南开区");
        uc3.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("河北区");
        uc4.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("红桥区");
        uc5.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("塘沽区");
        uc6.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("汉沽区");
        uc7.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("大港区");
        uc8.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("东丽区");
        uc9.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("西青区");
        uc10.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("津南区");
        uc11.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("北辰区");
        uc12.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("武清区");
        uc13.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("宝坻区");
        uc14.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("宁河县");
        uc15.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("静海县");
        uc16.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("蓟　县");
        uc17.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("开发区");
        uc18.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("滨海区");
        uc19.setParent(tianjingSuper);
        tianjingSuper.getChildrenSet().add(uc19);
        session.save(uc19);

        session.save(tianjingSuper);


    }


    private void saveSuZhou()
    {
        UserCountry suZhouSuper = new UserCountry("苏州");
        UserCountry uc0 = new UserCountry("金阊区");
        uc0.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("沧浪区");
        uc1.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("平江区");
        uc2.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("工业园");
        uc3.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("高新区");
        uc4.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("吴中区");
        uc5.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("相城区");
        uc6.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("张家港");
        uc7.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("常熟市");
        uc8.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("太仓市");
        uc9.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("昆山市");
        uc10.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("吴江市");
        uc11.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("虎丘区");
        uc12.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("玉山镇");
        uc13.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("巴城镇");
        uc14.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("周市镇");
        uc15.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("陆家镇");
        uc16.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("花桥镇");
        uc17.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("淀山湖");
        uc18.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("张浦镇");
        uc19.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("周庄镇");
        uc20.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("千灯镇");
        uc21.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("锦溪镇");
        uc22.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("开发区");
        uc23.setParent(suZhouSuper);
        suZhouSuper.getChildrenSet().add(uc23);
        session.save(uc23);

        session.save(suZhouSuper);
    }


    private void saveChongQin()
    {
        UserCountry chongqinSuper = new UserCountry("重庆");
        UserCountry uc0 = new UserCountry("渝中区");
        uc0.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("江北区");
        uc1.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("南岸区");
        uc2.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("沙坪坝");
        uc3.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("九龙坡");
        uc4.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("大渡口");
        uc5.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("北碚区");
        uc6.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("巴南区");
        uc7.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("渝北区");
        uc8.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("永川区");
        uc9.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("涪陵区");
        uc10.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("合川区");
        uc11.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("江津区");
        uc12.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("长寿区");
        uc13.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("南川区");
        uc14.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("万州区");
        uc15.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("黔江区");
        uc16.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("綦江区");
        uc17.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("潼南县");
        uc18.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("铜梁区");
        uc19.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("大足区");
        uc20.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("荣昌县");
        uc21.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("璧山区");
        uc22.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("垫江县");
        uc23.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc23);
        session.save(uc23);
        UserCountry uc24 = new UserCountry("武隆县");
        uc24.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc24);
        session.save(uc24);
        UserCountry uc25 = new UserCountry("丰都县");
        uc25.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc25);
        session.save(uc25);
        UserCountry uc26 = new UserCountry("城口县");
        uc26.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc26);
        session.save(uc26);
        UserCountry uc27 = new UserCountry("梁平县");
        uc27.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc27);
        session.save(uc27);
        UserCountry uc28 = new UserCountry("开县");
        uc28.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc28);
        session.save(uc28);
        UserCountry uc29 = new UserCountry("巫溪县");
        uc29.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc29);
        session.save(uc29);
        UserCountry uc30 = new UserCountry("巫山县");
        uc30.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc30);
        session.save(uc30);
        UserCountry uc31 = new UserCountry("奉节县");
        uc31.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc31);
        session.save(uc31);
        UserCountry uc32 = new UserCountry("云阳县");
        uc32.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc32);
        session.save(uc32);
        UserCountry uc33 = new UserCountry("忠县");
        uc33.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc33);
        session.save(uc33);
        UserCountry uc34 = new UserCountry("石柱");
        uc34.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc34);
        session.save(uc34);
        UserCountry uc35 = new UserCountry("彭水县");
        uc35.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc35);
        session.save(uc35);
        UserCountry uc36 = new UserCountry("酉阳县");
        uc36.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc36);
        session.save(uc36);
        UserCountry uc37 = new UserCountry("石柱县");
        uc37.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc37);
        session.save(uc37);
        UserCountry uc38 = new UserCountry("秀山县");
        uc38.setParent(chongqinSuper);
        chongqinSuper.getChildrenSet().add(uc38);
        session.save(uc38);

        session.save(chongqinSuper);
    }


    private void saveNanJing()
    {
        UserCountry nanJingSuper = new UserCountry("南京");
        UserCountry uc0 = new UserCountry("玄武区");
        uc0.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("白下区");
        uc1.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("秦淮区");
        uc2.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("建邺区");
        uc3.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("鼓楼区");
        uc4.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("下关区");
        uc5.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("浦口区");
        uc6.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("六合区");
        uc7.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("栖霞区");
        uc8.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("雨花台");
        uc9.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("江宁区");
        uc10.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("溧水县");
        uc11.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("高淳县");
        uc12.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("大厂区");
        uc13.setParent(nanJingSuper);
        nanJingSuper.getChildrenSet().add(uc13);
        session.save(uc13);

        session.save(nanJingSuper);
    }


    private void saveHangZhou()
    {
        UserCountry hangZhouSuper = new UserCountry("杭州");
        UserCountry uc0 = new UserCountry("上城区");
        uc0.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("下城区");
        uc1.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("拱墅区");
        uc2.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("西湖区");
        uc3.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("江干区");
        uc4.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("滨江区");
        uc5.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("萧山区");
        uc6.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("余杭区");
        uc7.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("临安市");
        uc8.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("富阳区");
        uc9.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("建德市");
        uc10.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("桐庐县");
        uc11.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("淳安县");
        uc12.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("市郊");
        uc13.setParent(hangZhouSuper);
        hangZhouSuper.getChildrenSet().add(uc13);
        session.save(uc13);

        session.save(hangZhouSuper);
    }


    private void saveDaLian()
    {
        UserCountry daLianSuper = new UserCountry("大连");
        UserCountry uc0 = new UserCountry("西岗区");
        uc0.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("中山区");
        uc1.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("沙河口");
        uc2.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("甘井子");
        uc3.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("旅顺口");
        uc4.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("金州区");
        uc5.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("瓦房店");
        uc6.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("普兰店");
        uc7.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("庄河市");
        uc8.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("普湾区");
        uc9.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("长海县");
        uc10.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("新区");
        uc11.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("开发区");
        uc12.setParent(daLianSuper);
        daLianSuper.getChildrenSet().add(uc12);
        session.save(uc12);

        session.save(daLianSuper);
    }


    private void saveChengDu()
    {
        UserCountry chengDuSuper = new UserCountry("成都");
        UserCountry uc0 = new UserCountry("成华区");
        uc0.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("武侯区");
        uc1.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("青羊区");
        uc2.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("锦江区");
        uc3.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("金牛区");
        uc4.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("龙泉驿");
        uc5.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("青白江");
        uc6.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("新都区");
        uc7.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("双流县");
        uc8.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("郫县");
        uc9.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("温江区");
        uc10.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("大邑县");
        uc11.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("金堂县");
        uc12.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("蒲江县");
        uc13.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("新津县");
        uc14.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("温江区");
        uc15.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("高新区");
        uc16.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("高新西");
        uc17.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("都江堰");
        uc18.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("彭州市");
        uc19.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("邛崃市");
        uc20.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("崇州市");
        uc21.setParent(chengDuSuper);
        chengDuSuper.getChildrenSet().add(uc21);
        session.save(uc21);

        session.save(chengDuSuper);
    }


    private void saveWuHan()
    {
        UserCountry wuHanSuper = new UserCountry("武汉");
        UserCountry uc0 = new UserCountry("江岸区");
        uc0.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("江汉区");
        uc1.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("硚口区");
        uc2.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("汉阳区");
        uc3.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("武昌区");
        uc4.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("青山区");
        uc5.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("洪山区");
        uc6.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("蔡甸区");
        uc7.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("江夏区");
        uc8.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("黄陂区");
        uc9.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("新洲区");
        uc10.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("东西湖");
        uc11.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("汉南区");
        uc12.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("开发区");
        uc13.setParent(wuHanSuper);
        wuHanSuper.getChildrenSet().add(uc13);
        session.save(uc13);

        session.save(wuHanSuper);
    }

    //endregion

    //region 广东

    private void saveGuangDong()
    {
        UserCountry guangDongSuper = new UserCountry("广东");
        UserCountry uc0 = new UserCountry("广州");
        uc0.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("潮州");
        uc1.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("东莞");
        uc2.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("佛山");
        uc3.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("惠州");
        uc4.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("清远");
        uc5.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("汕头");
        uc6.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("深圳");
        uc7.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("顺德");
        uc8.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("湛江");
        uc9.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("肇庆");
        uc10.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("中山");
        uc11.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("珠海");
        uc12.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("江门");
        uc13.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("阳江");
        uc14.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("韶关");
        uc15.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("茂名");
        uc16.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("梅州");
        uc17.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("汕尾");
        uc18.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("河源");
        uc19.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("揭阳");
        uc20.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("云浮");
        uc21.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("开平");
        uc22.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("台山");
        uc23.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc23);
        session.save(uc23);
        UserCountry uc24 = new UserCountry("普宁");
        uc24.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc24);
        session.save(uc24);
        UserCountry uc25 = new UserCountry("南沙");
        uc25.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc25);
        session.save(uc25);
        UserCountry uc26 = new UserCountry("龙川");
        uc26.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc26);
        session.save(uc26);
        UserCountry uc27 = new UserCountry("鹤山");
        uc27.setParent(guangDongSuper);
        guangDongSuper.getChildrenSet().add(uc27);
        session.save(uc27);

        session.save(guangDongSuper);

    }

    //endregion

    //region 保存江苏

    /**
     * 保存江苏
     */

    private void saveJiangSu()
    {
        UserCountry jiangSu = new UserCountry("江苏");
        UserCountry uc0 = new UserCountry("南京");
        uc0.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("常熟");
        uc1.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("常州");
        uc2.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("昆山");
        uc3.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("连云港");
        uc4.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("南通");
        uc5.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("苏州");
        uc6.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("太仓");
        uc7.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("无锡");
        uc8.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("徐州");
        uc9.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("扬州");
        uc10.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("镇江");
        uc11.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("淮安");
        uc12.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("盐城");
        uc13.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("泰州");
        uc14.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("宿迁");
        uc15.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("张家港");
        uc16.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("江阴");
        uc17.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("丹阳");
        uc18.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("溧阳");
        uc19.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("泰兴");
        uc20.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("宜兴");
        uc21.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("靖江");
        uc22.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("句容");
        uc23.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc23);
        session.save(uc23);
        UserCountry uc24 = new UserCountry("如皋");
        uc24.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc24);
        session.save(uc24);
        UserCountry uc25 = new UserCountry("扬中");
        uc25.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc25);
        session.save(uc25);
        UserCountry uc26 = new UserCountry("高邮");
        uc26.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc26);
        session.save(uc26);
        UserCountry uc27 = new UserCountry("启东");
        uc27.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc27);
        session.save(uc27);
        UserCountry uc28 = new UserCountry("盱眙");
        uc28.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc28);
        session.save(uc28);
        UserCountry uc29 = new UserCountry("通州");
        uc29.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc29);
        session.save(uc29);
        UserCountry uc30 = new UserCountry("金湖");
        uc30.setParent(jiangSu);
        jiangSu.getChildrenSet().add(uc30);
        session.save(uc30);
        session.save(jiangSu);

    }
    //endregion

    //region 保存浙江

    /**
     * 保存浙江
     */

    private void saveZheJiang()
    {
        UserCountry zheJiang = new UserCountry("浙江");
        UserCountry uc0 = new UserCountry("杭州");
        uc0.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("宁波");
        uc1.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("温州");
        uc2.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("绍兴");
        uc3.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("金华");
        uc4.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("台州");
        uc5.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("湖州");
        uc6.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("嘉兴");
        uc7.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("衢州");
        uc8.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("丽水");
        uc9.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("舟山");
        uc10.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("义乌");
        uc11.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("海宁");
        uc12.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("玉环县");
        uc13.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("平湖");
        uc14.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("永康");
        uc15.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("东阳");
        uc16.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("嘉善");
        uc17.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("余姚");
        uc18.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("慈溪");
        uc19.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("乐清");
        uc20.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("永嘉");
        uc21.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("桐乡");
        uc22.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("瑞安");
        uc23.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc23);
        session.save(uc23);
        UserCountry uc24 = new UserCountry("温岭");
        uc24.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc24);
        session.save(uc24);
        UserCountry uc25 = new UserCountry("上虞");
        uc25.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc25);
        session.save(uc25);
        UserCountry uc26 = new UserCountry("诸暨");
        uc26.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc26);
        session.save(uc26);
        UserCountry uc27 = new UserCountry("宁海");
        uc27.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc27);
        session.save(uc27);
        UserCountry uc28 = new UserCountry("三门");
        uc28.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc28);
        session.save(uc28);
        UserCountry uc29 = new UserCountry("德清");
        uc29.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc29);
        session.save(uc29);
        UserCountry uc30 = new UserCountry("象山");
        uc30.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc30);
        session.save(uc30);
        UserCountry uc31 = new UserCountry("方家山");
        uc31.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc31);
        session.save(uc31);
        UserCountry uc32 = new UserCountry("龙泉");
        uc32.setParent(zheJiang);
        zheJiang.getChildrenSet().add(uc32);
        session.save(uc32);
        session.save(zheJiang);

    }
    //endregion

    //region 保存安徽

    /**
     * 保存安徽
     */

    private void saveAnHui()
    {
        UserCountry anHui = new UserCountry("安徽");
        UserCountry uc0 = new UserCountry("合肥");
        uc0.setParent(anHui);
        anHui.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("安庆");
        uc1.setParent(anHui);
        anHui.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("蚌埠");
        uc2.setParent(anHui);
        anHui.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("芜湖");
        uc3.setParent(anHui);
        anHui.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("淮南");
        uc4.setParent(anHui);
        anHui.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("马鞍山");
        uc5.setParent(anHui);
        anHui.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("淮北");
        uc6.setParent(anHui);
        anHui.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("铜陵");
        uc7.setParent(anHui);
        anHui.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("黄山");
        uc8.setParent(anHui);
        anHui.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("滁州");
        uc9.setParent(anHui);
        anHui.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("阜阳");
        uc10.setParent(anHui);
        anHui.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("宿州");
        uc11.setParent(anHui);
        anHui.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("六安");
        uc12.setParent(anHui);
        anHui.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("亳州");
        uc13.setParent(anHui);
        anHui.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("池州");
        uc14.setParent(anHui);
        anHui.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("宣城");
        uc15.setParent(anHui);
        anHui.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("巢湖");
        uc16.setParent(anHui);
        anHui.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("凤阳");
        uc17.setParent(anHui);
        anHui.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("广德");
        uc18.setParent(anHui);
        anHui.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("宿松");
        uc19.setParent(anHui);
        anHui.getChildrenSet().add(uc19);
        session.save(uc19);
        session.save(anHui);

    }
    //endregion

    //region 保存福建

    /**
     * 保存福建
     */

    private void saveFuJian()
    {
        UserCountry fuJian = new UserCountry("福建");
        UserCountry uc0 = new UserCountry("福州");
        uc0.setParent(fuJian);
        fuJian.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("泉州");
        uc1.setParent(fuJian);
        fuJian.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("厦门");
        uc2.setParent(fuJian);
        fuJian.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("漳州");
        uc3.setParent(fuJian);
        fuJian.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("莆田");
        uc4.setParent(fuJian);
        fuJian.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("三明");
        uc5.setParent(fuJian);
        fuJian.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("南平");
        uc6.setParent(fuJian);
        fuJian.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("龙岩");
        uc7.setParent(fuJian);
        fuJian.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("宁德");
        uc8.setParent(fuJian);
        fuJian.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("泉港区");
        uc9.setParent(fuJian);
        fuJian.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("福安");
        uc10.setParent(fuJian);
        fuJian.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("晋江");
        uc11.setParent(fuJian);
        fuJian.getChildrenSet().add(uc11);
        session.save(uc11);
        session.save(fuJian);

    }
    //endregion

    //region 保存甘肃

    /**
     * 保存甘肃
     */

    private void saveGanSu()
    {
        UserCountry ganSu = new UserCountry("甘肃");
        UserCountry uc0 = new UserCountry("兰州");
        uc0.setParent(ganSu);
        ganSu.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("嘉峪关");
        uc1.setParent(ganSu);
        ganSu.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("酒泉");
        uc2.setParent(ganSu);
        ganSu.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("金昌");
        uc3.setParent(ganSu);
        ganSu.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("白银");
        uc4.setParent(ganSu);
        ganSu.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("天水");
        uc5.setParent(ganSu);
        ganSu.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("张掖");
        uc6.setParent(ganSu);
        ganSu.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("武威");
        uc7.setParent(ganSu);
        ganSu.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("定西");
        uc8.setParent(ganSu);
        ganSu.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("陇南");
        uc9.setParent(ganSu);
        ganSu.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("平凉");
        uc10.setParent(ganSu);
        ganSu.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("庆阳");
        uc11.setParent(ganSu);
        ganSu.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("临夏");
        uc12.setParent(ganSu);
        ganSu.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("甘南");
        uc13.setParent(ganSu);
        ganSu.getChildrenSet().add(uc13);
        session.save(uc13);
        session.save(ganSu);

    }
    //endregion

    //region 保存广西

    /**
     * 保存广西
     */

    private void saveGuangXi()
    {
        UserCountry guangXi = new UserCountry("广西");
        UserCountry uc0 = new UserCountry("南宁");
        uc0.setParent(guangXi);
        guangXi.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("北海");
        uc1.setParent(guangXi);
        guangXi.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("桂林");
        uc2.setParent(guangXi);
        guangXi.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("柳州");
        uc3.setParent(guangXi);
        guangXi.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("玉林");
        uc4.setParent(guangXi);
        guangXi.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("梧州");
        uc5.setParent(guangXi);
        guangXi.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("崇左");
        uc6.setParent(guangXi);
        guangXi.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("来宾");
        uc7.setParent(guangXi);
        guangXi.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("防城港");
        uc8.setParent(guangXi);
        guangXi.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("百色");
        uc9.setParent(guangXi);
        guangXi.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("钦州");
        uc10.setParent(guangXi);
        guangXi.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("贺州");
        uc11.setParent(guangXi);
        guangXi.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("河池");
        uc12.setParent(guangXi);
        guangXi.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("贵港");
        uc13.setParent(guangXi);
        guangXi.getChildrenSet().add(uc13);
        session.save(uc13);
        session.save(guangXi);

    }
    //endregion

    //region 保存贵州

    /**
     * 保存贵州
     */

    private void saveGuiZhou()
    {
        UserCountry guiZhou = new UserCountry("贵州");
        UserCountry uc0 = new UserCountry("贵阳");
        uc0.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("遵义");
        uc1.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("六盘水");
        uc2.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("安顺");
        uc3.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("毕节");
        uc4.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("铜仁");
        uc5.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("黔西南");
        uc6.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("黔东南");
        uc7.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("黔南");
        uc8.setParent(guiZhou);
        guiZhou.getChildrenSet().add(uc8);
        session.save(uc8);
        session.save(guiZhou);

    }
    //endregion

    //region 保存海南

    /**
     * 保存海南
     */

    private void saveHaiNan()
    {
        UserCountry haiNan = new UserCountry("海南");
        UserCountry uc0 = new UserCountry("海口");
        uc0.setParent(haiNan);
        haiNan.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("三亚");
        uc1.setParent(haiNan);
        haiNan.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("三沙");
        uc2.setParent(haiNan);
        haiNan.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("文昌");
        uc3.setParent(haiNan);
        haiNan.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("琼海");
        uc4.setParent(haiNan);
        haiNan.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("万宁");
        uc5.setParent(haiNan);
        haiNan.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("儋州");
        uc6.setParent(haiNan);
        haiNan.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("东方");
        uc7.setParent(haiNan);
        haiNan.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("五指山");
        uc8.setParent(haiNan);
        haiNan.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("定安");
        uc9.setParent(haiNan);
        haiNan.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("屯昌");
        uc10.setParent(haiNan);
        haiNan.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("澄迈");
        uc11.setParent(haiNan);
        haiNan.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("临高");
        uc12.setParent(haiNan);
        haiNan.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("琼中");
        uc13.setParent(haiNan);
        haiNan.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("保亭");
        uc14.setParent(haiNan);
        haiNan.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("白沙");
        uc15.setParent(haiNan);
        haiNan.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("昌江");
        uc16.setParent(haiNan);
        haiNan.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("乐东");
        uc17.setParent(haiNan);
        haiNan.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("陵水");
        uc18.setParent(haiNan);
        haiNan.getChildrenSet().add(uc18);
        session.save(uc18);
        session.save(haiNan);

    }
    //endregion

    //region 保存河北

    /**
     * 保存河北
     */

    private void saveHeBei()
    {
        UserCountry heBei = new UserCountry("河北");
        UserCountry uc0 = new UserCountry("石家庄");
        uc0.setParent(heBei);
        heBei.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("保定");
        uc1.setParent(heBei);
        heBei.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("承德");
        uc2.setParent(heBei);
        heBei.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("邯郸");
        uc3.setParent(heBei);
        heBei.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("廊坊");
        uc4.setParent(heBei);
        heBei.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("秦皇岛");
        uc5.setParent(heBei);
        heBei.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("唐山");
        uc6.setParent(heBei);
        heBei.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("张家口");
        uc7.setParent(heBei);
        heBei.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("邢台");
        uc8.setParent(heBei);
        heBei.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("沧州");
        uc9.setParent(heBei);
        heBei.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("衡水");
        uc10.setParent(heBei);
        heBei.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("燕郊");
        uc11.setParent(heBei);
        heBei.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("固安");
        uc12.setParent(heBei);
        heBei.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("遵化");
        uc13.setParent(heBei);
        heBei.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("香河");
        uc14.setParent(heBei);
        heBei.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("三河");
        uc15.setParent(heBei);
        heBei.getChildrenSet().add(uc15);
        session.save(uc15);
        session.save(heBei);

    }
    //endregion

    //region 保存河南

    /**
     * 保存河南
     */

    private void saveHeNan()
    {
        UserCountry heNan = new UserCountry("河南");
        UserCountry uc0 = new UserCountry("郑州");
        uc0.setParent(heNan);
        heNan.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("开封");
        uc1.setParent(heNan);
        heNan.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("洛阳");
        uc2.setParent(heNan);
        heNan.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("商丘");
        uc3.setParent(heNan);
        heNan.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("安阳");
        uc4.setParent(heNan);
        heNan.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("平顶山");
        uc5.setParent(heNan);
        heNan.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("新乡");
        uc6.setParent(heNan);
        heNan.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("焦作");
        uc7.setParent(heNan);
        heNan.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("濮阳");
        uc8.setParent(heNan);
        heNan.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("许昌");
        uc9.setParent(heNan);
        heNan.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("漯河");
        uc10.setParent(heNan);
        heNan.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("三门峡");
        uc11.setParent(heNan);
        heNan.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("鹤壁");
        uc12.setParent(heNan);
        heNan.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("周口");
        uc13.setParent(heNan);
        heNan.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("驻马店");
        uc14.setParent(heNan);
        heNan.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("南阳");
        uc15.setParent(heNan);
        heNan.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("信阳");
        uc16.setParent(heNan);
        heNan.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("济源");
        uc17.setParent(heNan);
        heNan.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("西平");
        uc18.setParent(heNan);
        heNan.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("长葛");
        uc19.setParent(heNan);
        heNan.getChildrenSet().add(uc19);
        session.save(uc19);
        session.save(heNan);

    }
    //endregion

    //region 保存黑龙江

    /**
     * 保存黑龙江
     */

    private void saveHeiLongJiang()
    {
        UserCountry heiLongJiang = new UserCountry("黑龙江");
        UserCountry uc0 = new UserCountry("哈尔滨");
        uc0.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("大庆");
        uc1.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("佳木斯");
        uc2.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("牡丹江");
        uc3.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("齐齐哈尔");
        uc4.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("鸡西");
        uc5.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("鹤岗");
        uc6.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("双鸭山");
        uc7.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("伊春");
        uc8.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("七台河");
        uc9.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("黑河");
        uc10.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("绥化");
        uc11.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("大兴安岭");
        uc12.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("安达");
        uc13.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("双城");
        uc14.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("尚志");
        uc15.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("绥芬河");
        uc16.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("肇东");
        uc17.setParent(heiLongJiang);
        heiLongJiang.getChildrenSet().add(uc17);
        session.save(uc17);
        session.save(heiLongJiang);

    }
    //endregion

    //region 保存湖北

    /**
     * 保存湖北
     */

    private void saveHuBei()
    {
        UserCountry huBei = new UserCountry("湖北");
        UserCountry uc0 = new UserCountry("武汉");
        uc0.setParent(huBei);
        huBei.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("十堰");
        uc1.setParent(huBei);
        huBei.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("襄阳");
        uc2.setParent(huBei);
        huBei.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("宜昌");
        uc3.setParent(huBei);
        huBei.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("潜江");
        uc4.setParent(huBei);
        huBei.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("荆门");
        uc5.setParent(huBei);
        huBei.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("荆州");
        uc6.setParent(huBei);
        huBei.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("黄石");
        uc7.setParent(huBei);
        huBei.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("鄂州");
        uc8.setParent(huBei);
        huBei.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("黄冈");
        uc9.setParent(huBei);
        huBei.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("孝感");
        uc10.setParent(huBei);
        huBei.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("咸宁");
        uc11.setParent(huBei);
        huBei.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("随州");
        uc12.setParent(huBei);
        huBei.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("仙桃");
        uc13.setParent(huBei);
        huBei.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("天门");
        uc14.setParent(huBei);
        huBei.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("神农架");
        uc15.setParent(huBei);
        huBei.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("恩施");
        uc16.setParent(huBei);
        huBei.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("公安");
        uc17.setParent(huBei);
        huBei.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("武穴");
        uc18.setParent(huBei);
        huBei.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("宜城");
        uc19.setParent(huBei);
        huBei.getChildrenSet().add(uc19);
        session.save(uc19);
        session.save(huBei);

    }
    //endregion

    //region 保存湖南

    /**
     * 保存湖南
     */

    private void saveHuNan()
    {
        UserCountry huNan = new UserCountry("湖南");
        UserCountry uc0 = new UserCountry("长沙");
        uc0.setParent(huNan);
        huNan.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("湘潭");
        uc1.setParent(huNan);
        huNan.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("株洲");
        uc2.setParent(huNan);
        huNan.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("常德");
        uc3.setParent(huNan);
        huNan.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("衡阳");
        uc4.setParent(huNan);
        huNan.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("益阳");
        uc5.setParent(huNan);
        huNan.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("郴州");
        uc6.setParent(huNan);
        huNan.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("岳阳");
        uc7.setParent(huNan);
        huNan.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("邵阳");
        uc8.setParent(huNan);
        huNan.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("张家界");
        uc9.setParent(huNan);
        huNan.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("娄底");
        uc10.setParent(huNan);
        huNan.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("永州");
        uc11.setParent(huNan);
        huNan.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("怀化");
        uc12.setParent(huNan);
        huNan.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("湘西");
        uc13.setParent(huNan);
        huNan.getChildrenSet().add(uc13);
        session.save(uc13);
        session.save(huNan);

    }
    //endregion

    //region 保存吉林

    /**
     * 保存吉林
     */

    private void saveJiLin()
    {
        UserCountry jiLin = new UserCountry("吉林");
        UserCountry uc0 = new UserCountry("长春");
        uc0.setParent(jiLin);
        jiLin.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("吉林市");
        uc1.setParent(jiLin);
        jiLin.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("四平");
        uc2.setParent(jiLin);
        jiLin.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("辽源");
        uc3.setParent(jiLin);
        jiLin.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("通化");
        uc4.setParent(jiLin);
        jiLin.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("白山");
        uc5.setParent(jiLin);
        jiLin.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("松原");
        uc6.setParent(jiLin);
        jiLin.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("白城");
        uc7.setParent(jiLin);
        jiLin.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("延吉");
        uc8.setParent(jiLin);
        jiLin.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("延边");
        uc9.setParent(jiLin);
        jiLin.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("公主岭");
        uc10.setParent(jiLin);
        jiLin.getChildrenSet().add(uc10);
        session.save(uc10);
        session.save(jiLin);

    }
    //endregion

    //region 保存江西

    /**
     * 保存江西
     */

    private void saveJiangXi()
    {
        UserCountry jiangXi = new UserCountry("江西");
        UserCountry uc0 = new UserCountry("南昌");
        uc0.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("九江");
        uc1.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("赣州");
        uc2.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("宜春");
        uc3.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("吉安");
        uc4.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("上饶");
        uc5.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("抚州");
        uc6.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("景德镇");
        uc7.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("萍乡");
        uc8.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("新余");
        uc9.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("鹰潭");
        uc10.setParent(jiangXi);
        jiangXi.getChildrenSet().add(uc10);
        session.save(uc10);
        session.save(jiangXi);

    }
    //endregion

    //region 保存辽宁

    /**
     * 保存辽宁
     */

    private void saveLiaoNing()
    {
        UserCountry liaoNing = new UserCountry("辽宁");
        UserCountry uc0 = new UserCountry("沈阳");
        uc0.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("鞍山");
        uc1.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("大连");
        uc2.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("葫芦岛");
        uc3.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("抚顺");
        uc4.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("本溪");
        uc5.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("丹东");
        uc6.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("锦州");
        uc7.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("营口");
        uc8.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("阜新");
        uc9.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("辽阳");
        uc10.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("盘锦");
        uc11.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("铁岭");
        uc12.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("朝阳");
        uc13.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("兴城");
        uc14.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("海城");
        uc15.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("昌图");
        uc16.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("开原");
        uc17.setParent(liaoNing);
        liaoNing.getChildrenSet().add(uc17);
        session.save(uc17);
        session.save(liaoNing);

    }
    //endregion

    //region 保存内蒙古

    /**
     * 保存内蒙古
     */

    private void saveNeiMengGu()
    {
        UserCountry neiMengGu = new UserCountry("内蒙古");
        UserCountry uc0 = new UserCountry("呼和浩特");
        uc0.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("包头");
        uc1.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("赤峰");
        uc2.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("鄂尔多斯");
        uc3.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("乌海");
        uc4.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("通辽");
        uc5.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("呼伦贝尔");
        uc6.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("巴彦淖尔");
        uc7.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("乌兰察布");
        uc8.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("兴安盟");
        uc9.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("锡林郭勒盟");
        uc10.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("阿拉善盟");
        uc11.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("乌审旗");
        uc12.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("满洲里");
        uc13.setParent(neiMengGu);
        neiMengGu.getChildrenSet().add(uc13);
        session.save(uc13);
        session.save(neiMengGu);

    }
    //endregion

    //region 保存宁夏

    /**
     * 保存宁夏
     */

    private void saveNingXia()
    {
        UserCountry ningXia = new UserCountry("宁夏");
        UserCountry uc0 = new UserCountry("银川");
        uc0.setParent(ningXia);
        ningXia.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("石嘴山");
        uc1.setParent(ningXia);
        ningXia.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("吴忠");
        uc2.setParent(ningXia);
        ningXia.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("固原");
        uc3.setParent(ningXia);
        ningXia.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("中卫");
        uc4.setParent(ningXia);
        ningXia.getChildrenSet().add(uc4);
        session.save(uc4);
        session.save(ningXia);

    }
    //endregion

    //region 保存青海

    /**
     * 保存青海
     */

    private void saveQingHai()
    {
        UserCountry qingHai = new UserCountry("青海");
        UserCountry uc0 = new UserCountry("西宁");
        uc0.setParent(qingHai);
        qingHai.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("海东");
        uc1.setParent(qingHai);
        qingHai.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("海西");
        uc2.setParent(qingHai);
        qingHai.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("海北");
        uc3.setParent(qingHai);
        qingHai.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("黄南");
        uc4.setParent(qingHai);
        qingHai.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("海南");
        uc5.setParent(qingHai);
        qingHai.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("果洛");
        uc6.setParent(qingHai);
        qingHai.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("玉树");
        uc7.setParent(qingHai);
        qingHai.getChildrenSet().add(uc7);
        session.save(uc7);
        session.save(qingHai);

    }
    //endregion

    //region 保存山东

    /**
     * 保存山东
     */

    private void saveShanDong()
    {
        UserCountry shanDong = new UserCountry("山东");
        UserCountry uc0 = new UserCountry("济南");
        uc0.setParent(shanDong);
        shanDong.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("德州");
        uc1.setParent(shanDong);
        shanDong.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("东营");
        uc2.setParent(shanDong);
        shanDong.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("济宁");
        uc3.setParent(shanDong);
        shanDong.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("临沂");
        uc4.setParent(shanDong);
        shanDong.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("青岛");
        uc5.setParent(shanDong);
        shanDong.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("日照");
        uc6.setParent(shanDong);
        shanDong.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("泰安");
        uc7.setParent(shanDong);
        shanDong.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("威海");
        uc8.setParent(shanDong);
        shanDong.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("潍坊");
        uc9.setParent(shanDong);
        shanDong.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("烟台");
        uc10.setParent(shanDong);
        shanDong.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("淄博");
        uc11.setParent(shanDong);
        shanDong.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("枣庄");
        uc12.setParent(shanDong);
        shanDong.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("滨州");
        uc13.setParent(shanDong);
        shanDong.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("聊城");
        uc14.setParent(shanDong);
        shanDong.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("菏泽");
        uc15.setParent(shanDong);
        shanDong.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("莱芜");
        uc16.setParent(shanDong);
        shanDong.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("荣成");
        uc17.setParent(shanDong);
        shanDong.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("黄岛");
        uc18.setParent(shanDong);
        shanDong.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("乳山");
        uc19.setParent(shanDong);
        shanDong.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("城阳");
        uc20.setParent(shanDong);
        shanDong.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("即墨");
        uc21.setParent(shanDong);
        shanDong.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("肥城");
        uc22.setParent(shanDong);
        shanDong.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("兖州");
        uc23.setParent(shanDong);
        shanDong.getChildrenSet().add(uc23);
        session.save(uc23);
        UserCountry uc24 = new UserCountry("海阳");
        uc24.setParent(shanDong);
        shanDong.getChildrenSet().add(uc24);
        session.save(uc24);
        UserCountry uc25 = new UserCountry("胶州");
        uc25.setParent(shanDong);
        shanDong.getChildrenSet().add(uc25);
        session.save(uc25);
        UserCountry uc26 = new UserCountry("胶南");
        uc26.setParent(shanDong);
        shanDong.getChildrenSet().add(uc26);
        session.save(uc26);
        UserCountry uc27 = new UserCountry("平度");
        uc27.setParent(shanDong);
        shanDong.getChildrenSet().add(uc27);
        session.save(uc27);
        UserCountry uc28 = new UserCountry("莱西");
        uc28.setParent(shanDong);
        shanDong.getChildrenSet().add(uc28);
        session.save(uc28);
        session.save(shanDong);

    }
    //endregion

    //region 保存山西

    /**
     * 保存山西
     */

    private void saveShanXi()
    {
        UserCountry shanXi = new UserCountry("山西");
        UserCountry uc0 = new UserCountry("太原");
        uc0.setParent(shanXi);
        shanXi.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("大同");
        uc1.setParent(shanXi);
        shanXi.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("临汾");
        uc2.setParent(shanXi);
        shanXi.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("运城");
        uc3.setParent(shanXi);
        shanXi.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("长治");
        uc4.setParent(shanXi);
        shanXi.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("阳泉");
        uc5.setParent(shanXi);
        shanXi.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("晋城");
        uc6.setParent(shanXi);
        shanXi.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("朔州");
        uc7.setParent(shanXi);
        shanXi.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("晋中");
        uc8.setParent(shanXi);
        shanXi.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("忻州");
        uc9.setParent(shanXi);
        shanXi.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("吕梁");
        uc10.setParent(shanXi);
        shanXi.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("永济");
        uc11.setParent(shanXi);
        shanXi.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("和顺");
        uc12.setParent(shanXi);
        shanXi.getChildrenSet().add(uc12);
        session.save(uc12);
        session.save(shanXi);

    }
    //endregion

    //region 保存陕西

    /**
     * 保存陕西
     */

    private void saveShanXi2()
    {
        UserCountry shanXi = new UserCountry("陕西");
        UserCountry uc0 = new UserCountry("西安");
        uc0.setParent(shanXi);
        shanXi.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("宝鸡");
        uc1.setParent(shanXi);
        shanXi.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("咸阳");
        uc2.setParent(shanXi);
        shanXi.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("铜川");
        uc3.setParent(shanXi);
        shanXi.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("渭南");
        uc4.setParent(shanXi);
        shanXi.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("汉中");
        uc5.setParent(shanXi);
        shanXi.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("安康");
        uc6.setParent(shanXi);
        shanXi.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("商洛");
        uc7.setParent(shanXi);
        shanXi.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("延安");
        uc8.setParent(shanXi);
        shanXi.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("榆林");
        uc9.setParent(shanXi);
        shanXi.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("杨凌");
        uc10.setParent(shanXi);
        shanXi.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("兴平");
        uc11.setParent(shanXi);
        shanXi.getChildrenSet().add(uc11);
        session.save(uc11);
        session.save(shanXi);

    }
    //endregion

    //region 保存四川

    /**
     * 保存四川
     */

    private void saveSiChuan()
    {
        UserCountry siChuan = new UserCountry("四川");
        UserCountry uc0 = new UserCountry("成都");
        uc0.setParent(siChuan);
        siChuan.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("乐山");
        uc1.setParent(siChuan);
        siChuan.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("泸州");
        uc2.setParent(siChuan);
        siChuan.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("绵阳");
        uc3.setParent(siChuan);
        siChuan.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("内江");
        uc4.setParent(siChuan);
        siChuan.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("宜宾");
        uc5.setParent(siChuan);
        siChuan.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("自贡");
        uc6.setParent(siChuan);
        siChuan.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("攀枝花");
        uc7.setParent(siChuan);
        siChuan.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("德阳");
        uc8.setParent(siChuan);
        siChuan.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("广元");
        uc9.setParent(siChuan);
        siChuan.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("遂宁");
        uc10.setParent(siChuan);
        siChuan.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("南充");
        uc11.setParent(siChuan);
        siChuan.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("眉山");
        uc12.setParent(siChuan);
        siChuan.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("广安");
        uc13.setParent(siChuan);
        siChuan.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("达州");
        uc14.setParent(siChuan);
        siChuan.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("雅安");
        uc15.setParent(siChuan);
        siChuan.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("巴中");
        uc16.setParent(siChuan);
        siChuan.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("资阳");
        uc17.setParent(siChuan);
        siChuan.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("西昌");
        uc18.setParent(siChuan);
        siChuan.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("甘孜");
        uc19.setParent(siChuan);
        siChuan.getChildrenSet().add(uc19);
        session.save(uc19);
        UserCountry uc20 = new UserCountry("阿坝");
        uc20.setParent(siChuan);
        siChuan.getChildrenSet().add(uc20);
        session.save(uc20);
        UserCountry uc21 = new UserCountry("凉山");
        uc21.setParent(siChuan);
        siChuan.getChildrenSet().add(uc21);
        session.save(uc21);
        UserCountry uc22 = new UserCountry("峨眉");
        uc22.setParent(siChuan);
        siChuan.getChildrenSet().add(uc22);
        session.save(uc22);
        UserCountry uc23 = new UserCountry("简阳");
        uc23.setParent(siChuan);
        siChuan.getChildrenSet().add(uc23);
        session.save(uc23);
        session.save(siChuan);

    }
    //endregion

    //region 保存西藏

    /**
     * 保存西藏
     */

    private void saveXiZang()
    {
        UserCountry xiZang = new UserCountry("西藏");
        UserCountry uc0 = new UserCountry("拉萨");
        uc0.setParent(xiZang);
        xiZang.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("日喀则");
        uc1.setParent(xiZang);
        xiZang.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("林芝");
        uc2.setParent(xiZang);
        xiZang.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("山南");
        uc3.setParent(xiZang);
        xiZang.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("昌都");
        uc4.setParent(xiZang);
        xiZang.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("那曲");
        uc5.setParent(xiZang);
        xiZang.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("阿里");
        uc6.setParent(xiZang);
        xiZang.getChildrenSet().add(uc6);
        session.save(uc6);
        session.save(xiZang);

    }
    //endregion

    //region 保存新疆

    /**
     * 保存新疆
     */

    private void saveXinJiang()
    {
        UserCountry xinJiang = new UserCountry("新疆");
        UserCountry uc0 = new UserCountry("乌鲁木齐");
        uc0.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("喀什");
        uc1.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("克拉玛依");
        uc2.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("伊犁");
        uc3.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("阿克苏");
        uc4.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("哈密");
        uc5.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("石河子");
        uc6.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("阿拉尔");
        uc7.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("五家渠");
        uc8.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("图木舒克");
        uc9.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("昌吉");
        uc10.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("阿勒泰");
        uc11.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("吐鲁番");
        uc12.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("塔城");
        uc13.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("和田");
        uc14.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("巴音郭楞");
        uc15.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("博尔塔拉");
        uc16.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc16);
        session.save(uc16);
        UserCountry uc17 = new UserCountry("奎屯市");
        uc17.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc17);
        session.save(uc17);
        UserCountry uc18 = new UserCountry("乌苏");
        uc18.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc18);
        session.save(uc18);
        UserCountry uc19 = new UserCountry("克州");
        uc19.setParent(xinJiang);
        xinJiang.getChildrenSet().add(uc19);
        session.save(uc19);
        session.save(xinJiang);

    }
    //endregion

    //region 保存云南

    /**
     * 保存云南
     */

    private void saveYunNan()
    {
        UserCountry yunNan = new UserCountry("云南");
        UserCountry uc0 = new UserCountry("昆明");
        uc0.setParent(yunNan);
        yunNan.getChildrenSet().add(uc0);
        session.save(uc0);
        UserCountry uc1 = new UserCountry("大理");
        uc1.setParent(yunNan);
        yunNan.getChildrenSet().add(uc1);
        session.save(uc1);
        UserCountry uc2 = new UserCountry("丽江");
        uc2.setParent(yunNan);
        yunNan.getChildrenSet().add(uc2);
        session.save(uc2);
        UserCountry uc3 = new UserCountry("玉溪");
        uc3.setParent(yunNan);
        yunNan.getChildrenSet().add(uc3);
        session.save(uc3);
        UserCountry uc4 = new UserCountry("曲靖");
        uc4.setParent(yunNan);
        yunNan.getChildrenSet().add(uc4);
        session.save(uc4);
        UserCountry uc5 = new UserCountry("保山");
        uc5.setParent(yunNan);
        yunNan.getChildrenSet().add(uc5);
        session.save(uc5);
        UserCountry uc6 = new UserCountry("昭通");
        uc6.setParent(yunNan);
        yunNan.getChildrenSet().add(uc6);
        session.save(uc6);
        UserCountry uc7 = new UserCountry("普洱");
        uc7.setParent(yunNan);
        yunNan.getChildrenSet().add(uc7);
        session.save(uc7);
        UserCountry uc8 = new UserCountry("临沧");
        uc8.setParent(yunNan);
        yunNan.getChildrenSet().add(uc8);
        session.save(uc8);
        UserCountry uc9 = new UserCountry("红河");
        uc9.setParent(yunNan);
        yunNan.getChildrenSet().add(uc9);
        session.save(uc9);
        UserCountry uc10 = new UserCountry("文山");
        uc10.setParent(yunNan);
        yunNan.getChildrenSet().add(uc10);
        session.save(uc10);
        UserCountry uc11 = new UserCountry("西双版纳");
        uc11.setParent(yunNan);
        yunNan.getChildrenSet().add(uc11);
        session.save(uc11);
        UserCountry uc12 = new UserCountry("德宏");
        uc12.setParent(yunNan);
        yunNan.getChildrenSet().add(uc12);
        session.save(uc12);
        UserCountry uc13 = new UserCountry("楚雄");
        uc13.setParent(yunNan);
        yunNan.getChildrenSet().add(uc13);
        session.save(uc13);
        UserCountry uc14 = new UserCountry("怒江");
        uc14.setParent(yunNan);
        yunNan.getChildrenSet().add(uc14);
        session.save(uc14);
        UserCountry uc15 = new UserCountry("迪庆");
        uc15.setParent(yunNan);
        yunNan.getChildrenSet().add(uc15);
        session.save(uc15);
        UserCountry uc16 = new UserCountry("思茅");
        uc16.setParent(yunNan);
        yunNan.getChildrenSet().add(uc16);
        session.save(uc16);
        session.save(yunNan);

    }
    //endregion

    //endregion

}