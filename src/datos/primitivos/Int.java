package datos.primitivos;

public class Int {
	
	public static void main(String[] args) {
		 
				
		int a= 8, b= 3, c=-5;
	        
	        System.out.print("a)a+b+c= "+ (a+b+c));
	        System.out.print("b)2*b+3+(a-c)= " + (2*(b+3)+(a-c)));
	        System.out.print("c)a/b= "+ (a/b)); //Como se operan enteros siempre va a dar entero 
	        System.out.println("d)a%b= "+ (a%b));
	        System.out.println("e)a/c= "+ (a/c));//Como se operan enteros siempre va a dar entero 
	        System.out.println("f)a%b= "+ (a%b));//¡Como se operan enteros aproximó?
	        System.out.println("g)a*b/c= "+ ((a*b)/c));//Como se operan enteros siempre va a dar entero 
	        System.out.println("h)a*(b/c)= "+ (a*(b/c)));
	        System.out.println("i)(a*c)%b= "+ ((a*c)%b));
	        System.out.println("j)a*(c%b)="+ (a*(c%b)));
	        System.out.println("k)(3*a-2*b)%(2*a-c)= " + (3*a-2*b)%(2*a-c));
	        System.out.println("l)2*(a/5+(4-b*3))%(a+c-2)= " + (2*((a/5)+(4-b)*3))%(a+c-2));
	        System.out.println("m)(a - 3 * b) % (c + 2 * a) / (a - c) = " + ((a - 3 * b) % (c + 2 * a) / (a - c)));
	        System.out.println("n) a - b - c * 2 = " + (a - b - c * 2));



	  //Usando printf
	        
	        System.out.printf("a) a+b+c=%d%n", a+b+c);
	        System.out.printf("b)2*(b+3)+(a-c)=%d%n", 2*(b+3)+(a-c));
	        System.out.printf("c)a/b= %d%n", a/b);
	        System.out.printf("d)a%%b= %d%n", a%b);//Para que aparezca el % en el string se debe poner doble al estar usando printf
	        System.out.printf("e)a/c=%d%n", a/c);
	        System.out.printf("f)a%%b=%d%n", a%b);
	        System.out.printf("g)a*b/c=%d%n", (a*b)/c);
	        System.out.printf("h)a*(b/c)=%d%n", a*(b/c));
	        System.out.printf("i)(a*c)%%b=%d%n", (a*c)%b);
	        System.out.printf("j)a*(c%%b)=%d%n", a*(c%b));
	        System.out.printf("k)(3*a-2*b)%%(2*a-c)=%d%n", (3*a-2*b)%(2*a-c));
	        System.out.printf("l)2*(a/5+(4-b*3))%%(a+c-2)=%d%n", 2*( a / 5 + (4 - b * 3)) % (a + c - 2));
	        System.out.printf("m)(a - 3 * b) %% (c + 2 * a) / (a - c) =%d%n", (a - 3 * b) % (c + 2 * a) / (a - c));
	        System.out.printf("n) a - b - c * 2 =%d%n", a - b - c * 2);

	        
	    //Incrementos
	       
	        
	        int x=10;
	        
	        System.out.println(x); //10
	        x++;//(11)
	        System.out.println(x);//11
	        System.out.println(++x);//12
	        System.out.println(x++);//12 (13)
	        System.out.println(x);//13
	        System.out.println(x++);//13 (14)
	        System.out.println(++x);//15
	        System.out.println(++x);//16
	        ++x;//(17)
	        x++;//17(18)
	        System.out.println(++x);//19
	        System.out.println(x++);//19(20)
	        System.out.println(++x);//21

	        
	}
	
}
