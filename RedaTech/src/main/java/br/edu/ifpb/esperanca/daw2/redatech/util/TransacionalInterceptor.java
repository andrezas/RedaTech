package br.edu.ifpb.esperanca.daw2.redatech.util;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Interceptor
@TransacionalCdi
public class TransacionalInterceptor {

	@Inject
	private EntityManager em;

	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {

		Object resultado = null;

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		try {
			resultado = ctx.proceed();
			transaction.commit();
		} catch (Exception pe) {
			pe.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw pe;
		}

		return resultado;
	}

}
