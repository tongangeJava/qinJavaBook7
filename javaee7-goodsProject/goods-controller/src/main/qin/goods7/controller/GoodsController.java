package qin.goods7.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee7.core.hibernate.controller.JavaEE7BaseController;

/**
 * 商品控制层
 *
 * @author qinzhengying
 * @since 1.7 2016/12/9
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/goods")
public class GoodsController extends JavaEE7BaseController
{
    private static final long serialVersionUID = 2131349480060528894L;

    //region bootstrap index
    @RequestMapping(value = "/index")
    @Override
    public ModelAndView doMainView()
    {
        return new ModelAndView("/goods/index");
    }
    //endregion

    //region easyui-index

    /**
     * easyui-index(easyui制作的页面)
     */
    @RequestMapping(value = "/easyuiIndex")
    public ModelAndView easyuiIndex()
    {
        return new ModelAndView("/goods/easyuiIndex");
    }
    //endregion

    //region bootstrap-index
    @RequestMapping(value = "/bootstrapIndex")
    public ModelAndView bootstrapIndex()
    {
        return new ModelAndView("/goods/bootstrapIndex");
    }
    //endregion

    //region list

    /**
     * 列表页面
     */
    @RequestMapping(value = "/list")
    public ModelAndView list()
    {
        return new ModelAndView("/goods/list");
    }
    //endregion

    //region add

    /**
     * 新增页面
     */
    @RequestMapping(value = "/add")
    public ModelAndView add()
    {
        return new ModelAndView("/goods/add");
    }
    //endregion

    //region type

    /**
     * 类型页面
     */
    @RequestMapping(value = "/type")
    public ModelAndView type()
    {
        return new ModelAndView("/goods/type");
    }
    //endregion

    //region ini

    /**
     * 初始化数据页面
     */
    @RequestMapping(value = "/ini")
    public ModelAndView ini()
    {
        return new ModelAndView("/goods/ini");
    }
    //endregion


}