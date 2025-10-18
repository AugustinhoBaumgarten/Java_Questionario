package fibonnacci_orientado;

public class Fibonnacci_Linear {
	//método linear
	public int fibLin(int n) {       
		if(n == 0){     //condicional e caso base para finalizar
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			int a = 0, b = 1, result = 0;   // criação das variáveis
			System.out.println("fib(0) = " + a);
			System.out.println("fib(1) = " + b);
			for(int cont = 2;cont <= n; cont++) {      //estrutura de repetição
				result = a + b;
				a = b;
				b = result;
				System.out.println("fib(" + cont + ") = " + result);  //imprimindo na tela cada valor, melhora a perspectiva visual
			}
			return result;
		}
	}
}
