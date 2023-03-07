package dev;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		//este es un hola mundo 
		System.out.println("Hola Mundo");
		//Aqui empiaza el calculo de la media aritmetica
		
		// se declara el scaner para recibir los datos
		Scanner ingreso = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		//se declaran las variables
		int numero;
		int suma = 0;
		int total = 0;
		int i;
		
		// se declara la variable para la estadisticas descriptivas
		int a,b,c;
		
		// se declaran las variables 
		double varianza = 0.0;
		double desviacion = 0.0;
		
		System.out.println("Ingresa tus 3  numeros");
		for ( i = 1; i <=3; i++) {
			System.out.println(i +" : ");
			numero = ingreso.nextInt();
			suma = suma + numero;
			
		}
		
		total = suma/5;
		System.out.println("La media aritmetica es " + total);
		
		// Estadisticas descriptivas
		 System.out.println("Estadisticas descriptivas ");
		 
		 System.out.println("Introduzca el primer numero ");
		 a=entrada.nextInt();
		 
		 System.out.println("Introduzca el segundo numero ");
		 b=entrada.nextInt();
		 
		 System.out.println("Introduzca el tercer numero ");
		 c=entrada.nextInt();
		  
	     if(a>b && b>c)
	            System.out.println( a+", "+b+", "+c);
	        else{
	            if(a>c && c>b)
	                System.out.println(a+", "+c+", "+b);
	            else{
	               if(b>a && a>c)
	                   System.out.println(b+", "+a+", "+c);
	               else{
	                  if(b>c && c>a)
	                      System.out.println(b+", "+c+", "+a);
	                  else{
	                      if(c>a && a>b)
	                         System.out.println(c+", "+a+", "+b);
	                      else{
	                         if(c>b && b>a)
	                            System.out.println(c+", "+b+", "+a);
	                        }
	                      }
	                   }
	                }
	            }
		 	
	     // para la desviacion estanadar tambien 
	     for (i = 1; i <=3; i++) {
	    	 double rango;
	    	 rango = Math.pow(3 - total,2);
	    	 varianza = varianza = rango;
	    	 }
	     varianza = varianza / 3;
	      
	     desviacion = Math.sqrt(varianza);
	     System.out.println("Desviacion Estandar; " + desviacion);
	     
}
}
