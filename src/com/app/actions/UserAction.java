package com.app.actions;

import com.app.SpringAnnotationDef;
import com.app.model.User;
import com.app.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-3-3
 * Time: 下午9:46
 * To change this template use File | Settings | File Templates.
 */
@Scope(SpringAnnotationDef.SCOPE_PROTOTYPE)
@Component
@Namespace("/")
public class UserAction extends ActionSupport{

    @Resource(name=SpringAnnotationDef.USER_SERVICE)
    private UserService service;

    @Action(value="getUser",results = {@Result(name=SUCCESS,location = "/WEB-INF/content/index.jsp")})
    public String getUser(){
        User user = service.getUser("9");
        System.out.println( user.getUsername() );
        return SUCCESS;
    }
}
