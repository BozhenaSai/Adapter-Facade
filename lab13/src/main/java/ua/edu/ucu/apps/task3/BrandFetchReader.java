package ua.edu.ucu.apps.task3;

import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;


public class BrandFetchReader {
    public static final String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    private static final String API_KEY = "";
    @SneakyThrows
    public Company fetch(String companyName) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(BRAND_FETCH_URL + companyName))
                .header("Authorization", "Bearer " + API_KEY)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), Company.class);
    }
}
