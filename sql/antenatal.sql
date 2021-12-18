-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.6-MariaDB - mariadb.org binary distribution
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

-- Dumping structure for table bwindihospital_reduced.antenatal
CREATE TABLE IF NOT EXISTS `antenatal` (
  `antId` int(10) NOT NULL AUTO_INCREMENT,
  `recordDate` datetime DEFAULT NULL,
  `serialNo` int(10) DEFAULT NULL,
  `clientNo` varchar(50) DEFAULT NULL,
  `nin` int(20) DEFAULT NULL,
  `clientSurname` varchar(50) DEFAULT NULL,
  `clientGivenName` varchar(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `Column 2` int(10) NOT NULL DEFAULT 0,
  `clientCategory` char(1) DEFAULT NULL,
  `antVillage` varchar(20) NOT NULL,
  `antParish` varchar(20) NOT NULL,
  `antSubcounty` varchar(20) NOT NULL,
  `antDistrict` varchar(20) NOT NULL,
  `phoneNumber` varchar(12) DEFAULT NULL,
  `ancVisit` int(10) DEFAULT NULL,
  `gravida` int(5) DEFAULT NULL,
  `parity` int(5) DEFAULT NULL,
  `gestationAge` int(5) DEFAULT NULL,
  `anc1` varchar(2) DEFAULT NULL,
  `expectedDate` date DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `height` float DEFAULT NULL,
  `muac` varchar(1) DEFAULT NULL,
  `inrNo` int(10) DEFAULT NULL,
  `bp` int(10) DEFAULT NULL,
  `wInitial` varchar(5) DEFAULT NULL,
  `wStk` varchar(1) DEFAULT NULL,
  `pAge` int(3) DEFAULT NULL,
  `pFacility` varchar(3) DEFAULT NULL,
  `pLinked` varchar(3) DEFAULT NULL,
  `pTfv` varchar(5) DEFAULT NULL,
  `pLinkedWhere` varchar(50) DEFAULT NULL,
  `pPArtNo` int(20) DEFAULT NULL,
  `pClientId` int(20) DEFAULT NULL,
  `diagnosis` varchar(255) DEFAULT NULL,
  `revisit` bit(1) DEFAULT NULL,
  `whoClinicalStage` int(10) DEFAULT NULL,
  `cd4Results` int(10) DEFAULT NULL,
  `cd4Date` date DEFAULT NULL,
  `viralLoadResults` int(10) DEFAULT NULL,
  `viralLoadDate` date DEFAULT NULL,
  `riskAssessment` varchar(4) DEFAULT NULL,
  `artCode` varchar(4) DEFAULT NULL,
  `linkageArtNo` int(20) DEFAULT NULL,
  `infantArv` varchar(50) DEFAULT NULL,
  `iycf` varchar(3) DEFAULT NULL,
  `materNutrCouns` varchar(3) DEFAULT NULL,
  `tbStatus` varchar(50) DEFAULT NULL,
  `woaScan` int(5) DEFAULT NULL,
  `phy` varchar(50) DEFAULT NULL,
  `sx` varchar(50) DEFAULT NULL,
  `psy` varchar(50) DEFAULT NULL,
  `hbLevel` int(20) DEFAULT NULL,
  `bloodGroup` varchar(20) DEFAULT NULL,
  `rhFactor` varchar(20) DEFAULT NULL,
  `sickleCell` varchar(20) DEFAULT NULL,
  `protein` varchar(20) DEFAULT NULL,
  `glucose` varchar(20) DEFAULT NULL,
  `wSyphilis` varchar(3) DEFAULT NULL,
  `wHepB` varchar(3) DEFAULT NULL,
  `pSyphilis` varchar(3) DEFAULT NULL,
  `pHepB` varchar(3) DEFAULT NULL,
  `familyPlanning` varchar(3) DEFAULT NULL,
  `td` varchar(5) DEFAULT NULL,
  `iptDose` int(2) DEFAULT NULL,
  `ctxCode` varchar(4) DEFAULT NULL,
  `llin` char(1) DEFAULT NULL,
  `mebendazole` varchar(1) DEFAULT NULL,
  `ironSulphate` int(10) DEFAULT NULL,
  `folicAcid` int(10) DEFAULT NULL,
  `combined` int(10) DEFAULT NULL,
  `misoprostol` int(10) DEFAULT NULL,
  `otherTreatments` varchar(255) DEFAULT NULL,
  `refInOut` varchar(20) DEFAULT NULL,
  `complications` varchar(255) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`antId`) USING BTREE,
  KEY `antVillage` (`antVillage`),
  KEY `antParish` (`antParish`),
  KEY `antSubcounty` (`antSubcounty`),
  KEY `antDistrict` (`antDistrict`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bwindihospital_reduced.antenatal: ~0 rows (approximately)
DELETE FROM `antenatal`;
/*!40000 ALTER TABLE `antenatal` DISABLE KEYS */;
/*!40000 ALTER TABLE `antenatal` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
