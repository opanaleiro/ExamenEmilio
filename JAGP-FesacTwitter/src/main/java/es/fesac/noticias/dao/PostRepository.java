package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.Model.Mensaje;

// Sigue el patrón DAO (Data Access Object)
// Se utiliza para obtener los objetos de la base de datos.
public interface PostRepository 
        extends CrudRepository<Mensaje, Long> {

}
