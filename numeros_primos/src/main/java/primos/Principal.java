package primos;

import java.util.Scanner;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        int n;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("-".repeat(90));
        System.out.print("Digite um número inteiro meior que 1: ");

        
        //validar o input
        while(true){
            n = ler.nextInt();
            if(n <= 1){
                System.out.println("ERRO!");
                System.out.println("Digite um número maior que 1: ");

            }else{
                break;//sai do while
            }
        }
        
        //criação dos objetos das classes  Linear e Recursivo
        Linear lin = new Linear();
        Recursivo rec = new Recursivo();
        
        List<Integer> resposta = lin.metodoCalc(n);
        List<Integer> respostaRec = rec.metodoCalc(n);
        
        System.out.println("(Linear) P(" + n + "): " + resposta);
        System.out.println("(Recursivos) P(" + n + "): " + respostaRec);

        
        ler.close();
    }
}
