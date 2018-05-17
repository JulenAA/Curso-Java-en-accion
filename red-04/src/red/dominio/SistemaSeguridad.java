package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {
	
	protected Red red;
	
	public SistemaSeguridad(Red red){
		this.red = red;
	}
	public boolean actua(){
		System.out.println("empezando actuacion sistema de seguridad");
		for(Aparato aparato: getAparatos()){
			if(red.esEstable()){
				System.out.println("equilibrio alcanzado : salimos");
				break;
			}
			aparato.solicitudApagado();
			/*if(! (aparato instanceof AparatoCritico)){
				System.out.println("apagamos : " + aparato);
				aparato.apagar();
			} else {
				System.out.println("evitamos por ser critico : " + aparato);
			}*/
			
		}
		return red.esEstable();
	}
	
	protected abstract List<Aparato> getAparatos();

}
