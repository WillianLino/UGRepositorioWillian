package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Turistas")
public class Turistas {
	@Id
	@Column(name = "idTurista")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private int idTurista;
	private int identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    
	public Turistas() {
	}


	public Turistas(int idTurista, int identificacion, String nombres, String apellidos, String direccion,
			String telefono, String email) {
		
		this.idTurista = idTurista;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}


	public void imprimir() {
		System.out.println(idTurista);
	}

	public int getidTurista() {
		return idTurista;
	}
	
	public void setidTurista(int idTurista) {
		this.idTurista = idTurista;
	}
	
	public int getidentificacion() {
		return identificacion;
	}
	
	public void setidentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getnombres() {
		return nombres;
	}
	
	public void setnombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getapellidos() {
		return apellidos;
	}
	
	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String gettelefono() {
		return telefono;
	}
	
	public void settelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	
    
    
}
