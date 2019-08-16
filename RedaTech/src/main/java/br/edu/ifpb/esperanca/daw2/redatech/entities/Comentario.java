package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Comentario")
public class Comentario implements Identificavel{
	
	@Id
	private Long id;
	
	private Calendar data;
	private String comentario;
	
	@OneToMany(mappedBy="comentario")
	private Set<NotaCompetencia> notacompetencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Set<NotaCompetencia> getNotacompetencia() {
		return notacompetencia;
	}

	public void setNotacompetencia(Set<NotaCompetencia> notacompetencia) {
		this.notacompetencia = notacompetencia;
	}

	public Comentario(Long id, Calendar data, String comentario, Set<NotaCompetencia> notacompetencia) {
		super();
		this.id = id;
		this.data = data;
		this.comentario = comentario;
		this.notacompetencia = notacompetencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((notacompetencia == null) ? 0 : notacompetencia.hashCode());
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
		Comentario other = (Comentario) obj;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (notacompetencia == null) {
			if (other.notacompetencia != null)
				return false;
		} else if (!notacompetencia.equals(other.notacompetencia))
			return false;
		return true;
	}
}
