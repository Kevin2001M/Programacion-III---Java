/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;
import Pojos.Numeros;
import Services.INumeros;
/**
 *
 * @author Vkaiido
 */
public class ClsNumeros implements INumeros {

    @Override
    public int Numero1(Numeros num) {
        if (Double.parseDouble(num.getNumuno()) > 0) {
            return 1;
        }else if (Double.parseDouble(num.getNumuno()) < 0){
            return 2;
        }else{
            return 0;
        }
    }

    @Override
    public int Numero2(Numeros num) {
   if (Double.parseDouble(num.getNumdos()) > 0) {
            return 1;
        }else if (Double.parseDouble(num.getNumdos()) < 0){
            return 2;
        }else{
            return 0;
        }
    }
    
    
}
