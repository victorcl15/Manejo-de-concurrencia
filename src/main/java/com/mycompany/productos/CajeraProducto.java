/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import com.mycompany.productos.cliente.producto.ClienteProducto;
import com.mycompany.productos.cliente.producto.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author GAME
 */
public class CajeraProducto {
    
    
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        
        
        System.out.println("La cajera "+this.nombre+ " Comienza a procesar la compra del cliente "
        + cliente.getNombre() + " en el tiempo: "+(System.currentTimeMillis() - timeStamp)/1000
        + " seg");
        
        int contClientes = 1;
        for (Producto producto : cliente.getProductos()){
            
            this.esperarXsegundos();
            System.out.println("Procesado el producto " + contClientes 
                    + " nombre producto "+ producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad de productos "+ producto.getCantidad() 
                    + " costo total del producto "
                    + producto.getCantidad() * producto.getPrecio() 
                    + " tiempo: "+ (System.currentTimeMillis() - timeStamp) / 1000 
                    + " seg");
        }
        System.out.println("La cajera "+ this.nombre + " ha terminado de procesar "
                + cliente.getNombre() + " en el tiempo: " 
                + (System.currentTimeMillis() - timeStamp) / 1000 
                    + " seg");
        JOptionPane.showMessageDialog(null, "La cajera "+ this.nombre + " ha terminado de procesar el/la cliente "
                + cliente.getNombre() + " en el tiempo: " 
                + (System.currentTimeMillis() - timeStamp) / 1000 
                    + " seg");
    }
    
    private void esperarXsegundos(){
        try{
            Thread.sleep(1000);
            
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
