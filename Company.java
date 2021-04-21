package com.company;

public abstract class Company {

    String name;
    int numOfWorkers;
    int marketCap;

    public Company(String name, int numOfworkers, int marketCap) {
        this.name=name;
        this.numOfWorkers=numOfworkers;
        this.marketCap=marketCap;
    }

    void addworker(){
        numOfWorkers++;
    }
}

