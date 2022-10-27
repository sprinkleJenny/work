package com.example.Layer.member;

public class Product {

    private int pid;
    private String name;

    Product(int pid, String name){
        this.pid = pid;
        this.name = name;
    }

    int getPid(){
        return pid;
    }

    String getName(){
        return name;
    }

}
