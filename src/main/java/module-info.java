module com.example.gitdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitdemo1 to javafx.fxml;
    exports com.example.gitdemo1;
}