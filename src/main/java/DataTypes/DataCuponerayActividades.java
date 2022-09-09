/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import java.time.LocalDate;
import java.util.HashSet;
import persistencia.Clase;

/**
 *
 * @author henry
 */
public class DataCuponerayActividades {
    private String nombre;
    private String descripcion;
    private LocalDate fecha_ini;
    private LocalDate fecha_fin;
    private int descuento;
    private HashSet<DataActividadDeportiva>actividades;
    private HashSet<Integer>cantidades;
    DataCuponerayActividades(String nombre,String descripcion,LocalDate fecha_ini,LocalDate fecha_fin,int descuento,HashSet<DataActividadDeportiva>actividades,HashSet<Integer>cantidades){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.fecha_ini=fecha_ini;
        this.fecha_fin=fecha_fin;
        this.descuento=descuento;
        this.actividades=actividades;
        this.cantidades=cantidades;
    };  
    public String getnombre(){
          return nombre;
    }
    public String getdescripcion(){
          return descripcion;
    }
    public LocalDate getfecha_ini(){
          return fecha_ini;
    }
    public LocalDate getfecha_fin(){
          return fecha_fin;
    };
    public int getdescuento(){
        return descuento;
    }
    
    public HashSet<DataActividadDeportiva> getactividades(){
        return actividades;
    }    
    public HashSet<Integer> getacantidades(){
        return cantidades;
    }    
    
}
