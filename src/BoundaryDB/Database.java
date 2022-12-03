package BoundaryDB;

import java.util.ArrayList;

import Entitity.Data;

public interface Database{

    final String USERNAME = "ensf480";

    final String PASSWORD = "password";

    final String URL = "jdbc:mysql://localhost/cinemopolis";

    public void initializeConnection();
    public ArrayList<Data> dbRecieve(int id);

}

