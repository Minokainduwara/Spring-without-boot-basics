package org.example;


public class Dev {
    private Laptop lp;
    private int age;
    Dev(){
        System.out.println("Dev created");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLp() {
        return lp;
    }

    public void setLp(Laptop lp) {
        this.lp = lp;
    }

    public void build(){
        System.out.println("Dev build");
        lp.compile();
    }
}
