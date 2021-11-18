package br.com.zup.Lead.model;

import br.com.zup.Lead.dtos.ProdutoDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lead")
public class LeadModel {

    @Id
    @Column(unique = true)
    private String email;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProdutoDTO> produtosDTOS;

    public LeadModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoDTO> getProdutosDTOS() {
        return produtosDTOS;
    }

    public void setProdutosDTOS(List<ProdutoDTO> produtosDTOS) {
        this.produtosDTOS = produtosDTOS;
    }
}
