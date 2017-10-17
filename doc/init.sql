/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/8/17 10:43:01                           */
/*==============================================================*/


drop table if exists baseRole.BR_T_FUNCTION;

drop table if exists baseRole.BR_T_LOGIN_INFO;

drop table if exists baseRole.BR_T_ROLE;

drop table if exists baseRole.BR_T_ROLE_FUN;

drop table if exists baseRole.BR_T_USER_INFO;

drop table if exists baseRole.BR_T_USER_ROLE;

drop table if exists baseRole.IP_NEWS;



/*==============================================================*/
/* Table: BR_T_FUNCTION                                         */
/*==============================================================*/
create table baseRole.BR_T_FUNCTION
(
   ID                   int not null auto_increment,
   name                 varchar(64),
   LINK                 varchar(64),
   PARENT_ID            int,
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: BR_T_LOGIN_INFO                                       */
/*==============================================================*/
create table baseRole.BR_T_LOGIN_INFO
(
   ID                   int not null auto_increment,
   USER_ID              int,
   IP                   varchar(30),
   LOGIN_TIME           timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: BR_T_ROLE                                             */
/*==============================================================*/
create table baseRole.BR_T_ROLE
(
   ID                   int not null auto_increment,
   ROLE_NAME            varchar(64),
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: BR_T_ROLE_FUN                                         */
/*==============================================================*/
create table baseRole.BR_T_ROLE_FUN
(
   ID                   int not null auto_increment,
   ROLE_ID              int,
   FUN_ID               int,
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: BR_T_USER_INFO                                        */
/*==============================================================*/
create table baseRole.BR_T_USER_INFO
(
   ID                   int not null auto_increment,
   USER_NAME            varchar(64),
   SYSNAME              varchar(64),
   PWD                  varchar(128),
   MOBILE               varchar(11),
   EMAIL                varchar(128),
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: BR_T_USER_ROLE                                        */
/*==============================================================*/
create table baseRole.BR_T_USER_ROLE
(
   ID                   int not null auto_increment,
   USER_ID              int,
   ROLE_ID              int,
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

/*==============================================================*/
/* Table: IP_NEWS                                               */
/*==============================================================*/
create table baseRole.IP_NEWS
(
   ID                   int not null auto_increment,
   TITLE                varchar(256),
   PIC                  mediumblob,
   content              text,
   visits               integer,
   TYPE                 varchar(2),
   CREAT_ID             int,
   CREAT_TIME           timestamp,
   STATUS               varchar(1) comment '0 无效 1有效',
   MODIFY_ID            int,
   MODIFY_TIME          timestamp,
   primary key (ID)
);

alter table baseRole.IP_NEWS comment '新闻表';

