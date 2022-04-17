-- MySQL Script generated by MySQL Workbench
-- Sat Aug 28 19:50:09 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Spotify_Mesa5
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Spotify_Mesa5` ;

-- -----------------------------------------------------
-- Schema Spotify_Mesa5
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Spotify_Mesa5` ;
USE `Spotify_Mesa5` ;

-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`TipoUsuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`TipoUsuario` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`TipoUsuario` (
  `idTipoUsuario` INT NOT NULL AUTO_INCREMENT,
  `tipoUsuario` VARCHAR(7) BINARY NOT NULL,
  PRIMARY KEY (`idTipoUsuario`),
  UNIQUE INDEX `idtipoUsuario_UNIQUE` (`idTipoUsuario` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Pais`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Pais` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Pais` (
  `idPais` INT NOT NULL,
  `pais` VARCHAR(45) NULL,
  PRIMARY KEY (`idPais`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `contrasenia` VARCHAR(45) NOT NULL,
  `fechaNacimiento` VARCHAR(45) NOT NULL,
  `sexo` TINYINT(1) NOT NULL,
  `codigoPostal` VARCHAR(15) NULL,
  `fechaModificacionContrasenia` DATE NOT NULL,
  `fechaExpiracionContrasenia` DATE NOT NULL,
  `TipoUsuario_idTipoUsuario` INT NOT NULL,
  `Pais_idPais` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_Usuario_TipoUsuario1_idx` (`TipoUsuario_idTipoUsuario` ASC) VISIBLE,
  INDEX `fk_Usuario_Pais1_idx` (`Pais_idPais` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_TipoUsuario1`
    FOREIGN KEY (`TipoUsuario_idTipoUsuario`)
    REFERENCES `Spotify_Mesa5`.`TipoUsuario` (`idTipoUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Pais1`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `Spotify_Mesa5`.`Pais` (`idPais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Playlist`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Playlist` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Playlist` (
  `idPlaylist` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `cantidadCanciones` INT NOT NULL,
  `fechaCreacion` DATE NOT NULL,
  `eliminada` TINYINT(1) NOT NULL,
  `fechaEliminacion` DATE NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPlaylist`),
  INDEX `fk_Playlist_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Playlist_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `Spotify_Mesa5`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Artista`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Artista` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Artista` (
  `idArtista` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `imagen` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idArtista`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Discografica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Discografica` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Discografica` (
  `idDiscografica` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `Pais_idPais` INT NOT NULL,
  PRIMARY KEY (`idDiscografica`),
  INDEX `fk_Discografica_Pais1_idx` (`Pais_idPais` ASC) VISIBLE,
  CONSTRAINT `fk_Discografica_Pais1`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `Spotify_Mesa5`.`Pais` (`idPais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Album`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Album` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Album` (
  `idAlbum` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `anioPublicacion` YEAR(4) NOT NULL,
  `imagen` VARCHAR(150) NOT NULL,
  `Artista_idArtista` INT UNSIGNED NOT NULL,
  `Discografica_idDiscografica` INT NOT NULL,
  PRIMARY KEY (`idAlbum`),
  UNIQUE INDEX `idAlbum_UNIQUE` (`idAlbum` ASC) VISIBLE,
  INDEX `fk_Album_Artista1_idx` (`Artista_idArtista` ASC) VISIBLE,
  INDEX `fk_Album_Discografica1_idx` (`Discografica_idDiscografica` ASC) VISIBLE,
  CONSTRAINT `fk_Album_Artista1`
    FOREIGN KEY (`Artista_idArtista`)
    REFERENCES `Spotify_Mesa5`.`Artista` (`idArtista`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Album_Discografica1`
    FOREIGN KEY (`Discografica_idDiscografica`)
    REFERENCES `Spotify_Mesa5`.`Discografica` (`idDiscografica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Cancion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Cancion` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Cancion` (
  `idCancion` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `duracion` FLOAT NOT NULL,
  `numeroReproducciones` INT NOT NULL,
  `cantidadLikes` INT NOT NULL,
  `Album_idAlbum` INT NOT NULL,
  PRIMARY KEY (`idCancion`),
  UNIQUE INDEX `idCancion_UNIQUE` (`idCancion` ASC) VISIBLE,
  INDEX `fk_Cancion_Album1_idx` (`Album_idAlbum` ASC) VISIBLE,
  CONSTRAINT `fk_Cancion_Album1`
    FOREIGN KEY (`Album_idAlbum`)
    REFERENCES `Spotify_Mesa5`.`Album` (`idAlbum`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Genero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Genero` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Genero` (
  `idGenero` INT NOT NULL AUTO_INCREMENT,
  `tipoGenero` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGenero`),
  UNIQUE INDEX `idGenero_UNIQUE` (`idGenero` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Playlist_has_Cancion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Playlist_has_Cancion` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Playlist_has_Cancion` (
  `Playlist_idPlaylist` INT NOT NULL,
  `Cancion_idCancion` INT NOT NULL,
  PRIMARY KEY (`Playlist_idPlaylist`, `Cancion_idCancion`),
  INDEX `fk_Playlist_has_Cancion_Cancion1_idx` (`Cancion_idCancion` ASC) VISIBLE,
  INDEX `fk_Playlist_has_Cancion_Playlist1_idx` (`Playlist_idPlaylist` ASC) VISIBLE,
  CONSTRAINT `fk_Playlist_has_Cancion_Playlist1`
    FOREIGN KEY (`Playlist_idPlaylist`)
    REFERENCES `Spotify_Mesa5`.`Playlist` (`idPlaylist`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Playlist_has_Cancion_Cancion1`
    FOREIGN KEY (`Cancion_idCancion`)
    REFERENCES `Spotify_Mesa5`.`Cancion` (`idCancion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify_Mesa5`.`Cancion_has_Genero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Spotify_Mesa5`.`Cancion_has_Genero` ;

CREATE TABLE IF NOT EXISTS `Spotify_Mesa5`.`Cancion_has_Genero` (
  `Cancion_idCancion` INT NOT NULL,
  `Genero_idGenero` INT NOT NULL,
  PRIMARY KEY (`Cancion_idCancion`, `Genero_idGenero`),
  INDEX `fk_Cancion_has_Genero_Genero1_idx` (`Genero_idGenero` ASC) VISIBLE,
  INDEX `fk_Cancion_has_Genero_Cancion1_idx` (`Cancion_idCancion` ASC) VISIBLE,
  CONSTRAINT `fk_Cancion_has_Genero_Cancion1`
    FOREIGN KEY (`Cancion_idCancion`)
    REFERENCES `Spotify_Mesa5`.`Cancion` (`idCancion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cancion_has_Genero_Genero1`
    FOREIGN KEY (`Genero_idGenero`)
    REFERENCES `Spotify_Mesa5`.`Genero` (`idGenero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

UsuarioINSERT INTO `Spotify_Mesa5` . `Usuario` (nombre, apellidos, email, contrasenia,fechaNacimiento,sexo,codigoPostal,fechaModificacionContrasenia,fechaExpiracionContrasenia) VALUES (a,a,a,2020-01-20,1,111,2020-01-20,2001-01-20),(a,a,a,2020-01-20,1,111,2020-01-20,2001-01-20),(a,a,a,2020-01-20,1,111,2020-01-20,2001-01-20);

INSERT INTO `album` VALUES (1,'Freedom',1992,1,'C:\\Users\\user\\Desktop/freedom_brit',1),(2,'No more time',1973,1,'C:\\Users\\user\\Desktop/nomore_brit',2),(3,'toxic',2000,1,'C:\\Users\\user\\Desktop/toxictoxic_brit',3);

INSERT INTO `canciones` VALUES (1,'el termoidUsuario no para','00:03:42',1456,2,3),(2,'la ssopa en la mosca','04:35:42',4,0,2),(3,'this','00:00:30',789034521,3,1);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
