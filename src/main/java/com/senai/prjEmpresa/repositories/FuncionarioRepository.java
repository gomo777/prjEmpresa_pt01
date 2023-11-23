package com.senai.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.prjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{

}
