package org.example;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CurrencyConverter {
    public String apiKey;
    public String baseCurrency;
    public String currencies;
    public CurrencyConverter(String baseCurrency, String currencies) {
        this.baseCurrency = baseCurrency;
        this.currencies = currencies;
    }

    public String getCurrency(String baseCurrency, String currencies) throws IOException {
        String apiUrl = "https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_ZN6u3toMRNcZtl1WdUqiQkWSYBzZckhqWfBLNKcP&currencies=" + currencies + "&base_currency=" + baseCurrency + "";

        URL url = new URL(apiUrl);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }
}
