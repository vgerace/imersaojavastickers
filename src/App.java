import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Realizar uma conexão HTTP e buscar os top 250 filmes
        // Buscar na variável de ambiente a API Key
        String imdbKey = System.getenv("IMDB_API_KEY");
        String url = "https://imdb-api.com/en/API/Top250Movies/" + imdbKey;
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Extrair só os dados que interessam (título, imagem, classificação)

        var parser = new JsonParser();

        List<Map<String, String>> listaDeFilmes = parser.parse(body);
//  O size retorna o tamanho da lista
//  System.out.println(listaDeFilmes.size());
//  O get(0) retorna o primeiro elemento do índice
//  System.out.println(listaDeFilmes.get(0));


        // Exibir a manipulação dos dados

//        for (Map<String, String> filme : listaDeFilmes) {
        for (int i = 0; i < 10; i++) {
            Map<String, String> filme = listaDeFilmes.get(i);
            System.out.println("\uD83C\uDFAC\u001b[1m\u001b[37m\u001b[43mTitle:\u001b[m " + filme.get("title"));
            System.out.println("\uD83C\uDF9E\u001b[1m\u001b[44mImage URL:\u001b[m\u001b[m" + " " + filme.get("image"));
            double classificacao = Double.parseDouble(filme.get("imDbRating"));
            int numeroEstrelinhas = (int) classificacao;
            for (int n = 1; n <= numeroEstrelinhas; n++) {
                if (numeroEstrelinhas > 9)
                    System.out.print("✴️");
                else if (numeroEstrelinhas > 7) {
                    System.out.print("\uD83C\uDF1F");
                } else {
                    System.out.print("\uD83D\uDC4E\uD83C\uDFFF");
                }
            }
            System.out.println("\n");
        }
    }
}
