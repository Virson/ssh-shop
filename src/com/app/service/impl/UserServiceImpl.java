package com.app.service.impl;

import com.app.SpringAnnotationDef;
import com.app.dao.BaseDao;
import com.app.model.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-3-3
 * Time: 下午9:38
 * To change this template use File | Settings | File Templates.
 */

@Service(SpringAnnotationDef.USER_SERVICE)
public class UserServiceImpl implements UserService{


    @Resource(name=SpringAnnotationDef.USER_DAO)
    private BaseDao dao;

    @Override
    public User getUser(String id) {
        return (User)dao.get(id);
    }
}
