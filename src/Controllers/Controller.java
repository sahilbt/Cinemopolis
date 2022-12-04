package Controllers;
import java.sql.SQLException;
import BoundaryDB.Database;

 

public interface Controller {

    default void close(Database d){
        try {
            d.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    };

}