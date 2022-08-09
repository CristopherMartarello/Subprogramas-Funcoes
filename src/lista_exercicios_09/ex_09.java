
package lista_exercicios_09;

import java.util.Scanner;


public class ex_09{
    static Scanner input = new Scanner(System.in);
    
    public static int[] lerVetor(){
        int[] vetorX = new int[10];
        for(int i = 0; i < vetorX.length ; i++) {
            System.out.print("Digite o número na posição ["+i+"]: ");
            vetorX[i] = Integer.valueOf(input.nextLine());
        }
        return vetorX;
    }
    
    public static int[] calcularSomaVetores(int[] vetorX, int[] vetorY){
        int[] vetorC = new int[10];
        for(int i = 0; i < vetorY.length; i++) {
            vetorC[i] = vetorX[i] + vetorY[i];
        }
        return vetorC;
    }
    
    public static int[] imprimeSomaVetores(int[] vetorC){
        for(int i = 0; i < vetorC.length; i++) {
            System.out.println("["+i+"]: " + vetorC[i]);
            
        }
        return vetorC;
    }
    
    public static void main(String[] args){
        
        int[] vetorA = lerVetor();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] vetorB = lerVetor();
        
        int[] vetorC = calcularSomaVetores(vetorA, vetorB);
        
        imprimeSomaVetores(vetorC);

    }
    
}
