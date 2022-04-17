SELECT * FROM movies;

SELECT `first_name`,`last_name`,`rating` FROM actors;

SELECT title FROM series;

SELECT title,awards ,rating FROM movies
WHERE rating>7.5 AND awards>2;

SELECT title, rating FROM movies
ORDER BY title;

SELECT title,rating FROM movies
WHERE title LIKE '%toy story%';

SELECT * from actors
WHERE first_name LIKE 'sam%';

SELECT title,release_date from movies
WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31';

SELECT first_name, last_name, rating FROM actors
ORDER BY rating DESC
LIMIT 5;

-- nos interesan los primeros 5

SELECT first_name, last_name, rating FROM actors
ORDER BY rating DESC
LIMIT 5
OFFSET 5;

-- nos interesan los primeros 5

SELECT title AS titulo, rating * 10 AS 'rating hasta 100' FROM movies;

-- no cambia el nombre de la columna, solo cómo se ve la consulta

SELECT COUNT(*)
FROM movies;

-- sirve para saber la cantidad de filas que tiene una tabla

SELECT COUNT(*)
FROM movies
WHERE rating>5;

-- las funciones de agregación nos imposibilitan ver datos de diferentes filas



