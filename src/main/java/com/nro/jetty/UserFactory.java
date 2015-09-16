package com.nro.jetty;

import com.nro.jetty.vo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class UserFactory {

    List<User> users ;

    public UserFactory(){
        users  = Arrays.asList(new User(1, "Rousseau", "Nicolas","SSII"), new User(2, "Rousseau", "Benedicte", "College"));
    }
    public List<User> list(){
        return  users;
    }
}
