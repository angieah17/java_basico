package datos.primitivos;

public class Double {
	
	public static void main(String[] args) {
		double x=88 , y= 3.5, z= -5.2;
        
        
        
        System.out.printf("a) x+y+z=%f%n", x+y+z); //Para double se usa %f de float
        System.out.printf("b) 2*y+3*(x-z)=%f%n", 2 * y + 3 * (x - z));
        System.out.printf("c) x / y = %f%n",x / y);
        System.out.printf("d) x %% y = %f%n", x % y);
        System.out.printf("e) x / (y + z) = %f%n", x / (y + z));
        System.out.printf("f) (x / y) + z = %f%n", (x / y) + z);
        System.out.printf("g) 2 * x / 3 * y = %f%n", 2 * x / 3 * y);
        System.out.printf("h) 2 * x / (3 * y)= %f%n",  2 * x / (3 * y));
        System.out.printf("i) x * y %% z =%f%n", x * y % z);
        System.out.printf("j) x * (y %% z) = %f%n", x * (y % z)); //Igual pese a ser int el resultado, como son todos double le agrega el .0 al int
        System.out.printf("k) 3 * x - z -2 * x = %f%n", 3 * x - z -2 * x);
        System.out.printf("l) 2 * x / 5 %% y = %f%n", 2 * x / 5 % y);
        System.out.printf("m) x - 100 %% y %% z = %f%n", x - 100 % y % z);//Igual pese a ser int el resultado, como son todos double le agrega el .0 al int
        System.out.printf("n) x - y - z * 2 = %f%n", x - y - z * 2);

	}
	
}
