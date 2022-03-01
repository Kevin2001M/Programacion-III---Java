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
import java.util.ArrayList;


/**
 *
 * @author Kevin
 */
public class Estudiantes {
    
    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
    
    public ArrayList <Estudiante> ListadoEstudiantes(){
          ArrayList<Estudiante> Listado = null;
          //ConexionAMYSQL con = new ConexionAMYSQL();
          //Connection conexion = con.getConecction();
        try {
            Listado = new ArrayList<Estudiante>();
             
            CallableStatement cb = conexion.prepareCall("Select * from Estudiante");
            ResultSet resultado = cb.executeQuery();
            
            
            while (resultado.next()){
                //Llamar a el objeto de entidades
                Estudiante es = new Estudiante();
                es.getNombre(resultado.getString("Nombre"));
                es.getApellido(resultado.getString("Apellido"));
            }
                    
        } catch (Exception e) {
        }      
        return Listado;
    }
    }

