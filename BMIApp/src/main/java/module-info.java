module com.dht.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.dht.bmiapp to javafx.fxml;
    exports com.dht.bmiapp;
}
