package org.owtz.models;

public class Pet {

    String name;
    boolean banho;



    public Pet(String name){
        this.setBanho(false);
        this.setName(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }
}
