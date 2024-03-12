module com.example.dobozok2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dobozok2 to javafx.fxml;
    exports com.example.dobozok2;
}