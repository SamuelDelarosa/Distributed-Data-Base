-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: estacionamientochido
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cajon`
--

DROP TABLE IF EXISTS `cajon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cajon` (
  `idUb` int(11) NOT NULL,
  `disponible` int(11) DEFAULT NULL,
  `contador` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUb`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cajon`
--

LOCK TABLES `cajon` WRITE;
/*!40000 ALTER TABLE `cajon` DISABLE KEYS */;
INSERT INTO `cajon` VALUES (1,0,2),(2,0,1),(3,0,1),(4,0,1),(5,0,1),(6,0,1),(7,0,1),(8,0,0),(9,0,0),(10,0,0),(11,0,0),(12,0,0),(13,0,0),(14,0,0),(15,0,0),(16,0,0),(17,0,0),(18,0,0),(19,0,0),(20,0,0),(21,0,2),(22,0,0),(23,0,0),(24,0,0),(25,0,0),(26,0,0),(27,0,0),(28,0,0),(29,0,0),(30,0,0),(31,0,0),(32,0,0),(33,0,0),(34,0,0),(35,0,0),(36,0,0),(37,0,0),(38,0,0),(39,0,0),(40,0,1),(41,0,4),(42,0,1),(43,0,1),(44,0,2),(45,0,0),(46,0,2),(47,0,0),(48,0,0),(49,0,1),(50,0,0),(51,0,2),(52,0,0),(53,0,2),(54,0,0),(55,0,1),(56,0,1),(57,0,1),(58,0,1),(59,0,1),(60,0,1),(61,0,2),(62,0,1),(63,0,1),(64,0,0),(65,0,0),(66,0,0),(67,0,0),(68,0,0),(69,0,0),(70,0,0),(71,1,1),(72,0,0),(73,0,5),(74,0,0),(75,0,0),(76,0,0),(77,0,0),(78,0,0),(79,0,0),(80,0,1),(81,0,1),(82,0,0),(83,0,0),(84,0,1),(85,0,0),(86,0,0),(87,0,0),(88,0,0),(89,0,0),(90,0,0),(91,0,0),(92,0,0),(93,0,0),(94,0,0),(95,0,0),(96,0,0),(97,0,0),(98,0,0),(99,0,0),(100,0,0),(101,0,0),(102,0,0),(103,0,0),(104,0,0),(105,0,0),(106,0,0),(107,0,0),(108,0,0),(109,0,0),(110,0,0),(111,0,0),(112,0,0),(113,0,0),(114,0,0),(115,0,0),(116,0,0),(117,0,0),(118,0,0),(119,0,0),(120,0,1);
/*!40000 ALTER TABLE `cajon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empleado` (
  `idEmp` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `ap` varchar(20) DEFAULT NULL,
  `am` varchar(20) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  PRIMARY KEY (`idEmp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (0,'Pedro','Hernandez','Hernandez','Seguridad',10000),(111,'Melani','Valdez','Esquivel','Administración',10000),(112,'Samuel','Jurado','Macias','Administración',10000),(121,'Samuel','De La Rosa','Hernandez','Administración',10000),(122,'Joel','Espejel','Zarate','Administración',10000),(261,'Ana María','Juárez','Méndez','Administración',10000),(512,'Diego','Reza','Ferreyra','Administración',1000),(622,'Jonathan','Mejorado','Lopez','Administración',50000),(754,'Euler','Hernandez','Contreras','Administración',2000000);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ganancia`
--

DROP TABLE IF EXISTS `ganancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ganancia` (
  `idUs` int(11) NOT NULL,
  `fecha` varchar(15) DEFAULT NULL,
  `cantGanada` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUs`),
  CONSTRAINT `ganancia_ibfk_1` FOREIGN KEY (`idUs`) REFERENCES `usuario` (`idus`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ganancia`
--

LOCK TABLES `ganancia` WRITE;
/*!40000 ALTER TABLE `ganancia` DISABLE KEYS */;
INSERT INTO `ganancia` VALUES (1703,'04-12-2018',15),(2160,'03-12-2018',15),(2166,'02-12-2018',15),(2330,'05-12-2018',15),(2498,'04-12-2018',15),(2510,'03-12-2018',15),(2815,'03-12-2018',15),(2829,'02-12-2018',15),(2836,'02-12-2018',15),(3215,'03-12-2018',15),(3329,'03-12-2018',15),(3384,'04-12-2018',15),(4212,'04-12-2018',15),(4214,'04-12-2018',15),(4298,'04-12-2018',15),(4483,'03-12-2018',15),(4598,'02-12-2018',15),(4628,'04-12-2018',15),(4996,'03-12-2018',45),(5619,'05-12-2018',15),(5846,'04-12-2018',15),(5938,'04-12-2018',15),(6348,'04-12-2018',15),(6365,'04-12-2018',15),(6449,'04-12-2018',15),(6589,'04-12-2018',30),(6624,'04-12-2018',15),(6630,'02-12-2018',15),(6653,'05-12-2018',15),(6730,'05-12-2018',15),(6773,'05-12-2018',15),(6845,'05-12-2018',15),(6915,'04-12-2018',15),(7003,'04-12-2018',15),(7835,'03-12-2018',15),(7864,'03-12-2018',15),(8162,'04-12-2018',15),(8549,'04-12-2018',15),(8677,'03-12-2018',45),(9356,'05-12-2018',15),(9463,'04-12-2018',15),(9851,'05-12-2018',15);
/*!40000 ALTER TABLE `ganancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiempo`
--

DROP TABLE IF EXISTS `tiempo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tiempo` (
  `idUs` int(11) NOT NULL,
  `idUb` int(11) NOT NULL,
  `hLlegada` time DEFAULT NULL,
  `hSalida` time DEFAULT NULL,
  `MPH` int(11) DEFAULT NULL,
  `fecha` varchar(15) DEFAULT NULL,
  `lapso` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUs`,`idUb`),
  KEY `idUb` (`idUb`),
  CONSTRAINT `tiempo_ibfk_1` FOREIGN KEY (`idUs`) REFERENCES `usuario` (`idus`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tiempo_ibfk_2` FOREIGN KEY (`idUb`) REFERENCES `cajon` (`idub`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiempo`
--

LOCK TABLES `tiempo` WRITE;
/*!40000 ALTER TABLE `tiempo` DISABLE KEYS */;
INSERT INTO `tiempo` VALUES (1130,60,'09:51:46','10:46:59',15,'04-12-2018',1),(1703,43,'10:38:13','10:48:33',15,'04-12-2018',1),(1980,73,'07:21:38','07:22:57',15,'04-12-2018',1),(2160,49,'11:50:37','11:58:41',15,'03-12-2018',1),(2166,73,'03:45:20','03:46:22',15,'02-12-2018',1),(2330,44,'03:41:10','03:42:04',15,'05-12-2018',1),(2498,62,'10:30:39','10:50:52',15,'04-12-2018',1),(2510,6,'11:53:39','11:59:14',15,'03-12-2018',1),(2815,46,'11:09:59','11:59:41',15,'03-12-2018',1),(2829,57,'03:45:58','03:46:41',15,'02-12-2018',1),(2836,1,'03:18:45','03:11:51',15,'01-12-2018',1),(3215,2,'11:18:59','11:59:57',15,'03-12-2018',1),(3329,5,'11:38:33','12:00:05',15,'03-12-2018',1),(3384,120,'09:58:14','10:51:02',15,'04-12-2018',1),(3645,71,'03:43:55',NULL,15,'05-12-2018',NULL),(4212,51,'11:10:41','12:00:29',15,'03-12-2018',1),(4214,61,'10:27:16','10:51:11',15,'04-12-2018',1),(4298,42,'10:30:52','10:51:19',15,'04-12-2018',1),(4483,73,'10:50:39','10:51:13',15,'03-12-2018',1),(4598,55,'03:45:49','03:47:07',15,'02-12-2018',1),(4628,81,'10:12:29','10:51:48',15,'04-12-2018',1),(4996,58,'07:23:17','10:26:18',15,'03-12-2018',3),(5619,41,'03:40:19','03:42:35',15,'05-12-2018',1),(5846,3,'11:22:57','12:00:47',15,'03-12-2018',1),(5938,63,'10:38:33','10:51:58',15,'04-12-2018',1),(6348,56,'09:49:25','10:52:06',15,'04-12-2018',1),(6365,41,'10:13:32','10:52:24',15,'04-12-2018',1),(6449,1,'11:17:37','12:01:04',15,'03-12-2018',1),(6589,40,'10:52:23','12:01:35',15,'03-12-2018',2),(6624,41,'10:53:28','10:54:04',15,'04-12-2018',1),(6630,53,'03:45:41','03:47:29',15,'02-12-2018',1),(6653,41,'02:46:00','02:46:51',15,'05-12-2018',1),(6730,73,'02:47:32','02:49:08',15,'05-12-2018',1),(6773,21,'12:27:44','12:28:21',15,'05-12-2018',1),(6845,46,'12:25:51','12:26:50',15,'05-12-2018',1),(6915,73,'11:16:05','12:01:56',15,'03-12-2018',1),(7003,53,'11:12:27','12:02:10',15,'03-12-2018',1),(7835,51,'07:21:29','07:22:05',15,'03-12-2018',1),(7864,80,'10:50:13','10:51:34',15,'03-12-2018',1),(8162,7,'11:57:32','12:02:22',15,'03-12-2018',1),(8549,4,'11:38:03','12:02:37',15,'03-12-2018',1),(8677,59,'07:22:54','10:26:45',15,'03-12-2018',3),(9216,84,'09:53:21','09:53:48',15,'04-12-2018',1),(9356,44,'02:50:08','02:50:33',15,'05-12-2018',1),(9463,21,'10:26:59','10:52:33',15,'04-12-2018',1),(9851,61,'02:48:02','02:48:44',15,'05-12-2018',1);
/*!40000 ALTER TABLE `tiempo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turno`
--

DROP TABLE IF EXISTS `turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `turno` (
  `idEmp` int(11) NOT NULL,
  `dia` varchar(10) NOT NULL,
  `hLlegada` time DEFAULT NULL,
  `hSalida` time DEFAULT NULL,
  PRIMARY KEY (`idEmp`,`dia`),
  CONSTRAINT `turno_ibfk_1` FOREIGN KEY (`idEmp`) REFERENCES `empleado` (`idemp`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno`
--

LOCK TABLES `turno` WRITE;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` VALUES (261,'Domingo','16:00:00','24:00:00'),(261,'Miércoles','16:00:00','24:00:00'),(261,'Viernes','16:00:00','24:00:00'),(512,'Jueves','08:00:00','16:00:00'),(512,'Martes','08:00:00','16:00:00'),(512,'Sábado','08:00:00','16:00:00'),(622,'Jueves','08:00:00','16:00:00'),(622,'Lunes','08:00:00','16:00:00'),(622,'Sábado','08:00:00','16:00:00'),(754,'Domingo','16:00:00','00:00:00'),(754,'Miércoles','16:00:00','00:00:00'),(754,'Viernes','16:00:00','00:00:00');
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idUs` int(11) NOT NULL,
  `pago` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUs`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1130,15,0),(1703,15,0),(1980,15,0),(2160,15,0),(2166,15,0),(2330,15,0),(2498,15,0),(2510,15,0),(2815,15,0),(2829,15,0),(2836,15,0),(3215,15,0),(3329,15,0),(3384,15,0),(3645,0,1),(4212,15,0),(4214,15,0),(4298,15,0),(4483,15,0),(4598,15,0),(4628,15,0),(4996,45,0),(5619,15,0),(5846,15,0),(5938,15,0),(6348,15,0),(6365,15,0),(6449,15,0),(6589,30,0),(6624,15,0),(6630,15,0),(6653,15,0),(6730,15,0),(6773,15,0),(6845,15,0),(6915,15,0),(7003,15,0),(7835,15,0),(7864,15,0),(8162,15,0),(8549,15,0),(8677,45,0),(9216,15,0),(9356,15,0),(9463,15,0),(9851,15,0);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `usuarios_dentro`
--

DROP TABLE IF EXISTS `usuarios_dentro`;
/*!50001 DROP VIEW IF EXISTS `usuarios_dentro`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `usuarios_dentro` AS SELECT 
 1 AS `idUs`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping routines for database 'estacionamientochido'
--
/*!50003 DROP PROCEDURE IF EXISTS `getFecha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFecha`(in id int, out fesha varchar(15))
begin
  select fecha into fesha
  from tiempo
  where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getLapso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getLapso`(in id int, out lapso int)
begin
  call getTimeSalida(id,@salida);
  call getTimeLlegada(id,@llegada);
  select if ((@salida-@llegada)>0,(@salida-@llegada),1) into lapso;

  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getMonto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMonto`(in id int, out monto int)
begin
  call getLapso(id,@lapso);
  select @lapso*(select MPH from tiempo where idUs=id) into monto;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getTimeLlegada` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getTimeLlegada`(in id int, out time int)
begin
  select hour(hLlegada) into time
  from tiempo
  where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getTimeSalida` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getTimeSalida`(in id int, out time int)
begin
  select hour(hSalida) into time
  from tiempo
  where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setEmpleado` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setEmpleado`(in id int, in name varchar(30), in ap varchar(20), in am varchar(20), in tip varchar(20), in suel double, in dia1 varchar(10), in dia2 varchar(10), in dia3 varchar(10), in hlle time, in hsal time)
begin
    insert into empleado values(id,name,ap,am,tip,suel);
    insert into turno values(id,dia1,hlle,hsal);
    insert into turno values(id,dia2,hlle,hsal);
    insert into turno values(id,dia3,hlle,hsal);
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setLapso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setLapso`(in id int)
begin
  call getTimeSalida(id,@salida);
  call getTimeLlegada(id,@llegada);
  update tiempo set lapso=(select if ((@salida-@llegada)>0,(@salida-@llegada),1))
    where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setRelacionTiempo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setRelacionTiempo`(in idUs int, in idCajon int, in horaLlegada time, in fecha varchar(15))
begin
  insert into usuario values ( idUs , 0 , 1);
  insert into tiempo values (idUs ,idCajon ,horaLlegada,null,15,fecha,null);
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setTimeSalida` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setTimeSalida`(in tiempo time, in id int)
begin
  update tiempo set hSalida=tiempo
    where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `storeGanancia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `storeGanancia`(in id int)
begin
  call getFecha(id,@f);
  call getMonto(id,@m);
  insert into ganancia values(id,@f,@m);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateDispo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateDispo`(in id int)
begin 
  update cajon set disponible=1 
    where idUb=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updatePago` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updatePago`(in id int)
begin
  call getMonto(id,@m);
  update usuario set pago=@m
    where idUs=id;
  end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `usuarios_dentro`
--

/*!50001 DROP VIEW IF EXISTS `usuarios_dentro`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `usuarios_dentro` AS select `t`.`idUs` AS `idUs` from (`tiempo` `t` join `usuario` `s`) where ((`s`.`idUs` = `t`.`idUs`) and (`s`.`status` = 1)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-01 12:42:18
