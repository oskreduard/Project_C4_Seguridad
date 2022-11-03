package Proyecto_C4.seguridad.repositorios;
import Proyecto_C4.seguridad.modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
