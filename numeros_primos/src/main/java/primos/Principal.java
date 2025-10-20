package primos;

import java.util.Scanner;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        int n;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro meior que 1: ");
        
        while(true){
            n = ler.nextInt();
            if(n <= 1){
                System.out.println("ERRO!");
                System.out.println("Digite um núemro maior que 1: ");
            }else{
                break;
            }
        }
        
        Linear lin = new Linear();
        Recursivo rec = new Recursivo();
        
        List<Integer> resposta = lin.calcular(n);
        List<Integer> respostaRec = rec.calcular(n);
        
        System.out.println("Números primos(Linear) até " + n + ": " + resposta);
        System.out.println("Números primos(Recursivos) até " + n + ": " + respostaRec);

        
        ler.close();
    }
}
