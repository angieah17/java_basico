package bucles;

public class ModeloExamen {
	
	public static void main(String[] args) {
		
		System.out.printf("---------------------------%nPRUEBA EVALUATIVA DE PRUEBA%n---------------------------%n%n");
        System.out.printf("EJERCICIO 0001 %n==============%n");
        
        byte hora = 14;
        String nombre = "Juan.";
        
        System.out.printf("%s %s%n", hora < 15? "Buenos días": hora < 22 ? "Buenas tardes":"Buenas noches", nombre);
        
        hora = 21;
        
        System.out.printf("%s %s%n", hora < 15? "Buenos días": hora < 22 ? "Buenas tardes":"Buenas noches", nombre);
        
        hora = 24;
        
        System.out.printf("%s %s%n", hora < 15? "Buenos días": hora < 22 ? "Buenas tardes":"Buenas noches", nombre);
        
        System.out.printf("Acuestate ya %s%n%n", nombre);
        
        System.out.printf("EJERCICIO 0002 %n==============%n");
        
        int valorInicial = 1;
        int valorFinal = 1_000;
        int contador = 0;
        int suma = 0;
        
        for(int i = valorInicial; i < valorFinal; i += 100){
            contador++;
            suma += i;
        }
        
        
        System.out.printf("He obtenido el resultado buscando en el array mediante bucles for.%nLa suma de los %d elementos pedidos es %d.%n%n", contador, suma);
       
        System.out.printf("EJERCICIO 0003 %n==============%n");
       
        int [] arrayImpares = {1, 3, 5, 7};
        int [] arrayPares = {2, 4, 6, 8};
        int [] productos = new int [arrayPares.length];
        
        for(int i = 0; i < productos.length;i++){
            productos[i] = arrayPares[i] * arrayImpares[i];
        }
        
        System.out.printf("He mostrado los 3 arrays mediante bucles for%n");
        
        System.out.printf("El producto del array [");
        
        for(int i = 0; i < arrayImpares.length ;i++){
            if (i == arrayImpares.length - 1){
               System.out.printf("%d",arrayImpares[i]); 
            }
            else{
                System.out.printf("%d, ",arrayImpares[i]); 
            }
            
        }
        
        System.out.printf("] y el array [");
        
        for (int i = 0; i < arrayPares.length; i++){
            if (i == arrayPares.length - 1){
                System.out.printf("%d", arrayPares[i]);
            }
            else{
                System.out.printf("%d, ", arrayPares[i]);
            }
        }
        
        System.out.printf("] es [");
        
        for (int i = 0; i < productos.length; i ++){
            if(i == productos.length - 1){
                System.out.printf("%d].", productos[i]);
            }
            else{
                System.out.printf("%d, ", productos[i]);
            }
        }
        
        System.out.printf("EJERCICIO 0004 %n==============%n");
        
        String pintar = "*";
        int cantidadDeFilas = 5;
        int cantidadDeColumnas = 5;
        
        for(int i = 0; i < cantidadDeFilas; i++){
            for(int j = 0; j < cantidadDeColumnas; j++){
                System.out.printf("%s", pintar);
            }
            System.out.printf("%n");
        }
        
        System.out.printf("%n");
        
        cantidadDeFilas = 5;
        cantidadDeColumnas = 10;
        
        for(int i = 0; i < cantidadDeFilas; i++){
            for(int j = 0; j < cantidadDeColumnas; j++){
                System.out.printf("%s", pintar);
            }
            System.out.printf("%n");
        }
     
        
        System.out.printf("%n");
        System.out.printf("EJERCICIO 0005 %n==============%n");
        
        int cantidadDeElementos = 10;
        int [] array5 = new int [cantidadDeElementos];
        
        for (int i = 0; i < array5.length; i++){
            if ( i % 2 == 0){
                array5[i] = i + 2;
            }
            else {
                array5[i] = i - 2;
            }
        }
        
        for(int num:array5){
            System.out.printf("%d ", num);
        }
        
        System.out.printf("%n%n");
        System.out.printf("EJERCICIO 0006 %n==============%n");
        
        int [] array6 = {3, 5, 7, 2, 8};
        int min = array6[0];
        
        for(int num:array6){
            if (num < min){
                min = num;
            }
        }
        
        System.out.printf("He obtenido el resultado recorrioendo mediante bucle for el array.%n");
        System.out.printf("El valor mínimo del array es %d", min);
        
        

		
		
	}
	
	
}
