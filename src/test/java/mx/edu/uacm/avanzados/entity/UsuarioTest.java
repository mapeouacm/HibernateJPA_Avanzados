package mx.edu.uacm.avanzados.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
public class UsuarioTest {
	
	private static final Logger log = LogManager.getLogger(UsuarioTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarUsuario() {
		log.debug("Entrando a debeGuardarUsuario");
		Usuario autor = new Usuario();
		autor.setEmail("usuario@uacm.edu.mx");
		autor.setPassword("12345678");
		autor.setCity("CDMX");
		em.persist(autor);
	}
}
