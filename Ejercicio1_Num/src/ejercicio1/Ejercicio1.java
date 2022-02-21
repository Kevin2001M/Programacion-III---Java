/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.*;
import Pojos.Numeros;
import Beans.ClsNumeros;
/**
 *
 * @author Vkaiido
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeros num = new Numeros();
        ClsNumeros clsNum = new ClsNumeros();
        
        Scanner sr = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num.setNumuno(sr.nextLine());
        System.out.print("Ingrese otro numero: ");
        num.setNumdos(sr.nextLine());
        
        int numero1 = clsNum.Numero1(num);
        int numero2 = clsNum.Numero2(num);
        
        switch (numero1) {
            case 1:
                System.out.println("El primer numero es positivo");
                break;
            case 2:
                System.out.println("El primer numero es negativo");
                break;
            default:
                System.out.println("El primer numero es cero");
                break;
        }
        
        switch (numero2) {
            case 1:
              System.out.println("El segundo numero es positivo");
                break;
            case 2:
                System.out.println("El segundo numero es negativo");
                break;
            default:
                System.out.println("El segundo numero es cero");
                break;
        }
    }
    
}
