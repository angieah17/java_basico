package booleans.operadores.logicos;

public class OperadorTernario {
	
	/*El operador ternario puede operar con cosas que sean del mismo tipo. 
	 * */
	
	public static void main(String[] args) {
		
		//Ejemplo1
		int edad = 19;
	        String nombre = "Manolo";
	        String textoAMostrar = (edad >= 18 ? "es mayor de edad":"es menor de edad");  // Se hace la primera pregunta y si se cumple es el primer string y si no se cumple es el segundo string
	        
	        System.out.println(textoAMostrar);
	        
	        //Ejemplo2 
	        edad = 2;
	        nombre = "Manolo";
	        
	        System.out.printf("La edad de %s es %d año%s y es %s%n", 
	            nombre, 
	            edad,
	            edad == 1? "":"s",
	            edad >=18 ? "mayor de edad.":"menor de edad.");

	      //Ejemplo3 
	        int numero= 100;
	        
	        System.out.printf("El número %d es %s y además es %s%n", numero, numero<100? "pequeño":"grande", numero>0? "positivo": "negativo");
	    
	    
	        int num= -5;
	        
	        System.out.printf("El número %d es %s%n", 
	            num, 
	            num <0? "negativo": num>=100?"grande.":"pequeño.");

	        
	}
	
}
