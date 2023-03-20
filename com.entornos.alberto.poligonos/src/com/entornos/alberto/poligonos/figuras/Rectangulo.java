package com.entornos.alberto.poligonos.figuras;

import java.util.Random;

/**
 * 
 * @author Alberto
 * 
 * @version 1.0
 *
 */
public class Rectangulo {
	
    int altura;
    int anchura;

    /**
     * Crea un rectangulo con la altura y la anchura especificadas.
     *
     * @param altura    la altura del rectangulo
     * @param anchura   la anchura del rectangulo
     */
    public Rectangulo (int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }
    
    
    /**
     * Crea un rectangulo con la altura y la anchura aleatorios. Ambas
     * seran numeros aleatorios enteros entre 1 y 10.
     * 
     * @see java.util.Random
     * */
    public Rectangulo() {
    	Random r = new Random();
    	altura = r.nextInt(1, 11);
    	anchura = r.nextInt(1, 11);
    }

    /**
     * Devuelve el perimetro del rectangulo, es decir, la suma de todos los lados.
     *
     * @return  el perimetro del rectangulo
     */
    public int perimetro() {
        return altura*2 + anchura*2;
    }

    /**
     * Devuelve el area del rectangulo.
     *
     * @return el area del rectangulo
     */
    public int area() {
        return altura*anchura;
    }

	
	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [anchura=" + anchura + ", altura=" + altura + "]";
	}
	
}
