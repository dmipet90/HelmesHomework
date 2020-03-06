-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: helmes_homework
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sector` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sector`
--

LOCK TABLES `sector` WRITE;
/*!40000 ALTER TABLE `sector` DISABLE KEYS */;
INSERT INTO `sector` VALUES (1,'Manufacturing'),(2,'Construction materials'),(3,'Electronics and Optics'),(4,'Food and Beverage'),(5,'Bakery & confectionery products'),(6,'Beverages'),(7,'Fish & fish products'),(8,'Meat & meat products'),(9,'Milk & dairy products'),(10,'Other'),(11,'Sweets & snack food'),(12,'Furniture'),(13,'Bathroom/sauna'),(14,'Bedroom'),(15,'Children’s room'),(16,'Kitchen'),(17,'Living room'),(18,'Office'),(19,'Other (Furniture)'),(20,'Outdoor'),(21,'Project furniture'),(22,'Machinery'),(23,'Machinery components'),(24,'Machinery equipment/tools'),(25,'Manufacture of machinery '),(26,'Maritime'),(27,'Aluminium and steel workboats'),(28,'Boat/Yacht building'),(29,'Ship repair and conversion'),(30,'Other'),(31,'Repair and maintenance service'),(32,'Metalworking'),(33,'Construction of metal structures'),(34,'Houses and buildings'),(35,'Metal products'),(36,'Metal works'),(37,'CNC-machining'),(38,'Forgings, Fasteners'),(39,'Gas, Plasma, Laser cutting'),(40,'MIG, TIG, Aluminum welding'),(41,'Plastic and Rubber'),(42,'Packaging'),(43,'Plastic goods'),(44,'Plastic processing technology'),(45,'Blowing'),(46,'Plastics welding and processing'),(47,'Plastic profiles'),(48,'Printing'),(49,'Advertising'),(50,'Book/Periodicals '),(51,'Labelling and packaging printing'),(52,'Textile and Clothing'),(53,'Clothing'),(54,'Textile'),(55,'Wood'),(56,'Other (Wood)'),(57,'Wooden building materials'),(58,'Wooden houses'),(59,'Other'),(60,'Creative industries'),(61,'Energy technology'),(62,'Environment'),(63,'Service'),(64,'Business services'),(65,'Engineering'),(66,'Information Technology and Telecommunications'),(67,'Data processing, Web portals, E-marketing'),(68,'Programming, Consultancy'),(69,'Software, Hardware'),(70,'Telecommunications'),(71,'Tourism'),(72,'Translation services'),(73,'Transport and Logistics'),(74,'Air'),(75,'Rail'),(76,'Road'),(77,'Water');
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-06 23:58:29
