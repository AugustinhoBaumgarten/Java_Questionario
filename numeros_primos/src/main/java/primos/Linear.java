package primos;

import java.util.ArrayList;
import java.util.List;

public class Linear {
    //encontra os numeros primos até n
    public List<Integer> calcular(int n){
        List<Integer> primos = new ArrayList<>();
        
        for(int cont = 2; cont <= n; cont++){
            if(verificPrimo(cont)){
                primos.add(cont);
            }
        }
        return primos;
    }   
    private boolean verificPrimo(int num){
        if (num < 2) return false;
        for (int cont = 2; cont <= Math.sqrt(num); cont++){
            if (num % cont == 0){
                return false;
        }
    }
        return true;
    }
}