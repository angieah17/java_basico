package booleans.operadores.logicos;

public class OperadorIfElse {
	
	public static void main(String[] args) {
		   
		//Ejemplo 1
		int edad =5;
	        
	        if(edad >=18){
	            System.out.println("Hola chaval cómo estás");
	            System.out.println("¿Vamos al cine?");} 
	        
	        else{
	            System.out.println("Hola niño te has perdido");
	            System.out.println("Buscamos a tu mamá");} 

	        
	       //Ejemplo 2
	        
	        edad =5;
	        
	        if(edad >0){
	            System.out.println("Hola chaval cómo estás");
	            System.out.println("¿Vamos al cine?");} 
	        
	        else if (edad>100){ }
	        
	        else{
	            System.out.println("Hola niño te has perdido");
	            System.out.println("Buscamos a tu mamá");} 

	        
	        
	        //Ejemplo 3
	        int bola= 15;
	        
	        if (bola==1) {
	            System.out.println("pim");
	            
	        }
	        
	        else if (bola ==4 || bola == 5){
	            System.out.println("pam");
	            
	            
	        }
	        
	        else if (bola == 7 || bola == 8 || bola == 9) {
	            
	            System.out.println("pum");
	        }
	        
	        
	        else if (bola == 2 || bola == 3 || bola == 6) {
	            
	            System.out.println("olé");
	        }
	        
	        else { }
	        
	        //Ejemplo 4
	        
	        int numeroDePreguntasRespondidas = 0;
	        int podium = 1;
	        
	        if (podium == 1){
	            numeroDePreguntasRespondidas++;
	            System.out.println("Es campeón");
	        }
	        
	        if (podium == 1){
	            numeroDePreguntasRespondidas++;
	            System.out.println("Es campeón");
	        }
	        
	        else {
	           numeroDePreguntasRespondidas++;
	            System.out.println("No es campeón"); 
	        }
	        
	        if (podium == 1){
	            numeroDePreguntasRespondidas++;
	            System.out.println("Es campeón"); }
	        
	            else if (podium == 2) {
	           numeroDePreguntasRespondidas++;
	            System.out.println("Es subcampeón"); 
	            }
	        
	            else if (podium==3) {
	           numeroDePreguntasRespondidas++;
	            System.out.println("Es perdedor"); 
	            }
	        
	            else {
	           numeroDePreguntasRespondidas++;
	            System.out.println("No es campeón");  
	            }
	       
	       System.out.println(numeroDePreguntasRespondidas);

	        
	}
	
}
