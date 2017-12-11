package br.com.prog3.atividade8aula13.persistence;

import java.util.List;
import br.com.prog3.atividade8aula13.model.Aluno;

public interface AlunoDAO {
	public String save(Aluno aluno);
	public String delete(int matricula);
	public String update(Aluno aluno);
	public List<Aluno> list();
	public Aluno findByMatricula(int matricula);
}
