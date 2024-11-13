# author: Margarita_Londono
# language: es

@ListarActualizarusuarioexistente
Característica: actualizar un usuario con un ID existente

  Escenario: actualizar un usuario
      con un ID existente
    Dado que tengo un ID de usuario existente
    Cuando realizo una solicitud PUT al endpoint "/api/users/2" con los datos:
      | name    | job          |
      | "Jane"  | "developer"  |
    Entonces el estado de la respuesta debe ser 200
    Y la respuesta debe indicar que el usuario fue actualizado exitosamente
    Y la respuesta debe contener los datos actualizados:
      | name   | "Jane"      |
      | job    | "developer" |
    Y la respuesta debe contener un campo "updatedAt" con una marca de tiempo válida


