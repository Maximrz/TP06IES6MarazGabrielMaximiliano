package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String name;
	private String lastName;
	private LocalDate fechaNac;
	private Integer dni;
	//private Integer edad;
	private String adressStreet;
	private String adressBarrio;
	private Integer adressNumber;
	private String adressCity;
	private String departamento;
	private Integer postCode;
	private String adressEmail;
	private String phoneNumber;
	private Boolean estado;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getAdressStreet() {
		return adressStreet;
	}

	public void setAdressStreet(String adressStreet) {
		this.adressStreet = adressStreet;
	}

	public String getAdressBarrio() {
		return adressBarrio;
	}

	public void setAdressBarrio(String adressBarrio) {
		this.adressBarrio = adressBarrio;
	}

	public Integer getAdressNumber() {
		return adressNumber;
	}

	public void setAdressNumber(Integer adressNumber) {
		this.adressNumber = adressNumber;
	}

	public String getAdressCity() {
		return adressCity;
	}

	public void setAdressCity(String adressCity) {
		this.adressCity = adressCity;
	}

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}

	public String getAdressEmail() {
		return adressEmail;
	}

	public void setAdressEmail(String adressEmail) {
		this.adressEmail = adressEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
		
	public Integer getEdad() {
		int edad = 0;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNac, fechaActual);
		edad = periodo.getYears();
		return edad;
	}

	public Integer setEdad(Integer edad) {
		return edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
}
