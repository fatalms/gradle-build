package ru.ac.uniyar.moneytest;
import com.practicalunittesting.chp03.money.Money;

public class Main {
    public static void main(String[] args) {
        Money m1 = new Money(30, "USD");
        Money m2 = new Money(50, "USD");
        Money result = m1.add(m2);
        System.out.println("$30 + $50 = $" + result.getAmount());
    }
}
