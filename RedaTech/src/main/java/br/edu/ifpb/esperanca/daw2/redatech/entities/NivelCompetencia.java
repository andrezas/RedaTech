package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NivelCompetencia")
public class NivelCompetencia implements Identificavel {
	
	@Id
	private Long id;
	
	@Column 
	private Integer nivel;
	
	@Column
	private Integer pontos;
	
	@ManyToOne
	@JoinColumn(name ="id_competencia")
	private Competencia competencia;
	
	@OneToMany(mappedBy="nivelCompetencia")
	private Set<NotaCompetencia> notacompetencia;
	
	private String descricao;

		
}
