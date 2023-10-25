/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.covid.proyecto;

import org.jpl7.Query;
import org.jpl7.Term;
import java.util.Map;
import org.jpl7.*;
/**
 *
 * @author pc
 */
public class reglas {

    public reglas(){
    }

    private boolean conexion_pl() {
        // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
            return true;
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return false;
        }
    }

    public void infectado() {

        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("persona_infectada(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Nombre de la persona contagiada: " + persona1.toString());
        }
    }
        
    public void contagiar() {

        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("puede_contagiar(Persona1, Persona2)");
        Map<String, Term>[] res1 = q1.allSolutions();

        for (int i = 0; i < res1.length; i++) {
            Term persona1 = res1[i].get("Persona1");
            Term persona2 = res1[i].get("Persona2");
            System.out.println("puede_contagiar: " + persona1.toString() + " a " + persona2.toString());
        }
    }
     
         
    public void contacto() {

        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }
 
        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("es_contacto_estrecho(Persona1, Persona2)");
        Map<String, Term>[] res3 = q1.allSolutions();

        for(int i = 0; i < res3.length; i++) {
            Term persona1 = res3[i].get("Persona1");
            Term persona2 = res3[i].get("Persona2");
            System.out.println("Han tenido contacto: " + persona1.toString() + " y " + persona2.toString());
        }
    }
        
        
    public void contagiar_indirectamente() {

        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }
 
        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("puede_contagiar_indirectamente(Persona1, Persona2)");
        Map<String, Term>[] res3 = q1.allSolutions();

        for (int i = 0; i < res3.length; i++) {
            Term persona1 = res3[i].get("Persona1");
            Term persona2 = res3[i].get("Persona2");
            System.out.println("Ha contagiado " + persona1.toString() + " indirectamente a " + persona2.toString());
        }
    }

    public void es_contacto_estrecho_indirecto() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("es_contacto_estrecho_indirecto(Persona1, Persona2)");
        Map<String, Term>[] res3 = q1.allSolutions();

        for (int i = 0; i < res3.length; i++) {
            Term persona1 = res3[i].get("Persona1");
            Term persona2 = res3[i].get("Persona2");
            System.out.println(persona1.toString() + " tiene contacto estrecho indirecto con " + persona2.toString());
        }

    }

    public void recibio_dosis_completa() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("recibio_dosis_completa(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que recibio dosis completa: " + persona1.toString());
        }

    }

    public void elegible_para_refuerzo() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("elegible_para_refuerzo(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona elegible para refuerzo: " + persona1.toString());
        }

    }

    public void tiene_condicion_salud_subyacente() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("tiene_condicion_salud_subyacente(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona con condicion de salud de riesgo: " + persona1.toString());
        }

    }

    public void se_hizo_prueba_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("se_hizo_prueba_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que se hizo prueba de covid: " + persona1.toString());
        }

    }

    public void dio_positivo_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("dio_positivo_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que dio positivo en prueba covid: " + persona1.toString());
        }

    }

    public void dio_negativo_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("dio_negativo_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que dio negativo en prueba covid: " + persona1.toString());
        }

    }

    public void necesita_prueba_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("necesita_prueba_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que necesita prueba covid: " + persona1.toString());
        }

    }

    public void necesita_prueba_seguimiento_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("necesita_prueba_seguimiento_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona que necesita prueba de seguimiento covid: " + persona1.toString());
        }

    }

    public void tiene_sintomas_covid() {
        // Inicializa conexion por medio de JPL
        if(!conexion_pl()) {
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("tiene_sintomas_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for(int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Persona con sintomas de covid: " + persona1.toString());
        }

    }
}
