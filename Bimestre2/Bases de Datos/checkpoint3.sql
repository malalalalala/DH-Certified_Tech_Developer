USE DHtube;

-- 1. Generar un reporte que indique la cantidad de usuarios por país,
-- mostrando el nombre del país y su cantidad.

SELECT COUNT(idUsuario) AS cantidadUsuario, pais.nombre AS nombrePais FROM usuario
INNER JOIN pais ON pais.idPais = usuario.Pais_idPais
GROUP BY pais.nombre;

SELECT COUNT(usuario.pais_idPais) AS cantidadUsuario,pais.nombre
FROM usuario
JOIN pais ON pais.idPais = usuario.Pais_idPais
GROUP BY usuario.pais_idPais;

-- 2. Mostrar el Top 5 de avatars utilizados por los usuarios, listando el
-- nombre del avatar y la cantidad de veces utilizado.

SELECT COUNT(avatar_idavatar),avatar.nombre
from usuario
join avatar on avatar.idavatar = usuario.avatar_idavatar
group by avatar_idavatar
order by COUNT(avatar_idavatar) desc
limit 5;

-- 3. Emitir un listado de todas las playlists públicas, informando el nombre
-- del usuario que la creó, el título de cada video que posee y el nombre
-- y año de creación de la playlist.

select playlist.nombre as NombrePlaylist, usuario.nombre as NombreUsuario, video.titulo, 
extract(year from playlist.fechaCreacion) as anio
from playlist
inner join usuario on playlist.Usuario_idUsuario = usuario.idUsuario
inner join playlist_video on playlist.idPlaylist = playlist_video.Playlist_idPlaylist
inner join video on playlist_video.Video_idVideo = video.idVideo
where playlist.privado = 0;



-- 4. Listar las 10 etiquetas menos usadas.

select etiqueta.nombre,count(video_etiqueta.etiqueta_idetiqueta) as cantidad
from etiqueta
join video_etiqueta
on etiqueta.idetiqueta = video_etiqueta.etiqueta_idetiqueta
group by etiqueta.idetiqueta
order by cantidad
limit 10;


-- 5. Generar un reporte de las últimas 10 reacciones, listando la fecha, el
-- nombre de la reacción, el id y nombre de usuario, y el título del video.

select reaccion.fecha,tiporeaccion.nombre as nombre_reaccion,usuario.idusuario,usuario.nombre,video.titulo
from reaccion
join tiporeaccion
on tiporeaccion.idtiporeaccion=reaccion.tiporeaccion_idtiporeaccion
join usuario
on usuario.idusuario=reaccion.usuario_idusuario
join video
on usuario.idusuario=video.usuario_idusuario
order by reaccion.fecha desc
limit 10;


select fecha, tiporeaccion.nombre as nombreReaccion, usuario.idUsuario, 
usuario.nombre as nombreUsuario, video.titulo
from reaccion
inner join tiporeaccion on reaccion.TipoReaccion_idTipoReaccion = tiporeaccion.idTipoReaccion
inner join usuario on reaccion.Usuario_idUsuario = usuario.idUsuario
inner join video on reaccion.Video_idVideo = video.idVideo
order by reaccion.fecha desc
limit 10;

select r.fecha, tr.nombre, u.idUsuario, u.nombre, v.titulo from usuario u
inner join video v
on u.idUsuario = v.Usuario_idUsuario
inner join reaccion r
on v.idVideo = r.Video_idVideo
inner join tiporeaccion tr
on r.TipoReaccion_idTipoReaccion = tr.idTipoReaccion
order by r.fecha desc
limit 10;
-- 6. Mostrar por usuario la cantidad de playlists que posee, pero solo para
-- aquellos que tengan más de 1 playlist creada en el año 2021.

select u.idUsuario, u.nombre,count(p.idPlaylist)
from usuario u
inner join playlist p
on u.idUsuario = p.Usuario_idUsuario
where year(p.fechacreacion)=2021
group by u.idUsuario
having count(p.idPlaylist)>1  ;


