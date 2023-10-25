/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.covid.proyecto;

import java.util.Map;
import org.jpl7.*;

public class Proyecto {

    public static void main(String[] args) {
        hechos hecho = new hechos();
        reglas regla = new reglas();
        
        System.out.println("Personas infectadas");
        hecho.personas_enfermas();
        
        System.out.println("Personas Contagiadas");
        hecho.personas_contagiadas();
        
        System.out.println("Personas con Sintomas:");
        System.out.println("Personas con Fiebre:");
        hecho.fiebre();
        System.out.println("Personas con Tos:");
        hecho.tos();
        System.out.println("Personas con Dificultades para respirar:");
        hecho.dificultad_respirar();
        
        
        System.out.println("Consultas:");
        //Personas que contagiaron a otra
        regla.contagiar();
        
        
        regla.dio_negativo_covid();
        
        regla.dio_positivo_covid();
        
        //Persona que esta en cuarenta
        
        //Personas que han tenido contacto con otras
        regla.contacto();
        
        
        regla.contagiar_indirectamente();
       
        
       
    }
}
