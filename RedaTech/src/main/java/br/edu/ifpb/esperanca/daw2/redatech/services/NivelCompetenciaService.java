package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.NivelCompetenciaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.NivelCompetencia;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class NivelCompetenciaService implements Serializable, Service<NivelCompetencia>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private NivelCompetenciaDAO nivelcompetenciaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(NivelCompetencia user) {
		nivelcompetenciaDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(NivelCompetencia user)  {
		nivelcompetenciaDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(NivelCompetencia user) {
		nivelcompetenciaDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public NivelCompetencia getByID(long comeId)  {
			return nivelcompetenciaDAO.getByID(comeId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<NivelCompetencia> getAll() {
			return nivelcompetenciaDAO.getAll();
	}


}
