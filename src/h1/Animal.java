/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;

/**
 *
 * @author Admin
 */
public class Animal {
    String nombre;
    String especie;
    String nombreCientifico;
    String descripcion;
    String zona;

    public Animal(){
        
    }
    public Animal(String nombre, String especie, String nombreCientifico, String descripcion, String zona) {
        this.nombre = nombre;
        this.especie = especie;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.zona = zona;
    }
    

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
}
