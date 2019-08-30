package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Competencia;
import br.edu.ifpb.esperanca.daw2.redatech.services.CompetenciaService;

@ViewScoped
@Named
public class CompetenciaBean implements Serializable {
	@Inject
	private CompetenciaService service;

	protected Competencia entidade;

	protected Collection<Competencia> entidades;

	public CompetenciaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Competencia entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Competencia getEntidade() {
		return entidade;
	}

	public void setEntidade(Competencia entidade) {
		this.entidade = entidade;
	}

	public Collection<Competencia> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Competencia> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Competencia newEntidade() {
		return new Competencia();
	}

	public CompetenciaService getService() {
		return service;
	}
	

}
