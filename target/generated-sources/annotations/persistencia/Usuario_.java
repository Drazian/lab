package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Fecha;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-04T17:17:53")
@StaticMetamodel(Usuario.class)
 class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> mail;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, Fecha> fechanac;
    public static volatile SingularAttribute<Usuario, String> nickname;
    public static volatile SingularAttribute<Usuario, String> nombre;

}