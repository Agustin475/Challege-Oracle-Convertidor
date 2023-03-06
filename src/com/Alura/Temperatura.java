package com.Alura;

public class Temperatura {
	
	private double temperaturaIngresada = 0.0;
	private String temperaturaSelecionada = "";
	private double temperaturaResultado = 0.0;
	private String temperaturaAConvertir = "";
	
	public double getTempIngresada() {
		return temperaturaIngresada;
	}
	public String getTempSelecionada() {
		return temperaturaSelecionada;
	}
	public String getTempAConvertir() {
		return temperaturaAConvertir;
	}
	
	public Temperatura (String tempIngresada) {					//Constructor Clase Temperatura
		this.temperaturaIngresada = Double.parseDouble(tempIngresada);
	}
	
	public double convertir(String conversion) {
		
		switch (conversion) {
		
		case "De Celsius a Fahrenheit":
			temperaturaResultado = (this.temperaturaIngresada * 9/5) + 32;
			temperaturaSelecionada = "Celsius";
			temperaturaAConvertir = "Fahrenheit";
			break;
		case "De Celsius a Kelvin":
			temperaturaResultado = this.temperaturaIngresada + 273.15;
			temperaturaSelecionada = "Celsius";
			temperaturaAConvertir = "Kelvin";
			break;
		case "De Fahrenheit a Celsius":
			temperaturaResultado = (this.temperaturaIngresada - 32) * 9/5;
			temperaturaSelecionada = "Fahrenheit";
			temperaturaAConvertir = "Celsius";
			break;
		case "De Fahrenheit a Kelvin":
			temperaturaResultado = (this.temperaturaIngresada - 32) * 9/5 + 273.15;
			temperaturaSelecionada = "Fahrenheit";
			temperaturaAConvertir = "Kelvin";
			break;
		case "De Kelvin a Celsius":
			temperaturaResultado = (this.temperaturaIngresada - 273.15);
			temperaturaSelecionada = "Kelvin";
			temperaturaAConvertir = "Celsius";
			break;
		case "De Kelvin a Fahrenheit":
			temperaturaResultado = (this.temperaturaIngresada - 273.15) * 9/5 + 32;
			temperaturaSelecionada = "Kelvin";
			temperaturaAConvertir = "Fahrenheit";
			break;
		
		default:
			System.out.println("Opcion Incorrecta");
			break;
		}
		double totalRedondeado = Math.round(temperaturaResultado * 100) / 100.0;
		
		return totalRedondeado; // Devuelve un numero double "00.00"
	}
	
	
	
	
	

}
