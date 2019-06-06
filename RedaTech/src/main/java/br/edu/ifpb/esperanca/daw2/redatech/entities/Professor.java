package br.edu.ifpb.esperanca.daw2.redatech.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor extends Usuario {
	
	@Column
	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((formacao == null) ? 0 : formacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (formacao == null) {
			if (other.formacao != null)
				return false;
		} else if (!formacao.equals(other.formacao))
			return false;
		return true;
	}

}
