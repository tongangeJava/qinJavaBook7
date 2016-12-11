package qin.goods7.utils;

import qin.goods7.domain.User;
import qin.javaee7.core.JavaEE7BaseSupport;

/**
 * 用户工具类
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
@SuppressWarnings("all")
public final class UserUtils implements JavaEE7BaseSupport
{
    private static final long serialVersionUID = 7884970791424684053L;

    public static final String log4jPath = "D:\\idea2016WK\\github\\qinJavaBook7\\src\\resources\\log4j.properties";

    //region 私有化构造函数
    private UserUtils()
    {
    }
    //endregion

    //region 检查用户

    /**
     * 检查用户
     *
     * @param user 用户实体类
     * @return 检查的结果
     */
    public static String checkUser(User user)
    {
        String result = "";

        String loginName = user.getLoginName();
        String password = user.getPassword();

        //1.用户名和密码最长不能超过30个字符
        if (loginName.length() > 30 || password.length() > 30)
        {
            return "用户名和密码最长不能超过30个字符!<br>";
        }
        else
        {
            result = str_success;
        }
        //2.用户名不能全部为数字!
        if (loginName.matches("[0-9]*"))
        {
            return "用户名不能全部为数字!<br>";
        }
        else
        {
            result = str_success;
        }
        //3.用户名中不能含有非法字符!
        for (int i = 0; i < notAllowNames.length; i++)
        {
            if (loginName.equals(notAllowNames[i]))
            {
                //输出一次就行了
                return "用户名中不能含有非法字符!<br>";
            }
            else
            {
                result = str_success;
            }
        }

        return result;
    }
    //endregion
}




















