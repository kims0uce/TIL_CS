package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;

interface PaymentStrategy {
    public void pay(int amount);
}

class KakaoCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String ExpireDate;

    public KakaoCardStrategy(String name, String cardNumber, String cvv, String ExpireDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.ExpireDate = ExpireDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KakaoCard.");
    }
}

class NaverPayStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    public NaverPayStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using NaverPay.");
    }
}

class Item {
    private String name;
    private int price;
    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart {
    ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calcTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calcTotal();
        paymentMethod.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item Dior = new Item("bobby", 470);
        Item Prada = new Item("moon padding", 345);

        cart.addItem(Dior);
        cart.addItem(Prada);

        // pay by NaverPay
        cart.pay(new NaverPayStrategy("ksy_59@naver.com", "qwerty"));

        // pay by KakaoCard
        cart.pay(new KakaoCardStrategy("kimsouce", "123456", "789", "07/04"));
    }
}

// 815 paid using NaverPay.
//815 paid using KakaoCard.