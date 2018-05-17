
public class Mascota {
	
	Persona propietario;
	
	void fijaPropietario (Persona propietario){
		this.propietario = propietario;
		propietario.mascota = this;
	}

}
