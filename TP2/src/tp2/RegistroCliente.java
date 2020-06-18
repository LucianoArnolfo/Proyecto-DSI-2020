/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import java.util.ArrayList;
/**
 *
 * @author lucia
 */
public class RegistroCliente {
    public static ArrayList<Cliente>Clientes = new ArrayList();

    public RegistroCliente() {
        Clientes.add(new Cliente("Luciano", "Arnolfo","12312"));
    }
    
    
}
