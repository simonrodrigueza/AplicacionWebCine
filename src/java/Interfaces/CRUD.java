
package Interfaces;

import Modelo.Pelicula;
import java.util.List;


public interface CRUD {
    public List listar();
    public Pelicula list(int id);
    public boolean add(Pelicula per);
    public boolean edit(Pelicula per);
    public boolean eliminar(int id);
}
