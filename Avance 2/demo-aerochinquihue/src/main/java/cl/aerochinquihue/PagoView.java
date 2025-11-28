package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PagoView {

    private Stage stage;

    public PagoView(Stage stage) {
        this.stage = stage;
    }

    public void mostrar() {

        Label titulo = new Label("Pago");
        titulo.setStyle("-fx-font-size: 18px;");

        Label metodoLabel = new Label("Método de pago:");
        Button btnMP1 = new Button("Débito");
        Button btnMP2 = new Button("Crédito");

        Label usuarioLabel = new Label("Datos usuario:");
        TextField txtUsuario = new TextField();
        txtUsuario.setPromptText("Ingrese nombre");
        TextField txtRut = new TextField();
        txtRut.setPromptText("Ingrese rut");

        Label totalLabel = new Label("Total a pagar:");
        TextField txtTotal = new TextField();
        txtTotal.setEditable(false);

        Button btnPagar = new Button("Pagar");

        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(
            titulo,
            metodoLabel, btnMP1, btnMP2,
            usuarioLabel, txtUsuario,
            totalLabel, txtTotal,
            btnPagar
        );

        Scene scene = new Scene(layout, 700, 600);
        stage.setScene(scene);
        stage.show();
    }
}
