DROP SCHEMA IF EXISTS `spring_mvc_hibernate_crm`;

CREATE SCHEMA `spring_mvc_hibernate_crm`;

USE `spring_mvc_hibernate_crm`;

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `customer` VALUES
    (1, 'Shannon', 'Chang', 'shannonchang@gmail.com'),
    (2, 'Blue', 'Mary','bluemary@gmail.com'),
    (3, 'Mai', 'Shiranui','maishiranui@gmail.com'),
    (4, 'Nina', 'Williams','ninawilliams@gmail.com'),
    (5, 'Lili', 'Rochefort','lilirochefort@gmail.com');