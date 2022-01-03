package com.richardeveloper.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "FUNCIONARIO")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SALARIO_BRUTO")
    private BigDecimal salarioBruto;

    @Column(name = "DEPENDENTES")
    private Integer dependentes;

    @Column(name = "DATA_ADMISSAO")
    private LocalDate dataAdmissao;

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "EMPRESA")
    private String empresa;

    @ManyToOne
    @JoinColumn(name = "PESSOA_ID")
    private PessoaEntity pessoa;

}
