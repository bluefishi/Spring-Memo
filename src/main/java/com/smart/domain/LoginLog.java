package com.smart.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by apple on 2015/12/31.
 */
public class LoginLog implements Serializable {
    private int LoginLogId;
    private int userId;
    private String ip;
    private Date loginDate;


    public int getUserId(){
        return userId;
    }
    public String getIp(){
        return ip;
    }
    public Date getLoginDate(){
        return loginDate;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
    public void setLoginDate(Date loginDate){
        this.loginDate = loginDate;
    }

}
