# API REST de Géneros Musicales

Este proyecto es una API REST desarrollada en Spring Boot que proporciona servicios relacionados con géneros musicales.

## Descripción

Este proyecto ofrece endpoints para realizar operaciones relacionadas con géneros musicales, como contar la cantidad total de géneros, contar la cantidad de géneros por nombre, verificar la existencia de un correo electrónico y obtener un conteo de géneros agrupados.

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- H2 Database (base de datos en memoria)
- Java JDK 20

## Requisitos

- Java JDK 20
- Maven 3.2

## Instalación y Uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Configura la conexión a la base de datos en `application.properties`.
4. Ejecuta la aplicación.
5. Accede a la API a través de http://localhost:8080/.

## Endpoints

A continuación se detallan los endpoints disponibles en esta API:

- `GET /contar`: Obtiene la cantidad total de géneros musicales en la base de datos.
- `GET /contar-por-genero`: Obtiene la cantidad de géneros musicales por nombre.
  - Parámetros: `genero` (nombre del género).
- `GET /verificaremail`: Verifica si un correo electrónico existe en la base de datos.
  - Parámetros: `email` (correo electrónico a verificar).
- `POST /genero`: Guarda un nuevo género musical en la base de datos.
- `GET /conteo`: Obtiene un conteo de géneros musicales agrupados.
  
## Contribuciones

Si deseas contribuir a este proyecto, sigue los siguientes pasos:
1. Crea un fork del repositorio.
2. Crea una rama para tus cambios.
3. Realiza tus cambios y realiza un commit.
4. Envía una solicitud de extracción.

## Licencia

Este proyecto fue realizado por solicitud empresa 3it para prueba tecnica.


