public enum API {
    IMDB_TOP_MOVIES("https://imdb-api.com/en/API/Top250Movies/k_vqv5snhq", new ExtratorDeConteudoImdb()),
    IMDB_TOP_SERIES("https://imdb-api.com/en/API/Top250TVs/k_vqv5snhq", new ExtratorDeConteudoImdb()),
    NASA("https://api.nasa.gov/planetary/apod?api_key=DPluIokwmgWhYh9iOr3o8n81iG8cUzCFf5DzoiU5&start_date=2022-06-12&end_date=2022-06-14", new ExtratorDeConteudoNasa());

    private String url;
    private ExtratorDeConteudo extrator;


    API(String url, ExtratorDeConteudo extrator) {
        this.url = url;
        this.extrator = extrator;
    }

    public String getUrl() {
        return url;
    }

    public ExtratorDeConteudo getExtrator() {
        return extrator;
    }
}