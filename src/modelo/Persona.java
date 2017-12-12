/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import interfaz.Crudable;
import java.util.List;
import persistencia.PerPersona;

/**
 *
 * @author gabriel
 */
public class Persona implements Crudable {

    private int id;
    private String nombre;
    private String direccion;
    
    PerPersona perpersona = new PerPersona();

    public Persona() {
    }

    public Persona(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean crear(Object objeto) {
    
    return perpersona.crear((Persona) objeto);
    
    }

    @Override
    public boolean editar(int indice, Object objeto) {
        return perpersona.editar(indice, (Persona) objeto);
    }

    @Override
    public boolean eliminar(int indice) {
        return perpersona.eliminar(indice);
    }

    @Override
    public List poblar() {
        return perpersona.poblar();
    }

}
