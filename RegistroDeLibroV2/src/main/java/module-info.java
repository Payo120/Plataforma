module me.edu.uam.registrodelibrov2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.edu.uam.registrodelibrov2 to javafx.fxml;
    exports me.edu.uam.registrodelibrov2;
}