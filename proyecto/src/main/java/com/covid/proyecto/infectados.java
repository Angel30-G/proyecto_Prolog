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
public class infectados {
    
    public infectados(){
        
    
 }
    
      public void valoresY() {
        Query q = new Query("consult('covid-19.pl')");
        q.hasSolution();
        
        q = new Query("infects(X, Y)");
        
        Map<String, Term>[] res = q.allSolutions();
        
        for(int i = 0; i< res.length; i++){
            System.out.println(res[i].get("Y"));
        }
    }
    
}
