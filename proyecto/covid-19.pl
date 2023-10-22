

infects(colibri, thalassinus).
infects(colibri, thalassinus).
infects(colibri, thalassinus).
infects(colibri, thalassinus).
infects(colibri, thalassinus).

% Reglas para determinar si alguien est� infectado por COVID-19
esta_infectado(Persona) :-
    tiene_fiebre(Persona),
    tiene_tos(Persona),
    tiene_dificultad_respirar(Persona).

% Hechos que representan los s�ntomas de una persona
tiene_fiebre(juan).
tiene_tos(juan).
tiene_dificultad_respirar(juan).

tiene_fiebre(maria).
tiene_tos(maria).
tiene_dificultad_respirar(maria).

tiene_fiebre(luis).
tiene_tos(luis).

% Ejemplos de consulta
% Para verificar si alguien est� infectado, consulta esta_infectado/1
% Ejemplo: �Juan est� infectado por COVID-19?
% Luego, puedes hacer consultas similares para otras personas.

% �Juan est� infectado por COVID-19?
% Debe devolver "true" porque tiene fiebre, tos y dificultad para respirar.
?- esta_infectado(juan).

% �Maria est� infectada por COVID-19?
% Debe devolver "true" por las mismas razones que Juan.
?- esta_infectado(maria).

% �Luis est� infectado por COVID-19?
% Debe devolver "false" porque le falta la dificultad para respirar.
?- esta_infectado(luis).



