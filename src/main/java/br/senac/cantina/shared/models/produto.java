package br.senac.cantina.shared.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

<<<<<<< HEAD
@Table("produtos")
=======
@Table ("produtos")
>>>>>>> d525f6e675e630079560525b006cbb8b840855e6
public class Produto {
    // Criar os atributos para a tabela Produto
    @Id
    private Long id;
    private String nome;
    private String descricao;
<<<<<<< HEAD
    private Double preco;
    private Double quantidade;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Criar um método construtor com todos os atributos
    public Produto(Long id, String nome, String descricao, Double preco, Double quantidade, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
=======
    private double preco;
    private float quantidade;
    private LocalDateTime dataHora;
    
    
    public Produto(Long id, String nome, String descricao, double preco, float quantidade, LocalDateTime dataHora) {
>>>>>>> d525f6e675e630079560525b006cbb8b840855e6
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
<<<<<<< HEAD

    // Criar os getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

=======
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
>>>>>>> d525f6e675e630079560525b006cbb8b840855e6
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
<<<<<<< HEAD

=======
    
>>>>>>> d525f6e675e630079560525b006cbb8b840855e6
}