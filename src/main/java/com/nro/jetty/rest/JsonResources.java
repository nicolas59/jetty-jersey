package com.nro.jetty.rest;

import com.nro.jetty.ResourceResolver;
import com.nro.jetty.vo.ResourceVO;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class JsonResources {

    @Path("jsonResources")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResourceVO getAvailableResources() throws NamingException{
        return  new ResourceVO("url/google", ResourceResolver.lookup("url/google", java.net.URL.class).toString());
    }
}
