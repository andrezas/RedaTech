package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Aluno extends Usuario{
	
	private String serie;
    
    @ManyToMany
	@JoinTable(name="aula_aluno", joinColumns=@JoinColumn(name="id_aluno"), inverseJoinColumns=@JoinColumn(name="id_aula"))
	private Set<Aula> aulas;
    
   
    @OneToMany(mappedBy="autor")
	private Set<Redacao> redacao;


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public Set<Aula> getAulas() {
		return aulas;
	}


	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}


	public Set<Redacao> getRedacao() {
		return redacao;
	}


	public void setRedacao(Set<Redacao> redacao) {
		this.redacao = redacao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aulas == null) ? 0 : aulas.hashCode());
		result = prime * result + ((redacao == null) ? 0 : redacao.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
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
		Aluno other = (Aluno) obj;
		if (aulas == null) {
			if (other.aulas != null)
				return false;
		} else if (!aulas.equals(other.aulas))
			return false;
		if (redacao == null) {
			if (other.redacao != null)
				return false;
		} else if (!redacao.equals(other.redacao))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
	}
}
