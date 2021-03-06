-- MySQL Script generated by MySQL Workbench
-- Fri Apr 23 21:07:10 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_generation_game_online` DEFAULT CHARACTER SET utf8 ;
USE `db_generation_game_online` ;

-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_classe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_classe` (
  `id_classe` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `aereo` TINYINT NOT NULL,
  `terrestre` TINYINT NOT NULL,
  `aquatico` TINYINT NOT NULL,
  PRIMARY KEY (`id_classe`),
  UNIQUE INDEX `id_classe_UNIQUE` (`id_classe` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_personagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_personagem` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `ataque` INT NOT NULL,
  `defesa` INT NOT NULL,
  `velocidade` INT NOT NULL,
  `resistencia` INT NOT NULL,
  `tb_classe_id_classe` INT NOT NULL,
  PRIMARY KEY (`id`, `tb_classe_id_classe`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_tb_personagem_tb_classe_idx` (`tb_classe_id_classe` ASC) VISIBLE,
  CONSTRAINT `fk_tb_personagem_tb_classe`
    FOREIGN KEY (`tb_classe_id_classe`)
    REFERENCES `db_generation_game_online`.`tb_classe` (`id_classe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


SELECT * FROM db_generation_game_online.tb_personagem WHERE ataque > 2000;
SELECT * FROM db_generation_game_online.tb_personagem WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM db_generation_game_online.tb_personagem WHERE nome LIKE "%C%"