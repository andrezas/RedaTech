package br.edu.ifpb.esperanca.daw2.redatech.entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor extends Usuario {
	
	@Column
	private String formacao;

	@OneToMany(mappedBy="professor")
	private Set<NotaCompetencia> notacompetencia;

}
