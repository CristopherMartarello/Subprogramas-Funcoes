
package lista_exercicios_09;

import java.util.Scanner;


public class ex_05 {
    static Scanner input = new Scanner(System.in);
    
    public static float conversaoFparaC(float farenheit){
        float celsius;
        celsius = (float) ((farenheit - 32.0) * (5.0/9.0));
        return celsius;
    }
    
    public static float lerTemperatura(){
        float farenheit;
        System.out.print("Digite a temperatura em farenheit: ");
        farenheit = Float.valueOf(input.nextLine());
        return farenheit;
    }
    
    
    public static void main(String[] args) {
        float farenheit = lerTemperatura();
        
        conversaoFparaC(farenheit);
        System.out.println("A conversão de " + farenheit + " F é " + conversaoFparaC(farenheit) + "°C.");
        
    }
    
}
