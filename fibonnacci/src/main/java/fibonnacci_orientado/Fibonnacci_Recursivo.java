package fibonnacci_orientado;

public class Fibonnacci_Recursivo {
	//Método recursivo
	public int fibRec(int n) {
		if(n == 0) {     //condicional e caso base para ter fim no programa
			return 0;
		}else if (n == 1 ) {
			return 1;
		}else {
			return fibRec(n-1) + fibRec(n-2); //retorna a recurção 
		}
		
	}
}
