package com.example.Layer.member;

public class Member {

    private int mID;
    private String name;

    Member(int mID, String name) {
        this.mID = mID;
        this.name = name;
    }

    int getmID() {
        return mID;
    }

    String getName() {
        return name;
    }
}