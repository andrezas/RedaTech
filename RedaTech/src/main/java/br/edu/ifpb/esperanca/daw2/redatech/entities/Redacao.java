package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Redacao")
public class Redacao implements Identificavel{
	
	@Id
	@GeneratedValue
	private Long id;
	 
	private Integer notaFinal;
	private String tema;
	private Date data;
	//ytyjtyjhgj
	@Lob
	private byte[] img;

	@ManyToOne
	@JoinColumn(name ="id_aluno")
	private Aluno autor;
	
	@OneToMany(mappedBy="redacao")
	private Set<NotaCompetencia> notacompetencia;
	
	private String redacao;
	
	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Integer notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Aluno getAutor() {
		return autor;
	}

	public void setAutor(Aluno autor) {
		this.autor = autor;
	}

	public Set<NotaCompetencia> getNotacompetencia() {
		return notacompetencia;
	}

	public void setNotacompetencia(Set<NotaCompetencia> notacompetencia) {
		this.notacompetencia = notacompetencia;
	}

	public String getRedacao() {
		return redacao;
	}

	public void setRedacao(String redacao) {
		this.redacao = redacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + ((notaFinal == null) ? 0 : notaFinal.hashCode());
		result = prime * result + ((notacompetencia == null) ? 0 : notacompetencia.hashCode());
		result = prime * result + ((redacao == null) ? 0 : redacao.hashCode());
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
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
		Redacao other = (Redacao) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
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
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (notaFinal == null) {
			if (other.notaFinal != null)
				return false;
		} else if (!notaFinal.equals(other.notaFinal))
			return false;
		if (notacompetencia == null) {
			if (other.notacompetencia != null)
				return false;
		} else if (!notacompetencia.equals(other.notacompetencia))
			return false;
		if (redacao == null) {
			if (other.redacao != null)
				return false;
		} else if (!redacao.equals(other.redacao))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}

}
