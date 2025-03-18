package booleans.operadores.logicos;

public class OperadorRelacional {
	
	/*Operadores relacionales:

	< menor que
	> mayor que 
	<= menos o igual que 
	>= mayor o igual que 
	!= distinto 
	== igual (ojo es diferente al = porque ese solo es para declarar)
	
	Y como resultado de usar los operadores relacionales dan un boolean.

	 * */
	
	public static void main(String[] args) {
		  int i= 8, j= 5;
	        float x= 0.005f, y = -0.01f;
	        char c= 'c', d = 'd';
	        
	        System.out.printf("a) i <= j => %b%n", i <= j); //false
	        System.out.printf("b) c > d => %b%n", c > d); //false
	        System.out.printf("c) x >= 0 => %b%n",x >= 0); //true
	        System.out.printf("d) x < y-- => %b%n", x < y--); //false y(-1.01)
	        System.out.printf("e) j !=6 => %b%n",j !=6); //true
	        System.out.printf("f) c == 99 =>%b%n",c == 99);// true
	        System.out.printf("g) !(i <= j) => %b%n", !(i <= j));//true
	        System.out.printf("h) !(c == 99) => %b%n",!(c == 99));//false, yo creo que hay un error en el del profesor porque el f) es el contrario y es true
	        System.out.printf("i) !(x > 0) => %b%n", !(x > 0));// false
	        System.out.printf("j) -j == i - 13 => %b%n", -j == i - 13);//true
	        System.out.printf("k) ++x > 0 => %b%n", ++x > 0);//true, primero sumo el valor 1.005 y después evalúo (x= 1.005)
	        System.out.printf("l) y-- < 1 => %b%n", y-- < 1);//true. aquí tomé -1.01 que estaba antes ej d) (y= -2.01)
	        System.out.printf("m) c > d || c > 0 => %b%n", c > d || c > 0);//true, porque la segunda condición 'c' vale 99 y es mayor que 0
	        System.out.printf("n) 5 * (i + j) > 'c' => %b%n", 5 * (i + j) > 'c');// false, primero se hace el parentesis?
	        System.out.printf("o) 2 * x + y == 0 => %b%n", 2 * x + y == 0);//true, tomé el valor de x= 1.005 ej k) y tomé y= -2.01 del ej l)
	        //System.out.printf("p) 2 * x + (y==0) => %b%n", 2 * x + (y==0));//No se puede hacer
	        System.out.printf("q) x + y >=0 => %b%n", x + y >=0);// false, x= 1.005 ej k) y tomé y= -2.01 del ej l)
	        System.out.printf("r) x < ++y => %b%n",  x < ++y);// false, x= 1.005 ej k) y ahora se cambia el valor de y= -1.01 
	        System.out.printf("s) - (i + j) != -i + j => %b%n", - (i + j) != -i + j); //true, uno da -13 y el otro -3
	        System.out.printf("t) i <= j && i >= c => %b%n", i <= j && i >= c); //false
	        System.out.printf("u) i > 0 && j < 5 => %b%n", i > 0 && j < 5); //false
	        System.out.printf("v) i > 0 || j < 5 => %b%n", i > 0 || j < 5); // true
	        System.out.printf("w) x > y && i > 0 || j < 5 => %b%n",  x > y && i > 0 || j < 5 ); //true, x= 1.005 ej k) y el valor de y= -1.01 del ej r)
	        System.out.printf("x) (3 * i - 2 * j) %% (2 * d - c) > 3 * d => %b%n", (3 * i - 2 * j) % (2 * d - c) > 3 * d); // false, los println siguientes muestran que el primero es 14 y el segundo es 300
	        System.out.println((3 * i - 2 * j) % (2 * d - c));
	        System.out.println(3*d);
	        System.out.printf("y) 2 * ((i / 5) + (4 *(j - 3)) %% (i + j - 2)) >= 10 => %b%n", 2 * ((i / 5) + (4 *(j - 3)) % (i + j - 2)) >= 10);//true, el println muestra que da 18
	        System.out.println(2 * ((i / 5) + (4 *(j - 3)) % (i + j - 2)));
	        System.out.printf("z) (i - 3 * j) %% (c + 2 * d) / (x - y) >= 0 => %b%n", (i - 3 * j) % (c + 2 * d) / (x - y) >= 0);//false, tomé x= 1.005 del ej k) y el valor de y= -1.01 del ej i)
	        System.out.println((i - 3 * j) % (c + 2 * d) / (x - y));
	        System.out.println(-7 % 299 / 2.015);

	}
	
	
}
