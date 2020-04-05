package com.hfad.bitsandpizza;

public class Pizza {
    public String name;
    public static final Pizza[] pizza = {new Pizza("Diavolo"),
                                         new Pizza("Funghi")};
    Pizza(String n){
        this.name = n;
    }
    public String getName(){ return this.name; }
}
