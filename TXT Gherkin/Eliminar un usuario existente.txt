# author: Margarita_Londono
# language: es

@ListarEliminarusuarioexistente
Característica: Eliminar un usuario existente

  Escenario: Eliminar un usuario
      con un ID existente
    Dado que tengo un ID de usuario existente
    Cuando realizo una solicitud DELETE al endpoint "/api/users/2"
    Entonces el estado de la respuesta debe ser 204
    Y la respuesta no debe contener un cuerpo
