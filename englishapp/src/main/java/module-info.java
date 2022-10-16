module com.dht.englishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dht.englishapp to javafx.fxml;
    exports com.dht.englishapp;
}
