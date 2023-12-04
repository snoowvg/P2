package com.p2.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //ID GERA AUTOMATICAMENTE//
    private long id;

    @Column(nullable = false)
    private String nome;
}