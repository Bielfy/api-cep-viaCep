package br.com.endereco.domain;

public class Endereco {
    private String cep;
    private String lograouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String numeroCasa;

    public Endereco(EnderecoViaCep enderecoViaCep, String numeroCasa) {
        this.cep = enderecoViaCep.cep();
        this.lograouro = enderecoViaCep.logradouro();
        this.bairro = enderecoViaCep.bairro();
        this.localidade = enderecoViaCep.localidade();
        this.uf = enderecoViaCep.uf();
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Cep: " + cep + ", Logradouro: " + lograouro + ", Numero: " + numeroCasa + ", bairro: " + bairro + ", localidade: " + localidade + ", UF: " + uf;
    }
}
