/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Estudiante;
import com.kevin.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Kevin
 */
public class Estudiantes {
    
    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
    
    public ArrayList <Estudiante> ListadoEstudiantes(){
          ArrayList<Estudiante> Listado = null;
         
        try {
            Listado = new ArrayList<Estudiante>();
             
            CallableStatement cb = conexion.prepareCall("select * from estudiante");
            ResultSet resultado = cb.executeQuery();
            
            
            while (resultado.next()){
                //Llamar a el objeto de entidades
                Estudiante es = new Estudiante();
                es.getNombre(resultado.getString("Nombre"));
                es.getApellido(resultado.getString("Apellido"));
                Listado.add(es);
            }
                    
        } catch (Exception e) {
        }      
        return Listado;
    }
    
    public void AddEstudiante(Estudiante es){
        try{
        CallableStatement cb = conexion.prepareCall("insert into "
        + "estudiante (nombre, Apellido) values('"+es.getNombre()+"','"+es.getApellido()+"')");
        
        cb.execute();
         JOptionPane.showMessageDialog(null, "Insertado");
        }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error");
        }
     
        
    }
    
    
    
    }

