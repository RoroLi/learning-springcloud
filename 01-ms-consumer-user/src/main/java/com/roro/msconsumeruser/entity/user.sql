create table user
(
  user_id int(8) not null ,
  user_name char(15) not null,
  sex varchar(4) not null ,
  primary key(user_id)
)engine=innodb default charset=utf8 auto_increment=1;
INSERT INTO user VALUES (1,'张三','男');
INSERT INTO user VALUES (2,'李四','男');
INSERT INTO user VALUES (3,'王五','男');