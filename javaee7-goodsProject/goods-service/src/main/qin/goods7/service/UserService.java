package qin.goods7.service;

import qin.goods7.domain.User;
import qin.javaee7.core.JavaEE7BaseSupport;

/**
 * 用户服务层
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
public interface UserService extends JavaEE7BaseSupport
{
    //region 登录用户

    /**
     * 登录用户
     *
     * @param user
     * @return
     */
    Object doLogin(User user);
    //endregion
}