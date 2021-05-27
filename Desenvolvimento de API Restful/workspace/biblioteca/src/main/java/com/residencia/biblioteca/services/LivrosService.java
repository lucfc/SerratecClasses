package com.residencia.biblioteca.services;

import com.residencia.biblioteca.repositories.LivrosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivrosService {
    
    @Autowired
    public LivrosRepository livrosRepository;

    public Livros findById(Integer id){
        return livrosRepository.findById(id).get();
    }

    public List<Livros> listAll(){
        return livrosRepository.findAll();
    }

    public Long count(){
        return livrosRepository.count();
    }

    public Livros save(Livros aluno){
        Livros novoAluno = livrosRepository.save(aluno);
        return novoAluno;
    }
}
