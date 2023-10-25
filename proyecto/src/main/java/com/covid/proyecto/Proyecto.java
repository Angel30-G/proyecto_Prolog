/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.covid.proyecto;

import java.util.Map;
import org.jpl7.*;

public class Proyecto {

    public static void main(String[] args) {
        infectados infectado = new infectados();
        reglas regla = new reglas();
        sintomas sintoma = new sintomas();
        vacunas vacuna = new vacunas();
        
        System.out.println("Personas infectadas");
        infectado.valoresX();
        
        System.out.println("Personas Contagiadas");
        infectado.valoresY();
        
        System.out.println("Personas con Sintomas:");
        System.out.println("Personas con Fiebre:");
        sintoma.fiebre();
        System.out.println("Personas con Tos:");
        sintoma.tos();
        System.out.println("Personas con Dificultades para respirar:");
        sintoma.dificultad_respirar();
        
        
        System.out.println("Consultas:");
        //Personas que contagiaron a otra
        regla.contagiar();
        
        //Persona que esta en cuarenta
        regla.cuarentena();
        
        //Personas que han tenido contacto con otras
        regla.contacto();
        
        
        regla.contagiar_indirectamente();
        
        regla.cuarentena_por_contacto();
        
        
        System.out.println("Consultas de las vacunas:");
        vacuna.fizer();
        vacuna.moderna();
        vacuna.johnson();
        vacuna.dosis_completa();
        vacuna.dosis_refuerzo();
        vacuna.problemas_salud();
        vacuna.prueba_covid();
        vacuna.prueba_covid_positivo();
        vacuna.prueba_covid_negativo();
        vacuna.prueba_covid_sugerida();
        vacuna.prueba_covid_seguimiento();
       
        
       
    }
}
