package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // APi connection -- https://app.freecurrencyapi.com/request-playground

        CurrencyConverter c = new CurrencyConverter("USD", "TRY");
        try {
            String currency = c.getCurrency("USD", "TRY");
            System.out.println("currency=" + currency);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}