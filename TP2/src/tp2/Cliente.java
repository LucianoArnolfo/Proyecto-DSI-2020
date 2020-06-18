/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author lucia
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Contrasena;

    public Cliente(String Nombre, String Apellido, String Contrasena) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    
    
}
