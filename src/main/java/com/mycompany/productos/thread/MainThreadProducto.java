/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos.thread;

import com.mycompany.productos.cliente.producto.ClienteProducto;
import com.mycompany.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GAME
 */
public class MainThreadProducto {

    
   
    public static void main(String[] args) {
        /*
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Juan", productos);
        ClienteProducto cliente2 = new ClienteProducto("Maria", productos);

        long initialTime = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Andrea", cliente1, initialTime);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Pedro", cliente2, initialTime);
        
        
        cajera1.start();
        cajera2.start();
        */
        Interfaz interfaz = new Interfaz();
        
        interfaz.setVisible(true);
        
        
    }

    private static void setProductos(List<Producto> productos) {
        
        
        /*
        Producto producto1 = new Producto("Sandia", 1000, 5);
        Producto producto2 = new Producto("Melon", 50, 2);
        Producto producto3 = new Producto("Naranja", 500, 12);

      productos.add(producto1);
      productos.add(producto2);
      productos.add(producto3);
      
*/
    }
}
