package FlowerStore;

public class Connection {
    private static Connection connection;

    private Connection() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
