package ar.edu.ies6.model;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String name;
	private String lastName;
	private Date fechaNac;
	private Integer age;
	private String adressStreet;
	private String adressBarrio;
	private Integer adressNumber;
	private String adressCity;
	private Integer postCode;
	private String adressEmail;
	private Integer phoneNumber;
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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
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

	public void setBarrio(String adressBarrio) {
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

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
		
	public Integer getAge() {
		return age;
	}
	
	public Integer setAge(Integer age) {
		return age;
	}
}
