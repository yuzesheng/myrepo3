package com.lianxi.impl;

import com.lianxi.dao.Eat;

/**
 * @author yuzs
 * @date 2022-06-2022/6/17-17:13
 */
public class User implements Eat {
    private String id;
    public  void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void eat() {
        System.out.println("ChiFan");
    }
}
