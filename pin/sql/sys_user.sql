/*
 Navicat MySQL Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50548
 Source Host           : 127.0.0.1:3306
 Source Schema         : jeeplatform

 Target Server Type    : MySQL
 Target Server Version : 50548
 File Encoding         : 65001

 Date: 19/02/2019 11:43:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `sex` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `mark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `rank` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号等级',
  `lastLogin` date NULL DEFAULT NULL COMMENT '最后一次登录时间',
  `loginIp` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录ip',
  `imageUrl` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像图片路径',
  `regTime` date NOT NULL COMMENT '注册时间',
  `locked` tinyint(1) NULL DEFAULT NULL COMMENT '账号是否被锁定',
  `rights` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限（没有使用）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_u_1`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', '28dca2a7b33b7413ad3bce1d58c26dd679c799f1', '1552323312', '男', '313222@foxmail.com', '超级管理员', 'admin', '2017-08-12', '127.0.0.1', '/static/images/', '2017-03-15', 0, NULL);
INSERT INTO `sys_user` VALUES (2, 'sys', 'e68feeafe796b666a2e21089eb7aae9c678bf82d', '1552323312', '男', '313222@foxmail.com', '系统管理员', 'sys', '2017-08-25', '127.0.0.1', '/static/images/', '2017-03-15', 0, NULL);
INSERT INTO `sys_user` VALUES (3, 'user', 'adf8e0d0828bde6e90c2bab72e7a2a763d88a0de', '1552323312', '男', '313222@foxmail.com', '用户', 'user', '2017-08-18', '127.0.0.1', '/static/images/', '2017-03-15', 0, NULL);
INSERT INTO `sys_user` VALUES (9, 'test', '123', '12332233212', '保密', '2312@qq.com', '没有备注', 'user', '2017-11-25', '127.0.0.1', NULL, '2017-11-25', 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
