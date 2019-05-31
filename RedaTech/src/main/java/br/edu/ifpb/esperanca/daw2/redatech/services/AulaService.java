package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.AulaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aula;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class AulaService implements Serializable, Service<Aula> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AulaDAO aulaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Aula aula) {
		aulaDAO.save(aula);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Aula aula)  {
			aulaDAO.update(aula);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Aula aula) {
		aulaDAO.remove(aula);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Aula getByID(long aulaId)  {
			return aulaDAO.getByID(aulaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Aula> getAll() {
			return aulaDAO.getAll();
	}

}
