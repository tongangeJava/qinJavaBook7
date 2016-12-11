/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.16-log : Database - java7book
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`java7book` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `java7book`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `book` */

/*Table structure for table `goodstype_childrenset7` */

DROP TABLE IF EXISTS `goodstype_childrenset7`;

CREATE TABLE `goodstype_childrenset7` (
  `joinColumn_children` bigint(20) NOT NULL,
  `goodsType_childrenSet_id` bigint(20) NOT NULL,
  PRIMARY KEY (`joinColumn_children`,`goodsType_childrenSet_id`),
  UNIQUE KEY `UK_a3wwe9vgjto2kxkb60o2jfe7w` (`goodsType_childrenSet_id`),
  CONSTRAINT `FK_a3wwe9vgjto2kxkb60o2jfe7w` FOREIGN KEY (`goodsType_childrenSet_id`) REFERENCES `qin_goodstype7` (`id`),
  CONSTRAINT `FK_r75cyd6qkj3lki1kkcj9vj9eq` FOREIGN KEY (`joinColumn_children`) REFERENCES `qin_goodstype7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goodstype_childrenset7` */

insert  into `goodstype_childrenset7`(`joinColumn_children`,`goodsType_childrenSet_id`) values (1,16),(1,17),(1,18),(1,19),(1,20),(1,21),(1,22),(1,23),(1,24),(1,25),(2,26),(2,27),(2,28),(2,29),(2,30),(2,31),(2,32),(2,33),(3,34),(3,35),(3,36),(3,37),(3,38),(3,39),(3,40),(3,41),(4,42),(4,43),(4,44),(4,45),(4,46),(4,47),(4,48),(5,49),(5,50),(5,51),(5,52),(5,53),(6,54),(6,55),(6,56),(6,57),(6,58),(6,59),(6,60),(6,61),(7,62),(7,63),(7,64),(7,65),(7,66),(7,67),(7,68),(7,69),(7,70),(7,71),(8,72),(8,73),(8,74),(8,75),(8,76),(8,77),(8,78),(8,79),(8,80),(8,81),(9,82),(9,83),(9,84),(9,85),(9,86),(9,87),(9,88),(9,89),(9,90),(9,91),(10,92),(10,93),(10,94),(10,95),(10,96),(10,97),(10,98),(10,99),(10,100),(10,101),(11,102),(11,103),(11,104),(11,105),(11,106),(11,107),(11,108),(11,109),(11,110),(11,111),(11,112),(11,113),(12,114),(12,115),(12,116),(12,117),(12,118),(12,119),(12,120),(13,121),(13,122),(13,123),(13,124),(13,125),(13,126),(13,127),(13,128),(13,129),(13,130),(13,131),(14,132),(14,133),(14,134),(14,135),(14,136),(14,137),(14,138),(14,139),(14,140),(14,141),(14,142),(15,143),(15,144),(15,145),(15,146),(15,147),(15,148),(23,319),(23,320),(23,321),(23,322),(23,323),(23,324),(23,325),(23,326),(23,327),(23,328),(23,329),(23,330),(23,331),(19,332),(19,333),(19,334),(19,335),(19,336),(19,337),(19,338),(20,339),(20,340),(20,341),(20,342),(20,343),(20,344),(20,345),(20,346),(21,347),(21,348),(21,349),(21,350),(21,351),(21,352),(21,353),(21,354),(21,355),(21,356),(21,357),(21,358),(21,359),(21,360),(21,361),(21,362),(21,363),(21,364),(21,365),(21,366),(21,367),(24,368),(24,369),(24,370),(24,371),(18,372),(18,373),(18,374),(18,375),(22,376),(22,377),(22,378),(22,379),(22,380),(22,381),(22,382),(22,383),(22,384),(22,385),(22,386),(22,387),(22,388),(22,389),(22,390),(22,391),(22,392),(22,393),(16,394),(16,395),(16,396),(17,397),(17,398),(17,399),(17,400),(26,553),(26,554),(26,555),(26,556),(27,557),(27,558),(27,559),(27,560),(27,561),(27,562),(27,563),(27,564),(27,565),(27,566),(28,567),(28,568),(28,569),(28,570),(28,571),(28,572),(28,573),(28,574),(28,575),(28,576),(28,577),(28,578),(28,579),(28,580),(28,581),(29,582),(29,583),(29,584),(29,585),(29,586),(29,587),(29,588),(29,589),(29,590),(29,591),(29,592),(30,593),(30,594),(30,595),(30,596),(30,597),(30,598),(30,599),(30,600),(30,601),(30,602),(30,603),(31,604),(31,605),(31,606),(31,607),(31,608),(31,609),(31,610),(32,611),(32,612),(32,613),(32,614),(32,615),(32,616),(32,617),(32,618),(32,619),(32,620),(32,621),(33,622),(33,623),(33,624),(33,625),(33,626),(33,627),(33,628),(34,794),(34,795),(34,796),(34,797),(34,798),(34,799),(34,800),(34,801),(35,802),(35,803),(35,804),(35,805),(35,806),(35,807),(35,808),(35,809),(35,810),(35,811),(35,812),(35,813),(35,814),(35,815),(36,816),(36,817),(36,818),(36,819),(36,820),(36,821),(36,822),(36,823),(36,824),(36,825),(36,826),(36,827),(36,828),(36,829),(36,830),(37,831),(37,832),(37,833),(37,834),(37,835),(38,836),(38,837),(38,838),(38,839),(38,840),(38,841),(38,842),(39,843),(39,844),(39,845),(39,846),(39,847),(39,848),(39,849),(39,850),(39,851),(39,852),(39,853),(39,854),(39,855),(39,856),(39,857),(39,858),(39,859),(40,860),(40,861),(40,862),(40,863),(40,864),(40,865),(40,866),(40,867),(40,868),(40,869),(40,870),(40,871),(40,872),(41,873),(41,874),(41,875),(41,876);

/*Table structure for table `goodstype_goodsset7` */

DROP TABLE IF EXISTS `goodstype_goodsset7`;

CREATE TABLE `goodstype_goodsset7` (
  `joinColumn_goodsSet` bigint(20) NOT NULL,
  `goodsTypeSet_id` bigint(20) NOT NULL,
  PRIMARY KEY (`joinColumn_goodsSet`,`goodsTypeSet_id`),
  UNIQUE KEY `UK_llhrvrd7lo6seer6c9hkx8tkq` (`goodsTypeSet_id`),
  CONSTRAINT `FK_atoyjvbak67e1in9dxbugw5mt` FOREIGN KEY (`joinColumn_goodsSet`) REFERENCES `qin_goodstype7` (`id`),
  CONSTRAINT `FK_llhrvrd7lo6seer6c9hkx8tkq` FOREIGN KEY (`goodsTypeSet_id`) REFERENCES `qin_goods7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goodstype_goodsset7` */

/*Table structure for table `qin_goods7` */

DROP TABLE IF EXISTS `qin_goods7`;

CREATE TABLE `qin_goods7` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodsAddDate` date DEFAULT NULL,
  `goodsAmount` bigint(20) DEFAULT NULL,
  `goodsDetails` varchar(20000) DEFAULT NULL,
  `goodsName` varchar(300) DEFAULT NULL,
  `goodsPrice` double DEFAULT NULL,
  `joinColumn_goods_goodsType` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_goods_goodsType` (`joinColumn_goods_goodsType`),
  CONSTRAINT `fk_goods_goodsType` FOREIGN KEY (`joinColumn_goods_goodsType`) REFERENCES `qin_goodstype7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_goods7` */

/*Table structure for table `qin_goodstype7` */

DROP TABLE IF EXISTS `qin_goodstype7`;

CREATE TABLE `qin_goodstype7` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodsTypeId` bigint(20) DEFAULT NULL,
  `goodsTypeName` varchar(400) DEFAULT NULL,
  `joinColumn_parent` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nxwlsiax58m56iv05uu37dvw4` (`goodsTypeId`),
  UNIQUE KEY `UK_lwadf2kp73uj67d0pff8i1hgo` (`goodsTypeName`),
  KEY `fk_parent` (`joinColumn_parent`),
  CONSTRAINT `fk_parent` FOREIGN KEY (`joinColumn_parent`) REFERENCES `qin_goodstype7` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=973 DEFAULT CHARSET=utf8;

/*Data for the table `qin_goodstype7` */

insert  into `qin_goodstype7`(`id`,`goodsTypeId`,`goodsTypeName`,`joinColumn_parent`) values (1,0,'家用电器',NULL),(2,1,'手机/运营商/数码',NULL),(3,2,'电脑办公',NULL),(4,3,'家居/家具/家装/厨具',NULL),(5,4,'男装/ 女装/ 童装/ 内衣',NULL),(6,5,'个护化妆/ 清洁用品/ 宠物',NULL),(7,6,'鞋靴/ 箱包/ 珠宝/ 奢侈品',NULL),(8,7,'运动/ 户外/ 钟表',NULL),(9,8,'汽车/ 汽车用品',NULL),(10,9,'母婴/ 玩具乐器',NULL),(11,10,'食品/ 酒类/ 生鲜/ 特产',NULL),(12,11,'医药保健',NULL),(13,12,'图书/ 音像/ 电子书',NULL),(14,13,'机票/ 酒店/ 旅游/ 生活',NULL),(15,14,'理财/ 众筹/ 白条/ 保险',NULL),(16,NULL,'电视',1),(17,NULL,'空调',1),(18,NULL,'洗衣机',1),(19,NULL,'冰箱',1),(20,NULL,'厨卫大电',1),(21,NULL,'厨房小电',1),(22,NULL,'生活电器',1),(23,NULL,'个护健康',1),(24,NULL,'家庭影音',1),(25,NULL,'进口电器',1),(26,NULL,'手机通讯',2),(27,NULL,'运营商',2),(28,NULL,'手机配件',2),(29,NULL,'摄影摄像',2),(30,NULL,'数码配件',2),(31,NULL,'影音娱乐',2),(32,NULL,'智能设备',2),(33,NULL,'电子教育',2),(34,NULL,'电脑整机',3),(35,NULL,'电脑配件',3),(36,NULL,'外设产品',3),(37,NULL,'游戏设备',3),(38,NULL,'网络产品',3),(39,NULL,'办公设备',3),(40,NULL,'文具耗材',3),(41,NULL,'服务产品',3),(42,NULL,'厨具',4),(43,NULL,'家纺',4),(44,NULL,'生活日用',4),(45,NULL,'家装软饰',4),(46,NULL,'灯具',4),(47,NULL,'家具',4),(48,NULL,'家装建材',4),(49,NULL,'女装',5),(50,NULL,'男装',5),(51,NULL,'内衣',5),(52,NULL,'配饰',5),(53,NULL,'童装童鞋',5),(54,NULL,'面部护肤',6),(55,NULL,'洗发护发',6),(56,NULL,'身体护理',6),(57,NULL,'口腔护理',6),(58,NULL,'女性护理',6),(59,NULL,'香水彩妆',6),(60,NULL,'清洁用品',6),(61,NULL,'宠物生活',6),(62,NULL,'时尚女鞋',7),(63,NULL,'流行男鞋',7),(64,NULL,'潮流女包',7),(65,NULL,'精品男包',7),(66,NULL,'功能箱包',7),(67,NULL,'奢侈品',7),(68,NULL,'精选大牌',7),(69,NULL,'礼品',7),(70,NULL,'珠宝首饰',7),(71,NULL,'金银投资',7),(72,NULL,'运动鞋包',8),(73,NULL,'运动服饰',8),(74,NULL,'健身训练',8),(75,NULL,'骑行运动',8),(76,NULL,'体育用品',8),(77,NULL,'户外鞋服',8),(78,NULL,'户外装备',8),(79,NULL,'垂钓用品',8),(80,NULL,'游泳用品',8),(81,NULL,'钟表',8),(82,NULL,'汽车车型',9),(83,NULL,'汽车价格',9),(84,NULL,'汽车品牌',9),(85,NULL,'维修保养',9),(86,NULL,'车载电器',9),(87,NULL,'美容清洗',9),(88,NULL,'汽车装饰',9),(89,NULL,'安全自驾',9),(90,NULL,'赛事改装',9),(91,NULL,'汽车服务',9),(92,NULL,'奶粉',10),(93,NULL,'营养辅食',10),(94,NULL,'尿裤湿巾',10),(95,NULL,'喂养用品',10),(96,NULL,'洗护用品',10),(97,NULL,'寝居服饰',10),(98,NULL,'妈妈专区',10),(99,NULL,'童车童床',10),(100,NULL,'玩具',10),(101,NULL,'乐器',10),(102,NULL,'新鲜水果',11),(103,NULL,'海鲜水产',11),(104,NULL,'肉禽蛋品',11),(105,NULL,'新鲜蔬菜',11),(106,NULL,'冷饮冻食',11),(107,NULL,'中外名酒',11),(108,NULL,'进口食品',11),(109,NULL,'休闲食品',11),(110,NULL,'地方特产',11),(111,NULL,'茗茶',11),(112,NULL,'饮料冲调',11),(113,NULL,'粮油调味',11),(114,NULL,'中西药品',12),(115,NULL,'营养健康',12),(116,NULL,'营养成分',12),(117,NULL,'滋补养生',12),(118,NULL,'成人用品',12),(119,NULL,'保健器械',12),(120,NULL,'护理护具',12),(121,NULL,'音像',13),(122,NULL,'少儿',13),(123,NULL,'教育',13),(124,NULL,'文艺',13),(125,NULL,'经管励志',13),(126,NULL,'人文社科',13),(127,NULL,'生活',13),(128,NULL,'科技',13),(129,NULL,'刊/原版',13),(130,NULL,'电子书',13),(131,NULL,'数字音乐',13),(132,NULL,'交通出行',14),(133,NULL,'酒店预订',14),(134,NULL,'旅游度假',14),(135,NULL,'商旅服务',14),(136,NULL,'演出票务',14),(137,NULL,'生活缴费',14),(138,NULL,'生活服务',14),(139,NULL,'教育培训',14),(140,NULL,'彩票',14),(141,NULL,'游戏',14),(142,NULL,'海外生活',14),(143,NULL,'理财',15),(144,NULL,'众筹',15),(145,NULL,'东家',15),(146,NULL,'白条',15),(147,NULL,'钱包',15),(148,NULL,'保险',15),(319,NULL,'剃须刀',23),(320,NULL,'口腔护理_',23),(321,NULL,'电吹风',23),(322,NULL,'美容器',23),(323,NULL,'卷/直发器',23),(324,NULL,'理发器',23),(325,NULL,'剃/脱毛器',23),(326,NULL,'足浴盆',23),(327,NULL,'健康秤/厨房秤',23),(328,NULL,'按摩器',23),(329,NULL,'按摩椅',23),(330,NULL,'计步器/脂肪检测仪',23),(331,NULL,'其它健康电器',23),(332,NULL,'多门',19),(333,NULL,'对开门',19),(334,NULL,'三门',19),(335,NULL,'双门',19),(336,NULL,'冷柜/冰吧',19),(337,NULL,'酒柜',19),(338,NULL,'冰箱配件',19),(339,NULL,'油烟机',20),(340,NULL,'燃气灶',20),(341,NULL,'烟灶套装',20),(342,NULL,'消毒柜',20),(343,NULL,'洗碗机',20),(344,NULL,'电热水器',20),(345,NULL,'燃气热水器',20),(346,NULL,'嵌入式厨电',20),(347,NULL,'厨房小电_',21),(348,NULL,'电饭煲',21),(349,NULL,'微波炉',21),(350,NULL,'电烤箱',21),(351,NULL,'电磁炉',21),(352,NULL,'电压力锅',21),(353,NULL,'豆浆机',21),(354,NULL,'咖啡机',21),(355,NULL,'面包机',21),(356,NULL,'榨汁机',21),(357,NULL,'料理机',21),(358,NULL,'电饼铛',21),(359,NULL,'养生壶/煎药壶',21),(360,NULL,'酸奶机',21),(361,NULL,'煮蛋器',21),(362,NULL,'电水壶/热水瓶',21),(363,NULL,'电炖锅',21),(364,NULL,'多用途锅',21),(365,NULL,'电烧烤炉',21),(366,NULL,'电热饭盒',21),(367,NULL,'其它厨房电器',21),(368,NULL,'家庭影院',24),(369,NULL,'迷你音响',24),(370,NULL,'dvd',24),(371,NULL,'电视影音插件',24),(372,NULL,'滚筒洗衣机',18),(373,NULL,'洗烘一体机',18),(374,NULL,'波轮洗衣机',18),(375,NULL,'洗衣机配件',18),(376,NULL,'取暖电器',22),(377,NULL,'吸尘器',22),(378,NULL,'净化器',22),(379,NULL,'扫地机器人',22),(380,NULL,'加湿器',22),(381,NULL,'挂烫机/熨斗',22),(382,NULL,'电风扇',22),(383,NULL,'冷风扇',22),(384,NULL,'插座',22),(385,NULL,'电话机',22),(386,NULL,'饮水机',22),(387,NULL,'净水器',22),(388,NULL,'除湿机',22),(389,NULL,'干衣机',22),(390,NULL,'清洁机',22),(391,NULL,'收录/音机',22),(392,NULL,'其它生活电器',22),(393,NULL,'生活电器配件',22),(394,NULL,'合资品牌',16),(395,NULL,'国产品牌',16),(396,NULL,'互联网品牌',16),(397,NULL,'壁挂式空调',17),(398,NULL,'柜式空调',17),(399,NULL,'中央空调',17),(400,NULL,'空调配件',17),(553,NULL,'手机',26),(554,NULL,'对讲机',26),(555,NULL,'以旧换新',26),(556,NULL,'手机维修',26),(557,NULL,'充话费/流量',27),(558,NULL,'170选号',27),(559,NULL,'合约机',27),(560,NULL,'办套餐',27),(561,NULL,'选号码',27),(562,NULL,'固话宽带',27),(563,NULL,'京东通信',27),(564,NULL,'中国移动',27),(565,NULL,'中国联通',27),(566,NULL,'中国电信',27),(567,NULL,'手机壳',28),(568,NULL,'贴膜',28),(569,NULL,'手机存储卡',28),(570,NULL,'数据线',28),(571,NULL,'充电器',28),(572,NULL,'手机耳机',28),(573,NULL,'创意配件',28),(574,NULL,'手机饰品',28),(575,NULL,'手机电池',28),(576,NULL,'苹果周边',28),(577,NULL,'移动电源',28),(578,NULL,'蓝牙耳机',28),(579,NULL,'手机支架',28),(580,NULL,'车载配件',28),(581,NULL,'拍照配件',28),(582,NULL,'数码相机',29),(583,NULL,'单电/微单相机',29),(584,NULL,'单反相机',29),(585,NULL,'拍立得',29),(586,NULL,'运动相机',29),(587,NULL,'摄像机',29),(588,NULL,'镜头',29),(589,NULL,'户外器材',29),(590,NULL,'影棚器材',29),(591,NULL,'冲印服务',29),(592,NULL,'数码相框',29),(593,NULL,'存储卡',30),(594,NULL,'三脚架/云台',30),(595,NULL,'相机包',30),(596,NULL,'滤镜',30),(597,NULL,'闪光灯/手柄',30),(598,NULL,'相机清洁/贴膜',30),(599,NULL,'机身附件',30),(600,NULL,'镜头附件',30),(601,NULL,'读卡器',30),(602,NULL,'支架',30),(603,NULL,'电池/充电器',30),(604,NULL,'耳机/耳麦',31),(605,NULL,'音箱/音响',31),(606,NULL,'便携/无线音箱',31),(607,NULL,'收音机',31),(608,NULL,'麦克风',31),(609,NULL,'MP3/MP4',31),(610,NULL,'专业音频',31),(611,NULL,'智能手环',32),(612,NULL,'智能手表',32),(613,NULL,'智能眼镜',32),(614,NULL,'智能机器人',32),(615,NULL,'运动跟踪器',32),(616,NULL,'健康监测',32),(617,NULL,'智能配饰',32),(618,NULL,'智能家居',32),(619,NULL,'体感车',32),(620,NULL,'无人机',32),(621,NULL,'其他配件',32),(622,NULL,'学生平板',33),(623,NULL,'点读机/笔',33),(624,NULL,'早教益智',33),(625,NULL,'录音笔',33),(626,NULL,'电纸书',33),(627,NULL,'电子词典',33),(628,NULL,'复读机 ',33),(794,NULL,'笔记本',34),(795,NULL,'游戏本',34),(796,NULL,'平板电脑',34),(797,NULL,'平板电脑配件',34),(798,NULL,'台式机',34),(799,NULL,'一体机',34),(800,NULL,'服务器/工作站',34),(801,NULL,'笔记本配件',34),(802,NULL,'显示器',35),(803,NULL,'CPU',35),(804,NULL,'主板',35),(805,NULL,'硬盘',35),(806,NULL,'内存',35),(807,NULL,'机箱',35),(808,NULL,'电源',35),(809,NULL,'散热器',35),(810,NULL,'刻录机/光驱',35),(811,NULL,'声卡/扩展卡',35),(812,NULL,'装机配件',35),(813,NULL,'显卡',35),(814,NULL,'SSD固态硬盘',35),(815,NULL,'组装电脑',35),(816,NULL,'鼠标',36),(817,NULL,'键盘',36),(818,NULL,'键鼠套装',36),(819,NULL,'网络仪表仪器',36),(820,NULL,'U盘',36),(821,NULL,'移动硬盘',36),(822,NULL,'鼠标垫',36),(823,NULL,'摄像头',36),(824,NULL,'线缆',36),(825,NULL,'手写板',36),(826,NULL,'硬盘盒',36),(827,NULL,'电脑工具',36),(828,NULL,'电脑清洁',36),(829,NULL,'UPS电源',36),(830,NULL,'插座_',36),(831,NULL,'游戏机',37),(832,NULL,'游戏耳机',37),(833,NULL,'手柄/方向盘',37),(834,NULL,'游戏软件',37),(835,NULL,'游戏周边',37),(836,NULL,'路由器',38),(837,NULL,'网络机顶盒',38),(838,NULL,'交换机',38),(839,NULL,'网络存储',38),(840,NULL,'网卡',38),(841,NULL,'4G/3G上网',38),(842,NULL,'网络配件',38),(843,NULL,'投影机',39),(844,NULL,'投影配件',39),(845,NULL,'多功能一体机',39),(846,NULL,'打印机',39),(847,NULL,'传真设备',39),(848,NULL,'验钞/点钞机',39),(849,NULL,'扫描设备',39),(850,NULL,'复合机',39),(851,NULL,'碎纸机',39),(852,NULL,'考勤机',39),(853,NULL,'收银机',39),(854,NULL,'会议音频视频',39),(855,NULL,'保险柜',39),(856,NULL,'装订/封装机',39),(857,NULL,'安防监控',39),(858,NULL,'办公家具',39),(859,NULL,'白板',39),(860,NULL,'硒鼓/墨粉',40),(861,NULL,'墨盒',40),(862,NULL,'色带',40),(863,NULL,'纸类',40),(864,NULL,'办公文具',40),(865,NULL,'学生文具',40),(866,NULL,'文件管理',40),(867,NULL,'本册/便签',40),(868,NULL,'计算器',40),(869,NULL,'笔类',40),(870,NULL,'画具画材',40),(871,NULL,'财会用品',40),(872,NULL,'刻录碟片/附件',40),(873,NULL,'延保服务',41),(874,NULL,'上门安装',41),(875,NULL,'维修保养_',41),(876,NULL,'电脑软件',41);

/*Table structure for table `qin_user7` */

DROP TABLE IF EXISTS `qin_user7`;

CREATE TABLE `qin_user7` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `birthdate` date DEFAULT NULL,
  `user_email` varchar(60) DEFAULT NULL,
  `user_firstName` varchar(6) DEFAULT NULL,
  `user_gender` varchar(255) DEFAULT NULL,
  `user_lastName` varchar(16) DEFAULT NULL,
  `user_loginName` varchar(30) DEFAULT NULL,
  `user_nation` varchar(5) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  `user_phone` varchar(30) DEFAULT NULL,
  `user_realName` varchar(9) DEFAULT NULL,
  `user_myName` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_user7` */

/*Table structure for table `qin_user_join_country7` */

DROP TABLE IF EXISTS `qin_user_join_country7`;

CREATE TABLE `qin_user_join_country7` (
  `userCountry_id` bigint(20) DEFAULT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_dw4ng9tmns72cc5d3ahmm29fx` (`userCountry_id`),
  CONSTRAINT `FK_4a3o4n3yfohxdoyh7vd8sn1tl` FOREIGN KEY (`id`) REFERENCES `qin_user7` (`id`),
  CONSTRAINT `FK_dw4ng9tmns72cc5d3ahmm29fx` FOREIGN KEY (`userCountry_id`) REFERENCES `qin_usercountry7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_user_join_country7` */

/*Table structure for table `qin_usercountry7` */

DROP TABLE IF EXISTS `qin_usercountry7`;

CREATE TABLE `qin_usercountry7` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_usercountry7` */

/*Table structure for table `qin_usercountry_children_set7` */

DROP TABLE IF EXISTS `qin_usercountry_children_set7`;

CREATE TABLE `qin_usercountry_children_set7` (
  `qin_userCountry7_id` bigint(20) NOT NULL,
  `childrenSet_id` bigint(20) NOT NULL,
  PRIMARY KEY (`qin_userCountry7_id`,`childrenSet_id`),
  UNIQUE KEY `UK_tbju1xdh77a0tqay37vkd3cu1` (`childrenSet_id`),
  CONSTRAINT `FK_1r28ww00k89v80g2j7hqtcrng` FOREIGN KEY (`qin_userCountry7_id`) REFERENCES `qin_usercountry7` (`id`),
  CONSTRAINT `FK_tbju1xdh77a0tqay37vkd3cu1` FOREIGN KEY (`childrenSet_id`) REFERENCES `qin_usercountry7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_usercountry_children_set7` */

/*Table structure for table `qin_usercountry_parent7` */

DROP TABLE IF EXISTS `qin_usercountry_parent7`;

CREATE TABLE `qin_usercountry_parent7` (
  `col_parent_id` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_parent_id` (`col_parent_id`),
  CONSTRAINT `FK_1i20ap5uyw3489ul5x4yx2r6m` FOREIGN KEY (`id`) REFERENCES `qin_usercountry7` (`id`),
  CONSTRAINT `fk_parent_id` FOREIGN KEY (`col_parent_id`) REFERENCES `qin_usercountry7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_usercountry_parent7` */

/*Table structure for table `qin_usercountry_user_set7` */

DROP TABLE IF EXISTS `qin_usercountry_user_set7`;

CREATE TABLE `qin_usercountry_user_set7` (
  `qin_userCountry7_id` bigint(20) NOT NULL,
  `userSet_id` int(11) NOT NULL,
  PRIMARY KEY (`qin_userCountry7_id`,`userSet_id`),
  UNIQUE KEY `UK_92hcobx336gs2smc4huwogoyh` (`userSet_id`),
  CONSTRAINT `FK_92hcobx336gs2smc4huwogoyh` FOREIGN KEY (`userSet_id`) REFERENCES `qin_user7` (`id`),
  CONSTRAINT `FK_eui59i1ivslwgmh2shqhsn5nh` FOREIGN KEY (`qin_userCountry7_id`) REFERENCES `qin_usercountry7` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qin_usercountry_user_set7` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
