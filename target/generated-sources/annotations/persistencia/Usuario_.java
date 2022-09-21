package persistencia;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> mail;
    public static volatile SingularAttribute<Usuario, String> foto;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, LocalDate> fechanac;
    public static volatile SingularAttribute<Usuario, String> nickname;
    public static volatile SingularAttribute<Usuario, String> nombre;

}