#language:es
Característica: Realizar una compra en la pagina saucedemo
  Yo como automatizador
  Quiero hacer una compra
  Para verificar la funcionalidad de saucedemo

  @inicio_sesion
  Esquema del escenario: Ingresar al home Saucedemo
   Dado que inicio sesion en la pagina Saucedemo con los datos de sesion
     | <usuario> | <contrasena> |

    Ejemplos:
      | usuario       | contrasena   |
      | standard_user | secret_sauce |

  @comprar_articulos
  Esquema del escenario: Comprar articulos en Saucedemo
    Dado que inicio sesion en la pagina Saucedemo con los datos de sesion
      | <usuario> | <contrasena> |
    Cuando agrego 2 articulos al inventario para acceder al carrito de compras
    Y continuo el checkout para visualizar y completar el formulario de compra
    Y se visualiza el costo total finalizando la compra
    Entonces se debe verificar el mensaje: Thank you for your order!


    Ejemplos:
      | usuario       | contrasena   |
      | standard_user | secret_sauce |