package com.p2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.p2.entidade.Pessoa;

@Repository

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}