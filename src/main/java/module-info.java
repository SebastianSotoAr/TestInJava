module com.example.tests {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.jdbc;
    requires java.sql;


    opens com.example.tests to javafx.fxml;
    exports com.example.util;
    exports player;
}