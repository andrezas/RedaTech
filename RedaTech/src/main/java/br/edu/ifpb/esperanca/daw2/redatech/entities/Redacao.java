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
	private String tema;
	
	@ManyToOne
	@JoinColumn(name ="id_aluno")
	private Aluno autor;
	
	@ManyToOne
	@JoinColumn(name ="id_professor")
	private Professor corretor;
	
	@ManyToMany
	@JoinTable(name="Redacao_NotaCompetencia", joinColumns=@JoinColumn(name="id_Redacao"), inverseJoinColumns=@JoinColumn(name="id_NotaCompetencia"))
	private Set<NotaCompetencia> notascompetencia;
	
	@Column
	private String redacao;
	
	@Column
	private Material material;
	
	@ManyToOne
	@JoinColumn(name ="id_competecia")
	private Set<Competencia> competencias;

	@OneToMany
	@JoinColumn(name = "id_comentario")
	private Set<Comentario>comentarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Aluno getAutor() {
		return autor;
	}

	public void setAutor(Aluno autor) {
		this.autor = autor;
	}

	public Professor getCorretor() {
		return corretor;
	}

	public void setCorretor(Professor corretor) {
		this.corretor = corretor;
	}

	public String getRedacao() {
		return redacao;
	}

	public void setRedacao(String redacao) {
		this.redacao = redacao;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Set<Competencia> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Set<Competencia> competencias) {
		this.competencias = competencias;
	}

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Redacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + ((competencias == null) ? 0 : competencias.hashCode());
		result = prime * result + ((corretor == null) ? 0 : corretor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((redacao == null) ? 0 : redacao.hashCode());
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Redacao other = (Redacao) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (competencias == null) {
			if (other.competencias != null)
				return false;
		} else if (!competencias.equals(other.competencias))
			return false;
		if (corretor == null) {
			if (other.corretor != null)
				return false;
		} else if (!corretor.equals(other.corretor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (redacao == null) {
			if (other.redacao != null)
				return false;
		} else if (!redacao.equals(other.redacao))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}

	

	
	
}
