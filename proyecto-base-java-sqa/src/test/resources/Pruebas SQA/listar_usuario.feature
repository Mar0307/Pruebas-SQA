# author: Margarita_Londono
# language: es

  @ListarUsuariopaginaespecifica
Característica: Listar usuarios
  en una página específica

    Escenario: Listar usuarios en la pagina 2
      Dado que accedo al servicio de listar usuarios de ReqRes
      Cuando realizo una solicitud GET al endpoint "/api/users?page=2"
      Entonces el estado de la respuesta debe ser 200
      Y la respuesta debe contener una lista de usuarios en la página 2
      Y el campo "pagina"  debe ser igual a 2




