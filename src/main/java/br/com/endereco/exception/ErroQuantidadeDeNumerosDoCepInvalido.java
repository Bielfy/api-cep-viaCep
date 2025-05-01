package br.com.endereco.exception;

public class ErroQuantidadeDeNumerosDoCepInvalido extends RuntimeException {
    private String mensagem;

    public ErroQuantidadeDeNumerosDoCepInvalido(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
