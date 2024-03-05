-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: siomai
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `C_ID` int NOT NULL,
  `C_LName` varchar(20) DEFAULT NULL,
  `C_FName` varchar(20) DEFAULT NULL,
  `C_Address` varchar(40) DEFAULT NULL,
  `Cell_Num` varchar(10) DEFAULT NULL,
  `C_Email` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1001,'Asperilla','Archangel','Rizal Avenue','9295556354','archangelis20@hotmail.com'),(1002,'Pedroso','Sheryll','148-C Haig Street','9285555882','pedroso024@gmail.com'),(1003,'Aquino','Romel','4848 Rosal St.','9246432112','aquino420@yahoo.com'),(1004,'Kwan','Joren','Alc Realty Building 1200','9461222313','kwanjoren09@gmail.com'),(1005,'Go','Liza','668 Muelle De Binondo, Binondo','9573012345','lizago910@yahoo.com'),(1006,'Weng','Anna','National Highway','9456230124','wenganna06@gmail.com'),(1007,'Leh','Margaret','Caloocan City','9572012335','margaretleh023@gmail.com'),(1008,'Lui','Emily','Chins Express','9670238123','emilylui@gmail.com'),(1009,'Mendez-Ella','Jojo','Downtown Center Building','9750782612','jojomendezella@outlook.com'),(1010,'Edilynbenting','Maria','1855 Eastwood Avenue','9674506703','mariaedilynbenting@yahoo.com'),(1011,'Dong','Yang Zhang','J.P. Laurel Avenue','9057123562','yangzhangdong@gmail.com'),(1012,'Bulayo','Mitsy Anne','71 N. Zamora Street','9670345123','mitsyannebulayo@hotmail.com'),(1013,'Gonzales','Elaine','Reparo Road, Potrero,','9145321267','elainegonzales@gmail.com'),(1014,'Dela Cruz','Dennis','Ayala Center, Business Park','9608645345','dennisdelacruz@outlook.com'),(1015,'Nicholas','Ron','A. Soriano','9680384671','ronnicholas014@gmail.com'),(1016,'Mateo','John Carlo','71 N. Zamora Street','9780784451','johncarlomateo@yahoo.com'),(1017,'Chung','Diane','648 Herbosa Street 1000','9707894512','dianechung@outlook.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `Ord_ID` int NOT NULL,
  `C_ID` int DEFAULT NULL,
  `Prod_ID` int DEFAULT NULL,
  `Ord_Qty` int DEFAULT NULL,
  `Ord_Cost` float DEFAULT NULL,
  `Date_Ord` date DEFAULT NULL,
  `Trans_ID` int DEFAULT NULL,
  PRIMARY KEY (`Ord_ID`),
  KEY `C_ID_idx` (`C_ID`),
  KEY `Prod_ID_idx` (`Prod_ID`),
  KEY `Trans_ID_idx` (`Trans_ID`),
  CONSTRAINT `C_ID` FOREIGN KEY (`C_ID`) REFERENCES `customer` (`C_ID`),
  CONSTRAINT `Prod_ID` FOREIGN KEY (`Prod_ID`) REFERENCES `product` (`Prod_ID`),
  CONSTRAINT `Trans_ID` FOREIGN KEY (`Trans_ID`) REFERENCES `transaction` (`Trans_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (12345,1001,111,4,880,'2022-02-12',1111),(12346,1002,222,8,1440,'2022-01-30',1112),(12347,1003,333,2,300,'2022-04-12',1113),(12348,1004,444,4,1360,'2022-02-23',1114),(12349,1005,555,8,2720,'2022-03-04',1115),(12350,1006,666,3,1140,'2022-01-24',1116),(12351,1007,111,1,220,'2022-02-06',1117),(12352,1008,222,5,900,'2022-02-21',1118),(12353,1009,333,4,600,'2022-02-21',1119),(12354,1010,444,2,680,'2022-04-07',1120),(12355,1011,555,5,1700,'2022-01-06',1121),(12356,1012,666,6,2280,'2022-03-21',1122),(12357,1013,111,2,440,'2022-01-20',1123),(12358,1014,222,4,720,'2022-02-26',1124),(12359,1015,333,5,750,'2022-01-24',1125),(12360,1016,444,2,888,'2022-04-12',1126),(12361,1017,555,4,1360,'2022-03-17',1127);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `Prod_ID` int NOT NULL,
  `Prod_Name` varchar(60) DEFAULT NULL,
  `Prod_Price` float DEFAULT NULL,
  PRIMARY KEY (`Prod_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (111,'Pork and Shrimp Xiomai (15 pcs)',220),(222,'Pork and Mushroom Xiomai (premium) (15 pcs)',180),(333,'Pork and Mushroom Xiomai (regular) (15 pcs)',150),(444,'Pork Dumplings (30 pcs)',340),(555,'Kuchai Dumplings (30 pcs)',340),(666,'Shrimp Dumplings (30 pcs)',380);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `Trans_ID` int NOT NULL,
  `C_ID` int DEFAULT NULL,
  `Prod_ID` int DEFAULT NULL,
  `Ord_ID` int DEFAULT NULL,
  PRIMARY KEY (`Trans_ID`),
  KEY `C_ID_idx` (`C_ID`),
  KEY `Prod_ID2_idx` (`Prod_ID`),
  KEY `Ord_ID2_idx` (`Ord_ID`),
  CONSTRAINT `C_ID2` FOREIGN KEY (`C_ID`) REFERENCES `customer` (`C_ID`),
  CONSTRAINT `Ord_ID2` FOREIGN KEY (`Ord_ID`) REFERENCES `order` (`Ord_ID`),
  CONSTRAINT `Prod_ID2` FOREIGN KEY (`Prod_ID`) REFERENCES `product` (`Prod_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1111,1001,111,12345),(1112,1002,222,12346),(1113,1003,333,12347),(1114,1004,444,12348),(1115,1005,555,12349),(1116,1006,666,12350),(1117,1007,111,12351),(1118,1008,222,12352),(1119,1009,333,12353),(1120,1010,444,12354),(1121,1011,555,12355),(1122,1012,666,12356),(1123,1013,111,12357),(1124,1014,222,12358),(1125,1015,333,12359),(1126,1016,444,12360),(1127,1017,555,12361);
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-30 22:49:31
