--creation of database
CREATE SCHEMA `proveedordb` ;;

--creation of table
USE proveedordb;
DROP TABLE IF EXISTS proveedor;

CREATE TABLE proveedor (
                           id_proveedor BIGINT PRIMARY KEY,
                           name VARCHAR(20) NOT NULL,
                           fecha_alta DATE NOT NULL,
                           id_cliente BIGINT
);

--Adding data to the table.
INSERT INTO proveedor (id_proveedor, name, fecha_alta, id_cliente)
VALUES
(1, 'Coca-cola', CURRENT_TIMESTAMP, 5),
(2, 'Pepsi', CURRENT_TIMESTAMP, 5),
(3, 'Redbull', CURRENT_TIMESTAMP, 6),
(4, 'Fanta', CURRENT_TIMESTAMP, 7),
(5, 'Casera', CURRENT_TIMESTAMP, 8),
(6, 'Trina', CURRENT_TIMESTAMP, 6);