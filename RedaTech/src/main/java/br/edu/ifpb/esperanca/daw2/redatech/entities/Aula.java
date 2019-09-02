package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Aula")
public class Aula implements Identificavel{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String proposta;
	
	@ManyToMany
	@JoinTable(name="aula_material")
	private Set<Material> material;
	
	@ManyToOne
	private Professor adiciona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public Set<Material> getMaterial() {
		return material;
	}

	public void setMaterial(Set<Material> material) {
		this.material = material;
	}

	public Professor getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(Professor adiciona) {
		this.adiciona = adiciona;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adiciona == null) ? 0 : adiciona.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((proposta == null) ? 0 : proposta.hashCode());
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
		Aula other = (Aula) obj;
		if (adiciona == null) {
			if (other.adiciona != null)
				return false;
		} else if (!adiciona.equals(other.adiciona))
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
		if (proposta == null) {
			if (other.proposta != null)
				return false;
		} else if (!proposta.equals(other.proposta))
			return false;
		return true;
	}

}
