package com.mayab.patrones.adapter;

public class PersonaAdapter implements PersonaVieja {

	private PersonaNueva persona;
	
	public PersonaAdapter(PersonaNueva persona) {
		this.persona = persona;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		String[] nombreCompleto = persona.getNombreCompleto().split("\\s+");
		return nombreCompleto[0];
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		String[] nombreCompleto = persona.getNombreCompleto().split("\\s+");
		nombreCompleto[0] = nombre;
		String nombreNuevo = nombreCompleto[0] + " " + nombreCompleto[1];
		persona.setNombreCompleto(nombreNuevo);
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		String[] nombreCompleto = persona.getNombreCompleto().split("\\s+");
		return nombreCompleto[1];
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		String[] nombreCompleto = persona.getNombreCompleto().split("\\s+");
		nombreCompleto[1] = apellido;
		String nombreNuevo = nombreCompleto[0] + " " + nombreCompleto[1];
		persona.setNombreCompleto(nombreNuevo);
	}

	@Override
	public String getFechaDeNacimiento() {
		// TODO Auto-generated method stub
		int año = 2019-persona.getEdad();
		return "DD-MM-"+año;
	}

	@Override
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		// TODO Auto-generated method stub
		String año = fechaDeNacimiento.substring(fechaDeNacimiento.length() - 4);
		int nuevoValor = Integer.parseInt(año);
		nuevoValor = 2019 - nuevoValor;
		persona.setEdad(nuevoValor);
	}
	
}
