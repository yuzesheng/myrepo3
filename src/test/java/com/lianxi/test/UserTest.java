package com.lianxi.test;

import com.lianxi.dao.Eat;
import com.lianxi.impl.User;
import org.junit.Test;

/**
 * @author yuzs
 * @date 2022-06-2022/6/17-17:16
 */
public class UserTest {
    @Test
    public void test(){
       User user = new User();
       user.setId("s110");
       System.out.println(user.getId());
    }
}
