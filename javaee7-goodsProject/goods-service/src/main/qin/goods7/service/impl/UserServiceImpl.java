package qin.goods7.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.goods7.dao.UserDAO;
import qin.goods7.domain.User;
import qin.goods7.service.UserService;

import javax.annotation.Resource;

/**
 * 用户服务层实现
 *
 * @author qinzhengying
 * @since 1.7 2016/12/8
 */
@Service(value = "goods_userServiceImpl7")
@Transactional
@SuppressWarnings("all")
public class UserServiceImpl implements UserService
{
    private static final long serialVersionUID = 806012788951557880L;

    //region 注入用户数据访问层
    private UserDAO userDAO;

    public UserDAO getUserDAO()
    {
        return userDAO;
    }

    @Resource
    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }
    //endregion

    //region 登录

    /**
     * 登录用户
     *
     * @param user
     * @return
     */
    @Override
    public Object doLogin(User user)
    {
        return userDAO.doLogin(user);
    }
    //endregion
}