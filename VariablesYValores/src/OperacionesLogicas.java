/**
 *
 * @author elenacabello
 * 
 * ! Negación
 * == Comparación de igualdad
 * ¡= Diferencia y no igual
 * > Mayor estricto
 * < Menor estricto
 * >= mayor o igual
 * <= menor o igual
 * && Operación lógica Y
 * || operación lógica or
 * 
 */
public class OperacionesLogicas {
    public static void main(String args[]) {
        int primerNumero = 1;
        int segundoNumero = 2;
        int tercerNumero = 3;
        
        String primerTexto = "Hola";
        String segundoTexto = "Bienvenido";
        
        boolean operacion;
        
        //operacion = (primerNumero + segundoNumero) == tercerNumero;
        operacion = (primerNumero > segundoNumero) || (primerNumero < tercerNumero);
        
        System.out.println(operacion);
    }
    
}
