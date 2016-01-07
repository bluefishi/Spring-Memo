package com.smart.domain;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by apple on 2015/12/31.
 */
public class User implements Serializable{
    private int userId;
    private String userName;
    private String password;
    private String lastIp;
    private Date lastVisit;

    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public Date getLastVisit(){
        return lastVisit;
    }
    public void setLastVisit(Date lastVisit){
        this.lastVisit = lastVisit;
    }
    public String getLastIp(){
        return lastIp;
    }
    public void setLastIp(String ip){
        this.lastIp = ip;
    }
    public int getUserId(){
        return userId;
    }


}
