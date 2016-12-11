package qin.goods7.dao;

import qin.goods7.domain.User;
import qin.goods7.utils.UserResult;
import qin.javaee7.core.hibernate.dao.JavaEE7DAOSupport;

/**
 * 用户数据访问层接口
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
@SuppressWarnings("all")
public interface UserDAO extends JavaEE7DAOSupport<User, Integer>
{
    //region 登录实现

    /**
     * 实现用户登录
     *
     * @param user 用户实体类
     * @return 返回登录结果
     */
    UserResult<User> doLogin(User user);
    //endregion
}
