package yungshun.chang.springmvchibernatecrm;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CRMIT {
    @Test
    public void givenMySQLIsRunningThenNoException() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String jdbcUrl = "jdbc:mysql://localhost:3306/spring_mvc_hibernate_crm";
        String user = "yungshun";
        String password = "lucifer317";

        // Run `mvn clean compiler:testCompile failsafe:integration-test`
        Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
        assert(true);
    }
}
