package com.residencia.biblioteca.services;

import java.util.List;

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {
    
    @Autowired
    public EmprestimoRepository emprestimoRepository;

    public Emprestimo findById(Integer id){
        return emprestimoRepository.findById(id).get();
    }

    public List<Emprestimo> listAll(){
        return emprestimoRepository.findAll();
    }

    public Long count(){
        return emprestimoRepository.count();
    }

    public Emprestimo save(Emprestimo aluno){
        Emprestimo novoAluno = emprestimoRepository.save(aluno);
        return novoAluno;
    }
}
