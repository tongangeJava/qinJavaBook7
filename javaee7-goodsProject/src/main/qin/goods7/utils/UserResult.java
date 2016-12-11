package qin.goods7.utils;

import qin.javaee7.core.JavaEE7BaseSupport;

import java.util.List;

/**
 * 用户数据访问层返回结果
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
@SuppressWarnings("all")
public class UserResult<T> implements JavaEE7BaseSupport
{
    private static final long serialVersionUID = -3247861420583898341L;

    //region 返回页面的ajax信息
    /**
     * 返回页面的ajax信息
     */
    private String ajaxMessage;

    public String getAjaxMessage()
    {
        return ajaxMessage;
    }

    public void setAjaxMessage(String ajaxMessage)
    {
        this.ajaxMessage = ajaxMessage;
    }
    //endregion

    //region 查询结果
    /**
     * 查询结果
     */
    private List<T> searchList;

    public List<T> getSearchList()
    {
        return searchList;
    }

    public void setSearchList(List<T> searchList)
    {
        this.searchList = searchList;
    }
    //endregion

    //region 保留变量
    /**
     * 保留变量
     */
    private Object myObject;

    public Object getMyObject()
    {
        return myObject;
    }

    public void setMyObject(Object myObject)
    {
        this.myObject = myObject;
    }
    //endregion

    //region 构造函数

    /**
     * 默认构造函数
     */
    public UserResult()
    {

    }

    /**
     * @param ajaxMessage ajax消息
     * @param searchList  搜索结果
     */
    public UserResult(String ajaxMessage, List<T> searchList)
    {
        this.ajaxMessage = ajaxMessage;
        this.searchList = searchList;
    }

    public UserResult(String ajaxMessage, Object myObject)
    {
        this.ajaxMessage = ajaxMessage;
        this.myObject = myObject;
    }

    public UserResult(String ajaxMessage, List<T> searchList, Object myObject)
    {
        this.ajaxMessage = ajaxMessage;
        this.searchList = searchList;
        this.myObject = myObject;
    }
    //endregion
}