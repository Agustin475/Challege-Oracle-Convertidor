package com.Alura;

public class Moneda {

	private double valorDolar = 200.00;
	private double valorEuro = 210.00;
	private double valorLibraEsterlina = 234.00;
	private double valorYenJapones = 1.44;
	private double valorWonSurCoreano = 0.15;
	private double monto = 0.00;
	private String moneda = "";
	private double total = 0.00;

	public Moneda(String monto) { 					// Contructor de clase
		this.monto = Double.parseDouble(monto);
	}

	public String getMoneda() {
		return moneda;
	}

	public double convertir(String pais) {
		
		switch (pais) {
		case "De Peso Argentino a Dolar":
			total = this.monto / valorDolar;
			moneda = " Dolares";
			break;
		case "De Peso Argentino a Euro":
			total = this.monto / valorEuro;
			moneda = " Euros";
			break;
		case "De Peso Argentino a Libra Esterlina":
			total = this.monto / valorLibraEsterlina;
			moneda = " Libras Esterlinas";
			break;
		case "De Peso Argentino a Yen Japones":
			total = this.monto / valorYenJapones;
			moneda = " Yenes Japoneses";
			break;
		case "De Peso Argentino a Won Sur Coreano":
			total = this.monto / valorWonSurCoreano;
			moneda = " Wones de Sur Corea";
			break;
		case "De Dolar a Peso Argentino":
			total = this.monto * valorDolar;
			moneda = " Pesos Argentinos";
			break;
		case "De Euro a Peso Argentino":
			total = this.monto * valorEuro;
			moneda = " Pesos Argentinos";
			break;
		case "De Libra Esterlina a Peso Argentino":
			total = this.monto * valorLibraEsterlina;
			moneda = " Pesos Argentinos";
			break;
		case "De Yen Japones a Peso Argentino":
			total = this.monto * valorYenJapones;
			moneda = " Pesos Argentinos";
			break;
		case "De Won Sur Coreano a Peso Argentino":
			total = this.monto * valorWonSurCoreano;
			moneda = " Pesos Argentinos";
			break;
		default:
			System.out.println("Opcion Incorrecta");
			break;
		}
		double totalRedondeado = Math.round(total * 100) / 100.0;
		
		return totalRedondeado; // Devuelve un numero double "00.00"
	}

	
}
