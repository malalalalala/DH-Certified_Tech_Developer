SELECT COUNT(*)
FROM movies;

-- COUNT
-- Devuelve un único resultado indicando la cantidad de filas/registros que cumplen con el criterio.
-- sirve para saber la cantidad de filas que tiene una tabla

SELECT COUNT(id) AS total FROM movies WHERE genre_id=3;

SELECT COUNT(*)
FROM movies
WHERE rating>5;

-- las funciones de agregación nos imposibilitan ver datos de diferentes filas

SELECT MAX(rating)
FROM movies;

SELECT MAX(rating), COUNT(*)
FROM movies
WHERE title LIKE 'la guerra%';

SELECT MIN(rating), COUNT(*)
FROM movies;

SELECT SUM(length)
FROM movies;

-- Devuelve el promedio del rating de las películas de la tabla movies.
SELECT AVG(length)
FROM movies;

SELECT COUNT(id) AS total FROM movies WHERE genre_id=3;

-- Devuelve la cantidad de películas de la tabla movies con el genero_id 3 y lo muestra en una columna denominada total.

SELECT * FROM movies
GROUP BY genre_id;

-- Group by viene después del where pero antes del limit y offset, con group by solo se pueden poner dos cosas en el select:
-- el o los campos agrupados y otra función de agregación

SELECT genre_id, COUNT(*), AVG(length)
FROM movies 
GROUP BY genre_id;

-- where no sirve para datos agregados

SET sql_mode = '';
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

-- Cumple la misma función que WHERE, a diferencia de queHAVING permite laimplementación dealias yfunciones de agregación en las condiciones de laselección de datos.

-- SELECT columna_1 
-- FROM nombre_tabla 
-- WHERE condition 
-- GROUP BY columna_1 
-- HAVING condition_Group 
-- ORDER BY columna_1

SELECT name, COUNT(*), MAX(rating), AVG(length)
FROM movies
INNER JOIN genres ON genre_id=genres.id
GROUP BY name
HAVING COUNT(*)>=3



