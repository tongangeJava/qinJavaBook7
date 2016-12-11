package qin.goods7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.goods7.domain.User;
import qin.goods7.service.UserService;
import qin.goods7.utils.UserResult;
import qin.goods7.utils.UserUtils;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller(value = "userController7")
@Scope("prototype")
@RequestMapping(value = "/member")
public class UserController extends JavaEE7BaseController
{
    private static final long serialVersionUID = -2211941714173776264L;

    //region 注入服务层
    private UserService userService;

    public UserService getUserService()
    {
        return userService;
    }

    @Resource
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
    //endregion

    //region 返回登录页面

    /**
     * 返回登录页面
     */
    @RequestMapping(value = "/login")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/member/login");
    }
    //endregion

    //region 实现登录功能

    /**
     * 实现登录功能
     *
     * @param user 接收用户实体类
     */
    @RequestMapping(value = "/loginUser")
    public void loginUser(User user, HttpServletResponse response)
    {
        try
        {
            //region 验证
            user.setLoginName(user.getLoginName().trim());
            user.setPassword(user.getPassword().trim());

            String msg = UserUtils.checkUser(user);
            UserResult userResult = null;

            if (msg == str_success)
            {
                //实现登录
                userResult = (UserResult) userService.doLogin(user);
                //如果消息为success则是登录成功
                if (userResult.getAjaxMessage() == str_success)
                {
                    returnJson(str_success, response);
                }
                else
                {
                    returnJson(str_failed, response);
                }
            }
            //endregion

            actionFlag = true;
        }
        catch (Exception ex)
        {
            actionFlag = false;
        }
        finally
        {
            doCheck(actionFlag);
        }
    }
    //endregion
}






















