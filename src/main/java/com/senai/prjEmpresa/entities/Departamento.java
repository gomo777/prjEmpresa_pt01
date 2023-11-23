package com.senai.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_departamento")
public class Departamento {
	// depcodigo , depnome 
			// atributos
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long depcodigo;
			
			private String depnome;
			
			// construtor vazio
			public Departamento() {

			}

			// construtor com parametros
			public Departamento(Long depcodigo, String depnome) {
				super();
				this.depcodigo = depcodigo;
				this.depnome = depnome;
			}

			public Long getDepcodigo() {
				return depcodigo;
			}

			public void setDepcodigo(Long depcodigo) {
				this.depcodigo = depcodigo;
			}

			public String getDepnome() {
				return depnome;
			}

			public void setDepnome(String depnome) {
				this.depnome = depnome;
			}
		

	
			
	
}
