package bucles;

public class BoletinJava2 {
	
	
	public static void main(String[] args) {
		
		 System.out.println("Ejercicio 0001");
		    
		    int valorInicial = 1;
		    int valorFinal = 1_000;
		    
		    for(int i = valorInicial; i <= valorFinal; i += 100){
		        System.out.printf("%d ", i);
		    }
		    
		    System.out.println();
		    System.out.println("Ejercicio 0002");
		    
		    valorInicial = 1;
		    valorFinal = 1_000;
		    int contador = 0;
		    int suma = 0;
		    
		    for( int i = valorInicial;i <= valorFinal; i += 100){
		        contador ++;
		        suma += i; 
		    }

		    System.out.printf("La suma de los %d elementos pedidos es %d.%n", contador, suma);
		    
		    System.out.println();
		    System.out.println("Ejercicio 0003");
		    
		    // [#0003] Crea un bucle y almacena los valores en un array que cuente del 
		    //1 al 1_000 pero saltando de 100 en 100) y lo muestre en pantalla según el formato indicado, 
		    //pero en orden inverso (cuidado con el guioncito del final).XXX-YYY- .... ZZZ
		    
		    valorInicial = 1;
		    valorFinal = 1_000;
		    contador = 0;
		    int posicion = 0;
		    
		    //1. Necesitamos saber cuántos hay para poder tener la dimensión del array que
		    //vamos a crear
		    
		    for (int i = valorInicial; i < valorFinal; i += 100){
		        contador++;
		    }
		    
		    System.out.printf("%d%n", contador);
		    
		    //2. Creamos el array vacío donde vamos a guardar los números
		    
		    int [] array3 = new int [contador];
		    
		    //3. Creamos un bucle para almacenar los valores dentro del array vacío
		    //Es necesario crear una variable de posicion, para que indique donde
		    //poner el valor en i que está aumentando
		    
		    for (int i = valorInicial; i <= valorFinal; i += 100){
		        array3[posicion++] = i;
		    }
		    
		    for(int num:array3){
		        System.out.printf("%d ", num);
		    }
		    
		    System.out.println();
		    System.out.println("Ejercicio 0004");
		    
		    //[#0004] Crea un solo bucle sin crear un array que cuente y multiplique los números del 1 al 1_000 
		    //pero saltando de 100 en 100) y lo muestre en pantalla según el formato indicado.
		    
		    valorInicial = 1;
		    valorFinal = 1_000;
		    contador = 0;
		    int producto = 1;
		    
		    for (int i = valorInicial; i < valorFinal; i +=100){
		        contador ++;
		        producto *= i;
		    }
		    
		    System.out.printf("El producto de los %d elementos pedidos es %d.%n", contador, producto);
		    
		    System.out.println();
		    System.out.println("Ejercicio 0005");
		    
		    // [#0005] Rellena un array según las siguientes indicaciones: en las posiciones 
		    //pares suma 2 al valor del índice y en las impares resta 2 al valor del índice. 
		    //En total deberá  tener 10 elementos. Una vez realizadas las operaciones,
		    //muestra la información contenida en el array con el siguiente formato.
		    
		    int [] array5 = new int [10];
		    
		    for(int i = 0; i < array5.length; i++){
		        array5[i] = i % 2 == 0? i + 2 : i - 2;
		    }
		    
		    for (int num: array5){
		        System.out.printf("%d ", num);
		    }
		    
		    System.out.println();
		    System.out.println("Ejercicio 0006");
		    
		    //[#0006] Dada una variable edad y otra nombre determinar si la persona es mayor de edad, 
		    //menor de edad o pensionista y muéstralo según el formato indicado. Elige el método que prefieras, 
		    //pero si te ha resultado fácil y lo has hecho con if, prueba a hacerlo con  operadores ternarios.
		    
		    int edad = 65;
		    String nombre = "Juan";
		    
		    System.out.printf("%s tiene %d años y es %s.%n", nombre, edad, edad < 18? "menor de edad":edad < 65? "mayor de edad":"pensionista");
		    
		    System.out.println();
		    System.out.println("Ejercicio 0007");
		    
		    //[#0007] Genera un array de 10 números pares y otro con 5 números impares y 
		    //crea otro nuevo array que incluya primero el contenido del array de pares y
		    //luego el contenido del array de impares. 
		    //Finalmente muestra el resultado de este nuevop array de la forma indicada a continuación.
		    
		    //1. Se crean los array y se llenan
		    
		    int [] arrayPares = new int [10];
		    int [] arrayImpares = new int [5];
		    
		    
		    
		    for(int i = 0; i < arrayPares.length; i++){
		        arrayPares[i] = 2 * (i + 1);
		    }
		    
		    for(int i = 0; i < arrayImpares.length; i++){
		        arrayImpares[i] = 2 * i + 1;
		    }
		    
		    //2. Crear el array vacío 
		    
		    int [] arrayUnido = new int [arrayPares.length + arrayImpares.length];
		    
		    //3. Crear un bucle que recorra el arrayPares y lo vaya poniendo en arrayUnido 
		    
		    for (int i = 0; i < arrayPares.length; i++){
		        arrayUnido[i] = arrayPares [i];
		    }
		    
		    //4. Crear un bucle que recorra el arrayImpares y lo vaya poniendo en array unido
		    //teniendo en cuenta que se rellene después de las posiciones
		    //que ya se han llenado con el par
		    
		    for (int i = 0; i < arrayImpares.length; i++){
		        arrayUnido[i + arrayPares.length] = arrayImpares[i];
		    }
		    
		    for (int num: arrayUnido){
		        System.out.printf("%d ", num);
		    }
		    
		    
		    }
		 

		
		
	
	
	
}
