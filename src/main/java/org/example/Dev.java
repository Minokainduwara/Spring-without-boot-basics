package org.example;


public class Dev {
    private int age;
    Dev(){
        System.out.println("Dev created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Dev build");
    }
}
