package es.fesac.noticias.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import es.fesac.noticias.Model.Mensaje;
import es.fesac.noticias.dao.PostRepository;

@Controller
public class MensajesController {
	
	@Autowired
	PostRepository postRepository;
	
	// Mostrar el formulario
		@GetMapping(path = "/nuevoMensaje")
		public ModelAndView  nuevoMensaje(Model modelo) {
			List<Mensaje> listaMensajes = new ArrayList<Mensaje>();	
			
			ModelAndView  mv = new ModelAndView ();
			
			listaMensajes = postRepository.findAll();
			
			mv.setViewName("paginaPrincipal");
			mv.addObject("listaPost", listaMensajes);	
		
			

			// La cadena devuelta esta asociado con un nuevoPost.jsp
			return mv;

}
