
package lista_exercicios_09;

import java.util.Scanner;


public class ex_01 {
    static Scanner input = new Scanner(System.in);
    
    public static int soma(int x, int y){
        return x + y;
    }

    public static int subtracao(int x, int y){
        return x - y;
    }
    
    public static int multiplicacao(int x, int y){
        return x * y;
    }
    
    public static int divisao(int x, int y){
        return x / y;
    }
    
    public static void main(String[] args){
        int numero1, numero2;
        
        System.out.print("Usuário, digite o primeiro numero: ");
        numero1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo numero: ");
        numero2 = Integer.valueOf(input.nextLine());

        System.out.println("Soma -> " + soma(numero1, numero2));
        System.out.println("Subtração -> " + subtracao(numero1, numero2));
        System.out.println("Multiplicação -> " + multiplicacao(numero1, numero2));
        System.out.println("Divisão - > " + divisao(numero1, numero2));
    }
    
}
