USE movies_db;

SELECT movies.id, title, genre_id, genres.id, name
FROM movies,genres
WHERE genre_id=genres.id;

-- relacion de muchos a muchos un where y un and
SELECT title,first_name,last_name
FROM movies,actor_movie,actors
WHERE movie_id=movies.id
AND actor_id=actors.id;

-- con join en el from se pone una sola, las otras se poenne en el inner join, el inner join no funciona sin en ON
SELECT movies.id, title, genre_id, genres.id, name
FROM movies
INNER JOIN genres ON  genre_id=genres.id;

SELECT title,first_name,last_name
FROM movies
INNER JOIN actor_movie ON movie_id=movies.id
INNER JOIN actors ON actor_id=actors.id ;

-- en la consulta de abajo me van a salir repetidos porque daniel radclife actuó en harry potter 1,2,3, para evitar repetidos us DISTINCT:

SELECT first_name,last_name
FROM movies
INNER JOIN actor_movie ON movie_id=movies.id
INNER JOIN actors ON actor_id=actors.id
WHERE title LIKE 'harry%' ;

SELECT DISTINCT first_name,last_name
FROM movies
INNER JOIN actor_movie ON movie_id=movies.id
INNER JOIN actors ON actor_id=actors.id
WHERE title LIKE 'harry%' ;

USE movies_db;

-- FUNCIONES DE ALTERACION	
SELECT concat( first_name, " ", last_name) as nombre_completo
FROM actors;

-- quiero que las películas aparezcan igual así no tengan género
select title, name
from movies
left join genres on genre_id= genres.id;

-- como alicia en el pais de las maravillas no tiene género, yo no quiero que me aparezca null sino con COALESCE rellenar ese campo con un texto que yo quiera

SELECT title, COALESCE(name, 'no tiene género')
FROM movies
LEFT jOIN genres ON genre_id= genres.Id;


SELECT title, release_date 
FROM movies;

-- quiero saber no cuándo se estrenó sino hace cuánto se estrenó una película DATEDIFF, debemos poner primero la fecha más reciente y luego la otra
SELECT title, DATEDIFF (NOW(),release_date )
FROM movies;

-- quiero trabajar solo con un pedazo de la fecha year month y date
SELECT title, YEAR(release_date )
FROM movies;

-- quiero trabajar solo con un pedazo de la fecha EXTRACT hace lo mismo que las otras
SELECT title, EXTRACT( DAY FROM release_date )
FROM movies;


-- formatear la fecha DATE_FORMAT
SELECT title, DATE_FORMAT( release_date, '%d/%m/%Y' )
FROM movies;

SELECT title, DATE_FORMAT( release_date, '%D/%M/%Y' )
FROM movies;

SELECT REPLACE(title, 'Harry', 'JUANITO')
FROM movies;

SELECT LENGTH(title) 
FROM movies;

-- length es más útil en el where
SELECT TITLE
FROM MOVIES
WHERE LENGTH(TITLE) >10;

SELECT title, rating,
CASE 
	WHEN rating<5 THEN 'mala'
	WHEN rating < 7 THEN 'buena'
	ELSE 'muy buena'
	END
FROM movies

