package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DestinosView {

    private Stage stage;
    private boolean esEncomienda;

    public DestinosView(Stage stage, boolean esEncomienda) {
        this.stage = stage;
        this.esEncomienda = esEncomienda;
    }

    public void mostrar() {

        Label titulo = new Label("Destino");
        titulo.setStyle("-fx-font-size: 18px;");

        Label subtitulo = new Label("Escoja una opción:");

        String[] destinos = {
            "Cochamó", "Puelo Bajo", "Contao", "Rio Negro", "Pupelde", "Chepu",
            "Ayacara", "Pillán", "Reñihue", "Isla Quenac", "Palqui", "Chaitén", "Santa Bárbara"
        };

        VBox lista = new VBox(10);

        for (String d : destinos) {
            Button btn = new Button(d);
            Label info = new Label("Imagen + precio");
            btn.setOnAction(e -> {
            new HorarioView(stage).mostrar();
            });

            HBox fila = new HBox(10, btn, info);

            btn.setOnAction(e -> {
                if (esEncomienda) {
                    System.out.println("Encomienda a " + d);
                } else {
                    System.out.println("Pasaje a " + d);
                }
            });

            lista.getChildren().add(fila);
        }

        VBox layout = new VBox(15, titulo, subtitulo, lista);
        layout.setPadding(new Insets(20));

        stage.setScene(new Scene(layout, 400, 600));
    }
}
