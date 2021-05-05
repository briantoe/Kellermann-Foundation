-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.9-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for bwindihospital_reduced
CREATE DATABASE IF NOT EXISTS `bwindihospital_reduced` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bwindihospital_reduced`;

-- Dumping structure for table bwindihospital_reduced.maternity
CREATE TABLE IF NOT EXISTS `maternity` (
  `matId` varchar(11) NOT NULL,
  `recordDate` datetime DEFAULT NULL ON UPDATE current_timestamp(),
  `dateOfAdmission` date DEFAULT NULL,
  `timeOfAdmission` time DEFAULT NULL,
  `admissionNo` tinytext DEFAULT NULL,
  `ancNo` varchar(255) DEFAULT NULL,
  `ipdNo` tinytext DEFAULT NULL,
  `nin` varchar(50) DEFAULT NULL,
  `clientSurname` varchar(50) DEFAULT NULL,
  `clientGivenName` varchar(50) NOT NULL,
  `age` tinytext DEFAULT NULL,
  `clientCategory` char(1) DEFAULT NULL,
  `matVillage` varchar(20) DEFAULT NULL,
  `matParish` varchar(20) DEFAULT NULL,
  `matSubcounty` varchar(20) DEFAULT NULL,
  `matDistrict` varchar(20) DEFAULT NULL,
  `phoneNumber` varchar(12) DEFAULT NULL,
  `gravidity` tinytext DEFAULT NULL,
  `parity` tinytext DEFAULT NULL,
  `gestationAge` tinytext DEFAULT NULL,
  `term` varchar(1) DEFAULT NULL,
  `reasonForAdmission` varchar(255) DEFAULT NULL,
  `revisit` bit(1) DEFAULT NULL,
  `whoClinicalStage` tinytext DEFAULT NULL,
  `cd4Results` tinytext DEFAULT NULL,
  `cd4Date` date DEFAULT NULL,
  `viralLoadResults` tinytext DEFAULT NULL,
  `viralLoadDate` date DEFAULT NULL,
  `wInitialResult` varchar(10) DEFAULT NULL,
  `wTFV` varchar(10) DEFAULT NULL,
  `pInitialResult` varchar(10) DEFAULT NULL,
  `pTFV` varchar(10) DEFAULT NULL,
  `pArtCode` varchar(10) DEFAULT NULL,
  `artCode` varchar(10) DEFAULT NULL,
  `artNo` varchar(20) DEFAULT NULL,
  `ctxCode` varchar(10) DEFAULT NULL,
  `wSyphilis` varchar(10) DEFAULT NULL,
  `wHepatitisB` varchar(10) DEFAULT NULL,
  `pSyphilis` varchar(10) DEFAULT NULL,
  `pHepatitisB` varchar(10) DEFAULT NULL,
  `muac` varchar(50) DEFAULT NULL,
  `inrNo` tinytext DEFAULT NULL,
  `modeOfDelivery` varchar(255) DEFAULT NULL,
  `dateOfDelivery` date DEFAULT NULL,
  `timeOfDelivery` time DEFAULT NULL,
  `liveBirths` varchar(10) DEFAULT NULL,
  `oxytocin` bit(1) DEFAULT NULL,
  `misoprostol` bit(1) DEFAULT NULL,
  `ergometrine` bit(1) DEFAULT NULL,
  `managementProcedure` varchar(255) DEFAULT NULL,
  `otherTreatment` varchar(255) DEFAULT NULL,
  `apgarScore` varchar(10) DEFAULT NULL,
  `sexOfBaby` varchar(1) DEFAULT NULL,
  `notBreathing` varchar(10) DEFAULT NULL,
  `immediateSkinToSkin` tinytext DEFAULT NULL,
  `sourceOfWarmth` varchar(50) DEFAULT NULL,
  `breastFed` varchar(1) DEFAULT NULL,
  `teo` bit(1) DEFAULT NULL,
  `vitK` bit(1) DEFAULT NULL,
  `chlorhexidine` bit(1) DEFAULT NULL,
  `weight` tinytext DEFAULT NULL,
  `riskStatus` varchar(10) DEFAULT NULL,
  `arvsAdministered` varchar(10) DEFAULT NULL,
  `syrupDuration` tinytext DEFAULT NULL,
  `bcgImmunization` varchar(1) DEFAULT NULL,
  `polioImmunization` varchar(1) DEFAULT NULL,
  `familyPlanningMethod` tinytext DEFAULT NULL,
  `familyPlanningDate` date DEFAULT NULL,
  `treatmentOffered` varchar(255) DEFAULT NULL,
  `babyFinalDiagnosis` varchar(255) DEFAULT NULL,
  `deliveredByName` varchar(50) DEFAULT NULL,
  `deliveredByCadre` varchar(50) DEFAULT NULL,
  `transferredByName` varchar(50) DEFAULT NULL,
  `transferredByWhere` varchar(50) DEFAULT NULL,
  `motherBleeding6` varchar(10) DEFAULT NULL,
  `motherSyst6` tinytext DEFAULT NULL,
  `motherDias6` tinytext DEFAULT NULL,
  `babyCheckedCord6` varchar(10) DEFAULT NULL,
  `babyBreastFeeding6` varchar(10) DEFAULT NULL,
  `babyBreathing6` varchar(10) DEFAULT NULL,
  `llinsGiven` varchar(1) DEFAULT NULL,
  `babyCondition` varchar(10) DEFAULT NULL,
  `motherFinalDiagnosis` varchar(255) DEFAULT NULL,
  `motherBleeding24` varchar(10) DEFAULT NULL,
  `motherSyst24` tinytext DEFAULT NULL,
  `motherDias24` tinytext DEFAULT NULL,
  `babyCheckedCord24` varchar(10) DEFAULT NULL,
  `babyBreastFeeding24` varchar(10) DEFAULT NULL,
  `babyBreathing24` varchar(10) DEFAULT NULL,
  `iycf` tinytext DEFAULT NULL,
  `iycfOption` tinytext DEFAULT NULL,
  `counselingDischarged` varchar(10) DEFAULT NULL,
  `materNutrCouns` varchar(1) DEFAULT NULL,
  `conditionOfMotherAtDischarge` varchar(10) DEFAULT NULL,
  `motherTransferredWhere` varchar(100) DEFAULT NULL,
  `nameOfPersonDischarging` varchar(50) DEFAULT NULL,
  `cadreOfPersonDischarging` varchar(50) DEFAULT NULL,
  `dateOfDischarge` date DEFAULT NULL,
  `timeOfDischarge` time DEFAULT NULL,
  `userId` tinytext NOT NULL DEFAULT '',
  PRIMARY KEY (`matId`) USING BTREE,
  KEY `village` (`matVillage`) USING BTREE,
  KEY `parish` (`matParish`) USING BTREE,
  KEY `subcounty` (`matSubcounty`) USING BTREE,
  KEY `district` (`matDistrict`) USING BTREE,
  KEY `userID` (`userId`(255)) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
