package persistencia;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Clase;
import persistencia.Clases_contenidas;
import persistencia.Institucion;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, String> descripcion;
    public static volatile SingularAttribute<Actividad, Integer> costo;
    public static volatile SetAttribute<Actividad, Clases_contenidas> asociadas;
    public static volatile SingularAttribute<Actividad, Integer> duracion;
    public static volatile MapAttribute<Actividad, String, Clase> cls;
    public static volatile SingularAttribute<Actividad, String> nombre;
    public static volatile SingularAttribute<Actividad, LocalDate> fecha_reg;
    public static volatile SingularAttribute<Actividad, Institucion> ins;

}