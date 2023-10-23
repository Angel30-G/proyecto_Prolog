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


% Reglas para determinar si alguien está infectado por COVID-19
esta_infectado(Persona) :-
    tiene_fiebre(Persona),
    tiene_tos(Persona),
    tiene_dificultad_respirar(Persona).

%Regla para saber si una persona contagió a otra
puede_contagiar(Persona1, Persona2) :-
    infects(Persona1, Persona2),
    tiene_fiebre(Persona1),
    tiene_tos(Persona1).

%Regla para saber si una persona esta en cuarentena
esta_en_cuarentena(Persona) :-
    esta_infectado(Persona);
    (infects(OtraPersona, Persona), esta_infectado(OtraPersona)).

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

% Regla que define si alguien esta en cuarentena por estar en contacto
% con alguien infectado
esta_en_cuarentena_por_contacto(Persona) :-
    infects(PersonaInfectada, Persona),
    esta_en_cuarentena(PersonaInfectada).
esta_en_cuarentena_por_contacto(persona) :-
    infects(PersonaInfectada, PersonaIntermedia),
    esta_en_cuarentena(PersonaInfectada),
    esta_en_cuarentena_por_contacto(PersonaIntermedia).


es_contacto_estrecho_indirecto(Persona1, Persona2) :-
    infects(Persona1, PersonaIntermedia),
    es_contacto_estrecho_indirecto(PersonaIntermedia, Persona2).
es_contacto_estrecho_indirecto(Persona1, Persona2) :-
    es_contacto_estrecho(Persona1, Persona2).





