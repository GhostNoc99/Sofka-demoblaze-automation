Feature: Login API

  Background:
    * url 'https://api.demoblaze.com'

  Scenario: Login exitoso
    Given path 'login'
    And request { username: 'pruebas1233333333333333333333333333331', password: 'pruebas' }
    When method post
    Then status 200
    And match response contains "Auth_token"

  Scenario: Login incorrecto
    Given path 'login'
    And request { username: 'testuser123', password: 'wrongpass' }
    When method post
    Then status 200
    And match response.errorMessage contains 'Wrong password'
