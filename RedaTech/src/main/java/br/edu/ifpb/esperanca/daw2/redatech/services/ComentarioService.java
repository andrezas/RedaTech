package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.ComentarioDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Comentario;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class ComentarioService implements Serializable, Service<Comentario>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ComentarioDAO comentarioDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Comentario user) {
		comentarioDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Comentario user)  {
		comentarioDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Comentario user) {
		comentarioDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Comentario getByID(long comeId)  {
			return comentarioDAO.getByID(comeId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Comentario> getAll() {
			return comentarioDAO.getAll();
	}

}
