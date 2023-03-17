SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `business` DEFAULT CHARACTER SET utf8mb4;
USE `business`;


-- TABLA EMPLOYEE
CREATE TABLE IF NOT EXISTS `business`.`employee`(
	`employee_id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(30),
    `last_name` VARCHAR(30),
    `salary` INT,
    `join_date` DATE,
    `department` VARCHAR(25),
    PRIMARY KEY (`employee_id`)
)
ENGINE = InnoDB;

INSERT INTO `employee`
	(`first_name`, `last_name`, `salary`, `join_date`, `department`)
	VALUES
    ('Monika', 'Arora', 100000, '2014-02-20', 'HR'),
    ('Santiago', 'Carrillo', 300000, '2014-02-20', 'Admin'),
    ('Ian', 'Smith', 300000, '2014-02-20', 'HR'),
    ('Boyd', 'Ndonga', 500000, '2014-02-20', 'Admin'),
    ('Vivek', 'Bhati', 500000, '2014-06-11', 'Admin'),
	('Elise', 'Guimares', 200000, '2014-06-11', 'Account'),
	('Barrack', 'Obama', 75000, '2014-01-20', 'Account'),
	('Vivian', 'Muyu', 90000, '2014-04-11', 'Admin');
    
CREATE TABLE `bonus` (
	`bonus_amount` INT,
    `bonus_date` DATETIME,
    `employee_id_fk` INT,
    FOREIGN KEY(`employee_id_fk`)
		REFERENCES `business`.`employee`(`employee_id`) -- Hace referencia a la tabla employee
        ON DELETE NO ACTION -- no elimina registros de t.employee al modificar 
)
ENGINE = InnoDB;
    
INSERT INTO `bonus`
	(`employee_id_fk`, `bonus_amount`, `bonus_date`) VALUES
	(1, 5000, '2016-02-20'),
	(2, 3000, '2016-06-11'),
	(3, 4000, '2016-02-20'),
	(1, 4500, '2016-02-20'),
	(2, 3500, '2016-06-11');
    
CREATE TABLE `title` (
	`effective_since` DATETIME,
    `employee_title` VARCHAR(25),
    `employee_id_fk` INT,
    FOREIGN KEY(`employee_id_fk`)
		REFERENCES `business`.`employee`(`employee_id`)
        ON DELETE NO ACTION
)
ENGINE = InnoDB;

INSERT INTO `title`
 (`employee_id_fk`, `employee_title`, `effective_since`) VALUES
	(1, 'Manager', '2016-02-20 00:00:00'),
	(2, 'Executive', '2016-06-11 00:00:00'),
	(8, 'Executive', '2016-06-11 00:00:00'),
	(5, 'Manager', '2016-06-11 00:00:00'),
	(4, 'Asst. Manager', '2016-06-11 00:00:00'),
	(7, 'Executive', '2016-06-11 00:00:00'),
	(6, 'Lead', '2016-06-11'),
	(3, 'Lead', '2016-06-11'); 