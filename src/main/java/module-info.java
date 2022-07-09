module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;

    opens org.example to javafx.fxml;
    exports org.example;
}
