import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties properties = new Properties();

        try {
            properties.load(Files.newInputStream(Path.of("music.properties"), StandardOpenOption.READ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        var dataSource = new MysqlDataSource();
        dataSource.setServerName(properties.getProperty("serverName"));
        dataSource.setPort(Integer.parseInt(properties.getProperty("port")));
        dataSource.setDatabaseName(properties.getProperty("databaseName"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an Artist Id: ");
//        String artistId = scanner.nextLine();
//        int artistid = Integer.parseInt(artistId);

        try {
            dataSource.setMaxRows(10);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT * FROM music.artists LIMIT 10";

//        String query = """
//                WITH RankedRows AS (
//                                    SELECT *,
//                                    ROW_NUMBER() OVER (ORDER BY artist_id) AS row_num
//                                    FROM music.artists
//                                )
//                                SELECT *
//                                    FROM RankedRows
//                                WHERE row_num <= 10""";

        try (var connection = dataSource.getConnection(
                properties.getProperty("user"),
                System.getenv("MYSQL_PASS"));
             Statement statement = connection.createStatement()
        ) {

            ResultSet resultSet = statement.executeQuery(query);

            var meta = resultSet.getMetaData();
//            for (int i = 1; i <= meta.getColumnCount(); i++) {
//                System.out.printf("%d %s %s%n",
//                        i,
//                        meta.getColumnName(i),
//                        meta.getColumnTypeName(i)
//                );
//            }
            System.out.println("==================================================");

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
            }
            System.out.println();

            while (resultSet.next()) {
//                System.out.printf("%d %s %s %n",
//                        resultSet.getInt("track_number"),
//                        resultSet.getString("artist_Name"),
//                        resultSet.getString("song_title"));
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    System.out.printf("%-15s", resultSet.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}