package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Redacao")
public class Redacao {
	
	@Id
	private Long id;
	@Column
	private String tema;
	@Column
	private Integer nota; 
	
	@ManyToOne
	@JoinColumn(name ="id")
	private Aluno autor;
	
	@ManyToOne
	@JoinColumn(name ="id")
	private Professor corretor;
	
	@ManyToMany
	@JoinTable(name = "red_com")
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

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
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

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
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
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Redacao [id=" + id + ", tema=" + tema + ", nota=" + nota + ", autor=" + autor + ", corretor=" + corretor
				+ ", comentarios=" + comentarios + "]";
	}
	
	
}
