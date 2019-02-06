package es.fesac.noticias.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Mensaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Lob
	private String mensaje;	
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private List<Comentario> myList = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Comentario> getMyList() {
		return myList;
	}
	public void setMyList(List<Comentario> myList) {
		this.myList = myList;
	}
	
	
	
}
