package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.redatech.entities.NotaCompetencia;
import br.edu.ifpb.esperanca.daw2.redatech.services.NotaCompetenciaService;

@ViewScoped
@Named
public class NotaCompetenciaBean implements Serializable {
	@Inject
	private NotaCompetenciaService service;

	protected NotaCompetencia entidade;

	protected Collection<NotaCompetencia> entidades;

	public NotaCompetenciaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(NotaCompetencia entidade) {
		getService().remove(entidade);
		limpar();
	}

	public NotaCompetencia getEntidade() {
		return entidade;
	}

	public void setEntidade(NotaCompetencia entidade) {
		this.entidade = entidade;
	}

	public Collection<NotaCompetencia> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<NotaCompetencia> entidades) {
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

	protected NotaCompetencia newEntidade() {
		return new NotaCompetencia();
	}

	public NotaCompetenciaService getService() {
		return service;
	}
}
