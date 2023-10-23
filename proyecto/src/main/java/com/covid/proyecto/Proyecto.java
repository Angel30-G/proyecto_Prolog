/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.covid.proyecto;

import java.util.Map;
import org.jpl7.*;

public class Proyecto {

    public static void main(String[] args) {
        infectados infectado = new infectados();
        hechos hecho = new hechos();
        
        System.out.println("Personas infectadas");
        infectado.valoresX();
        
        System.out.println("Personas Contagiadas");
        infectado.valoresY();
        
        System.out.println("Consultas:");
        hecho.consultas();
        
       
    }
}
