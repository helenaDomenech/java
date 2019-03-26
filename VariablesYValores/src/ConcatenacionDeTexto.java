/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elenacabello
 */
public class ConcatenacionDeTexto {
    public static void main(String args[]) {
        String primerTexto = "Primer valor";        
        String segundoTexto = "Segundo Valor";
        String textoCompleto = primerTexto + " " + segundoTexto;
        
        int numero = 35;
        int nuevoNumero = 10;
        
        System.out.println(textoCompleto);        
        System.out.println(segundoTexto);
        
        //si se le ponen las comillas de string delante, concatena como string
        System.out.println("" + numero + nuevoNumero);   
        
         //Aquí hará la suma
        System.out.println(numero + nuevoNumero);


    }
    
}
