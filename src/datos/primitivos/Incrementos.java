package datos.primitivos;

public class Incrementos {
	
	/*En Java los incrementos son operaciones que aumentan el valor de una variable numérica. Se realizan mediante el operador ++, que suma 1 al valor de la variable. Hay dos formas de usarlo:

	1. Incremento postfijo (variable++)
	Primero usa el valor actual de la variable en la expresión y luego la incrementa.
	
	2. Incremento prefijo (++variable)
	Primero incrementa la variable y luego usa el valor actualizado en la expresión.
	
	 * */

	public static void main(String[] args) {
		
		   int i=1, j = 1, k=1;
	        i=++j;
	        
	        System.out.printf("a) i = ++j => i = %d, j = %d, k = %d%n", i, j, k); // k=1, j=2, i=2
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = k++; 
	        
	        System.out.printf("b) i = k++ => i = %d, j = %d, k = %d%n", i, j, k);
	        
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = k + ++j;
	        
	        System.out.printf("c) i = k + ++j => i = %d, j = %d, k = %d%n", i, j, k);
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = i + j++;
	        
	        System.out.printf("d) i = i + j++ => i = %d, j = %d, k = %d%n", i, j, k); //*Primero se le asigna a i la evaluación del valor de las variables en el momento actual 
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = j + ++k;
	        
	        System.out.printf("e) i = j + ++k  => i = %d, j = %d, k = %d%n", i, j, k);
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = ++j + k++;
	        
	        System.out.printf("f) i = ++j + k++ => i= %d, j= %d, k=%d%n", i, j, k);
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        j = k-- + --i;
	        
	        System.out.printf("g) j = k-- + --i => i=%d, j=%d, k=%d%n", i, j, k);

	        i=1; 
	        j=1;
	        k=1;
	        
	        i = k + 1 + ++j;
	        
	        System.out.printf("h) i = k + 1 + ++j => i=%d, j=%d, k=%d%n", i, j, k);
	        
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        i = ++i + --j + k--;
	        
	        System.out.printf("i) i = ++i + --j + k-- => i=%d, j=%d, k=%d%n", i, j, k);
	        
	        i=1; 
	        j=1;
	        k=1;
	        
	        k = j-- + ++k;
	        
	        System.out.printf("k) k = j-- + ++k => i=%d, j=%d, k=%d%n", i, j, k);
	        
	        
	        /*
	        b) i = k++ // j=1, k=2 , i= 2, 
	        c) i = k + ++j // k= 1, j= 2, i= 3
	        d) i = i + j++//k=1, j=2, i= 2 
	        e) i = j + ++k//j=1, k=2, i=3
	        f) i = ++j + k++//j=2, k=2, i=4
	        g) j = k-- + --i//k=0, i=0, j=0
	        h) i = k + 1 + ++j// i=4 , k=1, j=2
	        i) i = ++i + --j + k-- // j= 0, k= 0, i= 3
	        j) k = j-- + ++k // j= 0, i= 1, k=3 */

	}
}
