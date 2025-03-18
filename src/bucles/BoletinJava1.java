package bucles;

public class BoletinJava1 {
	
	public static void main(String[] args) {
		
		System.out.println("EJERCICIOS VERDES");
		
		 System.out.println("Ejercicio 0001");

		    //[0001] Cuenta las letras el alfabeto inglés cuyo valor numérico es par.
		    
		    char valorInicial = 'a';
		    char valorFinal = 'z';
		    int contador = 0;
		    
		    for (int i = valorInicial; i <= valorFinal; i++){
		        if (i % 2 == 0){
		            contador++;
		        }
		    }
		    
		    System.out.printf("%d ", contador);
		    
		    System.out.println();
		    System.out.println("Ejercicio 0002");
		    
		    //[0002] Crea una variable de tipo byte b con valor 20, otra de tipo short s con valor 
		    //20 y otra de tipo i int con valor 20. 
		    //Consigue que las siguietes operaciones muestren el resultado correcto al ser impresas.
		    
		    byte b = 20;
		    short s = 20;
		    int i = 20;
		    
		    System.out.printf("%d + %d = %d%n", s, i, s + i);
		    
		    
		System.out.println("Ejercicio 0011");

		    //[0011] Crea, utilizando operadores ternarios un programa que en base al valor de una variable 
		    //de tipo byte para la hora y otra de tipo String para el nombre, salude. 
		    //Los posibles saludos se muestran en el ejemplo abajo. Los horarios son:
		    
		    byte hora = 22;
		    String nombre = "Juan";
		    
		    System.out.printf("%s, %s.%n", hora <= 14 ? "Buenos días" : hora <= 21 ? "Buenas tardes" : "Buenas noches", nombre);
		    
		    
		    System.out.println();
		    System.out.println("Ejercicio 0012");
		    //[0012] Dado un array de números [1, 2, 3, 4, 5], calcula la suma de todos los elementos.
		    
		    int [] array12 = {1, 2, 3, 4, 5};
		    int suma = 0;
		    
		    for (int x = 0; x < array12.length; x++){
		        suma += array12[x];
		    }
		    
		    System.out.printf("%d", suma);
		    
		    System.out.println();
		    System.out.println("Ejercicio 0013");
		    
		    //[0013] Dado un array [2, -3, 4, -1, 6], reemplaza todos los valores negativos por cero.
		    
		    int [] array13 = {2, -3, 4, -1, 6};
		    
		    for(int y = 0; y < array13.length; y++){
		        if (array13[y] < 0){
		            array13[y] = 0;
		        }
		    }
		    
		    for (int num:array13){
		        System.out.printf("%d ", num);
		    }
		    
		    System.out.println("EJERCICIOS AMARILLOS");
		 
		    System.out.println("Ejercicio 0003");

		    //[0003] Crea un array con los siguientes valores {1, 3, 5, 7} otro con los siguientes 
		    //valores {2, 4, 6, 8} y crea otro array para calcular 
		    //los productos de los elementos de mismo índice y almacenarlos con el mismo índice.
		    
		    int [] arrayImpares = {1, 3, 5, 7};
		    int [] arrayPares = {2, 4, 6, 8};
		    
		    int [] productos = new int [arrayPares.length];
		    
		    for (int o = 0; o < productos.length; o++){
		        productos[o] = arrayImpares[o] * arrayPares[o];
		    }
		    
		    for (int num:productos){
		        System.out.printf("%d ", num);
		    }
		    
		    System.out.println();
		    System.out.println("Ejercicio 0004");
		    
		    // [0004] Muestra los char ‘1’ a ‘9’ 3 veces tal y como ves en el ejemplo 
		    //(no puedes usar números, debes usar char). Debe estar preparado para cambiar 
		    //el número de veces que se muestra la lista de elementos. 
		    //Hay un detalle fino, y es que en la última vez no se muestra al final el -.
		    
		    valorInicial = '1';
		    valorFinal = '9';
		    int numeroDeVeces = 3;
		    
		    for (int u = 0; u < numeroDeVeces; u++){
		        for(int caracter = valorInicial; caracter <= valorFinal; caracter++){
		            System.out.printf("%c", caracter);
		        }
		        
		        if(u != numeroDeVeces - 1){
		            System.out.printf("-");
		        }
		    }
		    
		    System.out.println();
		    System.out.println("Ejercicio 0017");
		    
		    //[0017] Dado un array [1, 3, 5, 7], usa un bucle para multiplicar 
		    //cada elemento por 2 y guarda el resultado en un nuevo array.
		    
		    int [] array17 = {1, 3, 5, 7};
		    int [] producto = new int [array17.length];
		    
		    for (int t = 0; t < array17.length; t++){
		        producto[t] = array17[t] * 2;
		    }
		    
		    for(int num:producto){
		        System.out.printf("%d ", num);
		    }
		    
		    
		    System.out.println();
		    System.out.println("Ejercicio 0005");
		    
		    //[0005] Crea un cuadrado de 5 x 5 como el de la figura empleando bucles for. 
		    //Y si fuera generar un rectángulo de base 10 y altura 5.
		    
		    String pintar = "*";
		    int numeroDeFilas = 5;
		    int numeroDeColumnas = 5;
		    
		    for (int r = 0; r < numeroDeFilas; r++){
		        for(int j = 0; j < numeroDeColumnas; j++){
		           System.out.printf("%s", pintar); 
		        }
		        System.out.printf("%s%n", pintar);
		    }
		    
		    System.out.println("EJERCICIOS ROJOS");
		    
		    System.out.println("Ejercicio 0000");
	        
	        //[0000] Crea un array con 10 números múltiplos de 5 y luego pasa desde ese array los que 
	        //sean múltiplos de 10 a otro array
	        
	        
	        //1. Crear array mulitplos de 5
	        int cantidadMultiplosDe5 = 10;
	        int [] arrayMultiplosDe5 = new int [cantidadMultiplosDe5];
	        
	        
	        for (int q = 0; q < arrayMultiplosDe5.length; q++){
	            arrayMultiplosDe5[q] = (1 + q) * 5;
	        }
	        
	         for(int num:arrayMultiplosDe5){
	        System.out.printf("%d ", num);
	        }
	        
	        //2. Identificar cuántos números son multiplos de 10 para saber la dimensión del arrayMultiplosDe10
	        
	        int cantidadMultiplosDe10 = 0;
	        
	        for (int e = 0; e < arrayMultiplosDe5.length; e++){
	            if (arrayMultiplosDe5[e] % 10 == 0){
	                cantidadMultiplosDe10++;
	            }
	        }
	        
	        System.out.println();
	        System.out.printf("%d ", cantidadMultiplosDe10);
	        
	        //3. Crear array multiplos de 10
	        
	       int [] arrayMultiplosDe10 = new int [cantidadMultiplosDe10];
	       
	       //4. Traspasar de un array a otro
	       
	        int posicion = 0;
	        
	        for (int d = 0; d < arrayMultiplosDe5.length; d++){
	         if (arrayMultiplosDe5[d] % 10 == 0){
	                arrayMultiplosDe10[posicion++] = arrayMultiplosDe5[d];
	            }
	            
	        }
	        
	        System.out.println();
	        
	        for(int num: arrayMultiplosDe10){
	        System.out.printf("%d ", num);
	        }   
	    
	        System.out.println();
	        System.out.println("Ejercicio 0014");
	        //[0014] Dado un array de números [3, 5, 7, 2, 8], escribe un programa que encuentre el 
	        //mayor valor.
	        
	        int [] array14 = {3, 5, 7, 2, 8};
	        
	        int max = array14[0]; //Aquí vamos almacenando el número, empezando desde el ìndice 0 que es 3
	        
	        for(int num: array14){
	            if(num > max) { //Verificamos que si el número que se está reccoriendo es mayor que el almacenado
	            max = num; 
	            }
	        }
	        
	        System.out.printf("El máximo del array es el %d.%n", max);
	        
	        System.out.println();
	        System.out.println("Ejercicio 0015");
	        //[0015] Dado un array de números [3, 5, 7, 2, 8], escribe un programa que 
	        //encuentre el menor valor.
	        
	        int [] array15 = {3, 5, 7, 2, 8};
	        int min = array15[0];
	        
	        for (int num:array15){
	            if(num < min){
	                min = num;
	            }
	        }
	        
	        System.out.printf("El mínimo del array es el %d.%n", min);
	        
	        System.out.println();
	        System.out.println("Ejercicio 0016");
	        //[0016] Crea la tabla de multiplicar de cualquier conjunto de números desde el numInicial al 
	        //numFinal mostrando para cada tabla tantos números como se indique en cantidadNumeros
	        
	        
	        int numInicial = 1;
	        int numFinal = 10;
	        int cantidadNumeros = 5;
	        
	        for (int tablaDel = numInicial;  tablaDel <= numFinal; tablaDel++){
	            for (int numLinea = 1; numLinea <= cantidadNumeros; numLinea++){
	                System.out.printf("%d x %d = %d%n", tablaDel, numLinea, tablaDel * numLinea);
	            }
	            System.out.println();
	        }
	        
	        System.out.println();
	        System.out.println("Ejercicio 0018");
	        
	        //[0018] Dado un array [1, 2, 3, 4, 5], escribe un programa que use un 
	        //bucle para revertir el orden de los elementos en otro array.
	        
	        int [] arraycitoImpares = {1, 2, 3, 4, 5};
	        int [] arrayRevertido = new int[arraycitoImpares.length];
	        posicion = 0;

	        for (int a = arraycitoImpares.length - 1; a >= 0; a--){
	            arrayRevertido[posicion++] = arraycitoImpares[a]; //Cuando es pasar de un array a otro se usa otra variable de posicion
	        }        
	        
	        for(int num:arrayRevertido){
	            System.out.printf("%d ", num);
	        }
	        
	        System.out.println();
	        System.out.println("Ejercicio 0019");
	        //[0019] Dado un array [1, 2, 3, 4, 5], escribe un programa que use un bucle para revertir 
	        //el orden de los elementos en el mismo array.
	        
	        int [] array19 = {1, 2, 3, 4, 5};
	        int temp = 0;
	        
	        for (int y = 0; y < array19.length / 2; y++){
	            temp = array19[y];
	            array19[y] = array19[array19.length - y - 1];
	            array19[array19.length - y - 1] = temp;
	        }
	        
	        for(int num:array19){
	            System.out.printf("%d ", num);
	        }
	        
	        
	    }

		    

		
	
}
