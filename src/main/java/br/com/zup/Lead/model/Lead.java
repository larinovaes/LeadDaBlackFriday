package br.com.zup.Lead.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lead")
public class Lead {

    @Id
    @Column(unique = true)
    private String email;
    private String nome;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Lead() {
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
