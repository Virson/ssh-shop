package com.test;

import com.app.dao.UserDao;
import com.app.model.User;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-3-4
 * Time: 下午12:08
 * To change this template use File | Settings | File Templates.
 */
public class TestUserDao extends TestCase {

    //读spring配置文件
    public static BeanFactory factory = new ClassPathXmlApplicationContext("com/resources/spring-config.xml");

    public void testGet() throws Exception {
       /* UserDao dao = (UserDao)factory.getBean("userDao");
        User user = dao.get("9");
        System.out.println(user.getUsername()+"==="+user.getPassword());*/
    }
    
    public void testGetAll() throws Exception{
       /* UserDao dao = (UserDao)factory.getBean("userDao");
        List<User> list = dao.listAll();
        for(User user:list){
            System.out.println(user.getUsername()+"=555555555=="+user.getPassword());
        }*/
        testGetAll(2,4);
    }

    public void testGetAll(int pageNum,int pageSize) throws Exception{
        UserDao dao = (UserDao)factory.getBean("userDao");
        pageNum = 2;
        pageSize = 3;
        List<User> list = dao.listAll( pageNum,pageSize  );
        for(User user:list){
            System.out.println(user.getUsername()+"=222222222222=="+user.getPassword());
        }
    }
}
