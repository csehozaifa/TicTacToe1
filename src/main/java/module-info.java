module com.example.tictactoe1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoe1 to javafx.fxml;
    exports com.example.tictactoe1;
}