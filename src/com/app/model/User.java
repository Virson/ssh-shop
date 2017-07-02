package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-2-26
 * Time: 下午8:40
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
