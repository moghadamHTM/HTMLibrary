package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by moghadam on 3/26/2018.
 */
public class DBConnector {

    private static Connection connection = null;

    public static Connection getConnection()
    {
        if (connection != null)
        {
            return connection;
        }
        else
        {
            try
            {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/gclub", "moghadam",
                        "4321");
            }
            catch (Exception ee)
            {
                System.out.println("Err----");
                ee.printStackTrace();
            }
            return connection;
        }
    }
}
