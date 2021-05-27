package com.residencia.biblioteca.services;

import java.util.List;

import com.residencia.biblioteca.entities.Alunos;
import com.residencia.biblioteca.repositories.AlunosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunosService {
    
    @Autowired
    public AlunosRepository alunosRepository;

    public Alunos findById(Integer id){
        return alunosRepository.findById(id).get();
    }

    public List<Alunos> listAll(){
        return alunosRepository.findAll();
    }

    public Long count(){
        return alunosRepository.count();
    }

    public Alunos save(Alunos aluno){
        Alunos novoAluno = alunosRepository.save(aluno);
        return novoAluno;
    }

    public Alunos update(Integer id){
        return alunosRepository.save(id);
    }
}
