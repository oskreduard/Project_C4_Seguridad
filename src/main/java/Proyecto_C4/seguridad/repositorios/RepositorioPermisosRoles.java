package Proyecto_C4.seguridad.repositorios;
import Proyecto_C4.seguridad.modelos.Permiso;
import Proyecto_C4.seguridad.modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
