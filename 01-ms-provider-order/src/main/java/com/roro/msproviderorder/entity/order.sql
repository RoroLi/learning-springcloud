create table order
(
  order_id int(8) not null ,
  order_money decimal(8,2) not null,
  user_id int(8) not null ,
  create_dt date(yyyymmdd) not null ,
  db_source varchar(20) ,
  primary key(order_id)
)engine=innodb default charset=utf8 auto_increment=1;
INSERT INTO order VALUES (1,1000,1,);
INSERT INTO order VALUES (2,'李四','男');
INSERT INTO order VALUES (3,'王五','男');

    private Integer orderId;

    private BigDecimal orderMoney;

    private Integer userId;

    private Date createDt;

    private String dbSource;