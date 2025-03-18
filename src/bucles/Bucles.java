package bucles;

public class Bucles {
	/*Suma: acumulado. Valor neutro 0.
	Producto: acumulado. Valor neutro 1.
	Contador. Valor neutro 0.
	Acción. Valor neutro String “”.
	 * */
	
	public static void main(String[] args) {
		// Cuenta básica del 1 al 10
        
        for(int i= 1; i <= 10; i++){
            System.out.printf("%d ", i);
        }
        
        System.out.println();
        
        //Cuenta básica del 1 al 10 saltando de 2 en 2
        
        for(int i= 1; i <= 10; i+= 2){ //Aquí es igual que i++ pero en i+ = 2 para que aumente en 2
            System.out.printf("%d ", i);
        }
        
        System.out.println();
        
        //Cuenta básica del 1 al 10 e imprimir si es par 
        
        for(int i=1; i<=10; i++){
            if (i % 2 == 0) {System.out.printf("%d ", i);} //la variable se puede escribir i= de nuevo, porque una vez se ejecuta el for ya deja de existir
        }
        
        // Contar elementos que cumplen una condición: a) Entre 50 y 2500 hay XX números múltiplos de 13. 
        
        int contadorDeMultiplos = 0; //Debo poner un contador en 0 para que vaya incrementandose (también para la suma)
        int valorInicial = 50;
        int valorFinal = 2500;
        int multiploDe = 13;
        
        for (int i= 50; i <= 2_500; i++){
            if(i% 13 == 0) { contadorDeMultiplos++;}
        }
        
        System.out.printf("a) Entre %d y %d hay %d números múltiplos de %d.%n", contadorDeMultiplos, valorInicial, valorFinal, multiploDe);
        
        
        // Mostrar elementos decreciendo: b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: 
        //    XX XX ... XX
        
        valorInicial = 1_935;
        valorFinal = 1_812;
        multiploDe= 7;
        
        
        System.out.printf("b) La cuenta atrás de %d en %d desde %d a %d es:%n   ", multiploDe, multiploDe, valorFinal, valorInicial);
        
        for (int i=valorInicial; i >= valorFinal; i-= multiploDe) {
            System.out.printf(" %d ", i);
        }
        
        System.out.println();
        
        //Multiplicar elementos que cumplen una condición: c) El producto de los números impares entre 10 y 20 es XX.
        
        int producto = 1;
        valorInicial = 10; 
        valorFinal = 20; 
        
        for (int i= valorInicial; i <= valorFinal; i++){
            if (i % 2 !=0) {producto *= i;} //Es igual a producto = producto * i
        }
        
        System.out.printf("c) El producto de los números impares entre %d y %d es %d.%n", valorInicial, valorFinal, producto);
        
        //d) La suma de los números entre 70 y 800 es XXX.
        
        int valorSuma= 0;
        valorInicial= 70;
        valorFinal= 700;
        
        
        
        for(int i= valorInicial; i<=valorFinal; i++) {
            valorSuma += i;
        }
        
        System.out.printf("d) La suma de los números entre %d y %d es %d.%n", valorInicial, valorFinal, valorSuma);
        
        
        //e) Esta es la cadena de texto AAAAAAAAAAAAAAAAAAAAAAAAA y ha sido obtenida concatenando 25 veces la A.
        
        int numeroDeVeces= 5;
        String texto = "";
        String textoAConcatenar = "A";
        
        for(int i = 0; i < numeroDeVeces; i++){
            texto = texto + textoAConcatenar;
        }
        
        System.out.printf("e) Esta es la cadena de texto %s y ha sido obtenida concatenando %d veces la %s.%n", texto, numeroDeVeces, textoAConcatenar);
        
        //f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX. (cuadrado es el número multiplicado por si mismo)
        
        valorSuma=0;
        valorInicial = 15;
        valorFinal= 70;
        
        for( int i = valorInicial; i <= valorFinal; i++) {
            if ( i % 2 == 0) {
                valorSuma = valorSuma + i * i; //valorSuma += i*i;
            }
                
           
        }
        
        System.out.printf("f) La suma de los cuadrados de los numeros pares entre %d y %d es %d.%n", valorInicial, valorFinal, valorSuma);

 // a) Entre 50 y 2500 hay XX números múltiplos de 13.
        
        valorInicial = 50;
        valorFinal= 2_500;
        int multiplosDe= 13;
        int contadorDeNumeros= 0;
        
        for (int i = valorInicial; i <= valorFinal; i++) {  
            if (i % multiplosDe == 0) {
                contadorDeNumeros++;
            }
        }
       
       System.out.printf("a) Entre %d y %d hay %d números múltiplos de %d.%n", valorInicial, valorFinal, contadorDeNumeros, multiplosDe);
       
       //b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es:
            //XX XX ... XX
       
       
       valorInicial = 1935;
       valorFinal= 1812; 
       multiplosDe=7;
       
       System.out.printf("b) La cuenta atrás de %d en %d desde %d a %d es:%n   ", multiplosDe, multiplosDe, valorInicial, valorFinal);
       
       for (int i= valorInicial; i >= valorFinal; i-=multiplosDe) {System.out.printf(" %d", i);}
       
       System.out.println();
       
       //c) El producto de los números impares entre 10 y 20 es XX.
       
       producto = 1;
       valorInicial= 10; 
       valorFinal= 20;
       
       for ( int i= valorInicial; i <= valorFinal; i++) {
           if ( i % 2 != 0) {
               producto *= i;
           }
       }
       
       System.out.printf("c) El producto de los números impares entre %d y %d es %d.%n", valorInicial, valorFinal, producto);
       
       //d) La suma de los números entre 70 y 800 es XXX.
       
       int suma = 0;
       valorInicial= 70;
       valorFinal= 800;
       
       
       for ( int i=valorInicial; i <= valorFinal; i++ ) {
           suma += i;
       }
       
       System.out.printf("d) La suma de los números entre %d y %d es %d.%n", valorInicial, valorFinal, suma);
       
       //e) Esta es la cadena de texto AAAAAAAAAAAAAAAAAAAAAAAAA y ha sido obtenida concatenando 25 veces la A.
        
        String sumaDeString = "";
         numeroDeVeces= 25;
        textoAConcatenar = "A";
        
        for(int i = 0; i < numeroDeVeces; i++){
            sumaDeString= sumaDeString + textoAConcatenar; //Esto es lo mismo que sumaDeString += textoAConcatenar
        }
        
        System.out.printf("e) Esta es la cadena de texto %s y ha sido obtenida concatenando %d veces la %s.%n", sumaDeString, numeroDeVeces, textoAConcatenar);

        //f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
        
        suma = 0;
        valorInicial=15;
        valorFinal=70;
        
        for ( int i= valorInicial; i <= valorFinal; i++) {
            if (i % 2 ==0) {suma += i*i;
                
            }
        }
       
       System.out.printf("f) La suma de los cuadrados de los numeros pares entre %d y %d es %d.%n", valorInicial, valorFinal, suma);
       
       //g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
       
       suma = 0; 
       valorInicial = -10;
       valorFinal = 20; 
       
       for ( int i= -10; i <= 20 ; i++) {
           if ( i % 2 != 0 ) { suma += i * i * i;}
       }
       
       System.out.printf("g) La suma de los cubos de los numeros impares entre %d y %d es %d.%n", valorInicial, valorFinal, suma);
       
       //h) El abecedario inglés de letras minúsculas es:
            //abcdefghijklmnopqrstuvwxyz
       
       
        char caracterInicial = 'a';
        char caracterFinal = 'z';
        
       System.out.printf("h) El abecedario inglés de letras minúsculas es:%n   ");
       
       for ( char i = caracterInicial; i <= caracterFinal ; i++ ) {
           System.out.printf("%c", i);
       }
       
       System.out.println();
       
       //i) El abecedario inglés de letras mayúsculas es:
          //ABCDEFGHIJKLMNOPQRSTUVWXYZ
       
        caracterInicial = 'A';
        caracterFinal = 'Z';
        
       System.out.printf("i) El abecedario inglés de letras mayúsculas es:%n   ");
       
       for ( char i = caracterInicial; i <= caracterFinal ; i++ ) {
           System.out.printf("%c", i);
       }
       
       System.out.println();
       
       //j) El abecedario inglés de letras minúsculas de 3 en 3 letras es:
          //adgjmpsvy
       
       String valorcito = "";
       caracterInicial= 'a';
       caracterFinal= 'z';
       
       
       for ( char i = caracterInicial; i <= caracterFinal; i+= 3){
           valorcito += i;
       }
       
       System.out.printf("j) El abecedario inglés de letras minúsculas de 3 en 3 letras es: %n   %s%n",valorcito);
       
       System.out.println();
       
       //k) El abecedario inglés de letras minúsculas alrevés es:
          //zyxwvutsrqponmlkjihgfedcba
     
        
        caracterInicial ='z';
        caracterFinal = 'a';
        
        System.out.printf("k) El abecedario inglés de letras minúsculas alrevés es:%n   ");
        
        for( char i= caracterInicial; i>= caracterFinal; i--) {
            System.out.printf("%c", i);
        }
        
         System.out.println();
        
        //l) El abecedario inglés alternando mayúsculas y minúsculas es:
           //AbCdEfGhIjKlMnOpQrStUvWxYz
       
       caracterInicial= 'a';
       caracterFinal= 'z';
       int separacionMayusculaMinuscula = 'A'- 'a';
       
      
      System.out.printf("l) El abecedario inglés alternando mayúsculas y minúsculas es:");
      
       for ( char i= caracterInicial; i <= caracterFinal; i++) {
           if(i % 2 ==0) { 
               System.out.printf("%c", i);
           }
           
           else if (i % 2 !=0) {
               System.out.printf("%c", i + separacionMayusculaMinuscula); //si a mi letra minúscula le suma la separación me dará mayús, porque la distancia entre caracteres minus y mayus es siempre el mismo
           }
       }
       

        
	}
}
