package ar.edu.ies6.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.ies6.model.Alumno;

@Service
public class AlumnoService {
	public void guardarAlumno(Alumno alumno) {
		//metodo para guardar
		}

		public void eliminarAlumno(Integer dni) {
		//elimina un objeto por su identificador
		}

		public List<Alumno> buscarTodosAlumno() {
		//algoritmo para buscar alumnos
		List<Alumno> listado = new ArrayList<>();
		return listado;
		}
		
		public void modificarAlumno(Alumno alumno) {
			//metodo para modificar
		}

}
