package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by viv on 30.07.2016.
 */

import java.io.Serializable;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.SessionScoped;


@ManagedBean(name = "user")
@SessionScoped

public class User implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newValue) {
        password = newValue;
    }
}
