package br.com.zup.Lead.dtos;

import java.util.List;

public class LeadDTO {
    private String nome;
    private String email;
    private List<ProdutoDTO> produtosDTOS;

    public LeadDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ProdutoDTO> getProdutosDTOS() {
        return produtosDTOS;
    }

    public void setProdutosDTOS(List<ProdutoDTO> produtosDTOS) {
        this.produtosDTOS = produtosDTOS;
    }
}
