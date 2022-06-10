import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestJDBC {

    public static void main(String[] args) {
        // TEST CONNECTION TO DATABASE
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","24091995");){
            String schema = connection.getSchema();
            if (schema.equalsIgnoreCase("public")){
                System.out.println("successfully connected to the DB");
            }
            //test data insert in console
             //method 1
                //PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO PASSENGERS(PASSENGER_ID,SURVIVED,GENDER,AGE,PCLASS) VALUES (2,false,'male',22,3)");
                //prepareStatement.execute();
            //method 2
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PASSENGERS(PASSENGER_ID, SURVIVED, GENDER, AGE, PCLASS) VALUES(?, ?,?,?,?)");
            preparedStatement.setInt(1, 3);
            preparedStatement.setBoolean(2, false);
            preparedStatement.setString(3, "male");
            preparedStatement.setInt(4, 50);
            preparedStatement.setInt(5, 3);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}