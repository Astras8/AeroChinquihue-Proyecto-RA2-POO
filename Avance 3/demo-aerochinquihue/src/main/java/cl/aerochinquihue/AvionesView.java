package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AvionesView {
    private Stage stage;
    private boolean esEncomienda;

    public AvionesView(Stage stage, boolean esEncomienda) {
        this.stage = stage;
        this.esEncomienda = esEncomienda;
    }

    public void mostrar() {

        Label titulo = new Label("Avión");
        titulo.setStyle("-fx-font-size: 18px;");

        Label subtitulo = new Label("Escoja una opción:");

        // Tipos de aviones
        String[] aviones = {
            "CESSNA 310", 
            "CESSNA 208 CARAVAN", 
            "LET 410 UVP-E20"
        };

        VBox lista = new VBox(10);

        for (String v : aviones) {

            Button btn = new Button(v);
            btn.setPrefWidth(200);

            btn.setOnAction(e -> {

                if (esEncomienda) {
                    System.out.println("Encomienda en avión: " + v);
                } else {
                    System.out.println("Pasaje en avión: " + v);
                }

                // Vista de cada avion
                if (v.equals("CESSNA 310")) {
                    new CESSNA310View(stage).mostrar();
                } 
                else if (v.equals("CESSNA 208 CARAVAN")) {
                      new CESSNA208View(stage).mostrar();
                }
                else if (v.equals("LET 410 UVP-E20")) {
                      new LET410View(stage).mostrar();
                }

            });

            lista.getChildren().add(new HBox(10, btn));
        }

        VBox layout = new VBox(15, titulo, subtitulo, lista);
        layout.setPadding(new Insets(20));

        stage.setScene(new Scene(layout, 700, 600));
    }
}
