<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    /* 登录js文件 */
    function doLogin()
    {
        var loginName = $('#userLoginName').val();
        var password = $('#userPassword').val();

        //用户名和密码不能为空!
        if (loginName.length == 0 || password.length == 0)
        {
            $('#myModal').modal
            (
                    {
                        show: true
                    }
            );
            return;
        }
        else
        {
            var url = "/member/loginUser.com?loginName=" + loginName +
                    "        &&password=" + password;

            $.ajax
            (
                    {
                        url: url,
                        method: 'POST',
                        success: function (msg)
                        {
                            if (msg == "success")
                            {
                                alert("登录成功");
                            }
                            else
                            {
                                alert("登录失败");
                            }
                        }
                    }
            );
        }
    }
</script>