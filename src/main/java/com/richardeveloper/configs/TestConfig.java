package com.richardeveloper.configs;

import com.richardeveloper.entities.FuncionarioEntity;
import com.richardeveloper.entities.PessoaEntity;
import com.richardeveloper.repositories.FuncionarioRepository;
import com.richardeveloper.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public void run(String... args) throws Exception {

        PessoaEntity pessoa = PessoaEntity.builder().nome("Pessoa Rodrigues")
                .cpf("12345678900")
                .dataNascimento(LocalDate.of(1999, 11, 11))
                .email("email@email.com")
                .telefoneCelular("99999999999")
                .sexo("MASCULINO")
                .build();

        FuncionarioEntity funcionario = FuncionarioEntity.builder().cargo("Analista de Pessoas")
                .dataAdmissao(LocalDate.now())
                .dependentes(0)
                .empresa("Empresa Ltda")
                .salarioBruto(new BigDecimal("1200.00"))
                .pessoa(pessoa)
                .build();

        pessoaRepository.save(pessoa);
        funcionarioRepository.save(funcionario);
    }
}
