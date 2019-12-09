package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Professor;
import br.edu.ifpb.esperanca.daw2.redatech.services.ProfessorService;

@RequestScoped
@Named
public class ProfessorBean implements Serializable {
	@Inject
	private ProfessorService service;

	protected Professor entidade;

	protected Collection<Professor> entidades;
	
	private String opcao;

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public ProfessorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Professor entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Professor getEntidade() {
		return entidade;
	}

	public void setEntidade(Professor entidade) {
		this.entidade = entidade;
	}

	public Collection<Professor> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Professor> entidades) {
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

	protected Professor newEntidade() {
		return new Professor();
	}

	public ProfessorService getService() {
		return service;
	}
}
