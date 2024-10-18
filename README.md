# Challenge TQ Spring Boot Application

Este proyecto es una aplicación Spring Boot empaquetada como un archivo JAR. A continuación, se explica cómo construir y ejecutar la aplicación dentro de un contenedor Docker utilizando el Dockerfile proporcionado.

## Prerrequisitos
Antes de empezar, asegúrate de tener instalada la siguiente herramienta:

- Docker: Para crear y ejecutar el contenedor Docker.

## Pasos para ejecutar la aplicación con Docker

### 1. Construir la imagen Docker
Puedes construir la imagen Docker utilizando el Dockerfile proporcionado. Asegúrate de estar en el directorio donde se encuentra el Dockerfile y ejecuta el siguiente comando:

`docker build -t challenge-tq-springboot-app .`

Este comando crea una imagen Docker con el nombre challenge-tq-springboot-app a partir del Dockerfile.

### 2. Ejecutar el contenedor Docker
Una vez que la imagen ha sido construida, puedes ejecutar la aplicación dentro de un contenedor utilizando el siguiente comando:

`docker run -p 8080:8080 challenge-tq-springboot-app`

Este comando:

- Inicia un nuevo contenedor a partir de la imagen challenge-tq-springboot-app.
- Expone el puerto 8080 del contenedor al puerto 8080 en tu máquina local.

### 3. Verificar que la aplicación esté corriendo
Puedes verificar si la aplicación está corriendo correctamente accediendo a la siguiente URL en tu navegador:

http://localhost:8080

Si la aplicación está configurada correctamente, deberías poder ver la interfaz o los servicios de la aplicación.

## Comandos adicionales

### Verificar las imágenes Docker

Puedes listar todas las imágenes Docker disponibles en tu sistema con el siguiente comando:

`docker images`

### Verificar los contenedores en ejecución

Para listar los contenedores que están en ejecución, utiliza:

`docker ps`

### Detener el contenedor 

Para detener el contenedor que está ejecutando la aplicación, puedes usar el siguiente comando:

`docker stop <container_id>`
Reemplaza <container_id> con el ID o nombre del contenedor que obtuviste al listar los contenedores en ejecución.

## Notas adicionales
Si realizas cambios en el código y deseas volver a construir la imagen Docker, asegúrate construir la imagen Docker con el comando docker build mencionado en el punto 1.

**Disculpas, pero este README está en proceso de construcción.** Agradecemos tu paciencia mientras mejoramos la documentación.