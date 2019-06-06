package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.CompetenciaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Competencia;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

@ApplicationScoped
public class CompetenciaService implements Serializable, Service<Competencia> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private CompetenciaDAO CompetenciaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Competencia com) {
		CompetenciaDAO.save(com);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Competencia com)  {
			CompetenciaDAO.update(com);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Competencia com) {
		CompetenciaDAO.remove(com);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Competencia getByID(long comId)  {
			return CompetenciaDAO.getByID(comId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Competencia> getAll() {
			return CompetenciaDAO.getAll();
	}
}
