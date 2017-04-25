package cTeoria.c03;

public class Alien {
	/**
	 * @param p_nombre
	 * @param p_queEspecie
	 * @param p_origen
	 */
	public Alien(String p_nombre, Especie p_queEspecie, Planeta p_origen) {
		// this.nombre = nombre;
		// this.origen = new Planeta();
		// this.origen.setDenominacion =("Tierra");
		// this.queEspecie = new Especie();
		// this.queEspecie.setNombreEspecie("Hombre");
		this(nombre, new Especie(), new Planeta());
	}
	private int idAlien;
	private String nombre;
	private Especie queEspecie;
	private Planeta origen;
	
	public int getIdAlien() {
		return idAlien;
	}
	public void setIdAlien(int idAlien) {
		this.idAlien = idAlien;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Especie getQueEspecie() {
		return queEspecie;
	}
	public void setQueEspecie(Especie queEspecie) {
		this.queEspecie = queEspecie;
	}
	public Planeta getOrigen() {
		return origen;
	}
	public void setOrigen(Planeta origen) {
		this.origen = origen;
	}

}
