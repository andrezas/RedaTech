package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Material;
import br.edu.ifpb.esperanca.daw2.redatech.services.MaterialService;

@ViewScoped
@Named
public class MaterialBean implements Serializable {
	@Inject
	private MaterialService service;

	protected Material entidade;

	protected Collection<Material> entidades;
	
	private UploadedFile file;

	public MaterialBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Material entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Material getEntidade() {
		return entidade;
	}

	public void setEntidade(Material entidade) {
		this.entidade = entidade;
	}

	public Collection<Material> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Material> entidades) {
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

	protected Material newEntidade() {
		return new Material();
	}

	public MaterialService getService() {
		return service;
	}

}
