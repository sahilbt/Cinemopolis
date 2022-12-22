# Cinemopolis

## Overview

Cinemopolis is Java desktop application that allows users to browse theaters, movies, showtimes & seats to book tickets for the movie they would like to watch! Our application is also responsible for handling payment once the users select their seats, and their ticket reciept is sent to their email. Cinemopolis allows users to book seats as a regsitered Cinemopolis member, or as a guest. Some of the the perks for a registered user include a full refund on cancelled tickets and the ability to book seats for a particular movie before unregistered users. This application also includes admin features that allow administrators to manage movies, and registered users.

## Technologies

This application was built entirely in Java using Object Oriented Principles in Java. The GUI of this application was built using Java Swing & Java FX. This program also utilizes the singleton and strategy design patterns to manage the registered users, and to determine the appropriate screens to show depending on the user. For the database, MySQL was used to store information about the users, movies, tickets, showtimes, and seats. 

## How to Run the Program

Before attempting to run the program, ensure that MySQL is running with the provided `cinemopolis.sql` file set as the source.

### Option 1

1. Clone the repo into a directory of your choosing:
```
git clone
```
2. Run the provided `Cinemopolis.jar` file:
```
java -jar Cinemopolis.jar
```

### Option 2

1. Clone the repo into a directory of your choosing:
```
git clone
```

2. Compile the program:
```
javac -cp ".;./lib/*" UI/HomeScreen.java
```
3. Run the main GUI file to launch the program:
```
java -cp ".;./lib/*" UI/HomeScreen
```
