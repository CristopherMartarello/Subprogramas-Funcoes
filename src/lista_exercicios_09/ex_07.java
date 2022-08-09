
package lista_exercicios_09;

import java.util.Scanner;


public class ex_07{
    static Scanner input = new Scanner(System.in);
    
    public static String lerNome(){
        String nome = "";
        System.out.println("Digite o nome do aluno: ");
        nome = input.nextLine();
        return nome;
    }
    
    public static float lerNota(){
        float nota = 0;
        System.out.println("Informe a nota: ");
        nota = Float.valueOf(input.nextLine());
        return nota;
    }
    
    public static void resultado(float nota, String nome){
        //float opcao = nota;
        if(nota < 50){
            System.out.println(nome + ", sua nota foi " + nota +" e é INSUFICIENTE.");
        }else if(nota < 65 && nota >= 50){
            System.out.println(nome + ", sua nota foi "+ nota +" e é REGULAR.");
        }else if(nota < 85 && nota >= 65){
            System.out.println(nome + ", sua nota foi " + nota + " e é BOM.");
        }else{
            System.out.println(nome + ", sua nota foi " + nota + " e é ÓTIMA.");
        }
    }
    
    public static void main(String[] args) {
        String nome =  lerNome();
        float nota = lerNota();
        
        resultado(nota, nome);
    }
    
}
