package com.nro.jetty.rest;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class JndiResources {

    @Path("jndiResources")
    @GET
    @Produces("text/plain")
    public String displayJndi() throws NamingException{
        InitialContext context = null;
        try {
            context = new InitialContext();
            return context.lookup("url/google").toString();
        }finally {
            if(context!=null){
                context.close();
            }
        }
    }
}
