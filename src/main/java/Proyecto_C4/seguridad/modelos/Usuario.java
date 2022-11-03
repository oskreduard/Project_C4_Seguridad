package Proyecto_C4.seguridad.modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
@Data
@Document()
public class Usuario {
    public Usuario(String seudonimo, String correo, String contrasena) {
        this.seudonimo = seudonimo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Id
    private String _id;
    private String seudonimo;
    private String correo;
    private String contrasena;
    @DBRef
    private Rol rol;

}
