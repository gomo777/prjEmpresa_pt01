package com.senai.prjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.prjEmpresa.entities.Departamento;
import com.senai.prjEmpresa.entities.Funcionario;
import com.senai.prjEmpresa.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControler {
private final FuncionarioService FuncionarioService;
	
	@Autowired
	public FuncionarioControler(FuncionarioService FuncionarioService) {
		this.FuncionarioService = FuncionarioService ;
	}
	
	@PostMapping
	public Funcionario createProduct(@RequestBody Funcionario Funcionario ) {
		//return produtoService.saveProduto(produto);
		return FuncionarioService.SaveFuncionario(Funcionario);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> getDepartamento(@PathVariable Long funcodigo) {
		Funcionario Funcionario = FuncionarioService.getFuncionarioByid(funcodigo);
		if(Funcionario != null) {
			return ResponseEntity.ok(Funcionario);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/home")
	public String paginaInicial() {
		return "index" ; // nome do seu arquivo HTML , (sem a extensão)
	}
	

	@DeleteMapping("/{id}")
	public void deleteDepartamento(@PathVariable Long funcodigo) {
		FuncionarioService.deleteFuncionario(funcodigo);
	}
	
	//Utilizando o ResponseEntity e RequestEntity 
	@GetMapping("/")
	public ResponseEntity<List<Funcionario>>getAllFuncionario() {
		List<Funcionario> novoFuncionario = FuncionarioService.getAllFuncionario();
		return ResponseEntity.ok(novoFuncionario);
	}	
		@PutMapping("/{id}")
		public Funcionario updateFuncionario(@PathVariable Long depcodigo, @RequestBody Funcionario Funcionario) {
		    return FuncionarioService.getFuncionarioByid(depcodigo);
		}
}
