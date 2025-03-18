package datos.primitivos;

public class Char {
	
	public static void main(String[] args) {
				       
		        char c1='E' , c2= '5', c3= '?';
		        
		        
		        
		        System.out.printf("a) c1 + 1 = %d%n",c1 + 1); //Para que salga char se usa %c de character, se pone %d para que salga el int
		        System.out.printf("b) c1 - c2 + c3= %d%n", c1 - c2 + c3);
		        System.out.printf("c) c2 - 2 = %d%n",c2 - 2);
		        System.out.printf("d) c2 - '2'= %d%n", c2 - '2');
		        System.out.printf("e) c3 + '#' = %d%n",c3 + '#');
		        System.out.printf("f) c1 %% c3 = %d%n", c1 % c3);
		        System.out.printf("g) '2' + '2' = %d%n", '2' + '2');
		        System.out.printf("h) (c1/c2) * c3= %d%n", (c1/c2) * c3);
		        System.out.printf("i) 3 * c2 = %d%n", 3 * c2);
		        System.out.printf("j) '3' * c2 = %d%n", '3' * c2);
		        
		        //Para que salgan los character
		        
		        System.out.printf("a) c1 + 1 = %c%n",c1 + 1); //Para que salga char se usa %c de character, se pone %d para que salga el int
		        System.out.printf("b) c1 - c2 + c3= %c%n", c1 - c2 + c3);
		        System.out.printf("c) c2 - 2 = %c%n",c2 - 2);
		        System.out.printf("d) c2 - '2'= %c%n", c2 - '2');
		        System.out.printf("e) c3 + '#' = %c%n",c3 + '#');
		        System.out.printf("f) c1 %% c3 = %c%n", c1 % c3);
		        System.out.printf("g) '2' + '2' = %c%n", '2' + '2');
		        System.out.printf("h) (c1/c2) * c3= %c%n", (c1/c2) * c3);
		        System.out.printf("i) 3 * c2 = %c%n", 3 * c2);
		        System.out.printf("j) '3' * c2 = %c%n", '3' * c2);
		        
		        System.out.println('a'); //aquí te imprime el char
		        System.out.println('a'+ 0); // aquí para saber lo que representa se hace la suma con 0, porque el programa no suma char y lo convierte en int
		        
		        
		       /*
		       Esto es un comentario de bloque en java. Como no suma caracteres termina convirtiendolos en int
		       */

		        
		        //Incrementos
		        
		        char A = 'c';
		        char B;
		        
		        System.out.println(A++);//d
		        System.out.println(A++);//e
		        System.out.println(++A);//f
		        B= --A; //(e)
		        System.out.println(++A);//d
		        A++;//(e)
		        --B;//(d)
		        System.out.println(B++);//d(e)
		        System.out.println(++B);//f
		        System.out.println(++A);//f
		        System.out.println(B--);//f(e)
		        System.out.println(A);//f
		        System.out.println(B);//e

		        
	}
}
