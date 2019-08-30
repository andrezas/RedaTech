package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.redatech.entities.NivelCompetencia;
import br.edu.ifpb.esperanca.daw2.redatech.services.NivelCompetenciaService;

@ViewScoped
@Named
public class NivelCompetenciaBean implements Serializable {
	@Inject
	private NivelCompetenciaService service;

	protected NivelCompetencia entidade;

	protected Collection<NivelCompetencia> entidades;

	public NivelCompetenciaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(NivelCompetencia entidade) {
		getService().remove(entidade);
		limpar();
	}

	public NivelCompetencia getEntidade() {
		return entidade;
	}

	public void setEntidade(NivelCompetencia entidade) {
		this.entidade = entidade;
	}

	public Collection<NivelCompetencia> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<NivelCompetencia> entidades) {
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

	protected NivelCompetencia newEntidade() {
		return new NivelCompetencia();
	}

	public NivelCompetenciaService getService() {
		return service;
	}
}
