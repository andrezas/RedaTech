package br.edu.ifpb.esperanca.daw2.redatech.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Redacao;
import br.edu.ifpb.esperanca.daw2.redatech.services.RedacaoService;

@ViewScoped
@Named
public class RedacaoBean implements Serializable {
	@Inject
	private RedacaoService service;

	protected Redacao entidade;

	protected Collection<Redacao> entidades;
	
	private UploadedFile file;
	 
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }

	public RedacaoBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Redacao entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Redacao getEntidade() {
		return entidade;
	}

	public void setEntidade(Redacao entidade) {
		this.entidade = entidade;
	}

	public Collection<Redacao> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Redacao> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		File f = new File("c:/Users/Aluno/"+file.getFileName());
		try {
			FileOutputStream fos = new FileOutputStream(f);
			int b;
			while((b =file.getInputstream().read()) >= 0) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	protected Redacao newEntidade() {
		return new Redacao();
	}

	public RedacaoService getService() {
		return service;
	}
}
