package com.example.demo12;

public class Friend {
    public String name;
    private int number;
    private double age;

    Friend(String n,double age, int num){
        name = n;
        number = num;
        this.age = age;

    }

    //getter and setter
    public void setNumber(int amt){
        number += amt;
    }
    public int getNumber(){return number;}

    public void purchase(){
        number--;

    }

    public double getAge() {return age;}


    public String toString(){
        return name;
    }
}
