package br.com.zup.Lead.exception;

public class MensagemDeErro {

    private String mensagem;
    private String campo;

    public MensagemDeErro(String mensagem, String campo) {
        this.mensagem = mensagem;
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getCampo() {
        return campo;
    }
}
