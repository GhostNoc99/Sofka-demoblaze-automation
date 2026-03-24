Feature: Signup API

  Background:
    * url 'https://api.demoblaze.com'

  Scenario: Crear nuevo usuario
    * def user = 'user_' + java.util.UUID.randomUUID()
    Given path 'signup'
    And request { username: '#(user)', password: '12345' }
    When method post
    Then status 200
    And match response contains ""

  Scenario: Usuario ya existente
    * def user = 'testuser123'
    Given path 'signup'
    And request { username: '#(user)', password: '12345' }
    When method post
    Then status 200
    And match response.errorMessage contains 'This user already exist'
