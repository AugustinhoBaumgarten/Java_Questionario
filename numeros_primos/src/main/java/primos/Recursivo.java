package primos;

import java.util.List;
import java.util.ArrayList;

public class Recursivo {
    
    
    public List<Integer> metodoCalc(int n){
        if(n < 2) { //validação
            return new ArrayList<>(); 
        }
        List<Integer> primos = metodoCalc(n - 1);
        
        if(VerifPrimo(n)){
            primos.add(n);
        }
        return primos;
    }
    
    //validação se o número n é primo
    private boolean VerifPrimo(int num){
        if (num < 2) return false;
        for(int cont = 2; cont <= Math.sqrt(num); cont++){
            if(num % cont == 0) return false;
        }
        return true;
    }
}
