create database DB_QLNV char set utf8mb4 collate utf8mb4_bin;
use DB_QLNV;

Create table USER(
ID int  auto_increment,
USERNAME varchar(50) not null,
PASSWORD varchar(50) not null,
FULLNAME nvarchar(50) not null,
constraint pk_USER primary key (ID)
);

Create table DEPART(
ID int  auto_increment,
CODE char(100) not null,
NAMEDEPART nvarchar(50) not null,
constraint pk_DEPART primary key (ID)
);

Create table STAFF(
ID int  auto_increment,
CODE char(100) not null,
NAMESTAFF nvarchar(50) not null,
GENDER bit not null,
BIRTHDAY varchar(50)  null,
PHOTO varchar(100) null,
EMAIL varchar(100) not null,
PHONE varchar(100) null,
SALARY float not null,
NOTES nvarchar(100) null,
DEPARTID int not null,
constraint pk_STAFF primary key (ID),
constraint FK_STAFF_DEPART FOREIGN KEY (DEPARTID) REFERENCES DEPART(ID)
);

Create table RECORD(
ID int  auto_increment,
TYPE bit not null,
REASON nvarchar(100) not null,
DATE varchar(50) not null,
STAFFID int not null,
constraint pk_RECORD primary key (ID),
constraint FK_RECORD_STAFF FOREIGN KEY (STAFFID) REFERENCES STAFF(ID)
);

INSERT INTO `DB_QLNV`.`depart` (`CODE`,`NAMEDEPART`) VALUES ('PB001','IT');
INSERT INTO `DB_QLNV`.`depart` (`CODE`,`NAMEDEPART`) VALUES ('PB002','MA');
INSERT INTO `DB_QLNV`.`depart` (`CODE`,`NAMEDEPART`) VALUES ('PB003','MOB');
INSERT INTO `DB_QLNV`.`depart` (`CODE`,`NAMEDEPART`) VALUES ('PB004','AGILE');

INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH001','Hoàng Vân Anh', 0, '28-02-1997','anh1.jpg' ,'anh@fpt.edu.vn', '01684957862', '3000000', '', 1);
INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH002','Nguyễn Minh Trí',1, '28-02-1997','anh2.jpg' ,'tri@fpt.edu.vn', '01684957862', '3000000', '', 2);
INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH003','Nguyễn Phúc Tường', 1, '28-02-1997','anh4.jpg' ,'tuong@fpt.edu.vn', '01684957862', '3000000', '', 3);
INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH004','Nguyễn Văn Đoàn', 1, '28-02-1997','anh2.jpg' ,'doan@fpt.edu.vn', '01684957862', '3000000', '', 4);
INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH005','An Viết Hưng', 1, '28-02-1997','anh4.jpg' ,'hung@fpt.edu.vn', '01684957862', '3000000', '', 1);
INSERT INTO `DB_QLNV`.`staff` (`CODE`,`NAMESTAFF`, `GENDER`, `BIRTHDAY`,`PHOTO`, `EMAIL`, `PHONE`, `SALARY`, `NOTES`, `DEPARTID`) VALUES ('PH006','Trần Mỹ Linh', 0, '28-02-1997','anh3.jpg' ,'linh@fpt.edu.vn', '01684957862', '3000000', '',2);

INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (0,'Chưa làm tốt trong công việc kỷ luật','21-5-2018',1);
INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (1,'Chưa làm tốt trong công việc Khen thuong','21-5-2018',2);
INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (0,'Chưa làm tốt trong công việc kỷ luật','21-5-2018',3);
INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (1,'Chưa làm tốt trong công việc khen thuong','21-5-2018',4);
INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (0,'Chưa làm tốt trong công việc kỷ luật','21-5-2018',5);
INSERT INTO `DB_QLNV`.`record` (`TYPE`,`REASON`,`DATE`,`STAFFID`) VALUES (1,'Chưa làm tốt trong công việc khen thuong','21-5-2018',6);

INSERT INTO `DB_QLNV`.`user` (`USERNAME`,`PASSWORD`,`FULLNAME`) VALUES ('admin','admin','Admin');
