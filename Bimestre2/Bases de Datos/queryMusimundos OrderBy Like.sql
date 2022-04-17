USE musimundos;

CREATE TABLE tipo_cliente(
id_tipo_cliente INT(6) PRIMARY KEY NOT NULL,
titulo VARCHAR(20) NOT NULL
);

INSERT INTO artistas VALUES(
1233,'Lalala'
);

SELECT * FROM artistas;

-- INSERT INTO artistas (nombre)VALUES(
-- 'Lalala2'
-- );

DELETE from artistas WHERE nombre = 'Lalala';

CREATE TABLE tipo_cliente(
id_tipo_cliente INT(6) PRIMARY KEY NOT NULL,
titulo VARCHAR(20) NOT NULL
);

INSERT INTO generos (id,nombre) VALUES (26,'Cumbia');

SELECT * FROM generos;

SELECT nombre,bytes,compositor FROM canciones;

SELECT * FROM canciones WHERE bytes>10000000;

SELECT * FROM canciones WHERE nombre <> 'go down';

SELECT * FROM canciones WHERE nombre <> 'go down'
AND id_album = 1
order by bytes ;

SELECT * FROM albumes
WHERE titulo = 'big ones';

SELECT * FROM canciones
WHERE milisegundos BETWEEN 199000 AND 400000
ORDER BY milisegundos;
--  between incluye los extremos

SELECT * FROM canciones
WHERE nombre LIKE 'e%';
-- dice que el nombre de la canción debe empezar por e

SELECT * FROM canciones
WHERE nombre LIKE '%s';
-- dice que el nombre de la canción debe terminar por s

SELECT * FROM canciones
WHERE nombre LIKE '%x%';
-- dice que el nombre de la canción debe contener x

SELECT * FROM canciones
WHERE nombre LIKE '%hot%';
-- dice que el nombre de la canción debe contener x

SELECT * FROM canciones
WHERE nombre LIKE 'a%t%';
-- dice que el nombre de la canción debe empezar con a y contener t

SELECT * FROM clientes
WHERE pais = 'USA'
ORDER BY pais DESC;

;
;