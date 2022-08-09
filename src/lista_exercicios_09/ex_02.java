
package lista_exercicios_09;

import java.util.Scanner;


public class ex_02 {
    static Scanner input = new Scanner(System.in);
    
    public static void comparaMaior(float x, float y){
        if(x > y){
            System.out.println("O primeiro numero é o maior.");
        }else{
            System.out.println("O segundo numero é o maior.");
        }
    }
    
    
    public static void main(String[] args){
        
        float numero1, numero2;
        
        System.out.print("Digite o primeiro numero: ");
        numero1 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo numero: ");
        numero2 = Float.valueOf(input.nextLine());
        
        comparaMaior(numero1, numero2);
        
    }
    
}
