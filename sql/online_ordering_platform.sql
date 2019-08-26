/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : online_ordering_platform

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-08-27 00:59:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'admin1', 'CCBABE9289F0E877F224E85B39010B41');

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `details` varchar(20) DEFAULT '',
  `tid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tid` (`tid`) USING BTREE,
  CONSTRAINT `t_goods_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES ('1', '办公桌椅', '839', '环保舒适', '1');
INSERT INTO `t_goods` VALUES ('2', '电脑', '7999', '性能优越', '1');
INSERT INTO `t_goods` VALUES ('3', '打印机', '9668', '节能环保', '1');
INSERT INTO `t_goods` VALUES ('4', 'A4纸', '350', '节能环保', '1');
INSERT INTO `t_goods` VALUES ('5', '商务休闲装', '276', '舒适优雅', '2');
INSERT INTO `t_goods` VALUES ('6', '运动装', '220', '舒适优雅', '2');
INSERT INTO `t_goods` VALUES ('7', '礼服', '389', '舒适优雅', '2');
INSERT INTO `t_goods` VALUES ('8', '水杯', '32', '纳米科技', '3');
INSERT INTO `t_goods` VALUES ('9', '茶具', '770', '匠心打造', '3');
INSERT INTO `t_goods` VALUES ('10', '绿茶', '260', '修身养气', '4');
INSERT INTO `t_goods` VALUES ('11', '红茶', '380', '健康暖胃', '4');
INSERT INTO `t_goods` VALUES ('12', '比特币挖矿机', '27777', '性能优越', '5');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `state` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `aid` (`aid`),
  KEY `gid` (`gid`) USING BTREE,
  CONSTRAINT `t_order_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `t_user` (`id`),
  CONSTRAINT `t_order_ibfk_2` FOREIGN KEY (`gid`) REFERENCES `t_goods` (`id`),
  CONSTRAINT `t_order_ibfk_3` FOREIGN KEY (`aid`) REFERENCES `t_admin` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '1', '7', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('2', '1', '2', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('5', '1', '5', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('6', '1', '9', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('10', '1', '10', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('11', '1', '10', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('12', '1', '10', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('14', '1', '6', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('16', '1', '10', '1', '2019-02-06', '1');
INSERT INTO `t_order` VALUES ('19', '1', '7', '1', '2019-02-07', '1');
INSERT INTO `t_order` VALUES ('26', '2', '8', '1', '2019-02-08', '1');
INSERT INTO `t_order` VALUES ('27', '2', '12', '1', '2019-02-08', '1');
INSERT INTO `t_order` VALUES ('28', '1', '1', '1', '2019-08-27', '1');
INSERT INTO `t_order` VALUES ('29', '1', '12', null, '2019-08-27', '0');
INSERT INTO `t_order` VALUES ('30', '1', '2', null, '2019-08-27', '0');
INSERT INTO `t_order` VALUES ('31', '1', '4', null, '2019-08-27', '0');

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', '办公用品');
INSERT INTO `t_type` VALUES ('2', '服装');
INSERT INTO `t_type` VALUES ('3', '生活用品');
INSERT INTO `t_type` VALUES ('4', '饮料');
INSERT INTO `t_type` VALUES ('5', '机器设备');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nickname` varchar(11) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `registerdate` date DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'zhangsan', 'CCBABE9289F0E877F224E85B39010B41', '张三', '男', '13576765678', '2019-02-03', '科技路');
INSERT INTO `t_user` VALUES ('2', 'lisi', 'CCBABE9289F0E877F224E85B39010B41', '李四', '女', '18678987676', '2019-02-03', '科技路');
