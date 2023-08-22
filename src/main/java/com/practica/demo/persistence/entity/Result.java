package com.practica.demo.persistence.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private Integer count;
    private String next;
    private String previous ;

    private Pokemon[] results;

    public Integer getcount() {
        return count;
    }
    public void setcount(Integer count) {
        this.count = count;
    }
    public String getnext() {
        return next;
    }
    public void setnext(String next) {
        this.next = next;
    }
    public String getprevious() {
        return previous;
    }
    public void setprevious(String previous) {
        this.previous = previous;
    }
    public Pokemon[] getresults() {
        return results;
    }
    public void setresults(Pokemon[] results) {
        this.results = results;
    }
}
