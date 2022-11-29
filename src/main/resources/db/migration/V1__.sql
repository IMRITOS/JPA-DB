CREATE EXTENSION IF NOT EXISTS "193418";
create table if not exists shops
(
    id      int         not null,
    name    varchar(25) not null,
    address varchar(25) not null,
    UNIQUE (id),
    PRIMARY KEY (id)
    );
create table if not exists products
(
    id           int         not null,
    shop_name    varchar(25) not null,
    product_name varchar(25) not null,
    count        int         not null,
    price        int         not null,
    cost         int         not null,
    UNIQUE (id),
    PRIMARY KEY (id)
    );
create table if not exists storages
(
    id           int         not null,
    address      varchar(25) not null,
    product_name varchar(25) not null,
    count        int         not null,
    UNIQUE (id),
    PRIMARY KEY (id)
    );