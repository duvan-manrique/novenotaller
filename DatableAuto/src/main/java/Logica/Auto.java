/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ivan camilo
 * @author  duvan canon
 */
public class Auto {
    private String nombre ;//string para el nombre del carro
    private String marca ;//string para el marca del carro
    private int modelo ;//entero para el modelo del carro

     /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
  /**
     * Metodo para asignar el nombre
     * @param nombre del carro
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 /**
     * Metodo para obtener la marca
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
 /**
     * Metodo para asignar el nombre
     * @param marca  del carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
  /**
     * Metodo para obtener el modelo
     * @return modelo
     */
    public int getModelo() {
        return modelo;
    }
 /**
     * Metodo para asignar el nombre
     * @param modelo del carro
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
}
