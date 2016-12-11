/*
CollectionEmptyException:

	集合为空异常
	
		数据访问层里的集合为空异常是在查询记录时发生了
		例如登录功能:
		如果在表中并没有查找到记录就说明从页面上接收的用户名密码是错误的是无法登录的
		所以就抛出集合为空异常
		
		假设已在页面中接收了用户名和密码:
	
*/

class DAOImpl
{

    void doLogin(User user)
    {
        //没有查询成功
        if (list.size() == 0)
        {
            throw new CollectionEmptyException();
        }
    }


}



