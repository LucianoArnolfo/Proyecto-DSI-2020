
package Prototipo;


public class Usuario {
    private int id;
    private String Nombre;
    private String Email;
    private String Contraseña;
    
   

    public Usuario(int id, String Nombre, String Email, String Contraseña) {
        this.id = id;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Contraseña = Contraseña;
    
      
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

  
    
    
}
