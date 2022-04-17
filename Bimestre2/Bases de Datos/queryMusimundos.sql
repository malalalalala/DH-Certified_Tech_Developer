USE musimundos;


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
ORDER BY bytes ;

;
;
;
;