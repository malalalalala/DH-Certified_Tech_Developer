USE movies_db;

-- Alias, limit y offset
-- 1. Mostrar el título de todas las series y usar alias para que el nombre del campo
-- este en español.
-- 2. Traer el título de las películas con el rating mayor a 3, con más de 1 premio y con
-- fecha de lanzamiento entre el año ‘1988-01-01’ al ‘2009-12-31’. Ordenar los
-- resultados por rating descendentemente.
-- 3. Traer el top 3 a partir del registro 10 de la consulta anterior.
-- 4. ¿Cuáles son los 3 peores episodios teniendo en cuenta su rating?
-- 5. Obtener el listado de todos los actores. Quitar las columnas de fechas y película
-- favorita, además traducir los nombres de las columnas.

SELECT * 
FROM movies;

SELECT FIRST_name, last_name, rating 
FROM actors;

SELECT title
FROM series;

SELECT FIRST_name, last_name,rating
FROM actors
WHERE rating>7.5 ;

SELECT title, rating, awards
FROM movies
WHERE rating>7.5 AND awards>2 ;

SELECT title, rating
FROM movies
ORDER BY rating;

SELECT title, rating
FROM movies
WHERE title like '%Toy Story%';

SELECT first_name, last_name
FROM actors
WHERE first_name like 'Sam%' ;

SELECT title,release_date
FROM movies
WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31';

-- Alias, limit y offset
-- 1. Mostrar el título de todas las series y usar alias para que el nombre del campo
-- este en español.
-- 2. Traer el título de las películas con el rating mayor a 3, con más de 1 premio y con
-- fecha de lanzamiento entre el año ‘1988-01-01’ al ‘2009-12-31’. Ordenar los
-- resultados por rating descendentemente.
-- 3. Traer el top 3 a partir del registro 10 de la consulta anterior.
-- 4. ¿Cuáles son los 3 peores episodios teniendo en cuenta su rating?
-- 5. Obtener el listado de todos los actores. Quitar las columnas de fechas y película
-- favorita, además traducir los nombres de las columnas.

SELECT title AS 'titulo' 
FROM series;

SELECT title, rating, awards,release_date
FROM movies
WHERE rating>3 
AND awards>1 
AND release_date BETWEEN '1988-01-01' AND '2009-12-31'  
ORDER BY rating DESC;

SELECT title, rating, awards,release_date
FROM movies
WHERE rating>3 
AND awards>1 
AND release_date BETWEEN '1988-01-01' AND '2009-12-31'  
ORDER BY rating DESC
LIMIT 3
OFFSET 10;

SELECT title, rating
FROM episodes
ORDER BY rating
LIMIT 3;

SELECT title, rating
FROM episodes
ORDER BY rating;

SELECT id,first_name AS nombre, last_name AS apellido, rating AS calificacion
FROM actors;

-- Alias, limit y offset
-- 1. Mostrar el título de todas las series y usar alias para que tanto el nombre de la
-- tabla como el campo estén en español.

SELECT title AS titulo 
FROM series as mis_series;

