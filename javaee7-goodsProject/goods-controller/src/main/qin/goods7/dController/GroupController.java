package qin.goods7.dController;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;

/**
 * 团购控制层
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/group")
public class GroupController extends JavaEE7BaseController
{
    private static final long serialVersionUID = -8700569608496451024L;

    @RequestMapping(value = "/index")
    @Override
    public ModelAndView doMainView()
    {
        return new ModelAndView("/group/index");
    }
}