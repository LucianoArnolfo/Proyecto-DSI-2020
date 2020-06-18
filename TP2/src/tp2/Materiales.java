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
public class Materiales {
    private String Descripcion;
    private double Precio;

    public Materiales(String Descripcion, double Precio) {
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
