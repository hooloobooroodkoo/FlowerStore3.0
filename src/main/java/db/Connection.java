package db;

public class Connection {
    private static Connection thisConnection = null;
    private Connection() {
    }
    public static Connection getConnection() {
        if (thisConnection == null) {
            return thisConnection = new Connection();
        }
        return thisConnection;
    }

    public static void main(String[] args) {
        Connection con = Connection.getConnection();
        Connection con2 = Connection.getConnection();
        System.out.println(con);
        System.out.println(con2);

    }
}
