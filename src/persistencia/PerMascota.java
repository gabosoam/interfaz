/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import modelo.Mascota;

/**
 *
 * @author gabriel
 */
public class PerMascota {
    
    public static List<Mascota> listaMascotas = new ArrayList<Mascota>();
    
    public boolean crear(Mascota mascota){
    listaMascotas.add(mascota);
    return true;
    }
    
    public boolean editar(int indice,Mascota mascota){
    listaMascotas.set(indice, mascota);
    return true;
    }
    
    public boolean eliminar(int indice){
    listaMascotas.remove(indice);
    return true;
    }
    
    public List  poblar(){
    return listaMascotas;
    }
    
}
