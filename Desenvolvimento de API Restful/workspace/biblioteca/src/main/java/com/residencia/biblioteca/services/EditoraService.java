package com.residencia.biblioteca.services;

import java.util.List;

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.repositories.EditoraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditoraService {
    
    @Autowired
    public EditoraRepository editoraRepository;

    public Editora findById(Integer id){
        return editoraRepository.findById(id).get();
    }

    public List<Editora> listAll(){
        return editoraRepository.findAll();
    }

    public Long count(){
        return editoraRepository.count();
    }

    public Editora save(Editora aluno){
        Editora novoAluno = editoraRepository.save(aluno);
        return novoAluno;
    }
}
