<%--

    项目控件说明
    字段                                          控件类型                                        说明
    ----------------------------------------------------------------------------------------------------------

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="/jsLib/include_easyui.jsp"></jsp:include>
    <title>商品管理</title>
</head>

<body class="easyui-layout" id="_body">
<div data-options="region:'west',title:'功能模块',split:true" style="width:188px;">
    <jsp:include page="header.jsp"></jsp:include>
</div>
<div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
    <div class="easyui-panel" title="列表"
         style="width:100%;height:100%;padding:10px;background:#fafafa;"
         data-options="iconCls:'icon-save',closable:true, collapsible:true,minimizable:true,maximizable:true">

    </div>
</div>

</body>












































