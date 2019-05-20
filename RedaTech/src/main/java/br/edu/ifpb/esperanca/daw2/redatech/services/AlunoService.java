package br.edu.ifpb.esperanca.daw2.redatech.services;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.AlunoDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

@ApplicationScoped
public class AlunoService implements Serializable, Service<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AlunoDAO alunoDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Aluno user) {
		alunoDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Aluno user)  {
			alunoDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Aluno user) {
		alunoDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Aluno getByID(long userId)  {
			return alunoDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Aluno> getAll() {
			return alunoDAO.getAll();
	}
		
}
