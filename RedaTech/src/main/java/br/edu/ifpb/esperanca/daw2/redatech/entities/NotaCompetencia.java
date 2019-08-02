package br.edu.ifpb.esperanca.daw2.redatech.entities;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class NotaCompetencia implements Identificavel{
	@Id
	private Long id;

	
	private NivelCompetencia nivel;
	
	@ManyToOne
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name="id_redacao")
	private Redacao redacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NivelCompetencia getNivel() {
		return nivel;
	}

	public void setNivel(NivelCompetencia nivel) {
		this.nivel = nivel;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Redacao getRedacao() {
		return redacao;
	}

	public void setRedacao(Redacao redacao) {
		this.redacao = redacao;
	}

	public NotaCompetencia(Long id, NivelCompetencia nivel, Professor professor, Redacao redacao) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.professor = professor;
		this.redacao = redacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		result = prime * result + ((redacao == null) ? 0 : redacao.hashCode());
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
		NotaCompetencia other = (NotaCompetencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nivel == null) {
			if (other.nivel != null)
				return false;
		} else if (!nivel.equals(other.nivel))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		if (redacao == null) {
			if (other.redacao != null)
				return false;
		} else if (!redacao.equals(other.redacao))
			return false;
		return true;
	}



}
