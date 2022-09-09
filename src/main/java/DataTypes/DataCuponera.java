/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click  nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import java.time.LocalDate;

/**
 *
 * @author henry
 */
public class DataCuponera {
    private String nombre; 
    private String descripcion;
    private LocalDate fecha_ini;
    private LocalDate fecha_fin;
    private int  descuento;
    DataCuponera(String nombre,String descripcion,LocalDate fecha_ini,LocalDate fecha_fin,int  descuento){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.fecha_ini=fecha_ini;
        this.fecha_fin=fecha_fin;
        this.descuento=descuento;
    }; 
    public String getnombre(){
        return nombre;
    };
    public String getdescripcion(){
        return descripcion;
    };
    public LocalDate getfecha_ini(){
        return  fecha_ini;
    };
    public LocalDate getfecha_fin(){
        return  fecha_fin;
    };
    public int getdescuento(){
        return  descuento;
    };
 
    
    
    
}
