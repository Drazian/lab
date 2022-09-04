package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Clase;
import persistencia.Institucion;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-03T16:08:57")
@StaticMetamodel(Profesor.class)
public class Profesor_ extends Usuario_ {

    public static volatile SingularAttribute<Profesor, String> descripcion;
    public static volatile SingularAttribute<Profesor, String> biografia;
    public static volatile SingularAttribute<Profesor, String> sitio_web;
    public static volatile SetAttribute<Profesor, Clase> cls;
    public static volatile SingularAttribute<Profesor, Institucion> ins;

}