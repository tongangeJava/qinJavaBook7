<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到商品管理系统</title>
    <jsp:include page="/jsLib/include_bootstrap.jsp"></jsp:include>
</head>

<body id="_body" style="width: 100%;">

<%-- 头部导航栏 --%>
<div class="container" id="goods_headNavgiator">
    <jsp:include page="/WEB-INF/jsp/headerNavigator.jsp"></jsp:include>
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

<%-- 第三行:首页 --%>

<%-- 页面正文 --%>

<%-- 3columns --%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-4 column">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        供应分类
                    </h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
            </div>
        </div>
        <div class="col-md-4 column">
            <div class="carousel slide" id="carousel-237001">
                <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#carousel-237001">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-237001">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-237001">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                First Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/2/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Second Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/3/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Third Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-237001" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-237001" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>

            <br>

            <%-- 选项卡 --%>
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

            <div class="tab" role="tabpanel">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist" style="margin-top:0px;" id="docTabs">
                    <li role="presentation" class="active">
                        <a href="#Section_tj"
                           aria-controls="home" role="tab" data-toggle="tab">求购</a></li>
                    <li role="presentation">
                        <a href="#Section_gy"
                           aria-controls="profile" role="tab" data-toggle="tab">供应</a></li>
                    <li role="presentation">
                        <a href="#Section_zs"
                           aria-controls="profile" role="tab" data-toggle="tab">招商</a></li>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="Section_tj">
                        <%-- 显示推荐商品 --%>
                        <p>
                            推荐
                        </p>
                        <%-- 显示推荐商品 --%>
                    </div>
                    <div role="tabpanel" class="tab-pane fade" id="Section_gy">
                        <p>
                            供应
                        </p>
                    </div>
                    <div role="tabpanel" class="tab-pane fade" id="Section_zs">
                        <p>
                            招商
                        </p>
                    </div>
                </div>
            </div>
            <%-- 选项卡 --%>

        </div>
        <div class="col-md-4 column">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        企业展示
                    </h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
        </div>
    </div>
</div>
<%-- 3columns --%>

<br>

<%-- 行业市场 --%>
<div class="container" style="width: 90%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="panel panel-default">
                <div class="panel-heading" style="background-color: #d7d7d7;">
                    <h3 class="panel-title">
                        <!-- 供应  |  求购  |  招商  |  商城  |  团购  |  行情  |  公司  -->
                        <table width="100%;" border="0">
                            <tr>
                                <td style="width: 79%; font-weight: bold;">行业市场</td>
                                <td style="font-size: 9px;">
                                    供应
                                    &nbsp;
                                    求购
                                    &nbsp;
                                    招商
                                    &nbsp;
                                    商城
                                    &nbsp;
                                    团购
                                    &nbsp;
                                    行情
                                    &nbsp;
                                    公司
                                </td>
                            </tr>
                        </table>
                    </h3>
                </div>
                <div class="panel-body">
                    <div class="container">
                        <div class="row clearfix">
                            <%-- 选项卡 --%>
                            <div class="col-md-6 column">
                                <div class="tab" role="tabpanel">
                                    <!-- Nav tabs -->
                                    <ul class="nav nav-tabs" role="tablist" style="margin-top:0px;" id="docTabs">
                                        <li role="presentation" class="active">
                                            <a href="#tj"
                                               aria-controls="home" role="tab" data-toggle="tab">推荐产品</a></li>
                                        <li role="presentation">
                                            <a href="#gy"
                                               aria-controls="profile" role="tab" data-toggle="tab">热卖</a></li>
                                    </ul>
                                    <!-- Tab panes -->
                                    <div class="tab-content">
                                        <div role="tabpanel" class="tab-pane fade in active" id="tj">
                                            <p>
                                                推荐
                                            </p>
                                        </div>
                                        <div role="tabpanel" class="tab-pane fade" id="gy">
                                            <p>
                                                热卖
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%-- 选项卡 --%>
                            <div class="col-md-6 column">
                                <div class="panel panel-info">
                                    <div class="panel-heading" style="background-color: #f1e05a">
                                        <h3 class="panel-title">
                                            行情
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        Panel content
                                    </div>
                                    <div class="panel-footer">
                                        Panel footer
                                    </div>
                                </div>
                                <div class="panel panel-warning">
                                    <div class="panel-heading" style="background-color: #f04356">
                                        <h3 class="panel-title">
                                            报价
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        Panel content
                                    </div>
                                    <div class="panel-footer">
                                        Panel footer
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading" style="background-color: #ff6501">
                                        <h3 class="panel-title">
                                            团购
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        Panel content
                                    </div>
                                    <div class="panel-footer">
                                        Panel footer
                                    </div>
                                </div>
                            </div>
                            <%-- end <div class="col-md-6 column"> --%>
                        </div>
                        <%-- end <div class="row clearfix"> --%>
                    </div>
                    <%-- end <div class="container"> --%>
                </div>
                <%-- end <div class="panel-body"> --%>
            </div>
            <%-- end <div class="panel panel-default"> --%>
        </div>
        <%-- end <div class="col-md-12 column"> --%>
    </div>
    <%-- end <div class="row clearfix"> --%>
