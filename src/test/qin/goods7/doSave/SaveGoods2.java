package qin.goods7.doSave;

import org.junit.Test;

import java.util.Date;

@SuppressWarnings("all")
public class SaveGoods2 extends SaveGoods
{
    private Long a = 10l;

    @Test
    public void prints()
    {
        String s1 = "";

        for (int i = 0; i < 20; i++)
        {
            System.out.println("String s" + i + " = \"\";");
        }
    }

    /**
     * 手机/运营商/数码
     */
    @Test
    public void save()
    {
        //region details
        String s0 = "Apple MacBook Air 13.3英寸笔记本电脑 银色(Core i5 处理器/8GB内存/256GB SSD闪存 MMGG2CH)\n" +
                  "主体\n" +
                  "颜色\n" +
                  "银色\n" +
                  "平台\n" +
                  "Intel\n" +
                  "操作系统\n" +
                  "操作系统\n" +
                  "Mac OS\n" +
                  "内存\n" +
                  "内存容量\n" +
                  "8GB\n" +
                  "显示器\n" +
                  "屏幕尺寸\n" +
                  "其他\n" +
                  "屏幕规格\n" +
                  "13.3英寸\n" +
                  "显示比例\n" +
                  "宽屏16：10\n" +
                  "物理分辨率\n" +
                  "1440 x 900\n" +
                  "屏幕类型\n" +
                  "LED背光\n" +
                  "通信\n" +
                  "局域网\n" +
                  "其它\n" +
                  "无线局域网\n" +
                  "其它\n" +
                  "端口\n" +
                  "音频端口\n" +
                  "耳机接口x1\n" +
                  "音效系统\n" +
                  "扬声器\n" +
                  "内置扬声器\n" +
                  "内置麦克风\n" +
                  "有\n" +
                  "输入设备\n" +
                  "键盘\n" +
                  "背光键盘\n" +
                  "触摸板\n" +
                  "有\n" +
                  "其它设备\n" +
                  "网络摄像头\n" +
                  "有\n" +
                  "指纹识别\n" +
                  "无\n" +
                  "电源\n" +
                  "电池\n" +
                  "其它\n" +
                  "续航时间\n" +
                  "其它\n" +
                  "电源适配器\n" +
                  "其它\n" +
                  "机器规格\n" +
                  "尺寸\n" +
                  "227×325×3-17mm\n" +
                  "净重\n" +
                  "<1.5kg\n" +
                  "包装清单\n" +
                  "MacBook Air× 1、电源适配器× 1、交流电源插头× 1、电源线× 1";
        String s1 = "联想（Lenovo）拯救者 ISK15.6英寸游戏笔记本电脑（i5-6300HQ 8G 1T HDD GTX960M 4G独显 FHD IPS屏 ）黑\n" +
                  "主体\n" +
                  "系列\n" +
                  "拯救者-15\n" +
                  "型号\n" +
                  "拯救者ISK\n" +
                  "颜色\n" +
                  "黑色\n" +
                  "平台\n" +
                  "Intel\n" +
                  "操作系统\n" +
                  "操作系统\n" +
                  "Windows 10家庭版\n" +
                  "处理器\n" +
                  "CPU型号\n" +
                  "i5-6300HQ\n" +
                  "CPU速度\n" +
                  "2.3GHz\n" +
                  "核心\n" +
                  "四核\n" +
                  "其它说明\n" +
                  "第六代智能英特尔酷睿i5四核处理器2.3GHz,睿频至3.2GHz\n" +
                  "内存\n" +
                  "内存容量\n" +
                  "8GB\n" +
                  "内存类型\n" +
                  "DDR4 2133\n" +
                  "硬盘\n" +
                  "硬盘容量\n" +
                  "1T\n" +
                  "转速\n" +
                  "5400转/分钟\n" +
                  "显卡\n" +
                  "类型\n" +
                  "独立显卡\n" +
                  "显示芯片\n" +
                  "NVDIA GTX960M专业级游戏显卡\n" +
                  "显存容量\n" +
                  "独立4GB\n" +
                  "显存类型\n" +
                  "GDDR5\n" +
                  "光驱\n" +
                  "光驱类型\n" +
                  "无光驱\n" +
                  "显示器\n" +
                  "屏幕规格\n" +
                  "15.6英寸\n" +
                  "显示比例\n" +
                  "宽屏16：9\n" +
                  "物理分辨率\n" +
                  "1920×1080\n" +
                  "屏幕类型\n" +
                  "LED背光\n" +
                  "特征\n" +
                  "FHD IPS\n" +
                  "通信\n" +
                  "内置蓝牙\n" +
                  "蓝牙4.0\n" +
                  "局域网\n" +
                  "10/100/1000Mbps\n" +
                  "无线局域网\n" +
                  "有\n" +
                  "端口\n" +
                  "USB2.0\n" +
                  "1 个\n" +
                  "USB3.0\n" +
                  "2个\n" +
                  "音频端口\n" +
                  "耳机、麦克风二合一接口\n" +
                  "显示端口\n" +
                  "VGA x 1/ HDMI x 1\n" +
                  "RJ45\n" +
                  "1个\n" +
                  "音效系统\n" +
                  "扬声器\n" +
                  "内置扬声器\n" +
                  "杜比音效\n" +
                  "支持\n" +
                  "内置麦克风\n" +
                  "有\n" +
                  "输入设备\n" +
                  "键盘\n" +
                  "巧克力键盘\n" +
                  "触摸板\n" +
                  "有\n" +
                  "其它设备\n" +
                  "网络摄像头\n" +
                  "有\n" +
                  "电源\n" +
                  "电池\n" +
                  "4芯 锂离子电池\n" +
                  "续航时间\n" +
                  "2-5小时\n" +
                  "电源适配器\n" +
                  "其它\n" +
                  "机器规格\n" +
                  "尺寸\n" +
                  "387mm X 272.6mm X 27.9mm\n" +
                  "净重\n" +
                  ">2.5kg\n" +
                  "包装清单\n" +
                  "笔记本主机 x1 电池 x1 电源适配器 x1";
        String s2 = "联想（ThinkPad ）轻薄系列E450(20DCA082CD)14英寸笔记本电脑 (i5-5200U 4G 500G 2G独显 win10)\n" +
                  "主体\n" +
                  "型号\n" +
                  "20DCA082CD\n" +
                  "颜色\n" +
                  "神秘黑\n" +
                  "平台\n" +
                  "Intel\n" +
                  "操作系统\n" +
                  "操作系统\n" +
                  "Windows 10\n" +
                  "处理器\n" +
                  "CPU类型\n" +
                  "第五代智能英特尔酷睿i5处理器\n" +
                  "CPU型号\n" +
                  "i5-5200U\n" +
                  "CPU速度\n" +
                  "2.2GHz睿频至2.7GHz\n" +
                  "三级缓存\n" +
                  "3M\n" +
                  "核心\n" +
                  "双核\n" +
                  "内存\n" +
                  "内存容量\n" +
                  "4GB\n" +
                  "内存类型\n" +
                  "DDR3L 1600\n" +
                  "插槽数量\n" +
                  "2 x SO-DIMM\n" +
                  "最大支持容量\n" +
                  "16GB\n" +
                  "硬盘\n" +
                  "硬盘容量\n" +
                  "500GB\n" +
                  "转速\n" +
                  "7200转/分钟\n" +
                  "接口类型\n" +
                  "SATA 串行\n" +
                  "显卡\n" +
                  "类型\n" +
                  "独立显卡\n" +
                  "显示芯片\n" +
                  "AMD R5 M240\n" +
                  "显存容量\n" +
                  "独立2GB\n" +
                  "光驱\n" +
                  "光驱类型\n" +
                  "无光驱\n" +
                  "显示器\n" +
                  "屏幕尺寸\n" +
                  "14英寸\n" +
                  "屏幕规格\n" +
                  "14.0英寸\n" +
                  "显示比例\n" +
                  "宽屏16：9\n" +
                  "物理分辨率\n" +
                  "1366 x 768\n" +
                  "屏幕类型\n" +
                  "LED背光\n" +
                  "特征\n" +
                  "防炫光雾面屏\n" +
                  "通信\n" +
                  "内置蓝牙\n" +
                  "有\n" +
                  "局域网\n" +
                  "10/100/1000Mbps\n" +
                  "无线局域网\n" +
                  "有\n" +
                  "红外\n" +
                  "不支持\n" +
                  "内置3G\n" +
                  "无\n" +
                  "内置3G模块\n" +
                  "无\n" +
                  "端口\n" +
                  "USB2.0\n" +
                  "1 个\n" +
                  "音频端口\n" +
                  "耳机、麦克风二合一接口\n" +
                  "显示端口\n" +
                  "HDMI接口\n" +
                  "其他端口\n" +
                  "4合1读卡器\n" +
                  "RJ45\n" +
                  "1个\n" +
                  "USB3.0\n" +
                  "2个\n" +
                  "音效系统\n" +
                  "扬声器\n" +
                  "内置扬声器\n" +
                  "杜比音效\n" +
                  "支持\n" +
                  "内置麦克风\n" +
                  "有\n" +
                  "输入设备\n" +
                  "键盘\n" +
                  "全尺寸键盘\n" +
                  "触摸板\n" +
                  "有\n" +
                  "指点杆\n" +
                  "有\n" +
                  "遥控器\n" +
                  "无\n" +
                  "其它设备\n" +
                  "网络摄像头\n" +
                  "有\n" +
                  "面部识别\n" +
                  "不支持\n" +
                  "指纹识别\n" +
                  "无\n" +
                  "电源\n" +
                  "电池\n" +
                  "6芯 锂离子电池\n" +
                  "续航时间\n" +
                  "2-3小时, 具体时间视使用环境而定\n" +
                  "电源适配器\n" +
                  "100-240V自适应交流电源适配器\n" +
                  "机器规格\n" +
                  "尺寸\n" +
                  "约344mm*约239mm*约22.3mm\n" +
                  "净重\n" +
                  "1.5kg-2kg\n" +
                  "包装清单\n" +
                  "笔记本主机 x1 电源适配器 x1 电源线 x1 主要配件成分说明书 x1 保修卡 x1";
        String s3 = "戴尔（DELL）Precision7710 17.3英寸移动工作站至强 E3-1535M 64G/256G+2T/M5000M 8G/4K屏 蓝牙指纹背光/WIN10/3年上门服务\n" +
                  "主体\n" +
                  "颜色\n" +
                  "黑色\n" +
                  "平台\n" +
                  "Intel\n" +
                  "翻新类型\n" +
                  "全新\n" +
                  "操作系统\n" +
                  "操作系统\n" +
                  "Windows 10\n" +
                  "处理器\n" +
                  "CPU类型\n" +
                  "酷睿四核\n" +
                  "CPU速度\n" +
                  "其它　\n" +
                  "三级缓存\n" +
                  "8M\n" +
                  "内建GPU\n" +
                  "Intel核芯显卡\n" +
                  "核心\n" +
                  "四核\n" +
                  "内存\n" +
                  "内存类型\n" +
                  "DDR4 2133\n" +
                  "最大支持容量\n" +
                  "其它\n" +
                  "硬盘\n" +
                  "转速\n" +
                  "7200转/分钟\n" +
                  "接口类型\n" +
                  "SATA 串行\n" +
                  "显卡\n" +
                  "类型\n" +
                  "独立显卡\n" +
                  "光驱\n" +
                  "光驱类型\n" +
                  "无光驱\n" +
                  "显示器\n" +
                  "屏幕尺寸\n" +
                  "其他\n" +
                  "屏幕规格\n" +
                  "17.3英寸\n" +
                  "显示比例\n" +
                  "宽屏16：9\n" +
                  "物理分辨率\n" +
                  "1920×1080\n" +
                  "屏幕类型\n" +
                  "LED背光\n" +
                  "通信\n" +
                  "内置蓝牙\n" +
                  "有\n" +
                  "局域网\n" +
                  "10/100/1000Mbps\n" +
                  "无线局域网\n" +
                  "有\n" +
                  "端口\n" +
                  "音频端口\n" +
                  "耳机、麦克风二合一接口\n" +
                  "显示端口\n" +
                  "HDMI接口\n" +
                  "RJ45\n" +
                  "1个\n" +
                  "音效系统\n" +
                  "扬声器\n" +
                  "内置扬声器\n" +
                  "杜比音效\n" +
                  "支持\n" +
                  "内置麦克风\n" +
                  "有\n" +
                  "输入设备\n" +
                  "键盘\n" +
                  "全尺寸键盘\n" +
                  "触摸板\n" +
                  "有\n" +
                  "指点杆\n" +
                  "有\n" +
                  "其它设备\n" +
                  "网络摄像头\n" +
                  "有\n" +
                  "指纹识别\n" +
                  "有\n" +
                  "电源\n" +
                  "电池\n" +
                  "内置锂离子电池\n" +
                  "续航时间\n" +
                  "5-8小时\n" +
                  "电源适配器\n" +
                  "100-240V自适应交流电源适配器\n" +
                  "机器规格\n" +
                  "净重\n" +
                  ">2.5kg\n" +
                  "包装清单\n" +
                  "移动工作站X1 电源适配器X1";
        String s4 = "华硕(ASUS) 玩家国度 GX700VO 17英寸高性能水冷游戏本 i7-6820HK 32G 512G+512G双固态 定制 桌面级GTX980-8G独显 FHD\n" +
                  "主体\n" +
                  "颜色\t其他\n" +
                  "平台\tIntel\n" +
                  "内存\n" +
                  "内存容量\t其它\n" +
                  "内存类型\tDDR4 2133\n" +
                  "硬盘\n" +
                  "硬盘容量\t其它\n" +
                  "显卡\n" +
                  "类型\t集显+独显\n" +
                  "显存容量\t其它\n" +
                  "光驱\n" +
                  "光驱类型\t无光驱\n" +
                  "显示器\n" +
                  "屏幕尺寸\t17英寸\n" +
                  "屏幕规格\t17.3英寸\n" +
                  "显示比例\t宽屏16：9\n" +
                  "物理分辨率\t1920×1080\n" +
                  "屏幕类型\tLED背光\n" +
                  "通信\n" +
                  "内置蓝牙\t有\n" +
                  "局域网\t10/100/1000Mbps\n" +
                  "无线局域网\t有\n" +
                  "内置3G\t无\n" +
                  "内置3G模块\t无\n" +
                  "端口\n" +
                  "音频端口\t耳机、麦克风二合一接口\n" +
                  "显示端口\tHDMI接口\n" +
                  "音效系统\n" +
                  "扬声器\t内置扬声器\n" +
                  "内置麦克风\t有\n" +
                  "输入设备\n" +
                  "键盘\t全尺寸键盘\n" +
                  "触摸板\t多点触控\n" +
                  "其它设备\n" +
                  "网络摄像头\t有\n" +
                  "指纹识别\t无\n" +
                  "电源\n" +
                  "电池\t内置锂离子电池\n" +
                  "续航时间\t<2小时\n" +
                  "电源适配器\t100-240V自适应交流电源适配器\n" +
                  "机器规格\n" +
                  "净重\t>2.5kg\n";
        String s5 = "Razer 雷蛇 Blade pro笔记本电脑17.3英寸触屏游戏本2016新款包税 i7-6700HQ GTX1080 32G 4K 2Tssd\n" +
                  "主体\n" +
                  "颜色\t黑色\n" +
                  "平台\tIntel\n" +
                  "内存\n" +
                  "内存容量\t其它\n" +
                  "显示器\n" +
                  "屏幕规格\t17.3英寸\n" +
                  "显示比例\t普屏\n" +
                  "物理分辨率\t3840 x 2160\n" +
                  "屏幕类型\tLCD\n" +
                  "通信\n" +
                  "局域网\t10/100Mbps\n" +
                  "无线局域网\t有\n" +
                  "端口\n" +
                  "音频端口\t耳机、麦克风二合一接口\n" +
                  "音效系统\n" +
                  "扬声器\t内置扬声器\n" +
                  "内置麦克风\t有\n" +
                  "输入设备\n" +
                  "键盘\t背光键盘\n" +
                  "触摸板\t有\n" +
                  "其它设备\n" +
                  "网络摄像头\t有\n" +
                  "电源\n" +
                  "电池\t8芯 锂离子电池\n" +
                  "续航时间\t2-5小时\n" +
                  "电源适配器\t100-240V自适应交流电源适配器\n" +
                  "机器规格\n" +
                  "净重\t2-2.5kg";
        String s6 = "微软Surface Book i5/i7 PC平板二合一笔记本电脑 主机i7-16G-1TB独显 主机+拓展坞\n" +
                  "配置\n" +
                  "核心数量\n" +
                  "双核\n" +
                  "扩展支持\n" +
                  "Micro SD (TF)卡\n" +
                  "可扩展容量\n" +
                  "128GB\n" +
                  "显示\n" +
                  "屏幕分辨率\n" +
                  "其他\n" +
                  "指取设备\n" +
                  "触摸\n" +
                  "连接\n" +
                  "WiFi功能\n" +
                  "支持\n" +
                  "蓝牙功能\n" +
                  "支持\n" +
                  "端口\n" +
                  "音频接口\n" +
                  "其他\n" +
                  "视频接口\n" +
                  "Mini HDMI\n" +
                  "USB接口\n" +
                  "标准3.0\n" +
                  "音效\n" +
                  "扬声器\n" +
                  "有\n" +
                  "功能\n" +
                  "摄像头\n" +
                  "有\n" +
                  "多点触控\n" +
                  "支持\n" +
                  "Flash播放\n" +
                  "支持\n" +
                  "重力感应\n" +
                  "支持\n" +
                  "投影功能\n" +
                  "支持\n" +
                  "电源\n" +
                  "电池类型\n" +
                  "锂电池\n" +
                  "电池容量\n" +
                  "10000mAh以上\n" +
                  "包装清单\n" +
                  "Surface Book、Surface触控笔、电源、快速入门指南、安全和保修文件";
        String s7 = "全球购 外星人 Alienware ALWA51-D1778 专业游戏台式主机 美行 i7-5960X 32G内存 512G SSD+ 4T TITAN*24G独显\n" +
                  "主体\n" +
                  "推荐用途\t家用电脑\n" +
                  "平台\tIntel平台\n" +
                  "操作系统\tWindows 8.1\n" +
                  "机箱类型\t大机箱\n" +
                  "主板\n" +
                  "显卡类型\t独立显卡\n" +
                  "声卡\t集成声卡\n" +
                  "网卡\t1000Mbps以太网卡\n" +
                  "CPU\n" +
                  "核心数\t八核\n" +
                  "显卡\n" +
                  "显存规格\tDDR5\n" +
                  "光驱\n" +
                  "类型\tBlu-ray Disc\n" +
                  "前(侧)面接口\n" +
                  "USB\t2 x USB3.0\n" +
                  "音频接口\t1\n" +
                  "读卡器\t有\n" +
                  "后面接口\n" +
                  "音频接口\t1\n" +
                  "USB\t8";
        String s8 = "机械革命（MECHREVO）MR Q8游戏台式电脑主机（i7-6700 DDR4 16G 128GSSD+1T GTX1070 8G独显 ）WIN10\n" +
                  "主体\n" +
                  "系列\n" +
                  "机械革命\n" +
                  "型号\n" +
                  "MR Q8\n" +
                  "平台\n" +
                  "Intel平台\n" +
                  "操作系统\n" +
                  "Windows 10\n" +
                  "机箱类型\n" +
                  "大机箱\n" +
                  "主板\n" +
                  "芯片组\n" +
                  "Intel B150\n" +
                  "显卡类型\n" +
                  "独立显卡\n" +
                  "声卡\n" +
                  "集成声卡\n" +
                  "网卡\n" +
                  "1000Mbps以太网卡\n" +
                  "CPU\n" +
                  "CPU型号\n" +
                  "i7-6700\n" +
                  "核心数\n" +
                  "四核（八线程）\n" +
                  "三级缓存\n" +
                  "8MB\n" +
                  "显卡\n" +
                  "显示芯片\n" +
                  "GTX1070\n" +
                  "显存规格\n" +
                  "DDR5\n" +
                  "内存\n" +
                  "容量\n" +
                  "16GB\n" +
                  "插槽数量\n" +
                  "4个\n" +
                  "硬盘\n" +
                  "容量\n" +
                  "1TB；128G SSD\n" +
                  "类型\n" +
                  "SATA 串行\n" +
                  "转速\n" +
                  "7200转/分钟\n" +
                  "盘位数\n" +
                  "3\n" +
                  "前(侧)面接口\n" +
                  "USB\n" +
                  "2\n" +
                  "音频接口\n" +
                  "1个耳麦接口，1个麦克风接口\n" +
                  "后面接口\n" +
                  "PS/2\n" +
                  "1\n" +
                  "视频接口\n" +
                  "DVI\\HDMI接口\n" +
                  "音频接口\n" +
                  "6\n" +
                  "USB\n" +
                  "6\n" +
                  "RJ45\n" +
                  "1\n" +
                  "扩展性\n" +
                  "PCI槽(空闲/总数)\n" +
                  "1×PCI插槽\n" +
                  "PCI-E\n" +
                  "1*PCIEX1,1*PCIEX4,1*PCIEX16\n" +
                  "规格\n" +
                  "电源\n" +
                  "ATX\n" +
                  "电源功率\n" +
                  "500W\n" +
                  "尺寸\n" +
                  "长49.5cm*宽21cm*高45cm\n" +
                  "包装清单\n" +
                  "主机：×1 电源线:×1 说明书:×1 装箱单×1";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";
        String s14 = "";
        String s15 = "";
        String s16 = "";
        String s17 = "";
        String s18 = "";
        String s19 = "";
        //endregion

        makeSave
                  (
                            //name
                            new String[]
                                      {
                                                "苹果笔记本", "联想笔记本", "thinkpad笔记本", "戴尔笔记本", "华硕笔记本", "雷蛇笔记本",
                                                "微软平板电脑", "外星人机箱", "机械革命", "联想触摸一体机"
                                      },
                            //details
                            new String[]
                                      {
                                                s0, s1, s2, s3, s4, s5, s6, s7, s8, s9
                                      },
                            //addDate
                            new Date[]
                                      {
                                                getDate(2016, 7, 7), getDate(2016, 3, 5),
                                                getDate(2011, 9, 1), getDate(2016, 4, 3),
                                                getDate(2013, 4, 5), getDate(2016, 2, 13),
                                                getDate(2016, 9, 4), getDate(2016, 2, 8),
                                                getDate(2016, 4, 3), getDate(2015, 3, 3)
                                      },
                            //levelId
                            new Integer[]
                                      {
                                                1, 1, 1, 1, 1, 1, 1, 1, 1, 1
                                      },
                            //price
                            new Double[]
                                      {
                                                8488.00001d, 5699.0001d, 3999.000001d, 43999.021d, 54999.00001d, 40480.00393d,
                                                250000.0039d, 80499.0033d, 7999.0033d, 16999.00484d
                                      },
                            //amount
                            new Long[]
                                      {
                                                10l, 10l, 10l, 10l, 10l, 10l, 10l, 10l, 10l, 10l
                                      },
                            //goodsType
                            new String[]
                                      {
                                                "笔记本", "笔记本", "笔记本", "笔记本", "笔记本", "笔记本",
                                                "平板电脑", "台式机", "台式机", "台式机"
                                      }
                  );
    }
}















