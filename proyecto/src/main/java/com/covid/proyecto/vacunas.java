/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.covid.proyecto;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author pc
 */
public class vacunas {
    public vacunas(){
        
    }
    
    public void fizer() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("fue_vacunado_pfizer(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Fue vacunado con fizer: " + persona1.toString());
        }

        

    }
    
    
     public void moderna() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("fue_vacunado_moderna(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Fue vacunado con moderna: " + persona1.toString());
        }

        

    }
     
         public void johnson() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("fue_vacunado_johnson(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Fue vacunado con moderna: " + persona1.toString());
        }

        

    }
         
        public void dosis_completa() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("recibio_dosis_completa(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Recibió la primera y segunda dosis: " + persona1.toString());
        }

        
    }
        
        
        public void dosis_refuerzo() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("elegible_para_refuerzo(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Recibió la dosis completa hace mucho tiempo: " + persona1.toString());
        }

        
    }
        
        
         public void problemas_salud() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("tiene_condicion_salud_subyacente(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("Tiene sintomas de otras enfermedades: " + persona1.toString());
        }

        
    }
         
         
          public void prueba_covid() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("se_hizo_prueba_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("La siguiente persona se hizo la prueba del Covid: " + persona1.toString());
        }

        
    }
          
          
        public void prueba_covid_positivo() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("dio_positivo_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("La siguiente persona tuvo un resultado positivo en la prueba del covid: " + persona1.toString());
        }

        
    }
          
        
       public void prueba_covid_negativo() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("dio_negativo_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("La siguiente persona tuvo un resultado negativo en la prueba del covid: " + persona1.toString());
        }

        
    }
          
       
         public void prueba_covid_sugerida() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("necesita_prueba_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("La siguiente persona presenta sintomas y debe de realizarse la prueba: " + persona1.toString());
        }

        
    }
         
         
       public void prueba_covid_seguimiento() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
        if (loadQuery.hasSolution()) {
            System.out.println("Archivo Prolog cargado correctamente.");
        } else {
            System.out.println("Error al cargar el archivo Prolog.");
            return;
        }

        // Realizar consultas para recuperar reglas específicos
        Query q1 = new Query("necesita_prueba_seguimiento_covid(Persona)");
        Map<String, Term>[] res = q1.allSolutions();

        for (int i = 0; i < res.length; i++) {
            Term persona1 = res[i].get("Persona");
            System.out.println("La siguiente persona dio positivo en la prueba del covid y necesita un seguimiento de sus sintomas: " + persona1.toString());
        }

        
    }
    
}