</div>
<%-- 行业分类 --%>

<br><br>

<%-- 资讯中心 --%>
<div class="container" style="width: 90%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="panel panel-default">
                <div class="panel-heading" style="background-color: #d7d7d7;">
                    <h3 class="panel-title">
                        <table width="100%" border="0">
                            <tr>
                                <td style="width: 70%; font-weight: bold; color: black;">资讯中心</td>
                                <td>&nbsp;</td>
                            </tr>
                        </table>
                    </h3>
                </div>
                <div class="panel-body">
                    <div class="container">
                        <div class="row clearfix">
                            <%-- 第一列 --%>
                            <div class="col-md-4 column">
                                <div class="panel panel-info">
                                    <div class="panel-heading" style="background-color: #e4b9b9;">
                                        <h3 class="panel-title">
                                            资讯排行
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        Panel content
                                    </div>
                                </div>
                            </div>
                            <%-- 第一列 --%>

                            <%-- 第二列:所有资讯 --%>
                            <div class="col-md-4 column">
                            </div>
                            <%-- 第二列:所有资讯 --%>

                            <%-- 第三列:图库 --%>
                            <div class="col-md-4 column">
                                <div class="panel panel-success">
                                    <div class="panel-heading" style="background-color: #afd9ee;">
                                        <h3 class="panel-title">
                                            图库
                                        </h3>
                                    </div>
                                    <div class="panel-body">
                                        Panel content
                                    </div>
                                </div>
                            </div>
                            <%-- 第三列:图库 --%>
                        </div>
                    </div>
                </div>
                <%-- end <div class="panel-body"> --%>
            </div>
            <%-- end <div class="panel panel-default"> --%>
        </div>
        <%-- end <div class="col-md-12 column"> --%>
    </div>
    <%-- end <div class="row clearfix"> --%>
</div>
<%-- 资讯中心 --%>

<%-- 企业服务 --%>
<div class="container" style="width: 90%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="panel panel-default">
                <div class="panel-heading" style="background-color: #d7d7d7;">
                    <h3 class="panel-title">
                        <table width="100%" border="0">
                            <tr>
                                <td style="width: 70%; font-weight: bold; color: black;">企业服务</td>
                                <td>&nbsp;</td>
                            </tr>
                        </table>
                    </h3>
                </div>
                <div class="panel-body">
                </div>
                <%-- end <div class="panel-body"> --%>
            </div>
            <%-- end <div class="panel panel-default"> --%>
        </div>
        <%-- end <div class="col-md-12 column"> --%>
    </div>
    <%-- end <div class="row clearfix"> --%>
</div>
<%-- 企业服务 --%>

<%-- 页面正文 --%>

</body>

</html>




























