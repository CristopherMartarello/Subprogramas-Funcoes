
package lista_exercicios_09;

import java.util.Scanner;


public class ex_08 {
    static Scanner input = new Scanner(System.in);
    
    public static float lerValor(){
        float valorVenda = 0;
        System.out.println("Digite o valor da venda: ");
        valorVenda = Float.valueOf(input.nextLine());
        return valorVenda;
    }
    
    public static String tipoVenda(){
        String tipoVenda = "";
        System.out.println("Agora, informe o tipo que a venda foi efetuada: ");
        tipoVenda = input.nextLine();
        
        while(!(tipoVenda.equalsIgnoreCase("A vista") || tipoVenda.equalsIgnoreCase("A prazo 30") || tipoVenda.equalsIgnoreCase("A prazo 60") || tipoVenda.equalsIgnoreCase("A prazo 90") || 
                tipoVenda.equalsIgnoreCase("Debito") || tipoVenda.equalsIgnoreCase("Credito"))){
            
            System.out.println("ERRO! Informe uma opção válida.");
            System.out.println("Agora, informe o tipo que a venda foi efetuada: ");
            tipoVenda = input.nextLine();
        }
        
        return tipoVenda;
    }
    
    public static float novoValor(float valorVenda, String tipoVenda){
        float novoValor;
        if(tipoVenda.equalsIgnoreCase("A vista")){
            novoValor = valorVenda - (valorVenda * 0.1f);
        }else if(tipoVenda.equalsIgnoreCase("A prazo 30")){
            novoValor = valorVenda - (valorVenda * 0.05f);
        }else if(tipoVenda.equalsIgnoreCase("A prazo 60")){
            novoValor = valorVenda;
        }else if(tipoVenda.equalsIgnoreCase("A prazo 90")){
            novoValor = valorVenda + (valorVenda * 0.05f);
        }else if(tipoVenda.equalsIgnoreCase("Debito")){
            novoValor = valorVenda - (valorVenda * 0.07f);
        }else{
            novoValor = valorVenda - (valorVenda * 0.05f);
        }
        return novoValor;
    }
    
    public static void main(String[] args) {
        float valorVenda = lerValor();
        String tipoVenda = tipoVenda();
        
        System.out.println("VALOR FINAL DA VENDA: " + novoValor(valorVenda, tipoVenda) + " reais.");
    }
    
}
