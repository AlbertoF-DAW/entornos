package com.entornos.alberto.poligonos.figuras;

/**
 * Representa un circulo. Contiene constructores para crear un circulo dado el
 * radio y para crear un circulo con un radio aleatorio entero entre 1 y 10.
 * Contiene metodos para calcular el area y el perimetro.
 * 
 * @version 1.0
 * 
 * @author Alberto
 * 
 */

public class Circulo {

	public int radio;

	/**
	 * Constructor para el circulo dado un radio entero por parametro
	 * 
	 * @param radio
	 */
	public Circulo(int radio) {
		this.radio = radio;
	}

	/**
	 * Constructor sin parametros con radio aleatorio y entero entre 1 y 10 (inclusive)
	 */
	public Circulo() {
		radio = (int) (Math.random() * 10 + 1);
	}

	/**
	 * Devuelve el area del circulo.
	 * 
	 * @return el area del circulo
	 */
	public double area() {
		return Math.PI * radio * radio;
	}

	/**
	 * Devuelve el perimetro del rectangulo.
	 * 
	 * @return el perimetro del circulo
	 */
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	/**
	 * Getter del radio
	 * 
	 * @return radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * Setter del radio
	 * 
	 * @param nuevo radio
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * toString del circulo
	 * 
	 * @return representacion en forma de string del circulo
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
