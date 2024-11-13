# author: Margarita_Londono
# language: es

@ListarCrearNuevoUsuario
Característica: Crear un nuevo usuario
  con datos válidos

  Escenario: Crear un usuario con datos válidos
    Dado que tengo los datos para crear un nuevo usuario
    Cuando realizo una solicitud POST al endpoint "/api/users" con los datos:
      | name   | job       |
      | "John" | "leader"  |
    Entonces el estado de la respuesta debe ser 201
    Y la respuesta debe indicar que el usuario fue creado exitosamente
    Y la respuesta debe contener un campo "id" para el usuario creado
    Y la respuesta debe contener un campo "createdAt" con una marca de tiempo válida


