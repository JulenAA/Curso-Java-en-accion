
class Persona {

	String nombre;
	Persona jefe;
	Mascota mascota;
	
	public boolean tieneNombre(){
		if(nombre == null || "".equals(nombre))
			return false;
		else
			return true;
	}
}
