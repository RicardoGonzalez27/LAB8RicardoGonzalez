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
public class actividad {
    
    private String nombre;
    private int inicio_temprano;
    private int duracion;
    private int final_temprano;
    private ArrayList<String> predecesoras = new ArrayList();
    private ArrayList<String> sucesoras = new ArrayList();
    private int posibilidad_de_retraso;
    
    public actividad() {
    }
    
    public actividad(String nombre, int inicio_temprano, int duracion, int final_temprano, int posibilidad_de_retraso) {
        this.nombre = nombre;
        this.inicio_temprano = inicio_temprano;
        this.duracion = duracion;
        this.final_temprano = final_temprano;
        this.posibilidad_de_retraso = posibilidad_de_retraso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getInicio_temprano() {
        return inicio_temprano;
    }
    
    public void setInicio_temprano(int inicio_temprano) {
        this.inicio_temprano = inicio_temprano;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int getFinal_temprano() {
        return final_temprano;
    }
    
    public void setFinal_temprano(int final_temprano) {
        this.final_temprano = final_temprano;
    }
    
    public ArrayList<String> getPredecesoras() {
        return predecesoras;
    }
    
    public void setPredecesoras(ArrayList<String> predecesoras) {
        this.predecesoras = predecesoras;
    }
    
    public ArrayList<String> getSucesoras() {
        return sucesoras;
    }
    
    public void setSucesoras(ArrayList<String> sucesoras) {
        this.sucesoras = sucesoras;
    }
    
    public int getPosibilidad_de_retraso() {
        return posibilidad_de_retraso;
    }
    
    public void setPosibilidad_de_retraso(int posibilidad_de_retraso) {
        this.posibilidad_de_retraso = posibilidad_de_retraso;
    }
    
    public int calculo_inicio(ArrayList<Proyecto> lista_proyectos, String select, String selecta) {
        int calculo = 1;
        int prede = 0;
        
        for (int i = 0; i < lista_proyectos.size(); i++) {
            
            if (lista_proyectos.get(i).getNombre().equals(select)) {
                
                for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                    if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selecta)) {
                        
                        for (int k = 0; k < lista_proyectos.get(i).getActividades().get(j).getPredecesoras().size(); k++) {
                            
                            
                            String selectc = lista_proyectos.get(i).getActividades().get(j).getPredecesoras().get(k);
                            
                            for (int l = 0; l < lista_proyectos.get(i).getActividades().size(); l++) {
                            
                                if (lista_proyectos.get(i).getActividades().get(l).getNombre().equals(selectc)) {
                                
                                    int newnum = lista_proyectos.get(i).getActividades().get(l).getFinal_temprano();
                                    
                                    if (prede < newnum) {
                                        prede = newnum;
                                    }
                                }
                            }
                            
                        }
                        
                    }
                }
            }
        }
        calculo = calculo + prede;
        return calculo;
    }
    
    public int calculo_final(ArrayList<Proyecto> lista_proyectos, String select, String selecta) {
        int calculo = 1;
        int prede = 0;
        for (int i = 0; i < lista_proyectos.size(); i++) {
            if (lista_proyectos.get(i).getNombre().equals(select)) {
                
                for (int j = 0; j < lista_proyectos.get(i).getActividades().size(); j++) {
                    if (lista_proyectos.get(i).getActividades().get(j).getNombre().equals(selecta)) {
                        
                        for (int k = 0; k < lista_proyectos.get(i).getActividades().get(j).getPredecesoras().size(); k++) {
                            String selectc = lista_proyectos.get(i).getActividades().get(j).getPredecesoras().get(k);
                            for (int l = 0; l < lista_proyectos.get(i).getActividades().size(); l++) {
                                if (lista_proyectos.get(i).getActividades().get(l).getNombre().equals(selectc)) {
                                    int newnum = lista_proyectos.get(i).getActividades().get(l).getFinal_temprano();
                                    if (prede < newnum) {
                                        prede = newnum;
                                    }
                                }
                            }
                            
                        }
                        
                    }
                }
            }
        }
        calculo = calculo + prede + duracion;
        return calculo;
    }
    
    @Override
    public String toString() {
        return "actividad{" + "nombre=" + nombre + ", inicio_temprano=" + inicio_temprano + ", duracion=" + duracion + ", final_temprano=" + final_temprano + ", predecesoras=" + predecesoras + ", sucesoras=" + sucesoras + ", posibilidad_de_retraso=" + posibilidad_de_retraso + '}';
    }
    
}
