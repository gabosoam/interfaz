/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.List;

/**
 *
 * @author gabriel
 */
public interface Crudable {
    
    public boolean crear(Object objeto);
    public boolean editar(int indice, Object object);
    public boolean eliminar(int indice);
    public List poblar();
    
}
