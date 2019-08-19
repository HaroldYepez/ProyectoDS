-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: tecnoimport
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coti_det`
--

DROP TABLE IF EXISTS `coti_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coti_det` (
  `num_doc` int(11) NOT NULL AUTO_INCREMENT,
  `tip_doc` varchar(3) DEFAULT NULL,
  `catidad` int(11) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `cod_cat` varchar(3) DEFAULT NULL,
  `cod_item` varchar(4) DEFAULT NULL,
  `cod_bodega` varchar(3) DEFAULT NULL,
  `uni_medida` varchar(3) DEFAULT NULL,
  `sob_total` float DEFAULT NULL,
  PRIMARY KEY (`num_doc`),
  KEY `cod_i_idx` (`cod_item`),
  KEY `cod_b_idx` (`cod_bodega`),
  CONSTRAINT `cod_b` FOREIGN KEY (`cod_bodega`) REFERENCES `bodegas` (`cod_bodega`) ON UPDATE CASCADE,
  CONSTRAINT `cod_i` FOREIGN KEY (`cod_item`) REFERENCES `items` (`cod_item`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coti_det`
--

LOCK TABLES `coti_det` WRITE;
/*!40000 ALTER TABLE `coti_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `coti_det` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-18 21:26:57
