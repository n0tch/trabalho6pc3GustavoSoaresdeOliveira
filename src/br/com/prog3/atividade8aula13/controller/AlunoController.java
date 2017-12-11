package br.com.prog3.atividade8aula13.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.prog3.atividade8aula13.model.Aluno;
import br.com.prog3.atividade8aula13.persistence.AlunoDAOImp;

@ManagedBean
public class AlunoController {
	private Integer matricula;
	private String nome;
	private String ra;
	private Aluno aluno;
	private String mensagem;
	
	
	public void AddAluno(){
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDAOImp ad = new AlunoDAOImp();
		setMensagem(ad.save(aluno));
		aluno = new Aluno();
	}
	
	public void editAluno(){
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDAOImp ad = new AlunoDAOImp();
		setMensagem(ad.update(aluno));
	}
	
	public void deleteAluno(){
		AlunoDAOImp ad = new AlunoDAOImp();
		setMensagem(ad.delete(matricula));
	}

	public List<Aluno> getAlunos(){
		AlunoDAOImp ad = new AlunoDAOImp();
		return ad.list();
	}
	
	public Aluno findAluno(){
		AlunoDAOImp ad = new AlunoDAOImp();
		return ad.findByMatricula(matricula);
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}	
}
