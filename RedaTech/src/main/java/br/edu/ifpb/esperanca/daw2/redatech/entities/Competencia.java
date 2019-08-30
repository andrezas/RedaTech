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
	
	private String competencia;
	
	@OneToMany(mappedBy="competencia")
	private Set<NivelCompetencia> nivelcompetencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public Set<NivelCompetencia> getNivelcompetencia() {
		return nivelcompetencia;
	}

	public void setNivelcompetencia(Set<NivelCompetencia> nivelcompetencia) {
		this.nivelcompetencia = nivelcompetencia;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nivelcompetencia == null) ? 0 : nivelcompetencia.hashCode());
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
		Competencia other = (Competencia) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nivelcompetencia == null) {
			if (other.nivelcompetencia != null)
				return false;
		} else if (!nivelcompetencia.equals(other.nivelcompetencia))
			return false;
		return true;
	}
}

