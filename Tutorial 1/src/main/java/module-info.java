module org.example.testy {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testy to javafx.fxml;
    exports org.example.testy;
}