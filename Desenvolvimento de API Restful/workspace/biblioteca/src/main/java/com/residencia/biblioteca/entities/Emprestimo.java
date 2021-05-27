package com.residencia.biblioteca.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoemprestimo")
    private Integer codigoemprestimo;

    @ManyToOne
    @JoinColumn(name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno")
    private Alunos alunos;

    @ManyToOne
    @JoinColumn(name = "codigolivro", referencedColumnName = "codigolivro")
    private Livros livro;

   
    @Column(name = "dataemprestimo")
    private Calendar dataemprestimo;

    @Column(name = "dataentrega")
    private Calendar dataentrega;

    @Column(name = "valoremprestimo")
    private Double valoremprestimo;


    public Integer getCodigoemprestimo() {
        return this.codigoemprestimo;
    }

    public void setCodigoemprestimo(Integer codigoemprestimo) {
        this.codigoemprestimo = codigoemprestimo;
    }

    public Alunos getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }

    public Livros getLivro() {
        return this.livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }


    public Calendar getDataemprestimo() {
        return this.dataemprestimo;
    }

    public void setDataemprestimo(Calendar dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public Calendar getDataentrega() {
        return this.dataentrega;
    }

    public void setDataentrega(Calendar dataentrega) {
        this.dataentrega = dataentrega;
    }

    public Double getValoremprestimo() {
        return this.valoremprestimo;
    }

    public void setValoremprestimo(Double valoremprestimo) {
        this.valoremprestimo = valoremprestimo;
    }


}
