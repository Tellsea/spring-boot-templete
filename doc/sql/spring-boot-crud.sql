/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : spring-boot-crud

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 19/06/2019 00:14:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'Admin', '123456', '4328903@avd.ng', '北京市朝阳区霄云路50号');
INSERT INTO `tb_user` VALUES (2, 'Tellsea', 'fsdf', '678976876@qq.com', '北京市朝阳区霄云路25乙102-103室');
INSERT INTO `tb_user` VALUES (3, 'Susan', 'fdstt4', '4354354@qq.com', '宝山区水产西路680弄4号906室');
INSERT INTO `tb_user` VALUES (4, 'Tomcat', 't5454tg', '4354353@qq.com', '北京海淀区上地五街群英科技园5号楼2层');
INSERT INTO `tb_user` VALUES (5, 'Scott', '54ty45gh45', 'fdsfsfgwer@avd.ng', '杭州市 余杭区 阿里巴巴西溪园区');
INSERT INTO `tb_user` VALUES (6, 'Bigbang', '54y54', '543543@qq.com', '大连沙河口区服务业大厦');
INSERT INTO `tb_user` VALUES (7, 'SuperMan', '54y54', 'dsfdsf@fgd.cn', '北京北京方向A座，房天下大厦');
INSERT INTO `tb_user` VALUES (8, '刘亦菲', '5y54', 'dsffdsfd@avd.ng', '北京市朝阳区广渠路3号竞园5B栋');
INSERT INTO `tb_user` VALUES (9, '杨幂', '45y5y5', 'fsdfsdfs@fgd.cn', '北京市 海淀区 北京市海淀区人民政府');
INSERT INTO `tb_user` VALUES (10, '吴奇隆', '54y54y', 'dsffdsgrweg@avd.ng', '北京海淀区上地五街群英科技园5号楼');
INSERT INTO `tb_user` VALUES (11, '周杰伦', 'y45y54y', '78mo987mi@fgd.cn', '北京朝阳区保利东郡9号楼D座1101');
INSERT INTO `tb_user` VALUES (12, '山鸡哥', '54uty', 'sdtgt4ger@fgd.cn', '南通崇川区中南百货');
INSERT INTO `tb_user` VALUES (13, '欧巴', 'tretre', 'fgwergreg@fgd.cn', '北京北京方向A座，房天下大厦');

SET FOREIGN_KEY_CHECKS = 1;
