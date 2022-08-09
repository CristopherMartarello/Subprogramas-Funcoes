
package lista_exercicios_09;

import java.util.Scanner;


public class ex_10 {
    static Scanner input = new Scanner(System.in);
    
    public static char[] lerSexo(int entrevistados){
        char[] sexo = new char[entrevistados];
        for(int i = 0; i < entrevistados; i++) {
            System.out.print("Digite o sexo da pessoa "+i+": ");
            sexo[i] = input.nextLine().charAt(0);
            while(!(sexo[i] == 'M' || sexo[i] == 'm' || sexo[i] == 'f' || sexo[i] == 'F')){
                System.out.print("Informe um gênero correto!: ");
                sexo[i] = input.nextLine().charAt(0);
            }
        }
        return sexo;
    }
    
    public static int[] lerIdade(int entrevistados) {
        int[] idade = new int[entrevistados];
        for(int i = 0; i < entrevistados; i++) {
            System.out.print("Digite a idade da pessoa "+i+": ");
            idade[i] = Integer.valueOf(input.nextLine());
            while(!(idade[i] >= 18 && idade[i] <= 65)){
                System.out.print("Digite uma idade entre 18 e 65: ");
                idade[i] = Integer.valueOf(input.nextLine());
            }
        }
        return idade;
    }
    
    public static float[] lerSalario(int entrevistados) {
        float[] salario = new float[entrevistados];
        for(int i = 0; i < entrevistados; i++) {
            System.out.print("Digite o salário da pessoa "+i+": ");
            salario[i] = Float.valueOf(input.nextLine());
            while(!(salario[i] >= 1000f && salario[i] <= 20000f)){
                System.out.print("Digite um salário correto!: ");
                salario[i] = Float.valueOf(input.nextLine());
            }
        }
        return salario;
    }
    
    public static float mediaSalarialGrupo(float[] salario, int entrevistados){
        float mediaSalarios, somaSalarios = 0;
        for(int i = 0; i < entrevistados; i++){
            somaSalarios = somaSalarios + salario[i];
        }
        return mediaSalarios = somaSalarios / entrevistados;
    }
    
    public static int menorIdade(int[] idade, int entrevistados){
        int menorIdade = Integer.MAX_VALUE;
        for(int i = 0; i < entrevistados; i++) {
            if(idade[i] < menorIdade){
                menorIdade = idade[i]; 
            }
        }
        return menorIdade;
    }
    
    public static int maiorIdade(int[] idade, int entrevistados){
        int maiorIdade = Integer.MIN_VALUE;
        for(int i = 0; i < entrevistados; i++) {
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
            }
        }
        return maiorIdade;
    }
    
    public static int quantidadeMulheresAcimaMedia(float[] salario, char[] sexo, float mediaSalarialGrupo,int entrevistados){
        int contMulheresAcima = 0;
        for(int i = 0; i < entrevistados; i++) {
            if((sexo[i] == 'f' || sexo[i] == 'F') && salario[i] > mediaSalarialGrupo){
                contMulheresAcima++;
            }
            
        }
        return contMulheresAcima;
    }
    
    
    public static void main(String[] args){
        
        System.out.print("Informe a quantidade de entrevistados: ");
        int entrevistados = Integer.valueOf(input.nextLine());
        
        char[] sexo = lerSexo(entrevistados);
        int[] idade = lerIdade(entrevistados);
        float[] salario = lerSalario(entrevistados);
        
        float mediaSalarialGrupo = mediaSalarialGrupo(salario, entrevistados);
        System.out.println("A média salarial do grupo é: " + mediaSalarialGrupo);
        System.out.println("A menor idade é: " + menorIdade(idade, entrevistados));
        System.out.println("A maior idade é: " + maiorIdade(idade, entrevistados));
        System.out.println("A quantidade de mulheres com salário acima da média: " + quantidadeMulheresAcimaMedia(salario, sexo, mediaSalarialGrupo,entrevistados));
        
        
        
        
        
    }
    
}
