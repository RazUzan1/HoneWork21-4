package com.company;

public class oilCompany extends Company {

    String country;
    int storage;

    public oilCompany(String name, int numOfworkers, int marketCap) {

        super(name, numOfworkers, marketCap);
    }

    void bankruptcy(){
        System.out.println("We lost the company");
    }
}
