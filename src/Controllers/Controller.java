package Controllers;
import java.sql.SQLException;
import BoundaryDB.Database;

public interface Controller {
    /**
	 * Default function used by all controllers to close the SQL connection
	 * 
	 * @param d Database object to be closed
	*/
    default void close(Database d){
        try {
            d.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    };

}