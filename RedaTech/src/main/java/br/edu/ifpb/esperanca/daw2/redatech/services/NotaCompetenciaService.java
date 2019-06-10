package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.NotaCompetenciaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.NotaCompetencia;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class NotaCompetenciaService implements Serializable, Service<NotaCompetencia>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private NotaCompetenciaDAO notacompetenciaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(NotaCompetencia user) {
		notacompetenciaDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(NotaCompetencia user)  {
		notacompetenciaDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(NotaCompetencia user) {
		notacompetenciaDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public NotaCompetencia getByID(long comeId)  {
			return notacompetenciaDAO.getByID(comeId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<NotaCompetencia> getAll() {
			return notacompetenciaDAO.getAll();
	}


}
