package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.ProfessorDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Professor;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

@ApplicationScoped
public class ProfessorService implements Serializable, Service<Professor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ProfessorDAO professorDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Professor prof) {
		professorDAO.save(prof);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Professor prof)  {
			professorDAO.update(prof);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Professor prof) {
		professorDAO.remove(prof);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Professor getByID(long profId)  {
			return professorDAO.getByID(profId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Professor> getAll() {
			return professorDAO.getAll();
	}

}
