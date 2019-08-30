package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Aula;
import br.edu.ifpb.esperanca.daw2.redatech.services.AulaService;

@ViewScoped
@Named
public class AulaBean implements Serializable {
	@Inject
	private AulaService service;

	protected Aula entidade;

	protected Collection<Aula> entidades;

	public AulaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Aula entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Aula getEntidade() {
		return entidade;
	}

	public void setEntidade(Aula entidade) {
		this.entidade = entidade;
	}

	public Collection<Aula> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Aula> entidades) {
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

	protected Aula newEntidade() {
		return new Aula();
	}

	public AulaService getService() {
		return service;
	}

}
