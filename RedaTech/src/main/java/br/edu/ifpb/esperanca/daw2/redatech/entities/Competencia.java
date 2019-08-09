package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Competencia")
public class Competencia implements Identificavel{
	
	@Id
	private Long id;
	
	@Column
	private String competencia;
	
	@OneToMany(mappedBy="nivelCompetencia")
	private Set<NivelCompetencia> nivelcompetencia;
	
	

}

