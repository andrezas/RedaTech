package br.edu.ifpb.esperanca.daw2.redatech.entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor extends Usuario {
	
	private String formacao;
	
	@OneToMany(mappedBy="professor")
	private Set<Turma> turmas;
	
	@OneToMany(mappedBy="adiciona")
	private Set<Aula> aulas;
	
	@OneToMany(mappedBy="adiciona2")
	private Set<Material> materiais;

	@OneToMany(mappedBy="id_professor")
	private Set<NotaCompetencia> notacompetencia;
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Set<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}

	public Set<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}

	public Set<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(Set<Material> materiais) {
		this.materiais = materiais;
	}

	public Set<NotaCompetencia> getNotacompetencia() {
		return notacompetencia;
	}

	public void setNotacompetencia(Set<NotaCompetencia> notacompetencia) {
		this.notacompetencia = notacompetencia;
	}

	public Professor(String formacao, Set<Turma> turmas, Set<Aula> aulas, Set<Material> materiais,
			Set<NotaCompetencia> notacompetencia) {
		super();
		this.formacao = formacao;
		this.turmas = turmas;
		this.aulas = aulas;
		this.materiais = materiais;
		this.notacompetencia = notacompetencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aulas == null) ? 0 : aulas.hashCode());
		result = prime * result + ((formacao == null) ? 0 : formacao.hashCode());
		result = prime * result + ((materiais == null) ? 0 : materiais.hashCode());
		result = prime * result + ((notacompetencia == null) ? 0 : notacompetencia.hashCode());
		result = prime * result + ((turmas == null) ? 0 : turmas.hashCode());
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
		if (aulas == null) {
			if (other.aulas != null)
				return false;
		} else if (!aulas.equals(other.aulas))
			return false;
		if (formacao == null) {
			if (other.formacao != null)
				return false;
		} else if (!formacao.equals(other.formacao))
			return false;
		if (materiais == null) {
			if (other.materiais != null)
				return false;
		} else if (!materiais.equals(other.materiais))
			return false;
		if (notacompetencia == null) {
			if (other.notacompetencia != null)
				return false;
		} else if (!notacompetencia.equals(other.notacompetencia))
			return false;
		if (turmas == null) {
			if (other.turmas != null)
				return false;
		} else if (!turmas.equals(other.turmas))
			return false;
		return true;
	}
	
}
