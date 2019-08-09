package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Comentario")
public class Comentario implements Identificavel{
	
	@Id
	private Long id;
	
	@Column
	private Calendar data;
	
	@Column
	private String comentario;
	
	@OneToMany(mappedBy="comentario")
	private Set<NotaCompetencia> notacompetencia;
	
	
}
