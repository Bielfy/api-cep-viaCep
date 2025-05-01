package br.com.endereco.application;

import br.com.endereco.api.EnderecoApiUrl;
import br.com.endereco.api.ApiViaCep;
import br.com.endereco.converter.ConversorTituloJson;
import br.com.endereco.domain.Endereco;
import br.com.endereco.exception.ErroQuantidadeDeNumerosDoCepInvalido;
import br.com.endereco.util.EscritorDeArquivo;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String cep;
        String numeroCasa;
        EnderecoApiUrl apiKey = new EnderecoApiUrl();
        ApiViaCep apiViaCep = new ApiViaCep();
        ConversorTituloJson conversorTituloJson = new ConversorTituloJson();
        EscritorDeArquivo escritorDeArquivo = new EscritorDeArquivo();
        Gson gson = conversorTituloJson.criaGson();

            imprimirTituloCadastroEndereco();

            cep = solicitarCep(scanner);

            numeroCasa = solicitarNumero(scanner);

            String json = apiViaCep.buscaEndereco(apiKey.montarUrl(cep));

            System.out.println(json);

            Endereco endereco = conversorTituloJson.converter(json,gson,numeroCasa);

            escritorDeArquivo.escrever(gson,endereco);

            System.out.println("Endereço cadastrado com sucesso!...");
    }

    private static void imprimirTituloCadastroEndereco(){
        System.out.println("--------------------");
        System.out.println("CADASTRO DE ENDEREÇO");
        System.out.println("--------------------");
    }

    private static String solicitarCep(Scanner scanner){
        while (true) {
            System.out.println("Digite seu Cep:");
            String cep = scanner.nextLine();
            try {
               validarCep(cep);
               return cep;
            }catch (ErroQuantidadeDeNumerosDoCepInvalido e){
                System.out.println(e.getMensagem());
            }catch (NumberFormatException e) {
                System.out.println("Erro: CEP deve conter apenas números.");;
            }
        }
    }

    private static String solicitarNumero(Scanner scanner){
        while (true){
            System.out.println("digite o numero da sua casa:");
            String numeroCasa = scanner.nextLine();
            try {
                validarNumeroDaCasa(numeroCasa);
                return numeroCasa;
            }catch (NumberFormatException e){
                System.out.println("Erro: Numero da Casa deve conter apenas números.");
            }
        }
    }

    private static void validarCep(String cep){
        Integer.parseInt(cep);
        if(cep.length() < 8){
            throw new ErroQuantidadeDeNumerosDoCepInvalido("Erro: CEP inválido, deve conter exatamente 8 números.");
        }
    }

    private static void validarNumeroDaCasa(String numeroCasa){
        Integer.parseInt(numeroCasa);
    }

}
