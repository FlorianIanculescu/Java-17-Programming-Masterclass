module com.example.javafxchallenge {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens com.example.javafxchallenge to javafx.fxml;
    exports com.example.javafxchallenge;
}