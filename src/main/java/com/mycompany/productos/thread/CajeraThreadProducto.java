/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos.thread;

import com.mycompany.productos.cliente.producto.ClienteProducto;
import com.mycompany.productos.cliente.producto.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GAME
 */
public class CajeraThreadProducto extends Thread {

    private String nombre;
    private ClienteProducto cliente;
    private long initialTime;
 

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    @Override
    public void run() {

        System.out.println(" La cajera" + this.nombre
                + " comienza a procesar la compra del cliente" + this.cliente.getNombre()
                + " en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");

        int contClientes = 1;
        for (Producto producto : cliente.getProductos()) {

            this.esperarXsegundos();
            System.out.println("Procesado el producto " + contClientes
                    + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad de productos " + producto.getCantidad()
                    + " costo total del producto "
                    + producto.getCantidad() * producto.getPrecio()
                    + " tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000
                    + " seg");
            
            contClientes++;
        }
        System.out.println("La cajero/a " + this.nombre + " ha terminado de procesar "
                + this.cliente.getNombre() + " en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg");
        JOptionPane.showMessageDialog(null, "La cajera " + this.nombre + "\n ha terminado de procesar el/la cliente "
                + this.cliente.getNombre() + "\n en el tiempo: "
                +(System.currentTimeMillis() - this.initialTime) / 1000
                + " seg");
        
        
        
        
        
    }
    
    

    
    private void esperarXsegundos(){
        
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
            Thread.currentThread().interrupt();
        }
    }
}
