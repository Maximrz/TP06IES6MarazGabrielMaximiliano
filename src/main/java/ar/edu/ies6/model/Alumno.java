package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Component
public class Alumno {
	@Column
	private String name;
	@Column
	private String lastName;
	@Column
	private LocalDate fechaNac;
	@Id
	//@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer dni;
	//private Integer edad;
	@Column
	private String adressStreet;
	@Column
	private String adressBarrio;
	@Column
	private Integer adressNumber;
	@Column
	private String adressCity;
	@Column
	private String localidad;
	@Column
	private Integer postCode;
	@Column
	private String adressEmail;
	@Column
	private String phoneNumber;
	@Column
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

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
}