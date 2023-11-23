package com.senai.prjEmpresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.prjEmpresa.entities.Funcionario;
import com.senai.prjEmpresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository ) {
		this.funcionarioRepository = funcionarioRepository;
	}
		public Funcionario SaveFuncionario(Funcionario Funcionario) {
			return funcionarioRepository.save(Funcionario);
		}
		public List<Funcionario> getAllFuncionario(){
			return funcionarioRepository.findAll();
		}
		
		public Funcionario getFuncionarioByid(Long funcodigo) {
			return funcionarioRepository.findById(funcodigo).orElse(null);			
		}
		
		public void deleteFuncionario(Long funcodigo) {
			funcionarioRepository.deleteById(funcodigo);
		}
		
		// fazendo o update do nome do funcionario com o optional
			public Funcionario updateFuncionario(Long funcodigo, Funcionario novoFuncionario) {
		        Optional<Funcionario> FuncionarioOptional = funcionarioRepository.findById(funcodigo);
		        if (FuncionarioOptional.isPresent()) {
		        	Funcionario FuncionarioExistente = FuncionarioOptional.get();
		        	FuncionarioExistente.setfunnome(novoFuncionario.getfunnome());    
		        	FuncionarioExistente.setfunnascimento(novoFuncionario.getfunnascimento());     
		        	FuncionarioExistente.setfunsalario(novoFuncionario.getfunsalario());
		            return funcionarioRepository.save(FuncionarioExistente); 
		        } else {
		            return null; 
		        }
		 
	}
}
