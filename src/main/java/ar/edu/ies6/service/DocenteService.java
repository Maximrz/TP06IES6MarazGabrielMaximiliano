package ar.edu.ies6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.repository.DocenteRepository;

@Service
public class DocenteService {
	
	@Autowired
	DocenteRepository docenteRepository;
		
	public void guardarDocente(Docente docente) {
		//metodo para guardar
		
		docente.setEstado(true);
		docenteRepository.save(docente);
		
		}

		public void eliminarDocente(Integer dni) throws Exception {
		//elimina un objeto por su identificador

			Docente auxiliar = new Docente();
			auxiliar = encontrarUnDocente(dni);
			auxiliar.setEstado(false);
			docenteRepository.save(auxiliar);
		
		}

		public List<Docente> buscarTodosDocente() {
		//algoritmo para buscar alumnos
				
		return (List<Docente>) docenteRepository.findByEstado(true);
		
		}
		
		//metodo para modificar
		public void modificarAlumno(Docente docente) {
			
		}
		
		public Docente encontrarUnDocente(Integer dni) throws Exception {
			return docenteRepository.findById(dni).orElseThrow(() -> new Exception("Docente no encontrado"));
		}

}
