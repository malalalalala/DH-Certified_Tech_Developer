USE musimundos;

SELECT pais, COUNT(*) 
FROM clientes
GROUP BY pais HAVING pais='Brazil';

SELECT id_genero,COUNT(*) AS cantidadCancionesxgenero FROM canciones GROUP BY id_genero;

SELECT SUM(total) FROM facturas;

SELECT id_album, AVG(milisegundos)
FROM canciones
GROUP BY id_album;

SELECT MIN(bytes)
FROM canciones;

SELECT id_cliente, COUNT(id), SUM(total)
FROM facturas
GROUP BY id_cliente
HAVING SUM(total)>45;