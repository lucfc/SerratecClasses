package com.residencia.biblioteca.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "alunos")
public class Alunos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeromatriculaaluno")
    private Integer numeromatriculaString;

    @OneToMany(mappedBy = "alunos")
    private List<Emprestimo> listEmprestimo;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "datanascimento")
    private Calendar datanascimento;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "logradouro")
    private String logradouro;
    
    @Column(name = "numerologradouro")
    private String numerologradouro;
    
    @Column(name = "complemento")
    private String complemento;
    
    @Column(name = "bairro")
    private String bairro;
    
    @Column(name = "cidade")
    private String cidade;

    public Integer getNumeromatriculaString() {
        return this.numeromatriculaString;
    }

    public void setNumeromatriculaString(Integer numeromatriculaString) {
        this.numeromatriculaString = numeromatriculaString;
    }

    public List<Emprestimo> getListEmprestimo() {
        return this.listEmprestimo;
    }

    public void setListEmprestimo(List<Emprestimo> listEmprestimo) {
        this.listEmprestimo = listEmprestimo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDatanascimento() {
        return this.datanascimento;
    }

    public void setDatanascimento(Calendar datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumerologradouro() {
        return this.numerologradouro;
    }

    public void setNumerologradouro(String numerologradouro) {
        this.numerologradouro = numerologradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
