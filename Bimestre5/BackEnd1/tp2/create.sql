--drop table domicilios;
--drop table pacientes;
--drop table odontologos;

create table IF NOT EXISTS domicilios(id int auto_increment primary key,calle varchar(255),numero varchar (255),localidad varchar (255),provincia varchar (255));
create table IF NOT EXISTS pacientes(id int auto_increment primary key,nombre varchar(255),apellido varchar (255),dni varchar (255),fecha_ingreso TIMESTAMP WITHOUT TIME ZONE,domicilio_id int);
CREATE TABLE IF NOT EXISTS odontologos (id int auto_increment primary key,numero_de_matricula varchar(255),nombre varchar(255),apellido varchar (255));
