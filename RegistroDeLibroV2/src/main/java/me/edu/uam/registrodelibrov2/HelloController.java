package me.edu.uam.registrodelibrov2;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField tituloField;

    @FXML
    private TextField autorField;

    @FXML
    private TextField isbnField;

    @FXML
    private TextField categoriaField;

    @FXML
    private TextField precioField;

    @FXML
    private PasswordField claveField;


    @FXML
    protected void limpiarFormulario() {

        tituloField.clear();
        autorField.clear();
        isbnField.clear();
        categoriaField.clear();
        precioField.clear();
        claveField.clear();

        System.out.println("Formulario limpiado");
    }


    @FXML
    protected void guardarLibro() {

        String titulo = tituloField.getText();
        String autor = autorField.getText();
        String isbn = isbnField.getText();
        String categoria = categoriaField.getText();
        String precio = precioField.getText();
        String clave = claveField.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Libro guardado");
        alert.setHeaderText("Información del libro");

        alert.setContentText(
                "Título: " + titulo +
                        "\nAutor: " + autor +
                        "\nISBN: " + isbn +
                        "\nCategoría: " + categoria +
                        "\nPrecio (USD): " + precio +
                        "\nClave administrativa: " + clave
        );

        alert.showAndWait();
    }
}