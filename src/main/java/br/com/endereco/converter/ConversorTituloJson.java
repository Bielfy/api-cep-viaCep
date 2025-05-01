package br.com.endereco.converter;

import br.com.endereco.domain.Endereco;
import br.com.endereco.domain.EnderecoViaCep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorTituloJson {
    private Gson gson;

    public Gson criaGson(){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson;
    }

    public Endereco converter(String json, Gson gson, String numeroCasa){
        EnderecoViaCep enderecoViaCep = gson.fromJson(json, EnderecoViaCep.class);
        return new Endereco(enderecoViaCep,numeroCasa);
    }
}
