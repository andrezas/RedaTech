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
@Table(name = "Redacao")
public class Redacao implements Identificavel{
	
	@Id
	private Long id;
	
	@Column 
	private Integer notaFinal;
	
	@Column
	private String tema;
	
	@ManyToOne
	@JoinColumn(name ="id_aluno")
	private Aluno autor;
	
	@OneToMany(mappedBy="redacao")
	private Set<NotaCompetencia> notacompetencia;
	
	@Column
	private String redacao;
	
	@Column
	private Material material;
	

	
}
