USE musimundos;

-- table reference, en el from se ponen todas la tablas

SELECT id_genero,compositor,canciones.nombre,generos.id,generos.nombre
FROM canciones,generos
WHERE id_genero=generos.id
AND generos.nombre <> "rock" 
AND compositor='willie dixon' 
AND generos.nombre='blues';

-- con join en el from se pone una sola, las otras se poenne en el inner join, el inner join no funciona sin en ON

SELECT pais 
from clientes;

SELECT distinct pais 
from clientes;




