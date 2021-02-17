package com.demo21.demorest4.entity;

public class Ent {
    private String text;
    private int id;
    public Ent(String ent, int id){
        this.text = ent;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
