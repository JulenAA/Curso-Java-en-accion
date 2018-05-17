package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.Aparato;
import red.dominio.Red;
import red.dominio.SistemaSeguridad;
import red.dominio.SistemaSeguridadBasico;
import red.dominio.SistemaSeguridadMenorPotenciaPrimero;

public class Main {
	
	public static void main(String[] args) {
		Aparato tele = new Aparato("Television", 30);
		Aparato radio = new Aparato("Radio", 35);
		
		//tele.setEncendido(true);
		tele.encender();
		radio.encender();
		
		Red miRed = new Red(40);
		
		miRed.addAparato(tele);
		miRed.addAparato(radio);
		
		/*System.out.println("tele encendida? " + tele.isEncendido() + " , consumo: " + tele.getConsumo());
		System.out.println("mi red tiene " + miRed.size() + " aparatos");
		System.out.println("consumo actual red " + miRed.getConsumoActual());
		System.out.println("es la red estable? " + (miRed.esEstable()));*/
		
		//SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadBasico(miRed);
		SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed);
		miSistemaSeguridad.actua();
		
		System.out.println("es la red estable? " + (miRed.esEstable()));
		System.out.println("estado final de la red : " + miRed.toString());
		
	}

}
