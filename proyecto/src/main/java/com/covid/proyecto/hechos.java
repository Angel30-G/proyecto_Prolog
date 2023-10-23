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
public class hechos {
    
       public hechos(){
           
       }
        
     public void contagiar() {
         
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

        // Realizar consultas para recuperar hechos específicos
        Query q1 = new Query("puede_contagiar(Persona1, Persona2)");
        Map<String, Term>[] res1 = q1.allSolutions();

        for (int i = 0; i < res1.length; i++) {
            Term persona1 = res1[i].get("Persona1");
            Term persona2 = res1[i].get("Persona2");
            System.out.println("puede_contagiar: " + persona1.toString() + " a " + persona2.toString());
        }

        

    }
     
         public void cuarentena() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
   

        // Realizar consultas para recuperar hechos específicos
        Query q1 = new Query("esta_en_cuarentena(Persona)");
        Map<String, Term>[] res2 = q1.allSolutions();

        for (int i = 0; i < res2.length; i++) {
            Term persona1 = res2[i].get("Persona");
            System.out.println("Esta persona esta en cuarentena: " + persona1.toString());
        }

        

    }
         
        public void contacto() {
         
          // Inicializa JPL
        String[] jplArgs = {"-g", "true"};
        org.jpl7.JPL.init(jplArgs);

        // Cargar el archivo Prolog
        Query loadQuery = new Query("consult('covid-19.pl')");
 
        // Realizar consultas para recuperar hechos específicos
        Query q1 = new Query("es_contacto_estrecho(Persona1, Persona2)");
        Map<String, Term>[] res3 = q1.allSolutions();

        for (int i = 0; i < res3.length; i++) {
            Term persona1 = res3[i].get("Persona1");
            Term persona2 = res3[i].get("Persona2");
            System.out.println("Han tenido contacto: " + persona1.toString() + " y " + persona2.toString());
        }

        

    }
       
       
       

    

     }
   