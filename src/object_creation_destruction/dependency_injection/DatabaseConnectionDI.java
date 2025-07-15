package object_creation_destruction.dependency_injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionDI {
    private final DatabaseSource databaseSource;

    public DatabaseConnectionDI(DatabaseSource databaseSource){
        this.databaseSource = databaseSource;
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc...", "root", "test");
    }
}
