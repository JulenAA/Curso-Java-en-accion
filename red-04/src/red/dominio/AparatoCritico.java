package red.dominio;

public class AparatoCritico extends Aparato {

	public AparatoCritico(String nombre, int consumo) {
		super(nombre, consumo);
	}

	@Override
	public void solicitudApagado() {
		// ignoramos peticion
		System.out.println("ignoramos petición de apagado " + this.toString());
	}

}
