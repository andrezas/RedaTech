package br.edu.ifpb.esperanca.daw2.redatech.dao;

import java.util.List;

import javax.persistence.Query;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Turma;

public class TurmaDAO extends DAO<Turma>{
	
	public TurmaDAO() {
		super(Turma.class);
	}
	
	public List<Turma> turmasDoAluno(Aluno aluno) {
		Query query = em.createQuery("Select t from Turma t, Aluno a  where a MEMBER OF t.alunos and a.id = "+aluno.getId());
		return query.getResultList();
	}
	
}
