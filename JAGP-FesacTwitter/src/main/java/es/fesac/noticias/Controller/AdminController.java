package es.fesac.noticias.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.noticias.Model.Usuario;
import es.fesac.noticias.bean.LoginBean;
import es.fesac.noticias.dao.LoginRepository;

@Controller
public class AdminController {
	
	@Autowired
	private LoginRepository loginDao;
	
	 @PostMapping(value="/validarUsuario")   
	   public String validarLogin(@ModelAttribute("usuarioLoginBean") LoginBean loginBean, 
				  Model model) {
		Usuario user =  loginDao.findByUsuarioAndPassword(loginBean.getUsuario(), loginBean.getPassword());
		if (user!=null) {
			model.addAttribute("Usuario", "Usuario: "+loginBean.getUsuario());
		}		
		 return "paginaPrincipal";
	  }

}
