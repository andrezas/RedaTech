package br.edu.ifpb.esperanca.daw2.redatech.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Redacao {
	
	@Id
	private Long id;
	private String tema;
	private Aluno autor;

}
