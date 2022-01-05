package com.richardeveloper.controllers;

import com.richardeveloper.entities.PessoaEntity;
import com.richardeveloper.services.PessoaService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaEntity> findById(@PathVariable Long id){
        PessoaEntity pessoaEntity = pessoaService.findById(id);
        return new ResponseEntity<>(pessoaEntity, HttpStatus.OK);
    }

}
