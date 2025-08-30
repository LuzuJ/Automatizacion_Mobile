# language: es
@TiendaSauceLabs
Característica: Carrito de Compras
  Como usuario de la tienda
  Quiero agregar productos al carrito de compras
  Para poder comprarlos posteriormente

  Esquema del escenario: Validar que el carrito de compras se actualiza correctamente al agregar productos
    Dado estoy en la aplicación de SauceLabs
    Y valido que carguen correctamente los productos en la galeria
    Cuando agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Entonces valido que el contador del carrito de compra sea el correcto

    Ejemplos:
    | PRODUCTO                  | UNIDADES |
    | Sauce Labs Backpack       | 1        |
    | Sauce Labs Bolt T-Shirt   | 1        |
    | Sauce Labs Bike Light     | 2        |
