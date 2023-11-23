package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Docente {
		
		//@GeneratedValue (strategy = GenerationType.AUTO)
		//@Column(name = "id")
		//private Long id;
		private String name;
		@Column
		private String lastName;
		@Column
		private LocalDate fechaNac;
		@Id
		@Column(unique = true)
		private Integer dni;
		@Column
		private String gender;
		@Column
		private String adressCity;
		@Column
		private String adressEmail;
		@Column
		private String phoneNumber;
		@Column
		private Boolean estado;
		
		public Docente() {
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


		public String getAdressCity() {
			return adressCity;
		}

		public void setAdressCity(String adressCity) {
			this.adressCity = adressCity;
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

		public Integer getDni() {
			return dni;
		}

		public void setDni(Integer dni) {
			this.dni = dni;
		}
		
		public String getGender() {
			return gender;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}

		public void modificarDni(Integer nuevoDni) {
	       
	        if (validarDni(nuevoDni)) {
	            this.dni = nuevoDni;
	            System.out.println("DNI modificado correctamente.");
	        } else {
	            System.out.println("Error: El nuevo DNI no es válido.");
	        }
	    }

	    // Método para validar el DNI
	    private boolean validarDni(Integer dni) {
	        return dni.toString().length() == 8;
	    }

}