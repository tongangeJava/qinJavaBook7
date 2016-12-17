package qin.goods7.dao.impl;

import org.springframework.stereotype.Repository;
import qin.goods7.dao.UserDAO;
import qin.goods7.domain.User;
import qin.goods7.utils.UserResult;
import qin.goods7.utils.UserUtils;
import qin.javaee7.core.hibernate.dao.impl.JavaEE7DAOSupportImpl;

/**
 * 用户数据访问层实现
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
@Repository(value = "goods_userDAO7")
@SuppressWarnings("all")
public class UserDAOImpl
          extends JavaEE7DAOSupportImpl<User, Integer>
          implements UserDAO
{
    private static final long serialVersionUID = -6049010728238623624L;

    //region 获取配置文件路径
    @Override
    public String getLog4jLocation()
    {
        return UserUtils.log4jPath;
    }
    //endregion

    //region 实现登录
    @Override
    public UserResult<User> doLogin(User user)
    {
        UserResult<User> result = new UserResult<>();

        //查询用户
        result.setSearchList
                  (
                            getSessionFactory()
                                      .openSession()
                                      .createQuery
                                                (
                                                          new StringBuilder()
                                                                    .append("from User where loginName='")
                                                                    .append(user.getLoginName())
                                                                    .append("' and password='")
                                                                    .append(user.getPassword())
                                                                    .append("'").toString()
                                                )
                                      .list()
                  );
        if (result.getSearchList().size() > 0)
        {
            //登录成功
            result.setAjaxMessage(str_success);
        }
        else
        {
            result.setAjaxMessage(str_failed);
        }

        return result;
    }
    //endregion
}