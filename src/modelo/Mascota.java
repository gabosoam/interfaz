/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import interfaz.Crudable;
import java.util.List;
import persistencia.PerMascota;

/**
 *
 * @author gabriel
 */
public class Mascota implements Crudable{
    
    private int id;
    private int nombre;
    
    PerMascota permascota = new PerMascota();

    public Mascota() {
    }

    public Mascota(int id, int nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean crear(Object objeto) {
        return permascota.crear((Mascota) objeto);
    }
    

     @Override
    public boolean editar(int indice, Object objeto) {
        return permascota.editar(indice, (Mascota) objeto);
    }

    @Override
    public boolean eliminar(int indice) {
        return permascota.eliminar(indice);
    }

    @Override
    public List poblar() {
        return permascota.poblar();
    }

    
    
    
}
