package persistencia;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Actividad;
import persistencia.Profesor;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Clase.class)
public class Clase_ { 

    public static volatile SingularAttribute<Clase, Actividad> act;
    public static volatile SingularAttribute<Clase, Integer> regitrados_min;
    public static volatile SingularAttribute<Clase, Integer> regitrados_max;
    public static volatile SingularAttribute<Clase, LocalDate> fecha_dict;
    public static volatile SingularAttribute<Clase, LocalTime> hora_dict;
    public static volatile SingularAttribute<Clase, String> nombre;
    public static volatile SingularAttribute<Clase, LocalDate> fecha_reg;
    public static volatile SingularAttribute<Clase, Profesor> prof;
    public static volatile SingularAttribute<Clase, String> url;
    public static volatile SingularAttribute<Clase, Integer> cantRegistrados;

}