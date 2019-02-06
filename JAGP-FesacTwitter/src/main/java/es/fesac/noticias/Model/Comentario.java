package es.fesac.noticias.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Lob
	private String comentario;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Mensaje mensaje;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Mensaje getMensaje() {
		return mensaje;
	}
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	

}
