package com.Alura;

import java.util.Scanner;

public class Logica {

	public static void main(String[] args) {
		
		while(true){
			System.out.println("Convertidor de Monedas");
			System.out.println("1 - Peso Arg. a Dolar \n" + "2 - Salir");
			System.out.println("Ingrese una Opcion: ");
			Scanner leer = new Scanner(System.in);
			char opcion = leer.next().charAt(0);
			
			switch(opcion) {
			case '1' :
				convertir(300.00,"Peso Arg.");
				break;
			case '2' :
				System.out.println("Cerrado Programa");;
				break;
			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
			
		}
	}
	
	static void convertir(double valorDolar,String pais) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de %s : ", pais);
		double cantidadMoneda = leer.nextDouble();
		
		double dolares = cantidadMoneda / valorDolar;
		
		dolares = (double) Math.round(dolares * 100d)/100;
		
		System.out.println("--------------------------------------");
		System.out.println("|    Tienes $" + dolares + " Dolares |");
		System.out.println("--------------------------------------");
	}

}
