package com.nro.jetty.vo;

/**
 * Created by GFIUSER on 16/09/2015.
 */
public class User {

    private int id;

    private String name;

    private String firstname;

    private String entrepriseName;


    public User() {
    }

    public String getName() {
        return name;
    }

    public User(int id, String name, String firstname, String entrepriseName) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.entrepriseName = entrepriseName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEntrepriseName() {
        return entrepriseName;
    }

    public void setEntrepriseName(String entrepriseName) {
        this.entrepriseName = entrepriseName;
    }

    public int getId() {
        return id;
    }
}
