<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="qin.goods7.domain.Goods" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品首页</title>
    <jsp:include page="/jsLib/include_bootstrap.jsp"></jsp:include>
</head>

<style type="text/css">
    #_body
    {
        font-family: 微软雅黑;
    }
</style>

<%--

    div的id值                                                                           说明
    ----------------------------------------------------------------------------------------------------------------
    goods_headNavgiator                                                                 头部导航栏
    goods_allSearch                                                                     全局搜索与按钮
    goods_index                                                                         商品首页

--%>

<body id="_body" style="width: 100%;">

<%-- 头部导航栏 --%>
<div class="container" id="goods_headNavgiator">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand">
                        <font style="font-size:16px; color: black;">收藏本页</font>
                    </a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a style="color: blue;">
                                <img src="http://localhost/destoon/skin/default/image/ico_mobile.gif" alt="">
                                手机版
                            </a>
                        </li>
                        <li>
                            <a style="color: darkgreen;">
                                <img src="http://localhost/destoon/skin/default/image/ico_qrcode.gif" alt="">
                                二维码
                            </a>
                        </li>
                        <li>
                            <a style="color: purple;">
                                <img src="http://localhost/destoon/skin/default/image/ico_cart.gif" alt="">
                                购物车(0)
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</div>
<%-- 头部导航栏 --%>

<%-- 第二行:logo行与全局搜索 --%>
<div class="container" id="goods_allSearch">
    <div class="row clearfix">
        <div class="col-md-6 column">
            <img src="http://localhost/destoon/skin/default/image/logo.gif">
        </div>
    </div>
</div>
<%-- 第二行:logo行与全局搜索 --%>

<%-- 第三行:首页 --%>

<%-- 导航栏 --%>
<div class="row clearfix">
    <jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
</div>
<%-- 导航栏 --%>


<!-- 覆盖bootstrap选项卡样式 -->
<style type="text/css">
    .tab .nav-tabs
    {
        border-bottom: 0 none;
        background: #eaeaea;
    }

    .tab .nav-tabs li a
    {
        background: transparent;
        border-radius: 0;
        font-size: 16px;
        border: none;
        color: #333;
        padding: 12px 22px;
    }

    .tab .nav-tabs li.active a, .tab .nav-tabs li.active a i
    {
        border: 0 none;
        background: #e67e22;
        color: #fff;
    }

    .tab .nav-tabs li.active a:after
    {
        content: "";
        position: absolute;
        left: 45%;
        bottom: -14px;
        border: 7px solid transparent;
        border-top: 7px solid #e67e22;
    }

    .tab .tab-content
    {
        padding: 5px;
        color: #5a5c5d;
        font-size: 14px;
        line-height: 20px;
        margin-top: 5px;
        border-bottom: 1px solid #e67e22;
    }

    @media only screen and (max-width: 480px)
    {
        .tab .nav-tabs, .tab .nav-tabs li
        {
            width: 100%;
            background: transparent;
        }

        .tab .nav-tabs li.active a
        {
            border-radius: 10px 10px 0 0;
        }

        .tab .nav-tabs li:first-child a
        {
            border-bottom-left-radius: 0;
        }

        .tab .nav-tabs li a
        {
            margin-bottom: 10px;
            border: 1px solid lightgray;
        }

        .tab .nav-tabs li.active a:after
        {
            border: none;
        }
    }
</style>
<!-- 覆盖bootstrap选项卡样式 -->

