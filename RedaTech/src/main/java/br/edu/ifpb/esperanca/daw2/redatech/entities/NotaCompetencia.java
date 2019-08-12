package br.edu.ifpb.esperanca.daw2.redatech.entities;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class NotaCompetencia implements Identificavel{
	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name="id_nivelCompetencia")
	private NivelCompetencia nivelCompetencia;
	
	@ManyToOne
	@JoinColumn(name="id_professor")
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name="id_redacao")
	private Redacao redacao;
	
	@ManyToOne
	@JoinColumn(name="id_comentario")
	private Comentario comentario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NivelCompetencia getNivelCompetencia() {
		return nivelCompetencia;
	}

	public void setNivelCompetencia(NivelCompetencia nivelCompetencia) {
		this.nivelCompetencia = nivelCompetencia;
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

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public NotaCompetencia(Long id, NivelCompetencia nivelCompetencia, Professor professor, Redacao redacao,
			Comentario comentario) {
		super();
		this.id = id;
		this.nivelCompetencia = nivelCompetencia;
		this.professor = professor;
		this.redacao = redacao;
		this.comentario = comentario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nivelCompetencia == null) ? 0 : nivelCompetencia.hashCode());
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
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nivelCompetencia == null) {
			if (other.nivelCompetencia != null)
				return false;
		} else if (!nivelCompetencia.equals(other.nivelCompetencia))
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
