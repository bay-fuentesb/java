/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Categoria;
import Models.Libro;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Cetecom
 */
public class CategoriaController {
    Conexion cx;
    
    
    public CategoriaController() {
        cx = new Conexion();
        cx.conectar();
    }
        
    
    
        public List<Categoria> obtenerLibro(){
        List<Categoria> categorias = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM categoria");
            while(rs.next()){
                categorias.add(new Categoria){
                    rs.getInt("idCategoria");
                    rs.getString("nombre");
            }}
            
        } catch (Exception e) {
        }
        return categorias;
    }
    
}
