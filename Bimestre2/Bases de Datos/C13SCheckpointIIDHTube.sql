
USE dhtube;
-- 1. Listar todos los usuarios cuyo nombre comience con la letra “a”.
SELECT * 
FROM usuario
WHERE nombre like "a%";
-- 2. Listar todos los usuarios que no hayan cargado el email.
SELECT * 
FROM usuario
WHERE email IS NULL;
-- 3. Mostrar todos los canales creados entre el 01/04/2021 y el 01/06/2021.
SELECT * 
FROM canal
WHERE fechaCreacion BETWEEN "2021-04-01" AND "2021-06-01";
-- 4. Listar los 10 usuarios más jóvenes.
SELECT * 
FROM usuario 
ORDER BY fechaNacimiento DESC
LIMIT 10;

-- 5. Mostrar todas las playlists que sean privadas.
SELECT * 
FROM playlist 
WHERE privado = 1;

-- 6. Listar el top 5 de videos con más cantidad de likes.
SELECT * 
FROM video 
ORDER BY cantidadLikes 
DESC LIMIT 5;

-- 7. Insertar un usuario con los siguientes datos:
-- a. Nombre: Juan Jose Batzal
-- b. email: jjbatzal@gmail.com
-- c. password: jj1597
-- d. fecha de nacimiento: 01/04/2000
-- e. codigopostal: 1429
-- f. país: Argentina
-- g. Avatar: carita feliz

INSERT 
INTO usuario 
VALUES (20,'Juan Jose Batzal', 'jjbatzal@gmail.com', 'jj1597', '2000-01-04', '1429', (SELECT idpais FROM pais WHERE nombre = 'Argentina'),(SELECT idavatar FROM avatar WHERE nombre='carita feliz') );

-- 8. Generar un listado con todos los usuarios que hayan nacido en el año 2000.
SELECT * 
FROM usuario 
WHERE YEAR (fechaNacimiento)= 2000;
-- 9. Listar todos los países ordenados alfabéticamente y su nombre en
-- mayúsculas.
SELECT *, UPPER(nombre)
FROM pais
ORDER BY nombre;

-- 10.Listar todos los videos que posean más de 500.000 reproducciones.
SELECT * 
FROM video 
WHERE cantidadReproducciones > 500000;

-- 11. Generar un reporte de todos los videos publicados en el año 2020 que sean
-- privados y que posean más de 100 dislikes.

SELECT * 
FROM video
WHERE YEAR(fechaPublicacion) = 2020 
AND cantidadDislikes > 100 
AND Privado = 1;
-- 12.Por error hemos cargado mal los datos de Juan Jose Batzal. La fecha de
-- nacimiento no era 01/04/2000, sino 04/01/2000. Ahora debemos crear y
-- ejecutar la sentencia necesaria para realizar la modificación.
UPDATE usuario
SET fechaNacimiento = "2000-04-01"
WHERE nombre = "Juan Jose Batzal";

-- 13.Listar todos los usuarios cuyo password contenga menos de 5 caracteres
-- (pista: ver la función length()).

SELECT *
FROM usuario
WHERE LENGTH(password)<5;

-- 14. Generar un reporte de los usuarios. En la consulta mostrar los siguientes
-- títulos:

-- ID Nombre E-mail Fecha de
-- Nacimiento

-- Edad Codigo de
-- Pais

SELECT idUsuario ID, nombre Nombre, email "E-mail", fechaNacimiento "Fecha de Nacimiento", 
TIMESTAMPDIFF(YEAR, fechaNacimiento, CURDATE()) "Edad", pais_idPais "Codigo de Pais" 
FROM usuario;

-- 15.Listar el video de mayor tamaño.

SET sql_mode = '';
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SELECT *
FROM video;

SELECT COUNT(*), Usuario_idusuario, MAX(tamanio) 
FROM video
GROUP BY Usuario_idusuario;

SELECT titulo, MAX(tamanio) 
FROM video;

SELECT *, MAX(tamanio) 
FROM video;

SELECT * 
FROM video
WHERE MAX(tamanio);-- inválido

SELECT * 
FROM video
ORDER BY tamanio DESC
LIMIT 1;
-- 16.Generar un reporte de las últimas 10 reacciones, listando la fecha, el código
-- de reacción, el ID de usuario y el video.
SELECT fecha, idReaccion, Usuario_idUsuario, Video_idVideo 
FROM reaccion 
ORDER BY fecha 
DESC LIMIT 10;


-- 17.Listar todos los videos que tengan menos de 100.000 reproducciones y 100 o
-- más likes.

SELECT * 
FROM video 
WHERE cantidadReproducciones < 100000 
AND cantidadLikes >= 100;

-- 18.Mostrar todos los videos que incluyan la palabra “FAN” dentro de su
-- descripción.

SELECT * 
FROM video
 WHERE descripcion 
 LIKE "%FAN%";
-- 19.Generar un listado de los usuarios cuyos passwords sean aquellos que no
-- satisfacen las políticas de seguridad de la empresa. Estos son los que se
-- corresponden con: 123, 1234, 12345, abc, clave, password.
SELECT * 
FROM usuario
WHERE password 
IN ("123", "1234", "12345", "abc", "clave", "password");
 
-- 20.Eliminar el avatar cuyo nombre sea avDhTube.
DELETE
FROM avatar
WHERE nombre='avDhTube';