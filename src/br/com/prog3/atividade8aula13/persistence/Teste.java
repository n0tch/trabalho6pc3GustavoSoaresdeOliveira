package br.com.prog3.atividade8aula13.persistence;

import java.util.List;

import br.com.prog3.atividade8aula13.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlunoDAOImp ad = new AlunoDAOImp();
		Aluno a = ad.findByMatricula(2);
		if(a != null){
			System.out.println(a.getNome());			
		}
		
	}

}
