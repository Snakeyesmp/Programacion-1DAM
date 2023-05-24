drop database if exists futbol;
create database if not exists futbol;
use futbol;

create table Equipos(
id int unique not null auto_increment,
nombre varchar(40),
ciudad varchar(40),
primary key (id));

insert into equipos (nombre, ciudad) values
	("Real Valladolid", "Valladolid"),
    ("FC Barcelona", "Barcelona"),
    ("Real Madrid", "Madrid"),
    ("Atletico de Madrid", "Madrid"),
    ("Real Sociedad", "Socidedad"),
    ("PSG", "Paris");
    
select * from equipos;

delete from equipos where id = 3;

update equipos set nombre = "El valle" where id = 1;

insert into equipos (nombre, ciudad) values ('12343', '1234');