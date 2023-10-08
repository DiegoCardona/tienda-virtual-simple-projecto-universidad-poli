# Tienda virtual politecnico gran colombiano

## Descripción
Proyecto de tienda virtual para la materia Frontend del politecnico gran colombiano.
Este proyecto es una aplicación de comercio electrónico diseñada para gestionar usuarios, productos y pedidos. Los usuarios pueden navegar por los productos disponibles, añadirlos a su carrito y gestionar sus pedidos.

## Cómo ejecutar la aplicación (usando Docker Compose)
1. Asegúrate de tener Docker y Docker Compose instalados en tu máquina.
2. Clona este repositorio en tu máquina local.
3. Navega al directorio del proyecto utilizando la terminal o línea de comandos.
4. Ejecuta el siguiente comando:
    ```
    docker-compose up --build
    ```
5. Una vez que los contenedores estén en funcionamiento, la aplicación estará disponible en `http://localhost:8000`.

## Herramientas utilizadas
- Java 11
- Spring Boot
- Spring Data JPA
- MySQL
- Docker y Docker Compose
- Maven

## Especificación de la API
**Usuario**
- GET `/usuarios/{id}`: Obtiene un usuario por su ID.
- POST `/usuarios`: Crea un nuevo usuario.

**Producto**
- GET `/productos`: Obtiene todos los productos.
- GET `/productos/{id}`: Obtiene un producto por su ID.
- POST `/productos`: Crea un nuevo producto.

**Pedido**
- GET `/pedidos`: Obtiene todos los pedidos.
- GET `/pedidos/{id}`: Obtiene un pedido por su ID.
- POST `/pedidos`: Crea un nuevo pedido.

Para detalles más específicos, consulte la especificación OpenAPI ubicada en la carpeta api.
