-- Join
USE movies_db;
-- 1. Utilizando la base de datos de movies, queremos conocer, por un lado, los
-- títulos y el nombre del género de todas las series de la base de datos.
SELECT series.title,genres.name
FROM series
INNER JOIN  genres
ON series.genre_id=genres.id;

-- 2. Por otro, necesitamos listar los títulos de los episodios junto con el nombre y
-- apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title,first_name,last_name
FROM episodes
JOIN  actor_episode ON actor_episode.episode_id=episodes.id
JOIN actors ON actor_episode.actor_id=actors.id;

-- 3. Para nuestro próximo desafío, necesitamos obtener a todos los actores o
-- actrices (mostrar nombre y apellido) que han trabajado en cualquier película
-- de la saga de La Guerra de las galaxias.

SELECT first_name,last_name, title
FROM movies
INNER JOIN actor_movie ON movie_id=movies.id
INNER JOIN actors ON actor_id=actors.id 
WHERE title like "%La Guerra de las galaxias%";

-- 4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la
-- cantidad de películas por nombre de género./

SELECT name, COUNT(genres.id)
FROM movies
INNER JOIN genres ON genre_id=genres.id;

SELECT name, COUNT(*) as total_by_genre
FROM movies
INNER JOIN genres ON genre_id=genres.id
GROUP BY name;

