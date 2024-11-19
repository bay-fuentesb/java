
package Controller;

import Bd.Conexion;
import Models.Libro;

import java.util.ArrayList;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class LibroController {
    Conexion cx;
    
    
    
    public LibroController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Libro> obtenerLibro(){
        List<Libro> libros = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM libro");
            while(rs.next()){
                libros.add(new Libro){
                    rs.getInt("idLibro");
                    rs.getString("titulo");
                    rs.getInt("idCategoria");
            }}
            
        } catch (Exception e) {
        }
        return libros;
    }
    
    
    
    
}
