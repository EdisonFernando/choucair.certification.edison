#Autor: Edison Fernando Aza Casanova
  @stories
  Feature: Academy choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: search for a automation course
    Given than Estefania wants to learn automation at the academy choucair
    | strUser | strPassword |
    | 1085919324 | Choucair2021* |
    When he search for the course on the choucair academy platform
    | strCourse |
    | Prueba Técnica - Analista Bancolombia |
    Then he finds the course called
    | strCourse |
    | Prueba Técnica - Analista Bancolombia |