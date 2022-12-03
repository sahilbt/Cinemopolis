package BoundaryDB;
import java.util.ArrayList;
import Entitity.*;
import java.sql.*;
import java.util.*;

public interface Database{

    final String USERNAME = "ensf480";
    final String PASSWORD = "password";
    final String URL = "jdbc:mysql://localhost/cinemopolis";

    public void initializeConnection();

}

