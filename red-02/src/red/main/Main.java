package red.main;

import java.util.HashSet;
import java.util.Set;

import red.dominio.Aparato;
import red.dominio.Red;

public class Main {
	
	public static void main(String[] args) {
		Aparato tele = new Aparato(30);
		
		//tele.setEncendido(true);
		tele.encender();
		
		Red miRed = new Red(25);
		
		miRed.addAparato(tele);
		
		System.out.println("tele encendida? " + tele.isEncendido() + " , consumo: " + tele.getConsumo());
		System.out.println("mi red tiene " + miRed.size() + " aparatos");
		System.out.println("consumo actual red " + miRed.getConsumoActual());
		System.out.println("es la red estable? " + (miRed.esEstable()));
	}

}
