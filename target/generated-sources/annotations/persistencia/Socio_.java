package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Fecha_Compra;
import persistencia.Fecha_Registro;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-21T03:00:10")
@StaticMetamodel(Socio.class)
public class Socio_ extends Usuario_ {

    public static volatile SetAttribute<Socio, Fecha_Compra> cupon;
    public static volatile SetAttribute<Socio, Fecha_Registro> anotado;

}