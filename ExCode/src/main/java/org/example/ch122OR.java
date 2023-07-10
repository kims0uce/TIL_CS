package org.example;

class Animal {
    public void bark() {
        System.out.println("miao miao");
    }
}

class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("wal wal");
    }
}
public class ch122OR {
    public static void main(String[] args) {
        Dog Chihuahua = new Dog();
        Chihuahua.bark();   // wal wal
    }
}
