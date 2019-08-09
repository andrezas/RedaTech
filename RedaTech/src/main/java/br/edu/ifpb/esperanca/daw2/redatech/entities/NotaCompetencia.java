package br.edu.ifpb.esperanca.daw2.redatech.entities;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class NotaCompetencia implements Identificavel{
	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name="id_nivelCompetencia")
	private NivelCompetencia nivelCompetencia;
	
	@ManyToOne
	@JoinColumn(name="id_professor")
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name="id_redacao")
	private Redacao redacao;
	
	@ManyToOne
	@JoinColumn(name="id_comentario")
	private Comentario comentario;

	


}
