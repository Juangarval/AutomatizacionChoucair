#language:es
  Característica: buscar empleo

    Como usuario
    Necesito buscar empleos
    Para ver las vacantes disponibles

  Antecedentes:
    Dado que el usuario esta en la seccion de empleos de choucairtesting

    @BuscarEmpleoDisponible
    Escenario: buscar empleo disponible
      Cuando consulta "Analista de Estar Bien y Cultura" para la ciudad de "Medellin"
      Entonces el visualizara la vacante "Analista de Estar Bien y Cultura"

