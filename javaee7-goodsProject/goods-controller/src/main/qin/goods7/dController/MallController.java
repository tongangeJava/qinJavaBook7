package qin.goods7.dController;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;

import javax.servlet.http.HttpServletRequest;

/**
 * 商城控制层
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/mall")
public class MallController extends JavaEE7BaseController
{
    private static final long serialVersionUID = -8700569608496451024L;

    //region doMainView
    @RequestMapping(value = "/index")
    @Override
    public ModelAndView doMainView()
    {
        return new ModelAndView("/mall/index");
    }
    //endregion

    @RequestMapping(value = "/details")
    public ModelAndView details(HttpServletRequest request, String id)
    {
        request.setAttribute("id", id.trim());

        return new ModelAndView("/mall/details");
    }
}