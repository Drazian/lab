package DataTypes;

import java.time.LocalDate;

/**
 *
 * @author henry
 */
public class DataClase {
    private String nombre;
    private LocalDate fecha;
    private int hora_ini;
    private int registrados_min;
    private int registrados_max;
    private String url;
    private LocalDate fecha_reg;
DataClase(String nombre,LocalDate fecha,int hora_ini,int registrados_min,int registrados_max,String url,LocalDate fecha_reg){
    this.nombre=nombre;
    this.fecha=fecha;
    this.hora_ini=hora_ini;
    this.registrados_min=registrados_min;
    this.registrados_max=registrados_max;
    this.url=url;
    this.fecha_reg=fecha_reg;

};
public String getnombre(){
    return nombre;
};
public LocalDate getfecha(){
    return fecha;
};
  
public int gethora_ini(){
    return hora_ini;
};
public int getregistrados_min(){
    return registrados_min;
};
public int getregistrados_max(){
    return registrados_max;
};
public String geturl(){
    return url;
};
public LocalDate getfecha_reg(){
    return fecha_reg;
};

};