<div class="container" id="goods_index">

    <%-- 重写面板样式 --%>
    <style type="text/css">
        .panel-info > .panel-heading
        {
            color: maroon;
            background-color: #ff6501;
            border-color: mediumaquamarine;
        }
    </style>
    <%-- 重写面板样式 --%>

    <div class="row clearfix">
        <div class="col-md-4 column">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        商品分类
                    </h3>
                </div>
                <div class="panel-body">
                </div>
            </div>
        </div>
        <div class="col-md-4 column">

            <div class="carousel slide" id="carousel-342663">
                <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#carousel-342663">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-342663">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-342663">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt=""
                             src="http://localhost/jd/环球系带平底帆布鞋男女情侣高帮单鞋韩版休闲透气学生布鞋潮9121 深蓝色-女 38【图片 价格 品牌 报价】-京东_files/1.jpg"/>
                    </div>
                    <div class="item">
                        <img alt="" src="http://localhost/jd/环球系带平底帆布鞋男女情侣高帮单鞋韩版休闲透气学生布鞋潮9121 深蓝色-女 38【图片 价格 品牌 报价】-京东_files/2.jpg"/>
                    </div>
                    <div class="item">
                        <img alt="" src="http://localhost/jd/环球系带平底帆布鞋男女情侣高帮单鞋韩版休闲透气学生布鞋潮9121 深蓝色-女 38【图片 价格 品牌 报价】-京东_files/3.jpg"/>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-342663" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-342663" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>

            <div class="tab" role="tabpanel">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist" style="margin-top:0px;" id="docTabs">
                    <li role="presentation" class="active">
                        <a href="#Section_new"
                           aria-controls="home" role="tab" data-toggle="tab">推荐商品</a>
                    <li role="presentation">
                        <a href="#Section_week"
                           aria-controls="profile" role="tab" data-toggle="tab">热卖商品</a>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="Section_new">
                        <%-- 显示推荐商品 --%>
                        <p>
                            <%--
                                 这段是根据goodsLevel=1的商品来进行推荐的

                                 思路实现:
                                 为了方便写代码就直接在jsp页面中写入java代码
                                 因为如果调用controller层的话必须先要实现服务层
                                 现在还没有实现服务层
                                 所以在这里就大致地写一下

                                 1.查询所有一级商品
                                    被标为一级商品的商品都是推荐商品
                                    查找一级商品的方法是根据表中goodsLevel字段来查询
                                    当goodsLevel=1时则此商品是推荐商品显示在首页
                                    使用hql实现
                                 2.为了避免记录过多所以在首页推荐商品上只显示8条记录
                                    于是使用变量_for记录for循环次数
                                    当循环次数到8此后停止循环输出前8条记录
                                 3.定义集合ids方便在js中调用
                                    由于js代码不能写在迭代中所以必须new一个集合把商品编号全部记录下来然后循环此集合
                                    循环js代码并且访问相关链接
                                    比如商品编号为1则访问的控制层是/goods/details.com?id=1
                                    如果是2则访问的控制层是/goods/details.com?id=2
                                    所以多条记录就使用for循环来实现
                                    当点击到超链接时访问此链接
                            --%>
                            <%
                                SessionFactory sessionFactory = (SessionFactory) new
                                        ClassPathXmlApplicationContext("applicationContext.xml")
                                        .getBean("sessionFactory");
                                Session hbSession = sessionFactory.openSession();

                                //找到一级商品
                                List<Goods> goodsList = hbSession
                                        .createQuery("from Goods where goodsLevelId=1")
                                        .list();

                                //记录for循环次数
                                int _for = 0;

                                StringBuilder sb = new StringBuilder();

                                //记录商品主键方便js代码中使用
                                List<Long> ids = new ArrayList<Long>();

                                for (Iterator<Goods> it = goodsList.iterator(); it.hasNext(); _for++)
                                {
                                    Goods goods = it.next();

                                    //设置超链接代码
                                    sb
                                            .append(" <a id=\"")
                                            .append(goods.getId())
                                            .append("\" ")
                                            .append("style='color: brown;'>")
                                            .append(goods.getGoodsName())
                                            .append("</a><br>");

                                    //记录主键
                                    ids.add(goods.getId());

                                    //最多显示8条记录, 如果循环次数大于8则终止循环并且输出前8条记录
                                    if (_for == 8)
                                    {
                                        break;
                                    }
                                }

                                sb
                                        .append("<script type=\"text/javascript\">\n")
                                        .append("                                $(function ()\n")
                                        .append("                                    {");

                                for (int i = 0; i < ids.size(); i++)
                                {
                                    Long myId = ids.get(i);

                                    //根据刚才获取的主键来编写js代码
                                    sb
                                            .append("$('#")
                                            .append(myId)
                                            .append("').click(function ()\n")
                                            .append("                                            {\n")
                                            .append("                                                window.location.href = \"/goods/details.com?id=")
                                            .append(myId)
                                            .append("\";\n")
                                            .append("                                            }\n")
                                            .append("                                        );");
                                }

                                sb
                                        .append("}\n")
                                        .append("                                );\n")
                                        .append("                            </script>");

                                out.println(sb.toString());
                            %>
                        </p>
                        <%-- 显示推荐商品 --%>
                    </div>
                    <div role="tabpanel" class="tab-pane fade" id="Section_week">
                        <p>
                            tab2中的内容
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <%-- 重写面板样式 --%>
        <style type="text/css">
            .panel-success > .panel-heading
            {
                color: #255625;
                background-color: #f04356;
                border-color: #122b40;
            }
        </style>
        <%-- 重写面板样式 --%>

        <div class="col-md-4 column">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        商品
                    </h3>
                </div>
                <div class="panel-body">
                </div>
            </div>
        </div>
    </div>

    <%-- 重写面板样式 --%>
    <style type="text/css">
        .panel-warning > .panel-heading
        {
            color: white;
            background-color: #2587F4;
            border-color: deeppink;
        }
    </style>
    <%-- 重写面板样式 --%>

    <br><br>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        最新上架
                    </h3>
                </div>
                <div class="panel-body">
                </div>
            </div>
        </div>
    </div>
</div>
<%-- 第三行:首页 --%>

</body>

</html>


