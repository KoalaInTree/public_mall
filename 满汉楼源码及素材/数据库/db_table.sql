prompt PL/SQL Developer import file
prompt Created on 2017年8月27日 by CJ
set feedback off
set define off
prompt Disabling triggers for DISHES...
alter table DISHES disable all triggers;
prompt Disabling triggers for LOGIN...
alter table LOGIN disable all triggers;
prompt Disabling triggers for MENU...
alter table MENU disable all triggers;
prompt Disabling triggers for RESERVE...
alter table RESERVE disable all triggers;
prompt Disabling triggers for TURNOVER...
alter table TURNOVER disable all triggers;
prompt Disabling triggers for USERS...
alter table USERS disable all triggers;
prompt Deleting USERS...
delete from USERS;
commit;
prompt Deleting TURNOVER...
delete from TURNOVER;
commit;
prompt Deleting RESERVE...
delete from RESERVE;
commit;
prompt Deleting MENU...
delete from MENU;
commit;
prompt Deleting LOGIN...
delete from LOGIN;
commit;
prompt Deleting DISHES...
delete from DISHES;
commit;
prompt Loading DISHES...
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('NTXMHS', '浓汤小米海参', '128', '4', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CXNNR', '川湘嫩牛肉', '48', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GGYSS', '干锅野山笋', '48', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JPNLG', '金牌牛肋骨', '108', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TXHYTYW', '汤逊湖鱼头鱼丸', '68', '2', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('KWYJC', '口味有机菜', '28', '44', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('DPRHG', '大盘乳黄瓜', '22', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MPX', '满堂香', '68', '25', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GTYSY', '宫廷药膳鸭', '68', '12', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MHZHL', '美虹醉花螺', '168', '23', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZPHSM', '醉泡花生米', '16', '0', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SJHZT', '水晶海蜇头', '48', '51', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SKHME', '爽口黑木耳', '18', '57', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BZSNG', '冰镇圣女果', '28', '0', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZJRHG', '蘸酱乳黄瓜', '18', '23', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LBMD', '凉拌毛豆', '22', '0', '透味凉菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFGY', '古法桂鱼', '108', '014', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TJSJY', '土鸡烧甲鱼', '128', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLS', '私房姜辣蛇', '188', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TSCGY', '特色臭桂鱼', '138', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YSZSX', '养身煮双鲜', '28', '13', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CTYJSS', '翅汤有机时蔬', '58', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XCHNR', '小炒黄牛肉', '48', '12', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFSTY', '私房烧鱼头', '78', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TBNZG', '铁板牛仔骨', '108', '23', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CXXHG', '菜芯小花菇', '38', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LHHME', '兰花黑木耳', '28', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QJCTZR', '青椒炒土猪肉', '36', '65', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LSBXR', '芦笋爆虾仁', '68', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFRY', '古法鲈鱼', '68', '5', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TZLDF', '土灶老豆腐', '28', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLNW', '私房姜辣牛蛙', '68', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('THXY', '炭火鲜鱿', '48', '65', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFYGX', '古法一罐鲜', '198', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CZNW', '馋嘴牛蛙', '48', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZBTBSY', '滋补铁板山药', '28', '12', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BYZMPG', '鲍鱼仔焖排骨', '288', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JGSDYP', '井冈山豆油皮', '32', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CZSTJ', '柴灶烧土鸡', '58', '59', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JZGFS', '金针菇粉丝', '26', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XCHSX', '小炒河三鲜', '38', '56', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YSLB', '养生萝卜', '24', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('DCSJY', '大厨烧甲鱼', '158', '89', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HNWGDLB', '黄牛瓦沟炖萝卜', '88', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLZS', '私房姜辣煮手', '68', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('PGDSR', '排骨蛋烧肉', '68', '12', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'NTXMHS', '' || chr(9) || '浓汤小米海参', '128', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'CXNNR', '' || chr(9) || '川湘嫩牛肉', '48', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'GGYSS', '干锅野山笋', '48', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'JPNLG', '金牌牛肋骨', '108', '89', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TXHYTYW' || chr(9) || '', '汤逊湖鱼头鱼丸', '68', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'KWYJC', '口味有机菜', '28', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'DPRHG', '大盘乳黄瓜', '' || chr(9) || '22', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MTX', '满堂香', '' || chr(9) || '68', '0', '经典热菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'WGZL', '' || chr(9) || '五谷杂粮', '' || chr(9) || '36', '2', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SRZSB', '蒜蓉蒸扇贝', '10', '3', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LHFGJY', '梁湖风干鲫鱼', '36', '6', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('KWYT', '口味鱼头', '78', '6', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'ZZNGY', '珍珠南瓜元', '28', '11', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XRDD', '虾仁炖蛋', '28', '10', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JYFZR', '酱油份蒸肉', '48', '7', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SZDPR', '苏州东坡肉', '68', '10', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('PGYPX', '培根一品鲜', '38', '8', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QZGY', '清蒸桂鱼', '108', '5', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QZLY', '清蒸鲈鱼', '68', '4', '蒸蒸日上');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HTGK', '红糖锅盔', '18', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YZCF', '扬州炒饭', '16', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YMDPT', '阴米肚片汤', '42', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SRJTJT', '松茸菌土鸡汤', '35', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HSWZ', '红薯丸子', '18', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JYCF', '' || chr(9) || '酱油炒饭', '16', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HDPGT', '海带排骨汤', '48', '2', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZBYYT', '滋补养颜汤', '22', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QTM', '清汤面', '16', '1', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MJXTY', '米酒小汤圆', '22', '0', '主食汤羹');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HTSB', '荷塘三宝', '38', '0', '时令蔬菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QCXBC', '清炒小白菜', '18', '0', '时令蔬菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QCTJ', '清炒苕尖', '18', '0', '时令蔬菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'QCOD', '清炒藕带', '28', '0', '时令蔬菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BZGDCX', '白灼广东菜芯', '22', '0', '时令蔬菜');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HGHME', '黄瓜黑木耳', '22', '0', '时令蔬菜');
commit;
prompt 81 records loaded
prompt Loading LOGIN...
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('1', '黄雪薇', '111', '经理');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('2', '兰彪', '111', '经理');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('3', '孔令良', '111', '主管');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('4', '乔德拴', '111', '厨师');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('5', '党增城', '111', '帮工');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('6', '向泰稳', '111', '扫地');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('7', '李壮', '111', '洗菜');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('8', '任磊', '111', '端盘');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('9', '刘得生', '111', '切菜');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('10', '张士现', '111', '保安');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('11', '余宙', '111', '保安');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('12', '王大伟', '111', '厨师');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('13', '吕浩', '111', '端盘');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('14', '付超', '111', '厨师');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('15', '张青阳', '111', '采购');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('16', '宋彩', '111', '收银员');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('17', '王云棋', '111', '收银员');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('18', '刘霏霏', '111', '领班');
commit;
prompt 18 records loaded
prompt Loading MENU...
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('24', '珍珠南瓜元', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '蒜蓉蒸扇贝', '10', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '清蒸鲈鱼', '68', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '清蒸桂鱼', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '酱油份蒸肉', '48', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '清蒸桂鱼', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '梁湖风干鲫鱼', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '清蒸桂鱼', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '清蒸桂鱼', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '苏州东坡肉', '68', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('26', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('28', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('31', '口味鱼头', '78', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '珍珠南瓜元', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '阴米肚片汤', '42', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '红糖锅盔', '18', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '培根一品鲜', '38', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '苏州东坡肉', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '珍珠南瓜元', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('24', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('222', '培根一品鲜', '38', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '梁湖风干鲫鱼', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '培根一品鲜', '38', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('27', '清蒸桂鱼', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('29', '珍珠南瓜元', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('30', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('31', '珍珠南瓜元', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '口味鱼头', '78', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '滋补养颜汤', '22', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '' || chr(9) || '酱油炒饭', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '蒜蓉蒸扇贝', '10', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '苏州东坡肉', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '梁湖风干鲫鱼', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '' || chr(9) || '五谷杂粮', '36', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '口味鱼头', '78', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '苏州东坡肉', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '珍珠南瓜元', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '清汤面', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '扬州炒饭', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '口味鱼头', '78', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('222', '苏州东坡肉', '68', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '酱油份蒸肉', '48', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '虾仁炖蛋', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '虾仁炖蛋', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '松茸菌土鸡汤', '35', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '海带排骨汤', '48', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '红薯丸子', '18', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '清蒸鲈鱼', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '珍珠南瓜元', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '酱油份蒸肉', '48', '1');
commit;
prompt 51 records loaded
prompt Loading RESERVE...
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('5', '七位', '武器', '我', to_date('22-08-2017 21:20:54', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('13', null, null, null, to_date('22-08-2017 21:42:50', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('11', '我', '去', '武器', to_date('22-08-2017 21:26:48', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('12', '七位', '武器', '七位', to_date('22-08-2017 21:26:56', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('41', '1', null, null, to_date('22-08-2017 13:49:11', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('35', '33', '22', '22', to_date('26-08-2017 16:30:26', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('36', '1', null, null, to_date('27-08-2017 17:03:28', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('9', '10', '陈与', '18725632541', to_date('22-08-2017 21:22:38', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('14', '我', '我', '我', to_date('22-08-2017 22:51:51', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('31', '12', '22', '22', to_date('26-08-2017 13:56:04', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('38', '七位', '七位', '七位', to_date('22-08-2017 13:47:06', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('40', '七位', '七位', '七位', to_date('22-08-2017 13:47:11', 'dd-mm-yyyy hh24:mi:ss'));
commit;
prompt 12 records loaded
prompt Loading TURNOVER...
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:04', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:04', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:05', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:05', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:05', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:06', 'dd-mm-yyyy hh24:mi:ss'), '120');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:12', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:13', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:13', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:13', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:13', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:13', 'dd-mm-yyyy hh24:mi:ss'), '122');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:25', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:25', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:25', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:26', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:57:26', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:58:50', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:58:51', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:58:51', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 12:58:51', 'dd-mm-yyyy hh24:mi:ss'), '322');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 14:19:33', 'dd-mm-yyyy hh24:mi:ss'), '310');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 16:25:52', 'dd-mm-yyyy hh24:mi:ss'), '212');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 14:19:34', 'dd-mm-yyyy hh24:mi:ss'), '310');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 13:56:19', 'dd-mm-yyyy hh24:mi:ss'), '212');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 14:19:33', 'dd-mm-yyyy hh24:mi:ss'), '310');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 14:19:34', 'dd-mm-yyyy hh24:mi:ss'), '310');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 13:35:11', 'dd-mm-yyyy hh24:mi:ss'), '28');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 13:51:11', 'dd-mm-yyyy hh24:mi:ss'), '28');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 13:54:58', 'dd-mm-yyyy hh24:mi:ss'), '28');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 13:56:19', 'dd-mm-yyyy hh24:mi:ss'), '212');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 14:19:34', 'dd-mm-yyyy hh24:mi:ss'), '310');
insert into TURNOVER (DATES, MONEY)
values (to_date('26-08-2017 16:32:21', 'dd-mm-yyyy hh24:mi:ss'), '430');
insert into TURNOVER (DATES, MONEY)
values (to_date('01-08-2017', 'dd-mm-yyyy'), '4000');
insert into TURNOVER (DATES, MONEY)
values (to_date('02-08-2017', 'dd-mm-yyyy'), '3000');
insert into TURNOVER (DATES, MONEY)
values (to_date('03-08-2017', 'dd-mm-yyyy'), '2200');
insert into TURNOVER (DATES, MONEY)
values (to_date('04-08-2017', 'dd-mm-yyyy'), '4200');
insert into TURNOVER (DATES, MONEY)
values (to_date('05-08-2017', 'dd-mm-yyyy'), '6200');
insert into TURNOVER (DATES, MONEY)
values (to_date('06-08-2017', 'dd-mm-yyyy'), '5200');
insert into TURNOVER (DATES, MONEY)
values (to_date('07-08-2017', 'dd-mm-yyyy'), '3330');
insert into TURNOVER (DATES, MONEY)
values (to_date('08-08-2017', 'dd-mm-yyyy'), '3330');
insert into TURNOVER (DATES, MONEY)
values (to_date('09-08-2017', 'dd-mm-yyyy'), '3330');
insert into TURNOVER (DATES, MONEY)
values (to_date('10-08-2017', 'dd-mm-yyyy'), '3330');
insert into TURNOVER (DATES, MONEY)
values (to_date('10-08-2017', 'dd-mm-yyyy'), '7330');
insert into TURNOVER (DATES, MONEY)
values (to_date('11-08-2017', 'dd-mm-yyyy'), '7330');
insert into TURNOVER (DATES, MONEY)
values (to_date('12-08-2017', 'dd-mm-yyyy'), '8330');
insert into TURNOVER (DATES, MONEY)
values (to_date('13-08-2017', 'dd-mm-yyyy'), '2330');
insert into TURNOVER (DATES, MONEY)
values (to_date('14-08-2017', 'dd-mm-yyyy'), '2830');
insert into TURNOVER (DATES, MONEY)
values (to_date('15-08-2017', 'dd-mm-yyyy'), '2770');
insert into TURNOVER (DATES, MONEY)
values (to_date('16-08-2017', 'dd-mm-yyyy'), '3770');
insert into TURNOVER (DATES, MONEY)
values (to_date('17-08-2017', 'dd-mm-yyyy'), '4770');
insert into TURNOVER (DATES, MONEY)
values (to_date('18-08-2017', 'dd-mm-yyyy'), '11170');
insert into TURNOVER (DATES, MONEY)
values (to_date('19-08-2017', 'dd-mm-yyyy'), '1170');
insert into TURNOVER (DATES, MONEY)
values (to_date('20-08-2017', 'dd-mm-yyyy'), '1170');
insert into TURNOVER (DATES, MONEY)
values (to_date('20-08-2017', 'dd-mm-yyyy'), '1570');
insert into TURNOVER (DATES, MONEY)
values (to_date('21-08-2017', 'dd-mm-yyyy'), '1570');
insert into TURNOVER (DATES, MONEY)
values (to_date('22-08-2017', 'dd-mm-yyyy'), '170');
insert into TURNOVER (DATES, MONEY)
values (to_date('22-08-2017', 'dd-mm-yyyy'), '1170');
insert into TURNOVER (DATES, MONEY)
values (to_date('23-08-2017', 'dd-mm-yyyy'), '1970');
insert into TURNOVER (DATES, MONEY)
values (to_date('24-08-2017', 'dd-mm-yyyy'), '1970');
insert into TURNOVER (DATES, MONEY)
values (to_date('25-08-2017', 'dd-mm-yyyy'), '3970');
insert into TURNOVER (DATES, MONEY)
values (to_date('24-08-2017', 'dd-mm-yyyy'), '3970');
insert into TURNOVER (DATES, MONEY)
values (to_date('25-08-2017', 'dd-mm-yyyy'), '3970');
insert into TURNOVER (DATES, MONEY)
values (to_date('27-08-2017', 'dd-mm-yyyy'), '4970');
insert into TURNOVER (DATES, MONEY)
values (to_date('28-08-2017', 'dd-mm-yyyy'), '5970');
insert into TURNOVER (DATES, MONEY)
values (to_date('29-08-2017', 'dd-mm-yyyy'), '5170');
insert into TURNOVER (DATES, MONEY)
values (to_date('30-08-2017', 'dd-mm-yyyy'), '6170');
insert into TURNOVER (DATES, MONEY)
values (to_date('30-08-2017', 'dd-mm-yyyy'), '6870');
commit;
prompt 68 records loaded
prompt Loading USERS...
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('19', '张小花', '女', '56', '111', '保洁');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('1', '黄雪薇', '女', '50', '111', '经理');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('2', '兰彪', '男', '20', '111', '经理');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('3', '孔令良', '男', '30', '111', '主管');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('4', '乔德拴', '男', '34', '111', '厨师');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('5', '党增城', '男', '42', '111', '帮工');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('6', '向泰稳', '男', '25', '111', '扫地');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('7', '李壮', '男', '14', '111', '洗菜');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('8', '任磊', '男', '45', '111', '端盘');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('9', '刘得生', '男', '42', '111', '切菜');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('10', '张士现', '男', '42', '111', '保安');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('11', '余宙', '男', '55', '111', '保安');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('12', '王大伟', '男', '33', '111', '厨师');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('13', '吕浩', '男', '27', '111', '端盘');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('14', '付超', '男', '53', '111', '厨师');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('15', '张青阳', '男', '47', '111', '采购');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('16', '宋彩', '女', '22', '111', '收银员');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('17', '王云棋', '女', '25', '111', '收银员');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('18', '刘霏雯', '女', '29', '111', '领班');
commit;
prompt 19 records loaded
prompt Enabling triggers for DISHES...
alter table DISHES enable all triggers;
prompt Enabling triggers for LOGIN...
alter table LOGIN enable all triggers;
prompt Enabling triggers for MENU...
alter table MENU enable all triggers;
prompt Enabling triggers for RESERVE...
alter table RESERVE enable all triggers;
prompt Enabling triggers for TURNOVER...
alter table TURNOVER enable all triggers;
prompt Enabling triggers for USERS...
alter table USERS enable all triggers;
set feedback on
set define on
prompt Done.
