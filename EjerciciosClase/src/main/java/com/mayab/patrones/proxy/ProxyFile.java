package com.mayab.patrones.proxy;

public class ProxyFile implements File{
	
	public FileImp file;
	public Usuario usuario;
	
	public ProxyFile(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public void borrar() {
		if(usuario.getTipo() == "Super") {
			file.borrar();
		}
		else {
			System.out.print("No puedes eliminar archivos");
		}
		
	}

	@Override
	public void escribir() {
		file.escribir();
	}

	@Override
	public void leer() {
		file.leer();
	}
	
	public void CrearFile(String name) {
		file = new FileImp(name);
	}

}
