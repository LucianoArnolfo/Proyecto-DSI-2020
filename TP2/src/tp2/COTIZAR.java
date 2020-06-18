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
public class COTIZAR {
    private double Importe;
    private double MetrosCuadrados;

    public COTIZAR(double Importe, double MetrosCuadrados) {
        this.Importe = Importe;
        this.MetrosCuadrados = MetrosCuadrados;
    }

    public double getImporte() {
        return Importe;
    }

    public double getMetrosCuadrados() {
        return MetrosCuadrados;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public void setMetrosCuadrados(double MetrosCuadrados) {
        this.MetrosCuadrados = MetrosCuadrados;
    }
   
}
