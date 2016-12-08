package qin.goods7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "userController7")
@Scope("prototype")
@RequestMapping(value = "/member")
public class UserController
{
    @RequestMapping(value = "/login")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/member/login");
    }
}