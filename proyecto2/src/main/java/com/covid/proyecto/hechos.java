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
public class hechos {
    public hechos(){
        
    }
    
   public void infectado() {
         
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
        Query q1 = new Query("esta_infectado(Persona)");
        Map<String, Term>[] res1 = q1.allSolutions();

        for (int i = 0; i < res1.length; i++) {
            Term persona1 = res1[i].get("Persona");
            System.out.println("Nombre de personas infectadas: " + persona1.toString());
        }

        

    }
     
           public void personas_enfermas() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("infects(X, Y)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
            Term persona1 = res[i].get("X");
            System.out.println("Persona enferma: " + persona1.toString());
        }
            
    }
      
       public void personas_contagiadas() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("infects(X, Y)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
            Term persona1 = res[i].get("Y");
            System.out.println("Persona contagiada: " + persona1.toString());
        }
    }
       
       public void fiebre() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_fiebre(Persona)");
        
        Map<String, Term>[] res1 = q.allSolutions();
        
        for(int i = 0; i< res1.length; i++){
             Term persona1 = res1[i].get("Persona");
            System.out.println("Persona con fiebre: " + persona1.toString());
        }
    }
      
       public void tos() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_tos(Persona)");
        
        Map<String, Term>[] res2 = q.allSolutions();
        
        for(int i = 0; i< res2.length; i++){
             Term persona1 = res2[i].get("Persona");
            System.out.println("Persona con tos: " + persona1.toString());
        }
    }
       
      
       public void dificultad_respirar() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_dificultad_respirar(Persona)");
        
        Map<String, Term>[] res3 = q.allSolutions();
        
        for(int i = 0; i< res3.length; i++){
             Term persona1 = res3[i].get("Persona");
            System.out.println("Persona con problemas para respirar: " + persona1.toString());;
        }
    }
       
       
              
       public void primera_dosis() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("primera_dosis(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que recibió la primera dosis: " + persona1.toString());;
        }
    }
          
       public void segunda_dosis() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("segunda_dosis(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que recibió la segunda dosis: " + persona1.toString());;
        }
    }
     
       
        public void prueba_covid() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("prueba_covid(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que se hizo la prueba del covid: " + persona1.toString());
        }
    }
        
         public void resultado_prueba() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("resultado_prueba_covid(Persona, Resultado)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
            Term persona1 = res[i].get("Persona");
            Term persona2 = res[i].get("Resultado");
            System.out.println("Nombre de la persona " + persona1.toString() + " Resultado de la prueba:" + persona2.toString());
          }
        }
         
        public void tiene_diabetes() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_diabetes(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que tiene diabetes: " + persona1.toString());
        }
    }
    
            
        public void tiene_enfermedad_cardiaca() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_enfermedad_cardiaca(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que tiene enfermedad cardica: " + persona1.toString());;
        }
    }
        
        
       public void tiene_enfermedad_pulmonar_cronica() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_enfermedad_pulmonar_cronica(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que tiene enfermedad pulmonar cronica: " + persona1.toString());;
        }
    }
       
          public void esta_en_cuarentena() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("esta_en_cuarentena(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que esta en cuarentena: " + persona1.toString());;
        }
    }
          
          
                
       public void paso_tiempo_suficiente_desde_ultima_dosis() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("paso_tiempo_suficiente_desde_ultima_dosis(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que necesitan una vacuna de refuerzo: " + persona1.toString());;
        }
    }
       
       
      public void paso_tiempo_suficiente_desde_ultima_prueba() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("paso_tiempo_suficiente_desde_ultima_prueba(Persona)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
             Term persona1 = res[i].get("Persona");
            System.out.println("Persona que llevan mucho tiempo sin realizarse la prueba del covid: " + persona1.toString());;
        }
    }
       
       
    
}
