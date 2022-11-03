package Proyecto_C4.seguridad.repositorios;
        import Proyecto_C4.seguridad.modelos.Rol;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends
        MongoRepository<Rol,String> {
}
