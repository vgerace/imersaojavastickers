import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DA01ConsumoEndPoint {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Realizar Realizar uma conexão HTTP e buscar os top 250 filmes
//        String url = "https://imdb-api.com/en/API/Top250Movies/k_vqv5snhq";
        // Realizar uma conexão HTTP e buscar os top 250 filmes mais populares
        // String url = "https://imdb-api.com/en/API/MostPopularMovies/k_vqv5snhq";
       //  Realizar uma conexão HTTP e buscar os top 250 séries
         String url = "https://imdb-api.com/en/API/Top250TVs/k_vqv5snhq";

        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

    }
}
