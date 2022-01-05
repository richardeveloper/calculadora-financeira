package com.richardeveloper.services;

import com.richardeveloper.entities.PessoaEntity;
import com.richardeveloper.exceptions.ServiceException;
import com.richardeveloper.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaEntity findById(Long id){
        return this.pessoaRepository.findById(id)
                .orElseThrow(() -> new ServiceException("Não existe pessoa para o ID: "+id));
    }
}
