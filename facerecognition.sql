/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : facerecognition

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-03-04 20:04:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Id` int(10) NOT NULL,
  `Account` varchar(10) NOT NULL,
  `Passwd` varchar(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456');
INSERT INTO `admin` VALUES ('2', 'admin_01', '123456');
INSERT INTO `admin` VALUES ('3', 'admin_02', '123456');
INSERT INTO `admin` VALUES ('4', 'a', '1');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `price` int(11) NOT NULL,
  `bname` varchar(255) NOT NULL,
  `bid` int(11) NOT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('50', 'Java从入门到放弃', '1');
INSERT INTO `book` VALUES ('100', 'MYSQL从删库到跑路', '2');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1001');

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
  `balance` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES ('10', '1001');

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `st` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('7', '1');
INSERT INTO `stock` VALUES ('10', '2');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Number` char(10) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `isCollect` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Number` (`Number`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('1', '3119405056', '铁中棠', '0');
INSERT INTO `students` VALUES ('2', '3119405055', '顾惜朝', '0');
INSERT INTO `students` VALUES ('3', '3119405061', '傅晚晴', '0');
INSERT INTO `students` VALUES ('4', '3119405067', '戚少商', '0');
INSERT INTO `students` VALUES ('5', '3119405080', '令狐冲', '0');
