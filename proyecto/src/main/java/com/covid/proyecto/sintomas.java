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
public class sintomas {
    
    public sintomas(){
        
    }
    
       public void fiebre() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_fiebre(Persona)");
        
        Map<String, Term>[] res1 = q.allSolutions();
        
        for(int i = 0; i< res1.length; i++){
            System.out.println(res1[i].get("Persona"));
        }
    }
      
       public void tos() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_tos(Persona)");
        
        Map<String, Term>[] res2 = q.allSolutions();
        
        for(int i = 0; i< res2.length; i++){
            System.out.println(res2[i].get("Persona"));
        }
    }
       
      
       public void dificultad_respirar() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("tiene_dificultad_respirar(Persona)");
        
        Map<String, Term>[] res3 = q.allSolutions();
        
        for(int i = 0; i< res3.length; i++){
            System.out.println(res3[i].get("Persona"));
        }
    }
    
}
