package com.practica.demo.persistence.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private int id;
    private String name;
    private  String url;

    // Getters y setters
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String geturl() {
        return url;
    }
    public void setid(String url) {
        this.url = url;
    }
}
