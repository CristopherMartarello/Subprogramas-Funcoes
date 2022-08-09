
package lista_exercicios_09;

import java.util.Scanner;


public class ex_06{
    static Scanner input = new Scanner(System.in);
    
    public static float lerSaldo(){
        float saldo = 0;
        System.out.println("Informe o saldo da conta: ");
        saldo = Float.valueOf(input.nextLine());
        return saldo;
    }
    
    public static float lerTaxaJuros(){
        float taxaJuros = 0;
        System.out.println("Digite a taxa de juros do mês (%): ");
        taxaJuros = Float.valueOf(input.nextLine());
        return taxaJuros;
    }
    
    public static float calculaAjuste(float saldo, float taxaJuros){
        float novoSaldo = 0;
        novoSaldo = saldo - (saldo * taxaJuros/100.00f);
        return novoSaldo;
    }
    
    public static void main(String[] args) {
        float saldo = lerSaldo();
        float taxaJuros = lerTaxaJuros();
        
        System.out.println("O novo saldo é de: " + calculaAjuste(saldo, taxaJuros) + " reais.");
    }
    
}
