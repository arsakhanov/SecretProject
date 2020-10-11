CREATE TABLE cost_tbl(
    id serial primary key not null,
    user_id integer,
    category_id integer,
    summa numeric(15.2),
    comment text,
    cost_dt date
)