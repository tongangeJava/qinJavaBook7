package qin.goods7.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import qin.goods7.controller.IniData;

@ContextConfiguration(value = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@SuppressWarnings("all")
public class SpringTest
{
    public
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    /**
     * 开启事务
     */
    public Transaction transaction = session.beginTransaction();

    @Test
    public void make()
    {
        IniData i = (IniData) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("iniData");
        i.doMainView();
    }
}