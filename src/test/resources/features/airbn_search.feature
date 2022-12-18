Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de swagger

    Given que me encuentro en el login swagger
    When inicio sesion con usuario "standard_user" y contraseña "secret_sauce"
    Then valido que aparezca el titulo "PRODUCTS"

