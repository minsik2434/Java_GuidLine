package object_creation_destruction.dependency_injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final DatabaseSource databaseSource = new LocalDatabaseSource();

    private DatabaseConnection(){}

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc...", "root", "test");
    }
}
