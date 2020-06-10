/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - mobilestoremgmt
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mobilestoremgmt` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mobilestoremgmt`;

/*Table structure for table `accessories` */

DROP TABLE IF EXISTS `accessories`;

CREATE TABLE `accessories` (
  `itemid` varchar(7) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `type` varchar(25) DEFAULT NULL,
  `description` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `bills` */

DROP TABLE IF EXISTS `bills`;

CREATE TABLE `bills` (
  `billid` varchar(7) NOT NULL,
  `cusid` varchar(7) NOT NULL,
  `amount` varchar(7) NOT NULL,
  PRIMARY KEY (`billid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cusid` varchar(7) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(35) NOT NULL,
  `dob` date DEFAULT '1999-01-01',
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`cusid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `itemindex` */

DROP TABLE IF EXISTS `itemindex`;

CREATE TABLE `itemindex` (
  `itemid` varchar(7) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `loginhistory` */

DROP TABLE IF EXISTS `loginhistory`;

CREATE TABLE `loginhistory` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `stime` time DEFAULT NULL,
  `etime` time DEFAULT NULL,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Table structure for table `mobile` */

DROP TABLE IF EXISTS `mobile`;

CREATE TABLE `mobile` (
  `itemid` varchar(7) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `company` varchar(25) DEFAULT NULL,
  `model` varchar(25) DEFAULT NULL,
  `ram` varchar(5) DEFAULT NULL,
  `screensize` varchar(10) DEFAULT NULL,
  `screenres` varchar(10) DEFAULT NULL,
  `screentype` varchar(10) DEFAULT NULL,
  `screenppi` int(11) DEFAULT NULL,
  `pcamera` varchar(15) DEFAULT NULL,
  `scamera` varchar(15) DEFAULT NULL,
  `battery` int(11) DEFAULT NULL,
  `processor` varchar(25) DEFAULT NULL,
  `clock` varchar(10) DEFAULT NULL,
  `cores` int(11) DEFAULT NULL,
  `memory` varchar(10) DEFAULT NULL,
  `colours` varchar(99) DEFAULT NULL,
  `addinfo` varchar(9999) DEFAULT NULL,
  `rcamera` int(11) DEFAULT NULL,
  `rbattery` int(11) DEFAULT NULL,
  `rperformance` int(11) DEFAULT NULL,
  `rvom` int(11) DEFAULT NULL,
  `rscreen` int(11) DEFAULT NULL,
  `rdurability` int(11) DEFAULT NULL,
  `roverall` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `itemid` varchar(7) NOT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `stockio` */

DROP TABLE IF EXISTS `stockio`;

CREATE TABLE `stockio` (
  `billid` varchar(7) DEFAULT NULL,
  `itemid` varchar(7) DEFAULT NULL,
  `cusid` varchar(7) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `date` date DEFAULT '1999-01-01'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(35) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `dob` date DEFAULT '1999-01-01',
  `sques` varchar(50) DEFAULT 'East or West',
  `sans` varchar(25) DEFAULT 'India is the best',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
