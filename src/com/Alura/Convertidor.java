package com.Alura;

//import java.awt.*;
import javax.swing.*;

public class Convertidor {
	
	public Convertidor() {	
	}
	
	static void menu() {
		String[] opciones = { "Convertidor de Moneda", "Convertidor de Temperatura" };
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, 
				"Seleccione una opción de Conversion:",
				"Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		if (opcionSeleccionada != null) {
			if (opcionSeleccionada.equals("Convertidor de Moneda")) {
				convertirMoneda();
			} else {
				convertidorTeperatura();
			}
		}
	}

	private static void convertirMoneda() {
		
		boolean esValido = false;
		
		do {
			String montoIngresado = JOptionPane.showInputDialog(null, 
					"Ingrese cantidad de dinero que desea convertir :");
			try {
				double montoPrueba = Double.parseDouble(montoIngresado);
		        esValido = true;
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
		    }
			
			if (esValido) {
				String[] opciones2 = { "De Peso Argentino a Dolar", "De Peso Argentino a Euro",
						"De Peso Argentino a Libra Esterlina", "De Peso Argentino a Yen Japones",
						"De Peso Argentino a Won Sur Coreano", "De Dolar a Peso Argentino", 
						"De Euro a Peso Argentino", "De Libra Esterlina a Peso Argentino", 
						"De Yen Japones a Peso Argentino", "De Won Sur Coreano a Peso Argentino" };
				String opcionSeleccionada2 = (String) JOptionPane.showInputDialog(null,
						"Seleccione una opción de Conversion:", "Moneda", 
						JOptionPane.PLAIN_MESSAGE, null, opciones2,
						opciones2[0]);
				
				if (opcionSeleccionada2 != null) {
					Moneda moneda1 = new Moneda(montoIngresado);
					double Resultado = moneda1.convertir(opcionSeleccionada2);
					int opcionConfirmacion = JOptionPane.showConfirmDialog(
	
							null, "Tiene " + Resultado + moneda1.getMoneda() + 
							"\n¿Desea continuar?", "Confirmación",
							JOptionPane.YES_NO_OPTION );
	
					if (opcionConfirmacion == JOptionPane.YES_OPTION) {
						menu();
					} else if (opcionConfirmacion == JOptionPane.NO_OPTION) {
						System.exit(0);
					} else {
						System.exit(0);
					}
				}
			}
		} while (!esValido);
	}
private static void convertidorTeperatura() {
		
		boolean esValido = false;
		
		do {
			String tempIngresada = JOptionPane.showInputDialog(null, 
					"Ingrese la Temperatura que desea convertir :");
			try {
				double tempPrueba = Double.parseDouble(tempIngresada);
		        esValido = true;
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
		    }
			
			if (esValido) {
				String[] opciones2 = { "De Celsius a Fahrenheit", "De Celsius a Kelvin",
									   "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin",
									   "De Kelvin a Celsius", "De Kelvin a Fahrenheit" };
				String opcionSeleccionada2 = (String) JOptionPane.showInputDialog(null,
						"Elija una aplicacion para convertir:", "Temperatura", 
						JOptionPane.PLAIN_MESSAGE, null, opciones2,
						opciones2[0]);
				
				if (opcionSeleccionada2 != null) {
					Temperatura temperatura1 = new Temperatura(tempIngresada);
					double Resultado = temperatura1.convertir(opcionSeleccionada2);
					int opcionConfirmacion = JOptionPane.showConfirmDialog(
	
							null, temperatura1.getTempIngresada()+ " " 
							+ temperatura1.getTempSelecionada()+" son "
							+ Resultado + " " + temperatura1.getTempAConvertir() 
							+ "\n¿Desea continuar?", "Confirmación",
							JOptionPane.YES_NO_OPTION );
	
					if (opcionConfirmacion == JOptionPane.YES_OPTION) {
						menu();
					} else if (opcionConfirmacion == JOptionPane.NO_OPTION) {
						System.exit(0);
					} else {
						System.exit(0);
					}
				}
			}
		} while (!esValido);
	}

}
