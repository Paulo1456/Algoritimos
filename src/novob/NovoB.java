

package novob;

import com.sun.org.apache.bcel.internal.generic.RETURN;


public class NovoB {
    
    public static void quadrado(double n) {
        double r = n * n;
        
    }
    
    public static double metade(double a) {
double r = a /2;
          
    return r;
}



 
    public static void main(String[] args) {

        double raiz;
        raiz = Math.sqrt(15);
        System.out.println("A raiz é"+raiz);
       
        quadrado(15);
        
        double result;
        result = metade(15);
    }
    
}
