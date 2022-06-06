package com.example.tajwid;

public class Letter {
    protected String name;
    protected String Group;
    protected  int imgId;
    public Letter(String name, String group, int imgId) {
        this.name = name;
        Group = group;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
