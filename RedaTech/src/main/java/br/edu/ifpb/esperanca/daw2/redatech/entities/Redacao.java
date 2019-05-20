package br.edu.ifpb.esperanca.daw2.redatech.entities;
import javax.persistence.Entity;

@Entity
public class Redacao {
	
	private long id;
	private String tema;
	private Aluno autor;

}
