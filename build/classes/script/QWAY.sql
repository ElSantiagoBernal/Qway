CREATE DATABASE qway;

USE qway;

CREATE TABLE sandwich(
idSandwich int primary key auto_increment not null,
panIntegral boolean,
panGriego boolean,
panNormal boolean,
carne boolean,
bbq boolean,
cebolla boolean,
jamon boolean,
mayonesa boolean,
pepinillos boolean,
pollo boolean,
queso boolean,
salchicha boolean,
tomate boolean,
lechuga boolean,
rosada boolean,
mostaza boolean );

CREATE TABLE pedido(
idPedido bigint primary auto_increment key not null,
codigoNotificador Tinyint,
idSandwichP int,
foreign key (idSandwichP) references sandwich (idSandwich));

CREATE TABLE factura(
idFactura bigint primary key auto_increment not null,
precio double,
cedulaCF varchar(10),
idPedidoF bigint,
foreign key (idPedidoF) references pedido (idPedido));