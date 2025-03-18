package booleans.operadores.logicos;

public class Booleans {
	
	/*Operadores Lógicos
	 * 
	 * Las usamos para expresar condiciones. 
	y: ambos verdaderos.
	o: por lo menos alguno verdadero.
	no

	& = y
	|=o //pese a saber el resultado sigue ejecutando
	|| = o //al saber el resultado no sigue ejecutando
	!= no

	 * */
	public static void main(String[] args) {
    
		boolean X= true, Y= false, Z= true;
        
        System.out.printf("a) (X && Y) || (X && Z)=%b%n",(X && Y) || (X && Z)); //Se usa %b y lo que va después de la , vuelca la
        System.out.printf("b) (X || !Y) && (!X || Z)= %b%n", ((X || !Y) && (!X || Z)));
        System.out.printf("c) X || Y && Z= %b%n", (X || Y && Z));
        System.out.printf("d) !(X | Y) & Z= %b%n", !(X | Y) & Z);
        System.out.printf("e) X | Y | X & !Z & !Y= %b%n", X | Y | X & !Z & !Y);
        System.out.printf("f) !X | !Y | Z & X & !Y=%b%n", !X | !Y | Z & X & !Y);

        
        boolean t= true, f= false;
        
        System.out.printf("Tabla de verdad de and%n");
        System.out.printf("======================%n");
        System.out.printf("true && true => %b%n", t && t);
        System.out.printf("true && false => %b%n", t && f);
        System.out.printf("false && true => %b%n", f && t);
        System.out.printf("false && false => %b%n%n", f && f);
        
        System.out.printf("Tabla de verdad de or%n");
        System.out.printf("======================%n");
        System.out.printf("true || true => %b%n", t || t);
        System.out.printf("true || false =>%b%n", t || f);
        System.out.printf("false || true => %b%n", f || t); 
        System.out.printf("false || false => %b%n%n", f || f);
        
        System.out.printf("Tabla de verdad de not%n");
        System.out.printf("======================%n");
        System.out.printf("!true => %b%n", !t);
        System.out.printf("!false => %b%n", !f);

	}
	

	
	
}
