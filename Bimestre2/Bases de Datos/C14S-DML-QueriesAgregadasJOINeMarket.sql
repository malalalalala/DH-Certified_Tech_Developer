USE emarket;

-- Clientes
-- 1) ¿Cuántos clientes existen?
SELECT COUNT(ClienteID)
FROM clientes;
-- 2) ¿Cuántos clientes hay por ciudad?
SELECT ciudad, COUNT(ClienteID)
FROM clientes
GROUP BY ciudad;
-- Facturas
-- 1) ¿Cuál es el total de transporte?
SELECT *
FROM facturas;

SELECT SUM(transporte)
FROM facturas;
-- 2) ¿Cuál es el total de transporte por EnvioVia (empresa de envío)?
SELECT enviovia, SUM(transporte)
FROM facturas
GROUP BY enviovia;

-- 3) Calcular la cantidad de facturas por cliente. Ordenar descendentemente por
-- cantidad de facturas.

SELECT ClienteID, COUNT(FacturaID)
FROM facturas
GROUP BY ClienteID
ORDER BY COUNT(FacturaID) DESC;

-- 4) Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.

SELECT ClienteID, COUNT(FacturaID)
FROM facturas
GROUP BY ClienteID
ORDER BY COUNT(FacturaID) DESC
LIMIT 5;


-- 5) ¿Cuál es el país de envío menos frecuente de acuerdo a la cantidad de facturas?

SELECT paisenvio, ClienteID, COUNT(FacturaID)
FROM facturas
GROUP BY paisenvio
ORDER BY COUNT(FacturaID)
LIMIT 1;

-- 6) Se quiere otorgar un bono al empleado con más ventas. ¿Qué ID de empleado
-- realizó más operaciones de ventas?

SELECT empleadoID, COUNT(FacturaID)
FROM facturas
GROUP BY empleadoID
ORDER BY COUNT(FacturaID) desc
LIMIT 1;


-- Factura detalle
-- 1) ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?

SELECT productoID, COUNT(productoID)
FROM FacturaDetalle
GROUP BY ProductoID
ORDER BY COUNT(Facturaid) DESC
LIMIT 1;

SELECT ProductoID, COUNT(*)
FROM facturadetalle
GROUP BY ProductoID
ORDER BY COUNT(*) desc;

-- 2) ¿Cuál es el total facturado? Considerar que el total facturado es la suma de
-- cantidad por precio unitario.

SELECT SUM(preciounitario*cantidad) as total_facturado
FROM FacturaDetalle;

-- 3) ¿Cuál es el total facturado para los productos ID entre 30 y 50?

SELECT productoID, SUM(preciounitario*cantidad) as total_facturado
FROM FacturaDetalle
WHERE productoID BETWEEN 30 AND 50;

SELECT productoID
FROM FacturaDetalle
ORDER BY productoID DESC;

-- 4) ¿Cuál es el precio unitario promedio de cada producto?***

SELECT productoID, AVG(preciounitario)
FROM FacturaDetalle
GROUP BY productoID;

-- 5) ¿Cuál es el precio unitario máximo?

SELECT  MAX(preciounitario)
FROM FacturaDetalle;
-- 2

-- Consultas queries XL parte II - JOIN
-- En esta segunda parte vamos a intensificar la práctica de consultas con JOIN.

-- 1) Generar un listado de todas las facturas del empleado 'Buchanan'.

SELECT *
from facturas
join empleados on facturas.empleadoid=empleados.empleadoid
where apellido like'%Buchanan%';

-- 2) Generar un listado con todos los campos de las facturas del correo 'Speedy
-- Express'.

SELECT * 
FROM facturas
JOIN correos
ON facturas.enviovia = correos.correoID
WHERE compania = 'Speedy Express';

-- 3) Generar un listado de todas las facturas con el nombre y apellido de los
-- empleados.

SELECT facturas.*, empleados.Apellido, empleados.Nombre
FROM facturas
JOIN empleados
ON facturas.EmpleadoID = empleados.empleadoID;

-- 4) Mostrar un listado de las facturas de todos los clientes “Owner” y país de envío
-- “USA”.

SELECT *
FROM facturas
JOIN clientes
ON facturas.ClienteID = clientes.ClienteID
WHERE clientes.titulo = "Owner" and PaisEnvio = "Usa";


-- 5) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
-- “Leverling” o que incluyan el producto id = “42”.

SELECT facturas.*
FROM facturas
JOIN empleados
ON facturas.EmpleadoID = empleados.empleadoID
JOIN facturadetalle 
ON facturas.facturaID = facturadetalle.facturaId
WHERE Empleados.Apellido ='Leverling' or  facturadetalle.ProductoID = 42;


-- 6) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
-- “Leverling” y que incluya los producto id = “80” o ”42”.

SELECT facturas.*
FROM facturas
JOIN empleados
ON facturas.EmpleadoID = empleados.empleadoID
JOIN facturadetalle 
ON facturas.facturaID = facturadetalle.facturaId
WHERE Empleados.Apellido ='Leverling' and  (facturadetalle.ProductoID = 80 or facturadetalle.ProductoID = 42);

-- 7) Generar un listado con los cinco mejores clientes, según sus importes de
-- compras total (PrecioUnitario * Cantidad).

SELECT *
FROM Clientes
JOIN facturas
ON clientes.Clienteid=facturas.clienteID
JOIN FacturaDetalle
ON FacturaDetalle.facturaid=facturas.facturaid
GROUP By contacto
order by SUM(preciounitario*cantidad) desc
limit 5 ;

SELECT Clientes.contacto, SUM(PrecioUnitario * Cantidad) as Total
FROM facturas
JOIN facturadetalle 
ON facturas.facturaID = facturadetalle.facturaId
JOIN clientes 
ON facturas.ClienteID = clientes.ClienteID
GROUP By contacto
order by SUM(PrecioUnitario * Cantidad) desc
LIMIT 5;

-- 8) Generar un listado de facturas, con los campos id, nombre y apellido del cliente,
-- fecha de factura, país de envío, Total, ordenado de manera descendente por
-- fecha de factura y limitado a 10 filas.

SELECT Facturas.FacturaID, Clientes.contacto, 
Facturas.FechaFactura, Facturas.PaisEnvio, SUM(PrecioUnitario* Cantidad) as Total
FROM facturas
JOIN facturadetalle 
ON facturas.facturaID = facturadetalle.facturaId
JOIN clientes 
ON facturas.ClienteID = clientes.ClienteID
GROUP By Facturas.FacturaID, Clientes.contacto, 
Facturas.FechaFactura, Facturas.PaisEnvio
order by Facturas.FechaFactura desc
LIMIT 10;