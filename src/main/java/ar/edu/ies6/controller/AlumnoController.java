package ar.edu.ies6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.ies6.model.Alumno;


@Controller
public class AlumnoController {

	@GetMapping({ "/index", "/", "/home", "/alumno" })
	public ModelAndView cargarAlumno() {
		
		Alumno alu = new Alumno();

		//Mandar el objeto a la vista
		ModelAndView modelView = new ModelAndView("index");
		
		modelView.addObject("alumno", alu);
		
		return modelView;
	}

}