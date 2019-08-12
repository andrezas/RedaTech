package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.io.File;
import java.net.URL;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Material")
public class Material implements Identificavel{
	
	@Id
	private Long id;
	
	private String titulo;
	
	@ManyToMany(mappedBy="Aula_Material")
	private Set<Aula> aulas;
	
	@ManyToOne
	private Professor adiciona2;
	
	private String tipo;
	private String  descricao;
	private URL link;
	private File arquivo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Set<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}
	public Professor getAdiciona2() {
		return adiciona2;
	}
	public void setAdiciona2(Professor adiciona2) {
		this.adiciona2 = adiciona2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public URL getLink() {
		return link;
	}
	public void setLink(URL link) {
		this.link = link;
	}
	public File getArquivo() {
		return arquivo;
	}
	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
	
	public Material(Long id, String titulo, Set<Aula> aulas, Professor adiciona2, String tipo, String descricao,
			URL link, File arquivo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.aulas = aulas;
		this.adiciona2 = adiciona2;
		this.tipo = tipo;
		this.descricao = descricao;
		this.link = link;
		this.arquivo = arquivo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adiciona2 == null) ? 0 : adiciona2.hashCode());
		result = prime * result + ((arquivo == null) ? 0 : arquivo.hashCode());
		result = prime * result + ((aulas == null) ? 0 : aulas.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Material other = (Material) obj;
		if (adiciona2 == null) {
			if (other.adiciona2 != null)
				return false;
		} else if (!adiciona2.equals(other.adiciona2))
			return false;
		if (arquivo == null) {
			if (other.arquivo != null)
				return false;
		} else if (!arquivo.equals(other.arquivo))
			return false;
		if (aulas == null) {
			if (other.aulas != null)
				return false;
		} else if (!aulas.equals(other.aulas))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
