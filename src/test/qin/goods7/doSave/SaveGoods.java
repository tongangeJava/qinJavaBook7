package qin.goods7.doSave;

import org.junit.Test;
import qin.goods7.domain.Goods;
import qin.goods7.domain.GoodsType;
import qin.goods7.test.SpringTest;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("all")
public class SaveGoods extends SpringTest
{
    public Date getDate(int year, int month, int day)
    {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return c.getTime();
    }

    @Test
    public void _家用电器()
    {
        String s1 = "飞利浦（PHILIPS）43PFF5071/T3 43英寸 全高清LED十一核智能电视机（黑色）" +
                  "55英寸+十一核, 无理由三年保修149元, 安卓智能电视, 拨打服务热线400-880-0008可上门安装";
        String s2 = "夏普（SHARP）LCD-70SU860A 70英寸4K高清安卓智能平板液晶电视机" +
                  "主体参数\n" +
                  "产品品牌\t夏普（SHARP）\n" +
                  "产品型号\t70su860\n" +
                  "产品颜色\t黑色\n" +
                  "产品类型\t4K超清电视\n" +
                  "能效等级\t一级能效\n" +
                  "显示参数\n" +
                  "屏幕尺寸\t70英寸\n" +
                  "屏幕分辨率\t超高清4K（3840x2160）\n" +
                  "HDR显示\t支持\n" +
                  "屏幕比例\t16:9\n" +
                  "背光源\tLED\n" +
                  "3D显示\t不支持\n" +
                  "水平视角（度）\t160-180度\n" +
                  "垂直视角（度）\t160-180度\n" +
                  "核心参数\n" +
                  "智能电视\t是\n" +
                  "音频参数\n" +
                  "多声道功能\t环绕声\n" +
                  "扬声器数量\t2个\n" +
                  "扬声器类型\t辐射方向向后/向下\n" +
                  "输出功率\t≥12Hz\n" +
                  "外观设计\n" +
                  "底座配置\t内置底座\n" +
                  "端口参数\n" +
                  "光纤音频输出\t支持\n" +
                  "模拟RF接口\t支持\n" +
                  "功耗参数\n" +
                  "工作电压（v）\t220v\n" +
                  "网络参数\n" +
                  "网络连接\t支持\n" +
                  "连接方式\t无线/网线\n" +
                  "内容服务\n" +
                  "应用商店\t支持\n" +
                  "交互设备\n" +
                  "空鼠遥控\t支持\n" +
                  "体感遥控\t支持\n" +
                  "语音控制\t支持\n" +
                  "语音输入\t支持\n" +
                  "3D眼镜\t无\n" +
                  "互联互通\n" +
                  "多屏互动\t支持";
        String s3 = "奥克斯（AUX）正1.5匹 冷暖 定速 空调挂机(KFR-35GW/HFJ+3)\n" +
                  "【温情暖冬，一“惠”到底】厉害了我的空调，就是这么任性！110000+评论，高好评98%！人气网红爆款，赶紧下单吧！" +
                  "主体\n" +
                  "品牌\t奥克斯 AUX\n" +
                  "型号\tKFR-35GW/HFJ+3\n" +
                  "颜色\t白色\n" +
                  "类别\t壁挂式\n" +
                  "功能\n" +
                  "制冷类型\t冷暖\n" +
                  "匹数\t1.5匹\n" +
                  "定频/变频\t定频\n" +
                  "能效等级\t3级\n" +
                  "电辅加热\t支持\n" +
                  "适用面积(平方米)\t15-20\n" +
                  "制冷量(W)\t3500\n" +
                  "制冷功率(W)\t1064\n" +
                  "制热量(W)\t3850\n" +
                  "制热功率(W)\t1167\n" +
                  "电辅加热功率(W)\t1080\n" +
                  "内机噪音(dB(A)\t29-38-41\n" +
                  "外机噪音(dB(A)\t51\n" +
                  "定频机能效比\t3.29\n" +
                  "循环风量(m3/h)\t630\n" +
                  "扫风方式\t上下扫风\n" +
                  "产品特色\n" +
                  "自动清洁\t支持\n" +
                  "静音设计\t不支持\n" +
                  "独立除湿\t支持\n" +
                  "除甲醛\t支持\n" +
                  "规格\n" +
                  "制冷剂\t氟利昂（R22)\n" +
                  "电压/频率（V/HZ）\t220/50\n" +
                  "内机尺寸（宽x高x深）mm\t850×300×198\n" +
                  "外机尺寸（宽x高x深）mm\t785(845)×550×295\n" +
                  "内机重量（kg）\t11\n" +
                  "外机重量（kg）\t32.5";
        String s4 = "西门子（SIEMENS） XQG80-WM10N1C80W 8公斤 变频 滚筒洗衣机 LED显示 触摸控制 低噪音 洗涤分离（银色）" +
                  "主体\n" +
                  "品牌\t西门子 Siemens\n" +
                  "型号\tWM10N1C80W\n" +
                  "颜色\t银色\n" +
                  "类别\t滚筒式\n" +
                  "自动化程度\t全自动\n" +
                  "显示方式\tLED触摸宽屏控制\n" +
                  "开门方式\t前开式\n" +
                  "排水方式\t上排水\n" +
                  "电机类型\t变频电机\n" +
                  "特色功能\n" +
                  "脱水功能\t支持\n" +
                  "预约功能\t支持\n" +
                  "规格\n" +
                  "节能等级\t1级\n" +
                  "洗净比\t1.0-1.2\n" +
                  "洗涤容量（kg）\t6.1--8.0kg\n" +
                  "脱水容量（kg）\t6.1--8.0kg\n" +
                  "脱水转速\t1000\n" +
                  "脱水功率（W）\t400-550\n" +
                  "箱体材质\t渗锌钢板\n" +
                  "内筒材质\t不锈钢\n" +
                  "电源规格\t220V/50HZ\n" +
                  "产品尺寸（深×宽×高）mm\t560*600*850\n" +
                  "产品重量（kg）\t66\n";
        String s5 = "\n" +
                  "西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）\n" +
                  "分享 关注商品举报\n" +
                  "西门子（SIEMENS） BCD-610W(KA92NV02TI) 610升 变频风冷无霜 对开门冰箱 LED显示 速冷速冻（白色）" +
                  "主体\n" +
                  "品牌\t西门子 Siemens\n" +
                  "型号\tBCD-610W（KA92NV02TI）\n" +
                  "颜色\t白色\n" +
                  "类别\t对开门\n" +
                  "开门方式\t对开门\n" +
                  "显示方式\tLED显示\n" +
                  "气候类型\t热带（T）-亚热带（ST）--温带（N）－亚热带型（SN）\n" +
                  "功能\n" +
                  "制冷方式\t风冷\n" +
                  "控制方式\t电脑式\n" +
                  "制冷类型\t压缩机制冷\n" +
                  "除霜模式\t智能除霜\n" +
                  "定频/变频\t变频\n" +
                  "总容积(升)\t280以上\n" +
                  "能效等级\t2 级\n" +
                  "耗电量(KWh/24h)\t1.35\n" +
                  "制冷剂\tR600a\n" +
                  "规格\n" +
                  "电压/频率\t220V/50HZ\n" +
                  "产品尺寸（深x宽x高）mm\t714*912*1756";
        String s6 = "";
        String s7 = "";
        String s8 = "";

      /*
      电视
      空调
      洗衣机
      冰箱
      厨卫大电
      厨房小电
      生活电器
      个护健康
      家庭影音
      进口电气
       */

        makeSave
                  (
                            //name
                            new String[]
                                      {
                                                "飞利浦电视机", "夏普安卓液晶电视", "奥克斯壁挂式空调", "西门子洗衣机", "西门子冰箱"
                                      },
                            //details
                            new String[]
                                      {
                                                s1, s2, s3, s4, s5
                                      },
                            //addDate
                            new Date[]
                                      {
                                                getDate(2010, 3, 3), getDate(2016, 8, 5), getDate(2010, 3, 3), getDate(2009, 2, 2), getDate(2016, 6, 6)
                                      },
                            //levelId
                            new Integer[]
                                      {
                                                1, 1, 1, 1, 1
                                      },
                            //price
                            new Double[]
                                      {
                                                2099.00d, 14499.00d, 1899.00d, 3798.00d, 7299.00d
                                      },
                            //amount
                            new Long[]
                                      {
                                                20l, 10l, 10l, 10l, 10l
                                      },
                            //goodsType
                            new String[]
                                      {
                                                "合资品牌", "电视", "壁挂式空调", "滚筒洗衣机", "对开门"
                                      }
                  );

    }

