package persistencia;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Clases_contenidas;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Cuponera.class)
public class Cuponera_ { 

    public static volatile SingularAttribute<Cuponera, String> descripcion;
    public static volatile SingularAttribute<Cuponera, Integer> descuento;
    public static volatile SingularAttribute<Cuponera, LocalDate> fecha_fin;
    public static volatile SetAttribute<Cuponera, Clases_contenidas> cont;
    public static volatile SingularAttribute<Cuponera, String> nombre;
    public static volatile SingularAttribute<Cuponera, LocalDate> fecha_ini;

}