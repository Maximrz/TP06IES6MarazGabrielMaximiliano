package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.DocenteService;

@Controller
public class DocenteController {
	@Autowired                                           
	Docente doc;
	
	@Autowired
	DocenteService docenteService;

	@GetMapping({ "/docente"})
	public ModelAndView cargarDocente() {
		
		//Mandar el objeto a la vista
		ModelAndView modelView = new ModelAndView("docente");
		
		modelView.addObject("docente", doc);
		
		return modelView;
	}

	//procesar los datos del formulario
	
	@PostMapping("/cargarDocente")
    public ModelAndView cargarDocente(@ModelAttribute("docente") Docente docente) {
		
        //Ahora se guarda en el BD
		docenteService.guardarDocente(docente);
		
		ModelAndView modelView = new ModelAndView ("listadoDocentes");
		
		//buscar desde la BD
		modelView.addObject("listado", docenteService.buscarTodosDocente());
		
		return modelView;	
	}
	
	//método para eliminar un registro
	
	@GetMapping("/eliminarDocente/{dni}")
	public String eliminarDocente(@PathVariable Integer dni) throws Exception {
		docenteService.eliminarDocente(dni);		
		
		//return modelView;
		return "redirect:/mostrarListadoDocentes";

		}
	
	@GetMapping("/mostrarListadoDocentes")
	public ModelAndView mostrarDocente() {
		
		ModelAndView listado = new ModelAndView("listadoDocentes");
		listado.addObject("listado", docenteService.buscarTodosDocente());
		
		return listado;
		}
	
	//método para modificar un registro
	
	@GetMapping("/modificarDocente/{dni}")
	public ModelAndView modificarDocente(@PathVariable Integer dni) throws Exception {
		ModelAndView modificarDocente = new ModelAndView("index");
		modificarDocente.addObject("docente", docenteService.encontrarUnDocente(dni));
		return modificarDocente;	
	}
	
	@PostMapping("/modificarDocente")
    public ModelAndView modificarUnDocente(@ModelAttribute("docente") Docente docente) {
 	
		docenteService.guardarDocente(docente);
		ModelAndView modelView = new ModelAndView ("listadoDocentes");
		
		modelView.addObject("listado", docenteService.buscarTodosDocente());
		
		return modelView;
	}

}
