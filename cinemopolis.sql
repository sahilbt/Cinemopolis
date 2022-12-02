DROP DATABASE IF EXISTS cinemopolis;
CREATE DATABASE cinemopolis;
USE cinemopolis;
CREATE USER IF NOT EXISTS 'ensf480'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON cinemopolis.* to 'ensf480'@'localhost';


DROP TABLE IF EXISTS theatres;
CREATE TABLE theatres(
    ID                      int NOT NULL AUTO_INCREMENT,
    Name                    varchar(50) NOT NULL,
    primary key (ID)
);

INSERT INTO theatres (Name) VALUES
("Cosmotheater");


DROP TABLE IF EXISTS movies;
CREATE TABLE movies(
	ID						int NOT NULL AUTO_INCREMENT,
    TheatreID				int NOT NULL,
    Name 					varchar(50) NOT NULL,
    primary key (ID)
    );

INSERT INTO movies (TheatreID, Name) VALUES
(0, "Black Panther 2"), 
(0, "Transformers"), 
(0, "Elf"), 
(0, "Home Alone");
 
 
 DROP TABLE IF EXISTS showtimes;
CREATE TABLE showtimes(
	ID					int NOT NULL AUTO_INCREMENT,
    MovieID				int NOT NULL,
    Time				varchar(50) NOT NULL,
    primary key (ID)
 );
 
 
INSERT INTO showtimes (MovieID, Time) VALUES
(0, "12:00"), 
(0, "15:00"), 
(0, "18:00"), 
(0, "20:00"), 
(1, "12:00"), 
(1, "15:00"), 
(1, "18:00"), 
(1, "20:00"), 
(2, "12:00"), 
(2, "15:00"), 
(2, "18:00"), 
(2, "20:00"), 
(3, "12:00"), 
(3, "15:00"), 
(3, "18:00"), 
(3, "20:00");
 
 
DROP TABLE IF EXISTS seats;
CREATE TABLE seats(
	ID						int NOT NULL AUTO_INCREMENT,
    ShowtimeID				int NOT NULL,
    Vacancy					bool NOT NULL,
    RUser 					bool NOT NULL,
    primary key (ID)
 );
 
