package com.smart.web;

/**
 * Created by apple on 2015/12/31.
 */
public class LoginCommand {
    private String userName;
    private String password;

    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){

        return userName;
    }
    public String getPassword(){
        return password;
    }
}
