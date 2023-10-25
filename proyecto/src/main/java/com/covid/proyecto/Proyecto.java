/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.covid.proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {

        infectados infectado = new infectados();
        Reglas regla = new Reglas();
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

        System.out.println("Consultas de las vacunas:");
        regla.dio_negativo_covid();
        regla.dio_positivo_covid();
        
        System.out.println("Consultas:");

        /*
        regla.persona_infectada();
        regla.puede_contagiar();
        regla.en_cuarentena_por_sintomas();
        regla.tiene_sintomas_graves();
        regla.es_contacto_estrecho();
        regla.puede_contagiar_indirectamente();
        regla.es_contacto_estrecho_indirecto();
        regla.recibio_dosis_completa();
        regla.elegible_para_refuerzo();
        regla.tiene_condicion_salud_subyacente();
        regla.se_hizo_prueba_covid();
        regla.dio_positivo_covid();
        regla.dio_negativo_covid();
        regla.necesita_prueba_covid();
        regla.necesita_prueba_seguimiento_covid();
        regla.tiene_sintomas_covid();
        regla.es_alto_riesgo();
        regla.necesita_cuarentena();
        regla.puede_salir_de_cuarentena();
        regla.spread_disease();
        */



        Scanner scanner = new Scanner(System.in);

        int opcionPrincipal;
        int opcionSecundaria;

        // Menú principal
        do {
            System.out.println("Bienvenido al Sistema de Diagnóstico de COVID-19:");
            System.out.println("Elija una opción:");
            System.out.println("1. Hechos");
            System.out.println("2. Reglas");
            System.out.println("0. Salir");

            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    // Opciones de Hechos (si las tienes)
                    System.out.println("Opciones de Hechos (pendiente de implementación)");
                    break;
                case 2:
                    // Menú de Reglas
                    do {
                        System.out.println("Elija una opción:");
                        System.out.println("1. Personas Infectadas");
                        System.out.println("2. Personas que pueden contagiar");
                        System.out.println("3. Personas en cuarentena por síntomas");
                        System.out.println("4. Personas con sintomas graves");
                        System.out.println("5. Personas que tienen contacto directo con alguien infectado");
                        System.out.println("6. Personas contagiadas indirectamente");
                        System.out.println("7. Personas que tienen contacto indirecto con alguien infectado");
                        System.out.println("8. Personas que ya recibieron la dosis de vacunacion completa");
                        System.out.println("9. Personas elegibles para refuerzo");
                        System.out.println("10. Personas con condicion de riesgo");
                        System.out.println("11. Personas que se hicieron la prueba de covid");
                        System.out.println("12. Personas que salieron positivas en la prueba");
                        System.out.println("13. Personas que salieron negativos en la prueba");
                        System.out.println("14. Personas que necesitan prueba de covid");
                        System.out.println("15. Personas que necesitan prueba de seguimiento");
                        System.out.println("16. Personas con sintomas de covid");
                        System.out.println("17. Personas con condicion de alto riesgo");
                        System.out.println("18. Personas que necesitan cuarentena");
                        System.out.println("19. Personas que pueden salir de cuarentena");
                        System.out.println("20. Rastro de contagios(Spread Disease)");
                        System.out.println("0. Volver al menú principal");
                        opcionSecundaria = scanner.nextInt();

                        // Llamadas a los métodos según la opción seleccionada
                        switch (opcionSecundaria) {
                            case 1:
                                regla.persona_infectada();
                                break;
                            case 2:
                                regla.puede_contagiar();
                                break;
                            case 3:
                                regla.en_cuarentena_por_sintomas();
                                break;
                            case 4:
                                regla.tiene_sintomas_graves();
                                break;
                            case 5:
                                regla.es_contacto_estrecho();
                                break;
                            case 6:
                                regla.puede_contagiar_indirectamente();
                                break;
                            case 7:
                                regla.es_contacto_estrecho_indirecto();
                                break;
                            case 8:
                                regla.recibio_dosis_completa();
                                break;
                            case 9:
                                regla.elegible_para_refuerzo();
                                break;
                            case 10:
                                regla.tiene_condicion_salud_subyacente();
                                break;
                            case 11:
                                regla.se_hizo_prueba_covid();
                                break;
                            case 12:
                                regla.dio_positivo_covid();
                                break;
                            case 13:
                                regla.dio_negativo_covid();
                                break;
                            case 14:
                                regla.necesita_prueba_covid();
                                break;
                            case 15:
                                regla.necesita_prueba_seguimiento_covid();
                                break;
                            case 16:
                                regla.tiene_sintomas_covid();
                                break;
                            case 17:
                                regla.es_alto_riesgo();
                                break;
                            case 18:
                                regla.necesita_cuarentena();
                                break;
                            case 19:
                                regla.puede_salir_de_cuarentena();
                                break;
                            case 20:
                                regla.spread_disease();
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }

                    } while (opcionSecundaria != 0);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcionPrincipal != 0);

        scanner.close();

    }
}
