package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Nota")
public class Nota implements Identificavel{
	
	private Long id;
	private ArrayList<String> competencia;
	private ArrayList<String> encaminhamentos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ArrayList<String> getCompetencia() {
		return competencia;
	}
	public void setCompetencia(ArrayList<String> competencia) {
		this.competencia = competencia;
	}
	public ArrayList<String> getEncaminhamentos() {
		return encaminhamentos;
	}
	public void setEncaminhamentos(ArrayList<String> encaminhamentos) {
		this.encaminhamentos = encaminhamentos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result + ((encaminhamentos == null) ? 0 : encaminhamentos.hashCode());
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
		Nota other = (Nota) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (encaminhamentos == null) {
			if (other.encaminhamentos != null)
				return false;
		} else if (!encaminhamentos.equals(other.encaminhamentos))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
