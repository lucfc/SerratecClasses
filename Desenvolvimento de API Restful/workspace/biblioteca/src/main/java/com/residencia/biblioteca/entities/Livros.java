package com.residencia.biblioteca.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "livros")
public class Livros {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigolivro")
    private Integer codigolivro;

    @OneToOne   
    @JoinColumn(name = "codigoeditora", referencedColumnName = "codigoeditora")
    private Editora editora;

    @Column(name = "nomelivro")
    private String nomelivro;
    
    @Column(name = "nomeautor")
    private String nomeautor;
    
    @Column(name = "datalancamento")
    private Calendar datalancamento;

    @Column(name = "codigoisbn")
    private Integer codigoisbn;
    
    public Integer getCodigolivro() {
        return codigolivro;
    }

    public void setCodigolivro(Integer codigolivro) {
        this.codigolivro = codigolivro;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getNomeautor() {
        return nomeautor;
    }

    public void setNomeautor(String nomeautor) {
        this.nomeautor = nomeautor;
    }

    public Calendar getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(Calendar datalancamento) {
        this.datalancamento = datalancamento;
    }

    public Integer getCodigoisbn() {
        return codigoisbn;
    }

    public void setCodigoisbn(Integer codigoisbn) {
        this.codigoisbn = codigoisbn;
    }


    


}