    public void makeSave(String[] goodsName, String[] goodsDetails, Date[] addDate,
                         Integer[] levelId, Double[] price, Long[] amount, String[] typeNames)
    {
        for (int i = 0; i < goodsName.length; i++)
        {
            Goods goods = new Goods(goodsName[i]);
            goods.setGoodsDetails(goodsDetails[i]);
            goods.setGoodsAddDate(addDate[i]);
            goods.setGoodsLevelId(levelId[i]);
            goods.setGoodsPrice(price[i]);
            goods.setGoodsAmount(amount[i]);

            GoodsType goodsType = (GoodsType) session
                      .createQuery("from GoodsType where goodsTypeName='" + typeNames[i] + "'")
                      .list()
                      .get(0);

            goods.setGoodsType(goodsType);

            session.save(goods);
        }

        transaction.commit();
    }

    void _save()
    {
        GoodsType goodsType = null;

        Goods goods = new Goods("goodsName");
        goods.setGoodsDetails("details");
        goods.setGoodsAddDate(getDate(1, 1, 1));
        goods.setGoodsLevelId(1);
        goods.setGoodsPrice(22d);
        goods.setGoodsAmount(22l);
        goods.setGoodsType(goodsType);

        session.save(goods);
        transaction.commit();
    }
}
















