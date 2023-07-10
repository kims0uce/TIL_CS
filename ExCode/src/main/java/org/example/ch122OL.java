package org.example;

class Person {
    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public void eat(String food, String drink) {
        System.out.println("I eat " + food + " and " + drink);
    }
}

public class ch122OL {
    public static void main(String[] args) {
        Person me = new Person();
        me.eat("pizza");    // I eat pizza
        me.eat("susi", "beer"); // I eat susi and beer
    }
}
