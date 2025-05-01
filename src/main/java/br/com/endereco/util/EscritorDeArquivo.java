package br.com.endereco.util;

import br.com.endereco.domain.Endereco;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorDeArquivo {
    public void escrever(Gson gson, Endereco endereco) throws IOException {
        FileWriter escrever = new FileWriter("src/main/java/br/com/endereco/resources/Endereco.json");
        escrever.write(gson.toJson(endereco));
        escrever.close();
    }
}
