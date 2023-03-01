-- 样例数据库代码

CREATE DATABASE  IF NOT EXISTS `teaching` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `teaching`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: teaching
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `c`
--

DROP TABLE IF EXISTS `c`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c` (
  `cno` char(10) NOT NULL COMMENT '课程号',
  `cn` varchar(45) NOT NULL COMMENT '课程名',
  `ct` int NOT NULL COMMENT '课时',
  PRIMARY KEY (`cno`),
  UNIQUE KEY `idx_c_cn_ct` (`cn`,`ct`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c`
--

LOCK TABLES `c` WRITE;
/*!40000 ALTER TABLE `c` DISABLE KEYS */;
INSERT INTO `c` VALUES ('c1','Java程序设计',40),('c8','控制理论',32),('c5','数据库系统',56),('c6','数据挖掘',32),('c4','数据结构',64),('c2','程序设计基础',48),('c3','线性代数',48),('c7','高等数学',60);
/*!40000 ALTER TABLE `c` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s`
--

DROP TABLE IF EXISTS `s`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `s` (
  `sno` char(10) NOT NULL COMMENT '学号',
  `sn` varchar(45) NOT NULL COMMENT '姓名',
  `sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '性别',
  `age` int NOT NULL COMMENT '年龄',
  `maj` varchar(45) NOT NULL COMMENT '专业',
  `dept` varchar(45) NOT NULL COMMENT '院系',
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s`
--

LOCK TABLES `s` WRITE;
/*!40000 ALTER TABLE `s` DISABLE KEYS */;
INSERT INTO `s` VALUES ('s1','王彤','女',18,'计算机','信息学院'),('s10','韩义','男',19,'计算机','信息学院'),('s11','杨青','男',19,'计算机','工学院'),('s2','苏乐','女',20,'信息','信息学院'),('s3','林欣怡','男',19,'信息','信息学院'),('s4','陶然','女',18,'自动化','工学院'),('s5','魏立','男',17,'数学','理学院'),('s6','何欣荣','女',21,'计算机','信息学院'),('s7','赵琳琳','女',19,'数学','理学院'),('s8','李轩','男',19,'自动化','工学院');
/*!40000 ALTER TABLE `s` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sc`
--

DROP TABLE IF EXISTS `sc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sc` (
  `sno` char(10) NOT NULL COMMENT '学号',
  `cno` char(10) NOT NULL COMMENT '课程号',
  `score` decimal(5,2) DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`sno`,`cno`),
  KEY `c_sc_cons_idx` (`cno`),
  CONSTRAINT `c_sc_cons` FOREIGN KEY (`cno`) REFERENCES `c` (`cno`),
  CONSTRAINT `s_sc_cons` FOREIGN KEY (`sno`) REFERENCES `s` (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sc`
--

LOCK TABLES `sc` WRITE;
/*!40000 ALTER TABLE `sc` DISABLE KEYS */;
INSERT INTO `sc` VALUES ('s1','c1',90.50),('s1','c2',85.00),('s2','c4',70.00),('s2','c5',57.00),('s2','c6',81.50),('s2','c7',NULL),('s3','c1',75.00),('s3','c2',70.50),('s3','c4',85.00),('s4','c1',93.00),('s4','c2',85.00),('s4','c3',83.00),('s4','c6',NULL),('s5','c2',89.00),('s5','c7',60.00),('s7','c2',62.00),('s7','c5',80.00),('s7','c7',100.00),('s8','c3',96.00),('s8','c7',78.50);
/*!40000 ALTER TABLE `sc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t`
--

DROP TABLE IF EXISTS `t`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t` (
  `tno` char(10) NOT NULL COMMENT '教师号',
  `tn` varchar(45) DEFAULT NULL COMMENT '姓名',
  `sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '性别',
  `age` int NOT NULL COMMENT '年龄',
  `prof` varchar(10) NOT NULL COMMENT '职称',
  `sal` decimal(6,2) NOT NULL COMMENT '工资',
  `maj` varchar(45) NOT NULL COMMENT '专业',
  `dept` varchar(45) NOT NULL COMMENT '院系',
  PRIMARY KEY (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t`
--

LOCK TABLES `t` WRITE;
/*!40000 ALTER TABLE `t` DISABLE KEYS */;
INSERT INTO `t` VALUES ('t1','刘杨','男',40,'教授',3610.50,'计算机','信息学院'),('t2','石丽','女',26,'讲师',2923.30,'信息','信息学院'),('t3','顾伟','男',32,'副教授',3145.00,'计算机','信息学院'),('t4','赵礼','女',50,'教授',4267.90,'自动化','工学院'),('t5','赵希希','女',36,'副教授',3332.67,'数学','理学院'),('t6','张刚','男',30,'讲师',3012.00,'自动化','工学院');
/*!40000 ALTER TABLE `t` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tc`
--

DROP TABLE IF EXISTS `tc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tc` (
  `tno` char(10) NOT NULL COMMENT '教师号',
  `cno` char(10) NOT NULL COMMENT '课程号',
  `tcdate` date NOT NULL COMMENT '开课日期',
  PRIMARY KEY (`tno`,`cno`),
  KEY `c_cons_idx` (`cno`),
  CONSTRAINT `c_tc_cons` FOREIGN KEY (`cno`) REFERENCES `c` (`cno`),
  CONSTRAINT `t_tc_cons` FOREIGN KEY (`tno`) REFERENCES `t` (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tc`
--

LOCK TABLES `tc` WRITE;
/*!40000 ALTER TABLE `tc` DISABLE KEYS */;
INSERT INTO `tc` VALUES ('t1','c1','2021-09-03'),('t1','c2','2021-09-04'),('t2','c5','2021-09-06'),('t2','c6','2021-09-10'),('t3','c2','2021-03-08'),('t3','c4','2021-03-06'),('t4','c3','2020-03-10'),('t5','c7','2020-03-09'),('t5','c8','2021-09-10');
/*!40000 ALTER TABLE `tc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27 10:50:43

--北京林业大学 信息学院 数据库教学组 2022.07