module me.edu.uam.registro {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.edu.uam.registro to javafx.fxml;
    exports me.edu.uam.registro;
}