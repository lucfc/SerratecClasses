package com.residencia.biblioteca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "editora")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoeditora")
    private Integer codigoeditora;

    @OneToOne(mappedBy = "editora")
    private Livros livro;

    @Column(name = "nome")
    private String nome;


    public Integer getCodigoeditora() {
        return this.codigoeditora;
    }

    public void setCodigoeditora(Integer codigoeditora) {
        this.codigoeditora = codigoeditora;
    }

    public Livros getLivro() {
        return this.livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
