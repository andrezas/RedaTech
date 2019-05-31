package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.NotaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Nota;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class NotaService implements Serializable, Service<Nota>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private NotaDAO notaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Nota user) {
		notaDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Nota user)  {
			notaDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Nota user) {
		notaDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Nota getByID(long notaId)  {
			return notaDAO.getByID(notaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Nota> getAll() {
			return notaDAO.getAll();
	}
	
}