INSERT INTO seats (ShowtimeID, Vacancy, RUser) VALUES
(0, true, false), (0, true, false), (0, true, false), (0, true, false), (0, true, false),
(0, true, false), (0, true, false), (0, true, false), (0, true, false), (0, true, false),
(0, true, false), (0, true, false), (0, true, false), (0, true, false), (0, true, false),
(0, true, false), (0, true, false), (0, true, false), (0, true, false), (0, true, false),
(1, true, false), (1, true, false), (1, true, false), (1, true, false), (1, true, false),
(1, true, false), (1, true, false), (1, true, false), (1, true, false), (1, true, false),
(1, true, false), (1, true, false), (1, true, false), (1, true, false), (1, true, false),
(1, true, false), (1, true, false), (1, true, false), (1, true, false), (1, true, false),
(2, true, false), (2, true, false), (2, true, false), (2, true, false), (2, true, false),
(2, true, false), (2, true, false), (2, true, false), (2, true, false), (2, true, false),
(2, true, false), (2, true, false), (2, true, false), (2, true, false), (2, true, false),
(2, true, false), (2, true, false), (2, true, false), (2, true, false), (2, true, false),
(3, true, false), (3, true, false), (3, true, false), (3, true, false), (3, true, false),
(3, true, false), (3, true, false), (3, true, false), (3, true, false), (3, true, false),
(3, true, false), (3, true, false), (3, true, false), (3, true, false), (3, true, false),
(3, true, false), (3, true, false), (3, true, false), (3, true, false), (3, true, false),
(4, true, false), (4, true, false), (4, true, false), (4, true, false), (4, true, false),
(4, true, false), (4, true, false), (4, true, false), (4, true, false), (4, true, false),
(4, true, false), (4, true, false), (4, true, false), (4, true, false), (4, true, false),
(4, true, false), (4, true, false), (4, true, false), (4, true, false), (4, true, false),
(5, true, false), (5, true, false), (5, true, false), (5, true, false), (5, true, false),
(5, true, false), (5, true, false), (5, true, false), (5, true, false), (5, true, false),
(5, true, false), (5, true, false), (5, true, false), (5, true, false), (5, true, false),
(5, true, false), (5, true, false), (5, true, false), (5, true, false), (5, true, false),
(6, true, false), (6, true, false), (6, true, false), (6, true, false), (6, true, false),
(6, true, false), (6, true, false), (6, true, false), (6, true, false), (6, true, false),
(6, true, false), (6, true, false), (6, true, false), (6, true, false), (6, true, false),
(6, true, false), (6, true, false), (6, true, false), (6, true, false), (6, true, false),
(7, true, false), (7, true, false), (7, true, false), (7, true, false), (7, true, false),
(7, true, false), (7, true, false), (7, true, false), (7, true, false), (7, true, false),
(7, true, false), (7, true, false), (7, true, false), (7, true, false), (7, true, false),
(7, true, false), (7, true, false), (7, true, false), (7, true, false), (7, true, false),
(8, true, false), (8, true, false), (8, true, false), (8, true, false), (8, true, false),
(8, true, false), (8, true, false), (8, true, false), (8, true, false), (8, true, false),
(8, true, false), (8, true, false), (8, true, false), (8, true, false), (8, true, false),
(8, true, false), (8, true, false), (8, true, false), (8, true, false), (8, true, false),
(9, true, false), (9, true, false), (9, true, false), (9, true, false), (9, true, false),
(9, true, false), (9, true, false), (9, true, false), (9, true, false), (9, true, false),
(9, true, false), (9, true, false), (9, true, false), (9, true, false), (9, true, false),
(9, true, false), (9, true, false), (9, true, false), (9, true, false), (9, true, false),
(10, true, false), (10, true, false), (10, true, false), (10, true, false), (10, true, false),
(10, true, false), (10, true, false), (10, true, false), (10, true, false), (10, true, false),
(10, true, false), (10, true, false), (10, true, false), (10, true, false), (10, true, false),
(10, true, false), (10, true, false), (10, true, false), (10, true, false), (10, true, false),
(11, true, false), (11, true, false), (11, true, false), (11, true, false), (11, true, false),
(11, true, false), (11, true, false), (11, true, false), (11, true, false), (11, true, false),
(11, true, false), (11, true, false), (11, true, false), (11, true, false), (11, true, false),
(11, true, false), (11, true, false), (11, true, false), (11, true, false), (11, true, false),
(12, true, false), (12, true, false), (12, true, false), (12, true, false), (12, true, false),
(12, true, false), (12, true, false), (12, true, false), (12, true, false), (12, true, false),
(12, true, false), (12, true, false), (12, true, false), (12, true, false), (12, true, false),
(12, true, false), (12, true, false), (12, true, false), (12, true, false), (12, true, false),
(13, true, false), (13, true, false), (13, true, false), (13, true, false), (13, true, false),
(13, true, false), (13, true, false), (13, true, false), (13, true, false), (13, true, false),
(13, true, false), (13, true, false), (13, true, false), (13, true, false), (13, true, false),
(13, true, false), (13, true, false), (13, true, false), (13, true, false), (13, true, false),
(14, true, false), (14, true, false), (14, true, false), (14, true, false), (14, true, false),
(14, true, false), (14, true, false), (14, true, false), (14, true, false), (14, true, false),
(14, true, false), (14, true, false), (14, true, false), (14, true, false), (14, true, false),
(14, true, false), (14, true, false), (14, true, false), (14, true, false), (14, true, false),
(15, true, false), (15, true, false), (15, true, false), (15, true, false), (15, true, false),
(15, true, false), (15, true, false), (15, true, false), (15, true, false), (15, true, false),
(15, true, false), (15, true, false), (15, true, false), (15, true, false), (15, true, false),
(15, true, false), (15, true, false), (15, true, false), (15, true, false), (15, true, false);


DROP TABLE IF EXISTS users;
CREATE TABLE users(
	 Email				varchar(50) NOT NULL,
     Password			varchar(50) NOT NULL,
     Name				varchar(50) NOT NULL,
     CardNum			varchar(50) NOT NULL,
     ExpDate			varchar(50) NOT NULL,
     CVV				varchar(50) NOT NULL,
     CardName			varchar(50) NOT NULL,
     Address			varchar(50) NOT NULL,
     primary key (Email)
);

INSERT INTO users (Email, Password,  Name, CardNum, ExpDate, CVV, CardName, Address) VALUES
("henryoh02@gmail.com", "henry123",  "Henry Oh", "1111222233334444", "12/24", "111", "Henry Oh", "123 Some Street NW"), 
("fredgilchrist151@gmail.com", "Fred Gilchrist", "9999999999999999", "10/25", "121", "Fred Gilchrist", "69 Rowy Way SE"), 
("lmaopoo90023@gmail.com", "LPL Po", "123456789098754", "09/35", "420", "Allen Walker", "480 Whalebananam Crescent");


DROP TABLE IF EXISTS tickets;
CREATE TABLE tickets(
	ID					int NOT NULL AUTO_INCREMENT,
    RUser				bool NOT NULL,
    PurchaseDate		varchar(50) NOT NULL,
    Seats				varchar(50) NOT NULL,
    Movie				varchar(50) NOT NULL,
    Theatre				varchar(50) NOT NULL,
    Showtime			varchar(50) NOT NULL,
    primary key (ID)
);


DROP TABLE IF EXISTS coupons;
CREATE TABLE coupons(
	ID			int NOT NULL AUTO_INCREMENT,
    Value		int NOT NULL,
    primary key (ID)
);




