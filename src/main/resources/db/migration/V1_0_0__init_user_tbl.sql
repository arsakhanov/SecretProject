CREATE TABLE user_tbl(
    id serial primary key not null,
    username varchar(50),
    login varchar(20),
    password varchar(20),
    email varchar(50)
)