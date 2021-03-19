#Author: schavarriag
Feature: Realizar Registro en Utest
  Como empleado de sophos
  Necesito registrarme en la pagina utest
  Para realizar el reto

  Scenario: Registrar usuario
    Given "Sebastian" ingresa a la pagina "https://www.utest.com/"
    When Ingresa la informacion
      | nombre           | Sebastian         |
      | apellido         | Chavarria         |
      | email            | sechavarria@se.se |
      | dia              |                 1 |
      | mes              | March             |
      | anio             |              1997 |
      | marca            | Samsung           |
      | modelo           | Galaxy S20 FE     |
      | sistemaOperativo | Android 11        |
      | contrasenia      | asdQWE123123      |
    Then Valida el texto en pantalla "Welcome to the world's largest community of freelance software testers!"
