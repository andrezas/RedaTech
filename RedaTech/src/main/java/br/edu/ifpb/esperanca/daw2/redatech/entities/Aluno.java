package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno extends Usuario{
	
	@Id
	private Long id;
	private String nome;
	private String email;
	private String grupo;
	private String senha;
	private Date nascimento;

}
