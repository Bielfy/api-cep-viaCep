package br.com.endereco.api;

public class EnderecoApiUrl {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public String montarUrl(String cep){
        return BASE_URL+ cep +"/json/";
    }
}
