package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection connection;
    private Connection connection2;
    @BeforeEach
    void setUp() {
        connection = Connection.getConnection();
        connection2 = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertEquals(connection, connection2);
    }
}