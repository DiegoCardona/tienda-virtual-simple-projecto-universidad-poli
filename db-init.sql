-- Crear la base de datos
USE OFERTATON_GRANCOLOMBIANO;

-- Tabla `usuarios`
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL
);

-- Tabla `productos`
CREATE TABLE producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    descripcion TEXT,
    categoria VARCHAR(255),
    imagen VARCHAR(255)
);

-- Tabla `pedidos`
CREATE TABLE pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    metodo_pago VARCHAR(50) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    indicaciones TEXT,
    nombre_receptor VARCHAR(255) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

-- Tabla `detalle_pedido`
CREATE TABLE detalle_pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    producto_id INT,
    cantidad INT NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (producto_id) REFERENCES producto(id)
);

-- Insertar datos de prueba
INSERT INTO usuario (nombre, correo, contrasena) VALUES 
('Juan Perez', 'juan.perez@email.com', 'contrasena123'),
('Maria Gomez', 'maria.gomez@email.com', 'clave456');

INSERT INTO producto (nombre, precio, descripcion, categoria, imagen) VALUES 
('ProductoA', 100.50, 'Descripción del ProductoA', 'CategoriaA', 'https://industrialphysics.com/wp-content/uploads/2022/08/product-image-coming-soon-114.png'),
('ProductoB', 200.75, 'Descripción del ProductoB', 'CategoriaB', 'https://industrialphysics.com/wp-content/uploads/2022/08/product-image-coming-soon-114.png');

INSERT INTO pedido (usuario_id, total, metodo_pago, direccion, indicaciones, nombre_receptor, telefono) VALUES 
(1, 301.25, 'PSE', 'Calle 123', 'Indicaciones prueba', 'Juan Perez', '1234567890');

INSERT INTO detalle_pedido (pedido_id, producto_id, cantidad) VALUES 
(1, 1, 1),
(1, 2, 1);
