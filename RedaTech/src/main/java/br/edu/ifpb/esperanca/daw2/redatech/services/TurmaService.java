package br.edu.ifpb.esperanca.daw2.redatech.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.redatech.dao.TurmaDAO;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Turma;
import br.edu.ifpb.esperanca.daw2.redatech.util.TransacionalCdi;

public class TurmaService implements Serializable, Service<Turma> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private TurmaDAO turmaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services
	 * .Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Turma turma) {
		turmaDAO.save(turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Turma turma)  {
			turmaDAO.update(turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Turma turma) {
		turmaDAO.remove(turma);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Turma getByID(long turmaId)  {
			return turmaDAO.getByID(turmaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Turma> getAll() {
			return turmaDAO.getAll();
	}
	
	public List<Turma> turmasDoAluno(Aluno aluno){
		return turmaDAO.turmasDoAluno(aluno);
	}

}