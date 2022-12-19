# Cinemopolis

## Overview

Cinemopolis is Java desktop application that allows users to browse theaters, movies, showtimes & seats to book tickets for the movie they would like to watch! Our application is also responsible for handling payment once the users select their seats, and their ticket reciept is sent to their email. Cinemopolis allows users to book seats as a regsitered Cinemopolis member, or as a guest. Some of the the perks for a registered user include a full refund on cancelled tickets and the ability to book seats for a particular movie before unregistered users. This application also includes admin features that allow administrators to manage movies, and registered users.

## Technologies

This application was built entirely in Java. The GUI of this application was built using Java Swing, while the backend was using Object Oriented Principles in Java. This program also utilizes the singleton and stratgey design patterns to manage the registered users, and to  determine the appropriate screens  to show depending on the user. For the database, MySQL was used to store information about the users, movies, tickets, showtimes, and seats. 

## How to Run the Program

### Option 1

1. Clone the repo into a directory of your choosing:
```
git clone

2. Click the .jar file

### Option 2

1. Clone the repo into a directory of your choosing:
```
git clone

2. Compile the program:
```
javac -cp ".;./lib/*" UI/HomeScreen.java
```
3. Run the main GUI file to launch the program:
```
java -cp ".;./lib/*" UI/HomeScreen
```
