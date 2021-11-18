package br.com.zup.Lead.dtos;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class LeadDTO {
    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;
    @Valid
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
