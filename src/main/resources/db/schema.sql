create table persons
(
    id      bigserial
        primary key,
    age     integer not null,
    name    varchar(255),
    sex     varchar(255),
    surname varchar(255)
);

alter table persons
    owner to pg;

create table if not exists documents
(
    id        bigserial
    primary key,
    number    integer not null,
    type      varchar(255),
    person_id bigint  not null
    constraint fkca5dji06245g2nvcjs9n07x19
    references persons
    );

alter table documents
    owner to pg;



