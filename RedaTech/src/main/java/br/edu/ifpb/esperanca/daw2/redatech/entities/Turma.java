package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Turma {
	
	@Id
	private long id;
	
	@ManyToMany
	private Set<Aluno> alunos;
	
	private Professor professor;
	

}
