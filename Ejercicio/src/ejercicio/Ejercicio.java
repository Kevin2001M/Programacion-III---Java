/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import Beans.Acceso;
import Pojos.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante es = new Estudiante();
        Acceso ac = new Acceso();
        
        //Scanner sc = new Scanner(System.in);
        es.setNombre("Kevin");
        es.setPassword("123");
        var logica = ac.Acess(es);
        
        
        if (logica == 0){
            System.out.println("Inicio Correcto");
        } else {
            System.out.println("Inicio Incorrecto");
        }
    }
    
}
