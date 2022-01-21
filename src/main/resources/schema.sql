create table users(
    username varchar(128) primary key not null ,
    password varchar(512) not null ,
    enabled boolean not null
);

create table authorities(
    username varchar(128) not null ,
    authority varchar(128) not null
);