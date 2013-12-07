package presentation;

import javax.enterprise.inject.Default;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@SessionScoped
public class Login {
	
	@Default Credentials credentials;
	
	
}
