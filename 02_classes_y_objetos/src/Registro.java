
class Registro {
	
	/**
	 * Modifica el nombre de la persona pasada como 
	 * parametro, con el valor del parametro nuevoNombre
	 */
	void modificaNombre (Persona persona, String nuevoNombre) {
		persona.nombre = nuevoNombre;
	}
	
	
	/**
	 * Crea un nuevo objeto del tipo persona y
	 * le asigna el nombre indicado en el parametro.
	 * Finalmente devuelve este objeto creado
	 */
     Persona alta (String nombre) {
    	 Persona nuevaPersona = new Persona();
    	 nuevaPersona.nombre = nombre;
    	 return nuevaPersona;
     }
     
     // Para los siguientes ejercicios, id al fichero test -> (default package) -> TestRegistro
}
