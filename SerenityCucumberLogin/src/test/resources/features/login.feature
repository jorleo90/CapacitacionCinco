# language: es
# encoding: iso-8859-1
Característica: Login
  Como usuario del sistema de logeo
  deseo poder ingresar con mis credenciales
  para obtener el proceso de carrito de compras

  Esquema del escenario: Login Exitoso
    Dado que estoy en la pagina de training site
    Cuando ingreso los datos <usuario> y <password>
    Entonces puedo ingresar al carrito de compras

    Ejemplos: 
      | usuario | password |
      | test    | secret   |
