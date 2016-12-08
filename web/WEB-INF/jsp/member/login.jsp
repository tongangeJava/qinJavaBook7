<%--suppress ALL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<meta charset="utf-8">

<head>
    <jsp:include page="/jsLib/include_bootstrap.jsp"></jsp:include>
    <jsp:include page="js/loginJs.jsp"></jsp:include>
</head>

<body>

<div class="container" id="_container" style="width: 100%;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>

            <%-- 幻灯片 --%>

            <div class="carousel slide" id="carousel-457458">
                <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#carousel-457458">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-457458">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-457458">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt="" src="http://localhost/images/1.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                            </h4>
                            <p>
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="http://localhost/images/2.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                            </h4>
                            <p>
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="http://localhost/images/3.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                            </h4>
                            <p>
                            </p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-457458" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-457458" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>

            <%-- 幻灯片 --%>

        </div>
    </div>

    <br>

    <div class="container" style="width: 100%;">
        <div class="row clearfix">
            <div class="col-md-6 column">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            项目介绍
                        </h3>
                    </div>
                    <div class="panel-body">
                        如果想要查看此项目演示请先
                        <font style="font-size: 60px; color: red;">登录!</font>
                    </div>
                </div>
            </div>
            <div class="col-md-6 column">
                <%-- 登录界面开始 --%>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <form role="form">
                            <div class="form-group">
                                <label for="_loginName">用户名:</label>
                                <input type="text" class="form-control" id="userLoginName"/>
                            </div>
                            <div class="form-group">
                                <label for="_loginPassword">密码:</label>
                                <input type="password" class="form-control" id="userPassword"/>
                            </div>
                            <center>
                                <button type="button" class="btn btn-success btn-lg" style="width: 90%;"
                                        id="btn_loginUser" onclick="doLogin()">登录
                                </button>
                            </center>
                        </form>
                    </div>
                </div>
                <%-- 登录界面结束 --%>
            </div>
        </div>
    </div>

    <br><br><br>

    <!-- -->
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">
                        <font style="color: red; font-size: 60px; font-weight: bold">
                            基本错误信息
                        </font>
                    </h4>
                </div>
                <div class="modal-body">
                    <font style="color: brown; font-size: 30px;">用户名和密码不能为空!</font>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
    <!-- /.modal -->
    <!-- -->

</div>

</body>

