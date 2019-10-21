/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Auto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ivan camilo
 * @author  duvan canon
 */
@ManagedBean
@RequestScoped
public class AutoBean {

    public AutoBean() {
    }

   private Auto Auto = new Auto();// objeto que contiene todos los datos del carro
    static  private List<Auto> ListAuto = new ArrayList();//listas del objeto de los datos del carro
      /**
     * Metodo para agregar el carro a la lista
     * 
     */
   public void agregar(){
       this.ListAuto.add(this.Auto);
    }
    /**
     * Metodo para obtener la lista de autos
     * @return ListAuto
     */
    public List<Auto> getListAuto() {
        return ListAuto;
    }
  /**
     * Metodo para asignar la lista a la lista global
     * @param ListAuto del carro
     */
    public void setListAuto(List<Auto> ListAuto) {
        this.ListAuto = ListAuto;
    }

    /**
     * Metodo para obtener el auto
     * @return auto
     */

    public Auto getAuto() {
        return Auto;
    }
 /**
     * Metodo para asignar el auto
     * @param Auto
     */
    public void setAuto(Auto Auto) {
        this.Auto = Auto;
    }
    
    
}
