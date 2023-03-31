import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Realizar uma conexão HTTP e buscar o conteúdo


        API api = API.IMDB_TOP_SERIES;

        String url = api.getUrl();
        ExtratorDeConteudo extrator = api.getExtrator();


        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // Cria diretório de saída caso não exista
        var diretorio = new File("saida/");
        diretorio.mkdir();


        // Exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            String texto = "XD";
            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.titulo() + ".png";

            geradora.cria(inputStream, nomeArquivo, texto);

            System.out.println(conteudo.titulo());
            System.out.println();


        }
    }
}
