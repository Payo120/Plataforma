package me.edu.uam.registro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblResultado;

    @FXML
    protected void onMostrarDatosClick() {
        // Obtener el texto de los campos
        String nombre = txtNombre.getText();
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        // Validar que no estén vacíos
        if (nombre.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
            lblResultado.setText("Por favor, complete todos los campos.");
            return;
        }

        // Mostrar los datos en el Label
        lblResultado.setText("Nombre: " + nombre + "\nUsuario: " + usuario);
    }
}

