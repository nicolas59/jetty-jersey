package com.nro.jetty.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class ResourceVO {

    private String name;

    private String value;

    public ResourceVO(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public ResourceVO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
