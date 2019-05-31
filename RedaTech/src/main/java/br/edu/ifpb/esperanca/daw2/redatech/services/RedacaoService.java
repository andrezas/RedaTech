package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.ProfessorDAO;
import br.edu.ifpb.esperanca.daw2.redatech.dao.RedacaoDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Redacao;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class RedacaoService  implements Serializable, Service<Redacao>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private RedacaoDAO redacaoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Redacao reda) {
		redacaoDAO.save(reda);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Redacao reda)  {
		redacaoDAO.update(reda);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Redacao reda) {
		redacaoDAO.remove(reda);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Redacao getByID(long redaId)  {
			return redacaoDAO.getByID(redaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Redacao> getAll() {
			return redacaoDAO.getAll();
	}

}
	

