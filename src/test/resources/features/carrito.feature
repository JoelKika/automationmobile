
Feature: Carrito de compras

  @comprasCarrito
  Scenario Outline: validar la funcionalidad del carrito de compras
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente <UNIDADES>
    Examples:
      | PRODUCTO                  | UNIDADES |
      |Sauce Labs Backpack        | 3        |
      | Sauce Labs Bolt T-Shirt   | 1        |
      | Sauce Labs Bike Light     | 2        |

