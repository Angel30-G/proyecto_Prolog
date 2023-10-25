% Hechos para la regla "esta_infectado(Persona)"
esta_infectado(juan).
esta_infectado(maria).
esta_infectado(pedro).

%Hechos de personas infectadas
infects(maria, pedro).
infects(pedro, julia).
infects(flor, rosa).
infects(rosa, gloria).
infects(jose, flor).

%Hechos de que una persona tiene sintomas
tiene_fiebre(maria).
tiene_fiebre(julia).
tiene_tos(maria).
tiene_tos(julia).
tiene_dificultad_respirar(maria).
tiene_dificultad_respirar(rosa).


%Hechos de dosis de vacuna
primera_dosis(carlos).
primera_dosis(laura).
segunda_dosis(carlos).
segunda_dosis(laura).

%Hechos de personas que se realizaron la prueba del covid
prueba_covid(maria).
prueba_covid(carlos).
prueba_covid(julio).
prueba_covid(laura).



% Hechos de pruebas de COVID-19
resultado_prueba_covid(maria, positivo).
resultado_prueba_covid(carlos, negativo).
resultado_prueba_covid(julio, positivo).
resultado_prueba_covid(laura, negativo).

% Hechos de condiciones de salud subyacentes
tiene_diabetes(pedro).
tiene_enfermedad_cardiaca(ana).
tiene_enfermedad_pulmonar_cronica(julia).

% Hechos adicionales para la regla "esta_en_cuarentena"
esta_en_cuarentena(juan).
esta_en_cuarentena(maria).
esta_en_cuarentena(carlos).

% Hechos adicionales para la regla "paso_tiempo_suficiente_desde_ultima_dosis"
paso_tiempo_suficiente_desde_ultima_dosis(juan).
paso_tiempo_suficiente_desde_ultima_dosis(maria).
paso_tiempo_suficiente_desde_ultima_dosis(carlos).

% Hechos adicionales para la regla "paso_tiempo_suficiente_desde_ultima_prueba"
paso_tiempo_suficiente_desde_ultima_prueba(juan).
paso_tiempo_suficiente_desde_ultima_prueba(maria).
paso_tiempo_suficiente_desde_ultima_prueba(carlos).



% Regla para determinar si alguien está infectado por COVID-19
persona_infectada(Persona) :-
    dio_positivo_covid(Persona).


%Regla para saber si una persona contagió a otra
puede_contagiar(Persona1, Persona2) :-
    infects(Persona1, Persona2),
    tiene_fiebre(Persona1),
    tiene_tos(Persona1),
    tiene_dificultad_respirar(Persona1).



% Regla que supervisa si una persona tiene un contacto directo con
% alguien infectado
es_contacto_estrecho(Persona1, Persona2) :-
    infects(Persona1, Persona2);
    infects(Persona2, Persona1).


%Regla para saber si se contagió a alguien indirectamente
puede_contagiar_indirectamente(Persona1, Persona2) :-
    infects(Persona1, PersonaIntermedia),
    puede_contagiar_indirectamente(PersonaIntermedia, Persona2).
puede_contagiar_indirectamente(Persona1, Persona2) :-
    infects(Persona1, Persona2).


% Regla que supervisa si una persona tiene un contacto estrecho indirecto con
% alguien infectado
es_contacto_estrecho_indirecto(Persona1, Persona2) :-
    infects(Persona1, PersonaIntermedia),
    es_contacto_estrecho_indirecto(PersonaIntermedia, Persona2).
es_contacto_estrecho_indirecto(Persona1, Persona2) :-
    es_contacto_estrecho(Persona1, Persona2).

% Regla para determinar si alguien ha recibido ambas dosis de la vacuna
recibio_dosis_completa(Persona) :-
    primera_dosis(Persona),
    segunda_dosis(Persona).

% Regla para determinar si alguien es elegible para la vacuna de refuerzo
elegible_para_refuerzo(Persona) :-
    recibio_dosis_completa(Persona),
    paso_tiempo_suficiente_desde_ultima_dosis(Persona).

% Regla para determinar si alguien tiene una condición de salud subyacente
tiene_condicion_salud_subyacente(Persona) :-
    tiene_diabetes(Persona);
    tiene_enfermedad_cardiaca(Persona);
    tiene_enfermedad_pulmonar_cronica(Persona).

% Regla para determinar si alguien se ha hecho la prueba de COVID-19
se_hizo_prueba_covid(Persona) :-
    prueba_covid(Persona).

% Regla para determinar si alguien dio positivo en la prueba de COVID-19
dio_positivo_covid(Persona) :-
    resultado_prueba_covid(Persona, positivo).

% Regla para determinar si alguien dio negativo en la prueba de COVID-19
dio_negativo_covid(Persona) :-
    resultado_prueba_covid(Persona, negativo).

% Regla para determinar si alguien necesita hacerse la prueba de COVID-19
necesita_prueba_covid(Persona) :-
    tiene_sintomas_covid(Persona);
    es_contacto_estrecho(Persona, PersonaInfectada), dio_positivo_covid(PersonaInfectada).

% Regla para determinar si alguien necesita hacerse una prueba de seguimiento de COVID-19
necesita_prueba_seguimiento_covid(Persona) :-
    dio_positivo_covid(Persona),
    paso_tiempo_suficiente_desde_ultima_prueba(Persona).

% Regla para determinar si alguien tiene síntomas de COVID-19
tiene_sintomas_covid(Persona) :-
    tiene_fiebre(Persona);
    tiene_tos(Persona);
    tiene_dificultad_respirar(Persona).

% Regla para determinar si alguien esta vacunado
esta_vacunado(Persona) :-
    fue_vacunado_pfizer(Persona);
    fue_vacunado_moderna(Persona);
    fue_vacunado_johnson(Persona).

% Regla para determinar si alguien es de alto riesgo
es_alto_riesgo(Persona) :-
    tiene_condicion_salud_subyacente(Persona);
    not(esta_vacunado(Persona)).

% Regla para determinar si alguien necesita entrar en cuarentena
necesita_cuarentena(Persona) :-
    persona_infectada(Persona);
    esta_en_cuarentena_por_contacto(Persona).

% Regla para determinar si alguien puede salir de cuarentena
puede_salir_de_cuarentena(Persona) :-
    esta_en_cuarentena(Persona),
    paso_tiempo_suficiente_desde_ultima_prueba(Persona),
    dio_negativo_covid(Persona).

% Regla para rastrear la cadena de infecciones
spread_disease(Persona1, Persona2, _) :-
    infects(Persona1, Persona2).

spread_disease(Persona1, Persona2, Visitados) :-
    infects(Persona1, PersonaIntermedia),
    not(member(PersonaIntermedia, Visitados)),
    spread_disease(PersonaIntermedia, Persona2, [PersonaIntermedia | Visitados]).










