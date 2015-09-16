package com.nro.jetty;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class ResourceResolver {

    public static <P> P lookup(String naming, Class<P> type) throws NamingException, ClassCastException{
        InitialContext context = null;
        try {
            context = new InitialContext();
            return (P)context.lookup(naming);
        }finally {
            if(context!=null){
                context.close();
            }
        }
    }
}
