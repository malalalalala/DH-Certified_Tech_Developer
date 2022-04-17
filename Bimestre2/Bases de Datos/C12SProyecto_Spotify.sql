use proyecto_spotify;

-- Listar las canciones que poseen la letra “z” en su título.
SELECT * 
FROM cancion 
WHERE titulo LIKE '%z%';
-- Listar las canciones que poseen como segundo carácter la letra “a” y como último, la letra “s”.
SELECT * 
FROM cancion 
WHERE titulo LIKE '_a%s';
-- Mostrar la playlist que tiene más canciones, renombrando las columnas poniendo mayúsculas en la primera letra, los tildes correspondientes y agregar los espacios entre palabras.
SELECT IDPLAYLIST 'ID Playlist', 
    IDUSUARIO 'ID Usuario', 
    TITULO 'Título', 
    CANTCANCIONES 'Cantidad Canciones', 
    IDESTADO 'ID Estado', 
    FECHACREACION 'Fecha Creación', 
    FECHAELIMINADA 'Fecha Eliminada' 
FROM PLAYLIST 
ORDER BY cantcanciones DESC 
LIMIT 1;

-- En otro momento se obtuvo un listado con los 5 usuarios más jóvenes, obtener un listado de los 10 siguientes.
SELECT * 
FROM USUARIO 
ORDER BY FECHA_NAC DESC 
LIMIT 10 
OFFSET 5;

-- Listar las 5 canciones con más reproducciones, ordenadas descendentemente.
SELECT * 
FROM CANCION 
ORDER BY CANTREPRODUCCION DESC 
LIMIT 5;

-- Generar un reporte de todos los álbumes ordenados alfabéticamente.
SELECT * 
FROM ALBUM 
ORDER BY TITULO;
-- Listar todos los álbumes que no tengan imagen, ordenados alfabéticamente.
SELECT * 
FROM ALBUM 
WHERE IMAGENPORTADA IS NULL 
ORDER BY TITULO;

-- Insertar un usuario nuevo con los siguientes datos (tener en cuenta las relaciones):
-- a) nombreusuario: nuevousuariodespotify@gmail.com
-- b) Nombre y apellido: Elmer Gomez
-- c) password: S4321m
-- d) Fecha de nacimiento: 15/11/1991
-- e) Sexo: Masculino
-- f) Código Postal: B4129ATF
-- g) País: Colombia
SELECT*
FROM USUARIO;
-- INSERT INTO USUARIO VALUES (20, 'nuevousuariodespotify@gmail.com', 'Elmer Gomez','1991-11-15','M','B4129ATF', 'S4321m', (SELECT IDPAIS FROM PAIS WHERE PAIS = 'Colombia'), (SELECT IDTIPOUSUARIO FROM TIPOUSUARIO WHERE TIPOUSUARIO = "Premium"));

INSERT INTO usuario 
VALUES(20,'nuevousuariodespotify@gmail.com','Elmer Gomez','1991-11-15','M','B4129ATF', 'S4321m',(SELECT IDPAIS FROM PAIS WHERE PAIS = 'Colombia'),(SELECT IDTIPOUSUARIO FROM TIPOUSUARIO WHERE TIPOUSUARIO = "Premium"));

-- Eliminar todas las canciones de género “pop”.
SELECT *
FROM genero
WHERE genero='pop'; -- 9

SELECT *
FROM generoxcancion
WHERE idgenero=9; -- cruce entre genero y canciones, cojo la columna idcancion 6,	7,	8,	9,	11,	12,	13,	14,	15,	18,	19,	20,	21,	22,	23,	24,	25,	79,	85,	130,	133,

SELECT *
FROM cancion
WHERE idCancion IN (6,7,8,9,11,12,13,14,15,	18,	19,	20,	21,	22,	23,	24,	25,	79,	85,	130,133);

SELECT *
FROM cancion 
WHERE idcancion IN (SELECT idcancion FROM generoxcancion WHERE idgenero=9);

SELECT *
FROM cancion
INNER JOIN generoxcancion 
ON cancion.idcancion=generoxcancion.idcancion
INNER JOIN genero
ON generoxcancion.idgenero=genero.idgenero
WHERE genero.genero='pop';

-- DELETE *
-- FROM cancion
-- INNER JOIN generoxcancion 
-- ON cancion.idcancion=generoxcancion.idcancion
-- INNER JOIN genero
-- ON generoxcancion.idgenero=genero.idgenero
-- WHERE genero.genero='pop';


DELETE FROM PLAYLISTXCANCION WHERE IDCANCION IN (6,
7,
8,
9,
11,
12,
13,
14,
15,
18,
19,
20,
21,
22,
23,
24,
25,
79,
85,
130,
133);
DELETE FROM GENEROXCANCION WHERE IDCANCION IN (6,
7,
8,
9,
11,
12,
13,
14,
15,
18,
19,
20,
21,
22,
23,
24,
25,
79,
85,
130,
133);
DELETE FROM CANCION WHERE IDCANCION IN (6,
7,
8,
9,
11,
12,
13,
14,
15,
18,
19,
20,
21,
22,
23,
24,
25,
79,
85,
130,
133);


-- Editar todos los artistas que no tengan una imagen cargada y cargarles el texto “Imagen faltante” en la columna de imagen.
UPDATE ARTISTA 
SET IMAGEN = 'Imagen faltante' 
WHERE IMAGEN IS NULL;

SELECT coalesce(IMAGEN,'Imagen faltante')
FROM ARTISTA ;