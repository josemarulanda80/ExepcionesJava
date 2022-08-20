/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas.excepcioens;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class PruebasExcepcioens {

    /**
     * @param args the command line arguments
     */
    public void operaciones(){
        int num1 =5, num2=0;
        int resultado=num1/num2;
        System.out.println(resultado);
    }
    public void operaciones2(){
        try{
            operaciones();
        }catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null,"Error al dividir un numero entero entre cero");
            
        }
        
 
        System.out.println("Programa terminado");
    }
    public static void main(String[] args) {
        PruebasExcepcioens prueba = new PruebasExcepcioens();
        prueba.operaciones2();
    }
    
}
