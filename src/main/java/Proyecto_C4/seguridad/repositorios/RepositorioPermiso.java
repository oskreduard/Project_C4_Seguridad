package Proyecto_C4.seguridad.repositorios;
import Proyecto_C4.seguridad.modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends
        MongoRepository<Permiso,String> {
}
