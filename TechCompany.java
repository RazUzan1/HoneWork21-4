package com.company;

import java.util.Date;
import java.util.HashMap;

public class TechCompany extends Company implements Ipo,invastments {

    private final HashMap<String, String> products;
    Date nextproduct;
    String manyCountry;
    HashMap<String,String>Products;


    public TechCompany(String name,Date nextproduct,String manyCountry,HashMap <String,String>products,int numOfworkers ,int marketCap){

        super(name, numOfworkers,marketCap);
        this.nextproduct=nextproduct;
        this.manyCountry=manyCountry;
        this.products=products;
    }

    void addProduct(String k,String v){
      Products.put(k,v);
    }


    @Override
    public void marketCap() {
        System.out.println(this.marketCap);
    }

    @Override
    public int add(int funds) {
        this.marketCap += funds;
        return this.marketCap;
    }
}
