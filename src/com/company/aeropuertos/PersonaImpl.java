package com.company.aeropuertos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.company.utiles.Checkers;

public class PersonaImpl implements Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;
	private String email;

	public PersonaImpl(String dni, String nombre, String apellidos,
			LocalDate fechaNacimiento, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}

	public PersonaImpl(String dni, String nombre, String apellidos,
			LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = null;
	}

	//	R1: el dni debe tener ocho dígitos y una letral final.
	//	R2: la fecha de nacimiento debe ser anterior a la fecha actual.
	//	R3: el email debe contener el carácter ‘@’.

	private static Boolean restriccionDni(String dni){
		Boolean res;
		res = (dni.length() == 9) && Character.isLetter(dni.charAt(dni.length() - 1));
		return res;
	}

	private static Boolean restriccionFechaNacimiento(LocalDate fechaNacimiento){
		Boolean res;
		res = fechaNacimiento.isBefore(LocalDate.now());
		return res;
	}

	private static Boolean restriccionEmail(String email){
		Boolean res;
		res = email.contains("@");
		return res;
	}

	public Integer getEdad() {
		return (int) getFechaNacimiento().until(LocalDate.now(),
				ChronoUnit.YEARS);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDNI() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		Checkers.checkNoNull(nombre);
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return getDNI()
				+ " - "
				+ getApellidos()
				+ ", "
				+ getNombre()
				+ " - "
				+ getFechaNacimiento().format(
						DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof Persona){
			res = this.getDNI().equals(((Persona) o).getDNI());
		}
		return res;
	}

	public int hashCode(){
		return this.getDNI().hashCode();
	}

	public int compareTo(Persona p){
		return this.getDNI().compareTo(p.getDNI());
	}
}

