package com.nro.jetty.rest;

import com.nro.jetty.UserFactory;
import com.nro.jetty.vo.User;
import com.sun.jersey.api.NotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by GFIUSER on 16/09/2015.
 */
@Path("user")
public class UserService {

    private UserFactory userFactory = new UserFactory();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> list(){
        return userFactory.list();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User get(@PathParam("id") String id){
        //return   userFactory.list().stream().filter(user -> user.getId() == Integer.valueOf(id)).findFirst().get();

        for(User u:userFactory.list()){
            if(u.getId() == Integer.valueOf(id)){
                return u;
            }
        }
        throw new RuntimeException();
    }

}