-- 7. Generar un reporte de las reacciones generadas en el 2021, con el
-- siguiente formato :
-- Nombre de Reacción, Nombre de Usuario Título de Video Fecha

select r.fecha,tr.nombre,u.nombre,v.titulo
from reaccion r
join tiporeaccion tr
on tr.idtiporeaccion=r.tiporeaccion_idtiporeaccion
join usuario u
on u.idusuario=r.usuario_idusuario
join video v
on u.idusuario=v.usuario_idusuario
where year(r.fecha)=2021;


select tr.nombre Nombre_de_Reaccion, u.nombre Nombre_de_usuario, v.titulo Titulo_de_video, r.fecha Fecha from usuario u
inner join video v
on u.idUsuario = v.Usuario_idUsuario
inner join reaccion r
on v.idVideo = r.Video_idVideo
inner join  tiporeaccion tr
on r.TipoReaccion_idTipoReaccion = tr.idTipoReaccion
where r.fecha like "2021%"
order by r.fecha desc;

-- 8. Listar la cantidad de videos según sean públicos o privados.

-- SELECT id, titulo, rating,
--   CASE
--     WHEN rating < 4 THEN 'Mala'
--     WHEN rating BETWEEN 4 AND 6 THEN 'Regular'
--     WHEN rating BETWEEN 7 AND 9 THEN 'Buena'
--     ELSE 'Excelente'
--   END AS calificacion
-- FROM pelicula

select 
case 
	when privado = 1 then 'Privado'
    else 'Público'
end as tipoVideo,
count(*) as cantidad 
from video
group by privado;

-- 9. Generar un reporte con los nombres de los usuario que no poseen
-- ninguna Playlist.

select *
from usuario u
left join playlist p
on p.usuario_idusuario=u.idusuario
where p.idplaylist is null;

-- 10.Listar todos los videos hayan o no recibido reacciones en el último
-- mes; indicar cuántas reacciones tuvieron y si han sido reproducidos o
-- no. El listado debe estar ordenado alfabéticamente por título del vídeo.

SELECT r.idReaccion, v.cantidadReproducciones, v.titulo,month(r.fecha), count(r.idReaccion)
FROM video v
left join reaccion r
ON v.idVideo = r.Video_idVideo
where month(r.fecha)>=5
group by v.idvideo
order by v.titulo;


-- 11. Generar un reporte con el nombre del usuario y el título de videos del
-- usuario que no pertenecen a ninguna playlist.
 
 select usuario.nombre, video.titulo
 from video
 left join playlist_video
 on video.idvideo = playlist_video.video_idvideo
 join usuario
 on video.usuario_idusuario= usuario.idusuario
 where playlist_video.video_idvideo IS NULL ;
 
 
 


-- 12.Listar a todos los usuarios que no poseen ningún video.
SELECT usuario.nombre
FROM usuario
LEFT JOIN video
ON usuario.idusuario = video.usuario_idusuario
WHERE video.idvideo IS NULL;

-- 13.Listar la cantidad total de reacciones por cada tipo de reacción, en el
-- período del 01-01-2021 al 01-04-2021

SELECT SUM(tiporeaccion.idtiporeaccion)
FROM tiporeaccion
JOIN reaccion
ON reaccion.tiporeaccion_idtiporeaccion = tiporeaccion.idtiporeaccion
JOIN video
ON reaccion.video_idvideo = video.idvideo
WHERE reaccion.fecha BETWEEN '01-01-2021'and '01-04-2021'
GROUP BY tiporeaccion.nombre;

SELECT count(tiporeaccion.idtiporeaccion)
FROM tiporeaccion
JOIN reaccion
ON reaccion.tiporeaccion_idtiporeaccion = tiporeaccion.idtiporeaccion
JOIN video
ON reaccion.video_idvideo = video.idvideo
GROUP BY tiporeaccion.nombre;


select TipoReaccion_idTipoReaccion, count(*) as cantidad
from reaccion
where reaccion.fecha between '2021-01-01' and '2021-04-01'
group by TipoReaccion_idTipoReaccion;


