import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoNasa implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos(String json) {
        // Extrair só os dados que interessam (título, imagem, classificação)

        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        return listaDeAtributos.stream()
                .map((atributos) ->
                        new Conteudo(atributos.get("title"), atributos.get("url")))
                .toList();
    }
}
