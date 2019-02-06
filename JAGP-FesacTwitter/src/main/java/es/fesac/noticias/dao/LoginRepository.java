package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;
import es.fesac.noticias.Model.Usuario;

public interface LoginRepository extends CrudRepository<Usuario, Integer> {
	public Usuario findByUsuarioAndPassword(String usuario,String contrasenia);
	
}