-- 14.Listar los videos que tienen los usuarios cuyo nombre contiene la letra
-- “a” y son del país Argentina.

select video.titulo as nombre_video, usuario.nombre as nombre_usuario, pais.nombre as pais 
from video
join usuario
on video.Usuario_idUsuario = usuario.idUsuario
join pais
on usuario.Pais_idPais = pais.idPais
where usuario.nombre like "%a%"
and pais.nombre like "Argentina";


-- 15.Generar un informe estilo ranking de avatars utilizados por país.


select usuario.pais_idpais, COUNT(avatar.idavatar)
from avatar
join usuario
on usuario.avatar_idavatar = avatar.idavatar
GROUP BY usuario.pais_idpais
order by COUNT(avatar.idavatar) DESC;


select pais.nombre, count(avatar.idAvatar) as cantAvatars
from avatar
inner join usuario on avatar.idAvatar = usuario.Avatar_idAvatar
inner join pais on pais.idPais = usuario.Pais_idPais
group by pais.nombre
order by  cantAvatars desc;



-- 16.Generar un reporte de todos los videos, mostrando los que poseen
-- reacciones y cuántas veces han sido reproducidos.

SET sql_mode = '';
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

select video.titulo, video.cantidadreproducciones
from video 
left join reaccion 
on reaccion.usuario_idusuario=video.usuario_idusuario
WHERE reaccion.idreaccion IS NOT NULL
GROUP BY video.titulo;

select video.titulo, video.cantidadReproducciones, count(reaccion.idReaccion) 
as cantidad_reacciones
from video
left join reaccion
on video.idVideo = reaccion.Video_idVideo
where reaccion.idReaccion is not null
group by video.titulo;



-- 17.Mostrar los 5 videos de menor duración, listando el título del vídeo y el
-- nombre de usuario y país al que corresponde.


select v.titulo,u.nombre,pais.nombre,v.duracion
from video v
join usuario u
on v.usuario_idusuario=u.idusuario
join pais
on u.pais_idpais=pais.idpais
order by v.duracion
limit 5;

-- 18. Listar el usuario brasilero con más reacciones durante el 2021.

select u.nombre, count(r.idreaccion)
from usuario u
join reaccion r
on r.usuario_idusuario=u.idusuario
join pais
on u.pais_idpais=pais.idpais
where year(r.fecha)=2021 and pais.nombre='brasil'
group by u.nombre
order by count(r.idreaccion) desc
limit 1;

-- 19. Generar un reporte listando los usuarios, sus canales, playlists y los
-- videos que integran esas playlists.

select u.nombre,c.nombre,p.nombre,v.titulo
from usuario u
join canal c
on c.usuario_idusuario=u.idusuario
join video v
on v.usuario_idusuario=u.idusuario
join playlist p
on p.usuario_idusuario=u.idusuario;

select usuario.nombre as usuario, canal.idCanal as canal, playlist.idPlaylist as playlist,
video.titulo as video
from usuario
left join canal
on canal.Usuario_idUsuario = usuario.idUsuario
left join playlist
on playlist.Usuario_idUsuario = usuario.idUsuario
join playlist_video
on playlist_video.Playlist_idPlaylist = playlist.idPlaylist
join video
on video.idVideo = playlist_video.Video_idVideo;





-- 20. Listar todas las playlists que posean menos de 3 videos, mostrando el
-- nombre de usuario y el avatar que posee.

select playlist.idPlaylist as playlist, count(video.idVideo) as cantidad_videos, 
usuario.nombre as usuario, avatar.nombre as avatar
from playlist
join playlist_video
on playlist_video.Playlist_idPlaylist = playlist.idPlaylist
join video
on video.idVideo = playlist_video.Video_idVideo
join usuario
on usuario.idUsuario = playlist.Usuario_idUsuario
join avatar
on usuario.Avatar_idAvatar = avatar.idAvatar
group by playlist.idPlaylist
having count(video.idVideo) >= 3
