package cl.model.pojos;
// Generated 10-19-2014 07:15:35 PM by Hibernate Tools 3.6.0


import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String nombre;
     private Usuario usuario;
     private String contrasena;
     private Clob correo;
     private String rol;
     private Set reclamos = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String contrasena, Clob correo, String rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.rol = rol;
    }
    public Usuario(String nombre, Usuario usuario, String contrasena, Clob correo, String rol, Set reclamos, Set usuarios) {
       this.nombre = nombre;
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.correo = correo;
       this.rol = rol;
       this.reclamos = reclamos;
       this.usuarios = usuarios;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Clob getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(Clob correo) {
        this.correo = correo;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Set getReclamos() {
        return this.reclamos;
    }
    
    public void setReclamos(Set reclamos) {
        this.reclamos = reclamos;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


