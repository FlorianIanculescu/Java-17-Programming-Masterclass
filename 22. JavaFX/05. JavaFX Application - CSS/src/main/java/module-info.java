module com.example.javafxapplicationcss {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.javafxapplicationcss to javafx.fxml;
    exports com.example.javafxapplicationcss;
}