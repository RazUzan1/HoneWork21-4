package com.company;

public class industrial implements invastments {

    String type;
    int numOfplants;

    @Override
    public int add(int funds) {
        this.numOfplants+=funds;
        return numOfplants;
    }
}
