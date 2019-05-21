package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Midia")
public class Midia {
	
	@Id
	private Long id;
	
	@Column
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "prof_midia")
	private Set<Professor>professores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(Set<Professor> professores) {
		this.professores = professores;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Midia other = (Midia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (professores == null) {
			if (other.professores != null)
				return false;
		} else if (!professores.equals(other.professores))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Midia [id=" + id + ", nome=" + nome + ", professores=" + professores + "]";
	}
	
	

}
