/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author gabriel
 */
public class PerPersona {
    
    public static List<Persona> listaPersonas = new ArrayList<Persona>();
    
    public  boolean crear(Persona persona){
    listaPersonas.add(persona);
    return true;
    }
    
    public boolean editar(int indice,Persona persona){
    listaPersonas.set(indice, persona);
    return true;
    }
    
    public boolean eliminar(int indice){
    listaPersonas.remove(indice);
    return true;
    }
    
    public List  poblar(){

    return listaPersonas;
    }
    
}
