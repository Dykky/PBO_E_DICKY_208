module com.example.modul_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul_6 to javafx.fxml;
    exports com.example.modul_6;
    exports com.example.modul_6.Action;
    opens com.example.modul_6.Action to javafx.fxml;
    exports com.example.modul_6.Tugas_JAVAFX;
    opens com.example.modul_6.Tugas_JAVAFX to javafx.fxml;
}