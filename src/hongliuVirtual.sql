/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.0.45-community-nt : Database - hongliu_technology
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hongliu_technology` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hongliu_technology`;

/*Table structure for table `t_exercise` */

DROP TABLE IF EXISTS `t_exercise`;

CREATE TABLE `t_exercise` (
  `exercise_id` int(11) NOT NULL auto_increment,
  `time` date default NULL,
  `title` varchar(20) default NULL,
  `url` varchar(20) default NULL,
  `context` varchar(200) default NULL,
  PRIMARY KEY  (`exercise_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `t_exercise` */

insert  into `t_exercise`(`exercise_id`,`time`,`title`,`url`,`context`) values (1,NULL,'e1',NULL,NULL),(2,NULL,'e2',NULL,NULL),(3,NULL,'e3',NULL,NULL),(4,NULL,'e4',NULL,NULL);

/*Table structure for table `t_homework` */

DROP TABLE IF EXISTS `t_homework`;

CREATE TABLE `t_homework` (
  `homework_id` int(11) NOT NULL auto_increment,
  `time` datetime default NULL,
  `title` varchar(255) default NULL,
  `context` varchar(255) default NULL,
  `publisher` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  `file` tinyblob,
  `fileName` varchar(255) default NULL,
  `filePath` varchar(255) default NULL,
  `ContentType` varchar(255) default NULL,
  PRIMARY KEY  (`homework_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_homework` */

insert  into `t_homework`(`homework_id`,`time`,`title`,`context`,`publisher`,`email`,`file`,`fileName`,`filePath`,`ContentType`) values (1,'2018-02-10 00:00:00','h1','h1','h',NULL,NULL,NULL,NULL,NULL),(2,'2018-03-11 00:00:00','h2','h2','h',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_notice` */

DROP TABLE IF EXISTS `t_notice`;

CREATE TABLE `t_notice` (
  `notice_id` int(11) NOT NULL auto_increment,
  `time` date default NULL,
  `title` varchar(20) default NULL,
  `context` varchar(200) default NULL,
  `publisher` varchar(15) default NULL,
  PRIMARY KEY  (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_notice` */

insert  into `t_notice`(`notice_id`,`time`,`title`,`context`,`publisher`) values (1,'2018-05-21','hhh','1','1'),(2,'2017-04-22','hhheee','2','1'),(3,'2018-04-21','hehsss','3','1');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL auto_increment,
  `studentId` varchar(30) NOT NULL default '',
  `username` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `telephone` varchar(50) default NULL,
  `isH` tinyint(1) default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`studentId`,`username`,`password`,`telephone`,`isH`) values (1,'1616270201','jack','1234','17693459940',0),(2,'1111111','11111','11111','11111',0),(3,'2222','111','111','111',0),(4,'1','1','1','1',0),(5,'2','2','2','2',0),(6,'3','3','3','3',0),(7,'3','3','3','3',0),(8,'3','3','3','3',0),(9,'4','4','4','4',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
