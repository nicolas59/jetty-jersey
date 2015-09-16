package com.nro.jetty;

import com.nro.jetty.rest.JsonResources;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

/**
 * Created by GFIUSER on 16/09/2015.
 */
@Provider
public class JAXBContextResolver implements ContextResolver<JAXBContext> {

    private JAXBContext context;
    private Class[] types = {JsonResources.class};

    public JAXBContextResolver() throws Exception {
         this.context =
                 new JSONJAXBContext(
                JSONConfiguration.natural().build(), types);
    }


    public JAXBContext getContext(Class<?> objectType) {
         for (Class type : types) {
             if (type == objectType) {
                 return context;

            }
        }
         return null;
    }
}
