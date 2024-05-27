/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.11 : Database - crhotel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`crhotel` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `crhotel`;

/*Table structure for table `addroom` */

DROP TABLE IF EXISTS `addroom`;

CREATE TABLE `addroom` (
  `roomid` varchar(10) NOT NULL,
  `roomtype` varchar(20) DEFAULT NULL,
  `no_of_rooms` varchar(10) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `price_per_day` int(10) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `addroom` */

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

/*Table structure for table `booking` */

DROP TABLE IF EXISTS `booking`;

CREATE TABLE `booking` (
  `roomid` varchar(10) NOT NULL,
  `bookid` varchar(10) DEFAULT NULL,
  `fullname` varchar(20) DEFAULT NULL,
  `mobileno` varchar(12) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `fdate` varchar(15) DEFAULT NULL,
  `sdate` varchar(15) DEFAULT NULL,
  `money` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `booking` */

/*Table structure for table `user_reg` */

DROP TABLE IF EXISTS `user_reg`;

CREATE TABLE `user_reg` (
  `fullname` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `mobileno` varchar(12) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_reg` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
