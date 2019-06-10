package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NivelCompetencia")
public class NivelCompetencia implements Identificavel {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name ="id_competencia")
	private Competencia competencia;
	
	@ManyToMany
	@JoinTable(name="NivelCompetencia_NotaCompetencia", joinColumns=@JoinColumn(name="id_NivelCompetencia"), inverseJoinColumns=@JoinColumn(name="id_NotaCompetencia"))
	private Set<NotaCompetencia> notascompetencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		NivelCompetencia other = (NivelCompetencia) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
