
package lista_exercicios_09;

import java.util.Scanner;


public class ex_04 {
    static Scanner input = new Scanner(System.in);
    
    public static int contadorVogais(char[] vetorFrase){
        int contVogais = 0;
        for(int i = 0; i < vetorFrase.length; i++){
            if(vetorFrase[i] == 'A' || vetorFrase[i] == 'E' || vetorFrase[i] == 'I' || vetorFrase[i] == 'O' || vetorFrase[i] == 'U'){
                contVogais++;
            }
        }
        return contVogais;
    }
    
    public static int contadorConsoantes(char[] vetorFrase){
        int contConsoantes = 0;
        for(int i = 0; i < vetorFrase.length; i++){
            if(vetorFrase[i] != 'A' && vetorFrase[i] != 'E' && vetorFrase[i] != 'I' && vetorFrase[i] != 'O' && vetorFrase[i] != 'U'){
                contConsoantes++;
            }
        }
        return contConsoantes;
    }
    
    
    
    public static void main(String[] args){
        String frase = "";
        char[] vetorFrase;
        
        System.out.print("Digite a frase a ser analisada: ");
        frase = input.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        vetorFrase = frase.toCharArray();
        
        System.out.println("TOTAL VOGAIS -> " + contadorVogais(vetorFrase));
        System.out.println("TOTAL CONSOANTES -> " + contadorConsoantes(vetorFrase));
    }
    
}
