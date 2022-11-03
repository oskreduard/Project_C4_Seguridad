package Proyecto_C4.seguridad.modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class PermisosRoles {
    @Id
    private String _id;
    @DBRef
    private Rol rol;
    @DBRef
    private Permiso permiso;
    public PermisosRoles() {
    }

}