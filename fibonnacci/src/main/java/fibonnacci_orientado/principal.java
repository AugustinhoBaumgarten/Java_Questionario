
package fibonnacci_orientado;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);  
		int n;
		
		System.out.println("-".repeat(90));
		System.out.print("Digite um número inteiro maior ou igual ao zero: ");


		while(true) {
			n = num.nextInt(); //input do numero n e validação
			if(n < 0) {
				System.out.println("Por favor, digite um número inteiro maior ou igual a zero ");
			}else {          // se número valido 
				System.out.println("Procurando o Fibonnacci de: " + n + "...");
				break;
			}
		}
		Fibonnacci_Recursivo recursivo = new Fibonnacci_Recursivo();  //criando os objetos recursivo e linear das respectivas classes
		Fibonnacci_Linear linear = new Fibonnacci_Linear();
		
		int resultRec = recursivo.fibRec(n);
		int resultLin = linear.fibLin(n);
		
		System.out.println("-".repeat(90));
		System.out.println("Fibonnacci recursivo de " + n + ": " + resultRec); // imprimindo resultado Recursivo
        System.out.println("Fibonnacci linear de " + n + ": " + resultLin); // imprimindo resultado Linear.
		System.out.println("-".repeat(90));
		num.close();
		
		
	}

}
