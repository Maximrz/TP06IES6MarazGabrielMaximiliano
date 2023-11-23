package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.service.AlumnoService;
import ch.qos.logback.core.model.Model;


@Controller
public class AlumnoController {
	
	@Autowired
	Alumno alu;
	
	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping({"/index"})
	public String index(Model model) {
		return "index";
	}

	@GetMapping({"/alumno"})
	public ModelAndView cargarAlumno() {
		
		//alu.setFechaNac(LocalDate.of(1988, 8, 20));
		//System.out.println("Edad: "+alu.obtenerEdad());
		
		ModelAndView modelView = new ModelAndView ("alumno");
		modelView.addObject("alumno", alu);
		
		return modelView;	
	}
	
	//procesar los datos del formulario

	@PostMapping("/cargarAlumno")
    public ModelAndView cargarAlumno(@ModelAttribute("alumno") Alumno alumno) {
 	
		//ListadoAlumnos.getListado().add(alumno);
		
        //Ahora se guarda en el BD
		alumnoService.guardarAlumno(alumno);
		
		
		ModelAndView modelView = new ModelAndView ("listadoAlumnos");
		
		//modelView.addObject("listado", ListadoAlumnos.getListado());
		//buscar desde la BD
		modelView.addObject("listado", alumnoService.buscarTodosAlumno());
		
		return modelView;	
	}
	
	//método para eliminar un registro
	
	@GetMapping("/eliminarAlumno/{dni}")
	public String eliminarAlumno(@PathVariable Integer dni) throws Exception {
		alumnoService.eliminarAlumno(dni);		
		
		//return modelView;
		return "redirect:/mostrarListado";

		}
	
	@GetMapping("/mostrarListado")
	public ModelAndView mostrarAlumnos() {
		
		ModelAndView listado = new ModelAndView("listadoAlumnos");
		listado.addObject("listado", alumnoService.buscarTodosAlumno());
		
		return listado;
		}	
	
	//método para modificar un registro
	
	@GetMapping("/modificarAlumno/{dni}")
	public ModelAndView modificarAlumno(@PathVariable Integer dni) throws Exception {
		ModelAndView modificarAlumno = new ModelAndView("alumno");
		modificarAlumno.addObject("alumno", alumnoService.encontrarUnAlumno(dni));
		return modificarAlumno;	
	}
	
	@PostMapping("/modificarAlumno")
    public ModelAndView modificarUnAlumno(@ModelAttribute("alumno") Alumno alumno) {
 	
		alumnoService.guardarAlumno(alumno);
		ModelAndView modelView = new ModelAndView ("listadoAlumnos");
		
		modelView.addObject("listado", alumnoService.buscarTodosAlumno());
		
		return modelView;
	}
}