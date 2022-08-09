
package lista_exercicios_09;

import java.util.Scanner;


public class ex_03 {
    static Scanner input = new Scanner(System.in);
    
    public static int comparaVogal(String vogal){
        vogal = vogal.toUpperCase();
        if(vogal.equalsIgnoreCase("A") || vogal.equalsIgnoreCase("E") || vogal.equalsIgnoreCase("I") || vogal.equalsIgnoreCase("O") || vogal.equalsIgnoreCase("U")){
            return 0;
        }else{
            return 1;
        }
    }
    
    
    public static void main(String[] args) {
        String caractere = "";
        
        System.out.print("Digite um caractere: ");
        caractere = input.nextLine();
        
        System.out.println("VOGAL = 0, CONSOANTE = 1   ->   " + comparaVogal(caractere));
    }
    
}
