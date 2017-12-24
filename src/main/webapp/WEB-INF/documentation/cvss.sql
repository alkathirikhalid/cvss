-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cvss
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `cvss` ;

-- -----------------------------------------------------
-- Schema cvss
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cvss` DEFAULT CHARACTER SET utf8 ;
USE `cvss` ;

-- -----------------------------------------------------
-- Table `cvss`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cvss`.`user` ;

CREATE TABLE IF NOT EXISTS `cvss`.`user` (
  `iduser` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `salt` VARCHAR(50) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `account` VARCHAR(40) NOT NULL,
  `datejoined` VARCHAR(45) NOT NULL,
  `active` VARCHAR(40) NOT NULL,
  `lastlogin` VARCHAR(45) NOT NULL,
  `lastlogout` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvss`.`institute`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cvss`.`institute` ;

CREATE TABLE IF NOT EXISTS `cvss`.`institute` (
  `idinstitute` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `manager` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idinstitute`),
  UNIQUE INDEX `manager_UNIQUE` (`manager` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC),
  CONSTRAINT `fk_user_institute`
    FOREIGN KEY (`manager`)
    REFERENCES `cvss`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvss`.`certificate`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cvss`.`certificate` ;

CREATE TABLE IF NOT EXISTS `cvss`.`certificate` (
  `idcertificate` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `certificateid` VARCHAR(45) NOT NULL,
  `date` VARCHAR(45) NOT NULL,
  `action` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `institute` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcertificate`),
  CONSTRAINT `fk_institute_certificate`
    FOREIGN KEY (`institute`)
    REFERENCES `cvss`.`institute` (`name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvss`.`payment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cvss`.`payment` ;

CREATE TABLE IF NOT EXISTS `cvss`.`payment` (
  `idpayment` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NOT NULL,
  `amount` VARCHAR(45) NOT NULL,
  `subscription` VARCHAR(45) NOT NULL,
  `payee` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idpayment`),
  INDEX `fk_user_payment_idx` (`payee` ASC),
  CONSTRAINT `fk_user_payment`
    FOREIGN KEY (`payee`)
    REFERENCES `cvss`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
