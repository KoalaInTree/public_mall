prompt PL/SQL Developer import file
prompt Created on 2017��8��27�� by CJ
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
values ('NTXMHS', 'Ũ��С�׺���', '128', '4', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CXNNR', '������ţ��', '48', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GGYSS', '�ɹ�Ұɽ��', '48', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JPNLG', '����ţ�߹�', '108', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TXHYTYW', '��ѷ����ͷ����', '68', '2', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('KWYJC', '��ζ�л���', '28', '44', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('DPRHG', '������ƹ�', '22', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MPX', '������', '68', '25', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GTYSY', '��͢ҩ��Ѽ', '68', '12', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MHZHL', '��������', '168', '23', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZPHSM', '���ݻ�����', '16', '0', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SJHZT', 'ˮ������ͷ', '48', '51', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SKHME', 'ˬ�ں�ľ��', '18', '57', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BZSNG', '����ʥŮ��', '28', '0', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZJRHG', 'պ����ƹ�', '18', '23', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LBMD', '����ë��', '22', '0', '͸ζ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFGY', '�ŷ�����', '108', '014', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TJSJY', '�����ռ���', '128', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLS', '˽��������', '188', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TSCGY', '��ɫ������', '138', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YSZSX', '������˫��', '28', '13', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CTYJSS', '�����л�ʱ��', '58', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XCHNR', 'С����ţ��', '48', '12', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFSTY', '˽������ͷ', '78', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TBNZG', '����ţ�й�', '108', '23', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CXXHG', '��оС����', '38', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LHHME', '������ľ��', '28', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QJCTZR', '�ཷ��������', '36', '65', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LSBXR', '«��Ϻ��', '68', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFRY', '�ŷ�����', '68', '5', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TZLDF', '�����϶���', '28', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLNW', '˽������ţ��', '68', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('THXY', '̿������', '48', '65', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('GFYGX', '�ŷ�һ����', '198', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CZNW', '����ţ��', '48', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZBTBSY', '�̲�����ɽҩ', '28', '12', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BYZMPG', '���������Ź�', '288', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JGSDYP', '����ɽ����Ƥ', '32', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('CZSTJ', '����������', '58', '59', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JZGFS', '���빽��˿', '26', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XCHSX', 'С��������', '38', '56', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YSLB', '�����ܲ�', '24', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('DCSJY', '����ռ���', '158', '89', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HNWGDLB', '��ţ�߹����ܲ�', '88', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SFJLZS', '˽����������', '68', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('PGDSR', '�Źǵ�����', '68', '12', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'NTXMHS', '' || chr(9) || 'Ũ��С�׺���', '128', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'CXNNR', '' || chr(9) || '������ţ��', '48', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'GGYSS', '�ɹ�Ұɽ��', '48', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'JPNLG', '����ţ�߹�', '108', '89', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('TXHYTYW' || chr(9) || '', '��ѷ����ͷ����', '68', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'KWYJC', '��ζ�л���', '28', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'DPRHG', '������ƹ�', '' || chr(9) || '22', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MTX', '������', '' || chr(9) || '68', '0', '�����Ȳ�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'WGZL', '' || chr(9) || '�������', '' || chr(9) || '36', '2', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SRZSB', '�������ȱ�', '10', '3', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('LHFGJY', '�����������', '36', '6', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('KWYT', '��ζ��ͷ', '78', '6', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'ZZNGY', '�����Ϲ�Ԫ', '28', '11', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('XRDD', 'Ϻ������', '28', '10', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JYFZR', '���ͷ�����', '48', '7', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SZDPR', '���ݶ�����', '68', '10', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('PGYPX', '���һƷ��', '38', '8', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QZGY', '��������', '108', '5', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QZLY', '��������', '68', '4', '��������');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HTGK', '���ǹ���', '18', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YZCF', '���ݳ���', '16', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('YMDPT', '���׶�Ƭ��', '42', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('SRJTJT', '���׾�������', '35', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HSWZ', '��������', '18', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('JYCF', '' || chr(9) || '���ͳ���', '16', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HDPGT', '�����Ź���', '48', '2', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('ZBYYT', '�̲�������', '22', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QTM', '������', '16', '1', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('MJXTY', '�׾�С��Բ', '22', '0', '��ʳ����');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HTSB', '��������', '38', '0', 'ʱ���߲�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QCXBC', '�峴С�ײ�', '18', '0', 'ʱ���߲�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('QCTJ', '�峴���', '18', '0', 'ʱ���߲�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('' || chr(9) || 'QCOD', '�峴ź��', '28', '0', 'ʱ���߲�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('BZGDCX', '���ƹ㶫��о', '22', '0', 'ʱ���߲�');
insert into DISHES (DISHID, DISHNAME, DISHPRICE, DISHPOP, DISHCLASS)
values ('HGHME', '�ƹϺ�ľ��', '22', '0', 'ʱ���߲�');
commit;
prompt 81 records loaded
prompt Loading LOGIN...
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('1', '��ѩޱ', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('2', '����', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('3', '������', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('4', '�ǵ�˩', '111', '��ʦ');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('5', '������', '111', '�﹤');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('6', '��̩��', '111', 'ɨ��');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('7', '��׳', '111', 'ϴ��');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('8', '����', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('9', '������', '111', '�в�');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('10', '��ʿ��', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('11', '����', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('12', '����ΰ', '111', '��ʦ');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('13', '����', '111', '����');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('14', '����', '111', '��ʦ');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('15', '������', '111', '�ɹ�');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('16', '�β�', '111', '����Ա');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('17', '������', '111', '����Ա');
insert into LOGIN (USERID, USERNAME, USERPASSWORD, USERPOSITION)
values ('18', '������', '111', '���');
commit;
prompt 18 records loaded
prompt Loading MENU...
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('24', '�����Ϲ�Ԫ', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '�������ȱ�', '10', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '��������', '68', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '��������', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���ͷ�����', '48', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '��������', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '�����������', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '��������', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '��������', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '���ݶ�����', '68', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('26', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('28', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('31', '��ζ��ͷ', '78', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '�����Ϲ�Ԫ', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���׶�Ƭ��', '42', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���ǹ���', '18', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���һƷ��', '38', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '���ݶ�����', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '�����Ϲ�Ԫ', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('24', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('222', '���һƷ��', '38', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '�����������', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '���һƷ��', '38', '3');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('27', '��������', '108', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('29', '�����Ϲ�Ԫ', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('30', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('31', '�����Ϲ�Ԫ', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '��ζ��ͷ', '78', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '�̲�������', '22', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '' || chr(9) || '���ͳ���', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '�������ȱ�', '10', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���ݶ�����', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '�����������', '36', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '' || chr(9) || '�������', '36', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '��ζ��ͷ', '78', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', '���ݶ�����', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '�����Ϲ�Ԫ', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '������', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���ݳ���', '16', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '��ζ��ͷ', '78', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('222', '���ݶ�����', '68', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', '���ͷ�����', '48', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('25', 'Ϻ������', '28', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('32', 'Ϻ������', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '���׾�������', '35', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '�����Ź���', '48', '2');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '��������', '18', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('33', '��������', '68', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '�����Ϲ�Ԫ', '28', '1');
insert into MENU (MENUID, DISHNAME, DISHPRICE, DISHNUMBER)
values ('35', '���ͷ�����', '48', '1');
commit;
prompt 51 records loaded
prompt Loading RESERVE...
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('5', '��λ', '����', '��', to_date('22-08-2017 21:20:54', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('13', null, null, null, to_date('22-08-2017 21:42:50', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('11', '��', 'ȥ', '����', to_date('22-08-2017 21:26:48', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('12', '��λ', '����', '��λ', to_date('22-08-2017 21:26:56', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('41', '1', null, null, to_date('22-08-2017 13:49:11', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('35', '33', '22', '22', to_date('26-08-2017 16:30:26', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('36', '1', null, null, to_date('27-08-2017 17:03:28', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('9', '10', '����', '18725632541', to_date('22-08-2017 21:22:38', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('14', '��', '��', '��', to_date('22-08-2017 22:51:51', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('31', '12', '22', '22', to_date('26-08-2017 13:56:04', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('38', '��λ', '��λ', '��λ', to_date('22-08-2017 13:47:06', 'dd-mm-yyyy hh24:mi:ss'));
insert into RESERVE (RESERVENUMBER, DISKID, CUSTNAME, CUSTPHONE, RESERVETIME)
values ('40', '��λ', '��λ', '��λ', to_date('22-08-2017 13:47:11', 'dd-mm-yyyy hh24:mi:ss'));
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
values ('19', '��С��', 'Ů', '56', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('1', '��ѩޱ', 'Ů', '50', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('2', '����', '��', '20', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('3', '������', '��', '30', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('4', '�ǵ�˩', '��', '34', '111', '��ʦ');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('5', '������', '��', '42', '111', '�﹤');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('6', '��̩��', '��', '25', '111', 'ɨ��');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('7', '��׳', '��', '14', '111', 'ϴ��');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('8', '����', '��', '45', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('9', '������', '��', '42', '111', '�в�');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('10', '��ʿ��', '��', '42', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('11', '����', '��', '55', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('12', '����ΰ', '��', '33', '111', '��ʦ');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('13', '����', '��', '27', '111', '����');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('14', '����', '��', '53', '111', '��ʦ');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('15', '������', '��', '47', '111', '�ɹ�');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('16', '�β�', 'Ů', '22', '111', '����Ա');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('17', '������', 'Ů', '25', '111', '����Ա');
insert into USERS (USERID, USERNAME, USERSEX, USERAGE, USERPASSWORD, USERPOSITION)
values ('18', '������', 'Ů', '29', '111', '���');
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
