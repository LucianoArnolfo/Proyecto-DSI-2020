/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

import java.util.ArrayList;


public class Carrito {
    public static ArrayList<item>Productos = new ArrayList<item>();
    
     public static void Agregar(Producto producto, int cant) {
    item Item = new item();
    Item.Producto=producto;
    Item.Cant=cant;

   Productos.add(item);
     }
     
        public static void MostrarCarrito()
        {
            System.out.print("\n");
            System.out.print("Carrito: ");
             Double totalCarrito=0.0;
          
            for (item tem: Productos){
            
                Integer cantidad = tem.cant;
                Double precio = tem.Producto.Precio;
                String nombre = tem.Producto.Nombre;
                System.out.print(cantidad + "x " + nombre + " $" + cantidad * precio);

                totalCarrito=+ cantidad * precio;
            }

            System.out.print("Total: $" + totalCarrito);      
        }
     
}
