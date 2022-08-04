-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para reto4
CREATE DATABASE IF NOT EXISTS `reto4` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `reto4`;

-- Volcando estructura para tabla reto4.tb_categoria
CREATE TABLE IF NOT EXISTS `tb_categoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` text DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto4.tb_categoria: ~3 rows (aproximadamente)
INSERT INTO `tb_categoria` (`id_categoria`, `nombre`, `descripcion`) VALUES
	(1, 'Laptop ', 'Laptop tipo empresarial para el uso diario'),
	(2, 'Laptop gaming', 'Laptop Gaming para todo tipo de juegos con una tasa alta de FPS'),
	(3, 'Smartphone', 'Celular de gama media hasta alta');

-- Volcando estructura para tabla reto4.tb_cliente
CREATE TABLE IF NOT EXISTS `tb_cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Tdocumento_Identidad` varchar(50) DEFAULT NULL,
  `id_Direccion` varchar(50) DEFAULT NULL,
  `Email` text DEFAULT NULL,
  `Telefonos` varchar(50) DEFAULT NULL,
  `Tipo de persona` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `relacion cliente-direcciones` (`id_Direccion`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto4.tb_cliente: ~5 rows (aproximadamente)
INSERT INTO `tb_cliente` (`id_cliente`, `Nombre`, `Tdocumento_Identidad`, `id_Direccion`, `Email`, `Telefonos`, `Tipo de persona`) VALUES
	(100, 'Esteban Alejandro Beltrán', '1094950814', '46 norte,10-16,pavona, Quindio', 'esbv1908@hotmail.com', '3218384657', NULL),
	(101, 'Andrea carolina castillo', '1026124530', 'villa andrea,#9,Quindio', 'acva@gmail.com', '3102462025', NULL),
	(103, 'lina maria acebedo', '9520223630', '64-12,#4,berlin,Quindio', 'lbn@gmail.com', '3182466065', NULL),
	(105, 'Dylan francisco toro', '1019240630', '12-20,#5,Portal,caldas', 'Dyo@gmail.com', '3102654055', NULL),
	(106, 'Manuel alejandro montoya', '9503456623', '44-10,#2,san jose, Palmira', 'Mgs@gmail.com', '3102051005', NULL);

-- Volcando estructura para tabla reto4.tb_productos
CREATE TABLE IF NOT EXISTS `tb_productos` (
  `Idpd` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  `PrecioActual` float NOT NULL DEFAULT 0,
  `Existencia` int(11) NOT NULL DEFAULT 0,
  `Idp` int(11) DEFAULT NULL,
  PRIMARY KEY (`Idpd`) USING BTREE,
  KEY `FK_tb_productos_tb_proveedores` (`Idp`),
  CONSTRAINT `FK_tb_productos_tb_proveedores` FOREIGN KEY (`Idp`) REFERENCES `tb_proveedores` (`Id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto4.tb_productos: ~11 rows (aproximadamente)
INSERT INTO `tb_productos` (`Idpd`, `Nombre`, `PrecioActual`, `Existencia`, `Idp`) VALUES
	(2, 'Hp pavilonGaming', 2500000, 100, 1),
	(6, 'Mackbook retina', 5000000, 5, 0),
	(7, 'Dell legion', 2500000, 0, 1),
	(8, 'Samsung A30', 800000, 6, 2),
	(9, 'Iphone pro 13', 3000000, 2, 0),
	(10, 'andres', 55000, 2, 2),
	(12, 'p50', 1500000, 2, 3),
	(13, 'Hp 1050', 1000000, 5, 1),
	(14, 'Acer aspire one', 800000, 1, 4),
	(15, 'andres', 25000, 2, 2),
	(16, 'laptop s21', 5000000, 0, 29);

-- Volcando estructura para tabla reto4.tb_proveedores
CREATE TABLE IF NOT EXISTS `tb_proveedores` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) NOT NULL,
  `Nit` varchar(20) NOT NULL,
  `RazonSocial` varchar(50) NOT NULL DEFAULT '',
  `Telefono` varchar(20) NOT NULL,
  `CorreoElectronico` varchar(50) NOT NULL DEFAULT '',
  `RepresentanteLegal` varchar(50) NOT NULL DEFAULT '',
  `SitioWeb` varchar(50) NOT NULL DEFAULT '',
  `Calle` varchar(50) NOT NULL DEFAULT '',
  `barrio` varchar(50) NOT NULL DEFAULT '',
  `numero` varchar(50) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto4.tb_proveedores: ~6 rows (aproximadamente)
INSERT INTO `tb_proveedores` (`Id`, `codigo`, `Nit`, `RazonSocial`, `Telefono`, `CorreoElectronico`, `RepresentanteLegal`, `SitioWeb`, `Calle`, `barrio`, `numero`, `ciudad`) VALUES
	(0, '1012', '2021', 'Apple', '+543032665465', 'Apple@apple.org.or', 'Sainel stain', 'https://www.apple.com/co/', '', '', '', ''),
	(1, '1013', '12206068951125', 'Hewerllt packar', '+5730651155', 'Hewerp@hp.org.or', 'Bill gaits', 'https://www.hp.com/co-es/home.html', '', '', '', ''),
	(2, '1015', '1012103042', 'Acer soluciones', '3104501418', 'acer@gmail.com', 'Leonardo santos', 'Acer.com', '', '', NULL, NULL),
	(3, '1014', '9874563210', 'Huawei SA', '3100695871', 'huawei@gmail.com', 'Hernesto hernandez', 'huawei.com.co', '10-12', 'Obrero', '25', 'manizales'),
	(4, '1016', '1478523690', 'Xiaomi', '3218384257', 'Xiaomi@gmail.com', 'Shu set', 'xiaomi.com.co', 'tres norte', 'caracas', '19', 'palmira'),
	(29, '1020', '99632132651', 'Samsung', '3162589612', 'Samsung@gmail.com', 'magnus adner', 'samsung.com.co', 'altavista', 'alamos', '25', 'quintana');

-- Volcando estructura para tabla reto4.tb_ventas
CREATE TABLE IF NOT EXISTS `tb_ventas` (
  `id_ventas` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(11) DEFAULT NULL,
  `id_productos` int(11) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_ventas`),
  KEY `relacion ventas-cliente` (`id_cliente`),
  KEY `relacion ventas-producto` (`id_productos`),
  CONSTRAINT `venta-cliente` FOREIGN KEY (`id_cliente`) REFERENCES `tb_cliente` (`id_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `venta-producto` FOREIGN KEY (`id_productos`) REFERENCES `tb_productos` (`Idpd`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto4.tb_ventas: ~8 rows (aproximadamente)
INSERT INTO `tb_ventas` (`id_ventas`, `id_cliente`, `id_productos`, `Cantidad`) VALUES
	(1, 105, 7, NULL),
	(2, 106, 9, NULL),
	(3, 105, 9, NULL),
	(4, 100, 7, NULL),
	(5, 105, 6, NULL),
	(6, 100, 7, 2),
	(7, 100, 7, 2),
	(8, 101, 16, 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
