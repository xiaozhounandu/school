create database  if not exists bumen1;

use bumen1;
-- auto-generated definition
create table if not exists bumen5
(
    d_id    int(255) auto_increment primary key,
    d_name  varchar(50)  not null,
    fun     varchar(50)  not null,
    address varchar(255) not null
);

