<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    $(function ()
        {
            //region 商品列表
            $('#list').click(function ()
                {
                    window.location.href = "/goods/list.com";
                }
            );
            //endregion

            //region 新增商品
            $('#add').click(function ()
                {
                    window.location.href = "/goods/add.com";
                }
            );
            //endregion

            //region 商品分类
            $('#type').click(function ()
                {
                    window.location.href = "/goods/type.com";
                }
            );
            //endregion

            //region 还原数据
            $('#ini').click(function ()
                {
                    window.location.href = "/goods/ini.com";
                }
            );
            //endregion

        }
    );
</script>