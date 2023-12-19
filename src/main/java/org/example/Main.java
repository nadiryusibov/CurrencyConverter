package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Currency Converter API
        // APi connection -- https://app.freecurrencyapi.com/request-playground

        CurrencyConverter c = new CurrencyConverter(null, null);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Currency Converter-------------");
        System.out.println("USD,EUR,AUD,CAD,RUB,JPY,TRY,PLN");
        System.out.println("-----------Currency Converter-------------");
        try {
            while (true){
                System.out.println("Enter Base Currency");
                String baseCurrency = scanner.next();
                System.out.println("Enter currencies");
                String currencies = scanner.next();
                String currency = c.getCurrency(baseCurrency,currencies);
                System.out.println("Currency converted: " + currency);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}