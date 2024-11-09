create database if not exists BDCrunchy;
use BDCrunchy;

create table producto (
    codigoProducto int primary key auto_increment,
    nombreProducto varchar(30) not null,
    precioUnitario decimal(10,2) not null,
    cantidadProducto int not null,
    fechaVencimiento date
);

CREATE TABLE ventas (
    id_venta INT PRIMARY KEY AUTO_INCREMENT,
    cantidad INT(10) NOT NULL,
    total DECIMAL(11,2) NOT NULL,
    id_proveedor INT,
    id_clientes INT,
    id_vendedor INT,
    id_producto INT NOT NULL
);

create table usuario (
	id_usuario int(10) primary key auto_increment,
    nombre varchar(30) not null,
    apellido varchar(30) not null,
    correo varchar(30) not null,
    pass varchar(30) not null,
    tipo_usuario varchar(30)
);

create table proveedores(
	id_proveedor int(10) primary key auto_increment,
    nombre varchar(30) not null,
    telefono int(10) not null,
    direccion varchar(30) not null,
    ciudad varchar(30) not null
);

create table clientes(
	id_clientes int(10) primary key auto_increment,
    nombre varchar(30) not null,
    direccion varchar(30) not null,
    nit varchar(30) not null,
    telefono int(10) not null
);

create table vendedor(
	id_vendedor int(10) primary key auto_increment,
    nombre varchar(30) not null,
    apellido varchar(30) not null,
    dpi varchar(30) not null,
    cargo varchar(30) not null
);

ALTER TABLE ventas ADD FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor); 
ALTER TABLE ventas ADD FOREIGN KEY (id_clientes) REFERENCES clientes(id_clientes);
ALTER TABLE ventas ADD FOREIGN KEY (id_vendedor) REFERENCES vendedor(id_vendedor);
ALTER TABLE ventas ADD FOREIGN KEY (id_producto) REFERENCES producto(codigoProducto);

/*Creación de Triggers*/
DELIMITER //
CREATE TRIGGER actualizar_producto 
AFTER INSERT ON ventas 
FOR EACH ROW 
BEGIN
  UPDATE producto 
  SET cantidadProducto = cantidadProducto - NEW.cantidad
  WHERE codigoProducto = NEW.id_producto;
END//
DELIMITER ;


