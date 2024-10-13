import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirAPI {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD"; // URL de la API
    private HttpClient httpClient;
    private Gson gson;

    public ConsumirAPI() {
        httpClient = HttpClient.newHttpClient();
        gson = new Gson();  // Inicializamos Gson
    }

    public CurrencyRate getExchangeRates(String baseCurrency) throws Exception {
        // Crear el request HTTP
        String url = API_URL.replace("USD", baseCurrency); // Cambia USD por la moneda base
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        // Enviar el request y recibir la respuesta
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Convertir el JSON a un objeto Java (CurrencyRate)
        CurrencyRate currencyRate = gson.fromJson(response.body(), CurrencyRate.class);

        return currencyRate;
    }

}

