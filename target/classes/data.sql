--CREATE TABLE credit_period(id int PRIMARY KEY, gv int, sc int);
--CREATE TABLE balance_sheet(id int PRIMARY KEY, gv int, sc int);
--CREATE TABLE price(id int PRIMARY KEY, show VARCHAR(30), winningDate DATE, creditDate DATE, credited boolean, type VARCHAR(10), amount int);
--CREATE TABLE `show`(`id` int PRIMARY KEY, `name` VARCHAR(30), `active` VARCHAR(10));

insert into credit_period (id, gv, sc ) values (1, 60, 30);
insert into balance_sheet (id, gv, sc ) values (1, 50, 1002); 