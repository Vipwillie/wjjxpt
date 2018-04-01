package com.willie.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liang on 2016/6/12.
 */
public class User implements Serializable {

    private Integer sid;
    private String name;
    private String password;
    private String major;
    private Date birth;
    private Double score;

    public User() {
    }

    public User(Integer sid, String name, String password, String major, Date birth, Double score) {
        this.sid = sid;
        this.name = name;
        this.password = password;
        this.major = major;
        this.birth = birth;
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                ", birth=" + birth +
                ", score=" + score +
                '}';
    }
}
