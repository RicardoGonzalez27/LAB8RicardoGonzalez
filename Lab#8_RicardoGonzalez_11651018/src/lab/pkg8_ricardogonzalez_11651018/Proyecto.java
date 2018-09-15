/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_ricardogonzalez_11651018;

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class Proyecto {
    
    private String nombre;
    private int duracion;
    private ArrayList <actividad> actividades = new ArrayList();

    public Proyecto() {
    }
    
    

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<actividad> actividades) {
        this.actividades = actividades;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion=" + duracion + ", actividades=" + actividades + '}';
    }
    
    

    
    
    
    
    
    
}
