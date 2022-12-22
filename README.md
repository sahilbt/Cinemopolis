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

2. Change into the `src` directory:
```
cd src
```

2. Compile the program:
```
javac -cp ".;./lib/*" UI/HomeScreen.java
```

3. Compile the program:
```
javac -cp ".;./lib/*" UI/HomeScreen.java
```

4. Run the main GUI file to launch the program:
```
java -cp ".;./lib/*" UI/HomeScreen
```

## Check it out here!

### Home Screen
![welcomePage](https://user-images.githubusercontent.com/64620385/209062871-bd195977-6ef7-4253-bfb4-75ab3ff08b80.png)

### Register Screen
![registerPage](https://user-images.githubusercontent.com/64620385/209063552-aa4126f1-f4b8-4317-95ad-d5c96c84f358.png)

### Login Screen
![loginPage](https://user-images.githubusercontent.com/64620385/209063026-9e051fa5-55bf-4343-88bf-21e5ac7a1444.png)

### Cancel Ticket Screen
![cancelPage](https://user-images.githubusercontent.com/64620385/209063059-8c881aa5-9bba-4a4d-8647-eda5e87b2d39.png)

### Guest Dashboard Screen
![guestPage](https://user-images.githubusercontent.com/64620385/209063681-b613d2df-8403-4dda-9f7f-483cf3fecbba.png)

### Registered User Dashboard Screen
![accountPage](https://user-images.githubusercontent.com/64620385/209063121-2b3f2487-43d4-4bee-b9e9-b1e38b7c1154.png)

### Admin Dashboard Screen
![adminPage](https://user-images.githubusercontent.com/64620385/209063184-c3807c3b-58e4-4f1b-ae2f-e18b80b7a953.png)

### Movie Selection Screen
![moviePage](https://user-images.githubusercontent.com/64620385/209063244-fa4c81ab-895e-4fa8-9134-dc2f2325bcda.png)

### Showtime Selection Screen
![showtimePage](https://user-images.githubusercontent.com/64620385/209063794-62070b05-d8fa-443b-b6a9-05750164f89b.png)

### Seat Selection Screen 
![seatPage](https://user-images.githubusercontent.com/64620385/209063285-ca1a3341-4675-45e4-b1b1-3d9e6db3e29a.png)

### Payment Screen
![paymentPage](https://user-images.githubusercontent.com/64620385/209063841-0a16474b-1abb-4aaa-ab59-6d8f48f14afd.png)

