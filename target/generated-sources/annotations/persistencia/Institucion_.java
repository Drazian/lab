package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Actividad;
import persistencia.Profesor;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Institucion.class)
public class Institucion_ { 

    public static volatile SingularAttribute<Institucion, String> descripcion;
    public static volatile SetAttribute<Institucion, Actividad> act;
    public static volatile SingularAttribute<Institucion, String> nombre;
    public static volatile SetAttribute<Institucion, Profesor> prof;
    public static volatile SingularAttribute<Institucion, String> url;

}