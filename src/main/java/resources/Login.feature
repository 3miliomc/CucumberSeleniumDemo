#Cada feature contiene una feature
#Archivos Feature usan el lenguaje de Gherkin - Orientado al negocio
@tag
Feature: Completar formulario de Login

#Una feature permite tener diferentes escenarios especificos
#El escenario utiliza una estructura Give-When-Then
Scenario Outline: El usuario deberia ser capaz de autenticarse
Given usuario dentro de la pagina login
When usuario ingresa email <username>
And usuario ingresa password <password>
And usuario pincha boton login
Then usuario se le concede el acceso
 
Examples:
| username | password |
| tim@testemail.com | trpass|
| rw@testemail.com | rwpass |
| jv@testemail.com | jvpass |