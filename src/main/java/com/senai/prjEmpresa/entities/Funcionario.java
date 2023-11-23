package com.senai.prjEmpresa.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_funcionario")
public class Funcionario {
	// depcodigo , depnome 
				// atributos
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long funcodigo;
						
				private String funnome;
				
				@DateTimeFormat(pattern = "dd/MM/yyyy")
				   private LocalDate funnascimento;
				
				private Double funsalario;
				
				// construtor vazio
				public Funcionario() {

				}

				// construtor com parametros
				public Funcionario(Long funcodigo,String funnome, LocalDate funnascimento ,Double funsalario) {
					super();
					this.funcodigo = funcodigo;
					this.funnome = funnome;
					this.funnascimento = funnascimento;
					this.funsalario = funsalario;
				}
				// método de acesso
				public Long getfuncodigo() {
					return funcodigo;
				}

				public void setfuncodigo(Long funcodigo) {
					this.funcodigo = funcodigo;
				}

				// método de acesso
				public String getfunnome() {
					return funnome;
				}

				public void setfunnome(String funnome) {
					this.funnome = funnome;
				}
				
				// método de acesso
				public LocalDate getfunnascimento() {
					return funnascimento;
				}

				public void setfunnascimento(LocalDate funnascimento) {
					this.funnascimento = funnascimento;
				}

				public Double getfunsalario() {
					return funsalario;
				}

				public void setfunsalario(Double funsalario) {
					this.funsalario = funsalario;
				}
				
}
