package red.main;

import red.dominio.Aparato;

public class Main {
	
	public static void main(String[] args) {
		Aparato tele = new Aparato();
		
		//tele.setEncendido(true);
		tele.encender();
		
		System.out.println("tele encendida? " + tele.isEncendido());
		
	}

}
