package com.app.dao.impl;

import com.app.SpringAnnotationDef;
import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-3-3
 * Time: 下午11:09
 * To change this template use File | Settings | File Templates.
 */
@Scope(SpringAnnotationDef.SCOPE_PROTOTYPE)
@Repository(SpringAnnotationDef.USER_DAO)
public class UserDaoImpl extends BaseDaoImpl<User,String> implements UserDao{
    
    public UserDaoImpl(){
        super(User.class);
    }
}
