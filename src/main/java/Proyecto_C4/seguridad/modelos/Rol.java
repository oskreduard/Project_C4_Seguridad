package Proyecto_C4.seguridad.modelos;
        import lombok.Data;
        import org.springframework.data.annotation.Id;
        import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()
public class Rol {
    public Rol(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    @Id
    private String _id;
    private String nombre;
    private String descripcion;


}