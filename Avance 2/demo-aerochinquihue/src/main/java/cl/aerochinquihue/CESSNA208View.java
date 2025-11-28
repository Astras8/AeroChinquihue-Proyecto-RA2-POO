package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CESSNA208View {
    private Stage stage;

    public CESSNA208View(Stage stage) {
        this.stage = stage;
    }

    public void mostrar() {

        Label titulo = new Label("CESSNA 208 CARAVAN");
        titulo.setStyle("-fx-font-size: 18px;");

        Label subtitulo = new Label("Escoja un asiento:");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        // Asientos
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        // Coordenadas (columna, fila)
        grid.add(btn1, 0, 0);
        grid.add(btn2, 0, 1);
        grid.add(btn3, 1, 0);
        grid.add(btn4, 1, 1);
        grid.add(btn5, 2, 0);
        grid.add(btn6, 2, 1);
        grid.add(btn7, 3, 0);
        grid.add(btn8, 4, 0);
        grid.add(btn9, 4, 1);

        // Pagar
        btn1.setOnAction(e -> new PagoView(stage).mostrar());
        btn2.setOnAction(e -> new PagoView(stage).mostrar());
        btn3.setOnAction(e -> new PagoView(stage).mostrar());
        btn4.setOnAction(e -> new PagoView(stage).mostrar());
        btn5.setOnAction(e -> new PagoView(stage).mostrar());
        btn6.setOnAction(e -> new PagoView(stage).mostrar());
        btn7.setOnAction(e -> new PagoView(stage).mostrar());
        btn8.setOnAction(e -> new PagoView(stage).mostrar());
        btn9.setOnAction(e -> new PagoView(stage).mostrar());
        

        VBox layout = new VBox(15, titulo, subtitulo, grid);
        layout.setPadding(new Insets(20));

        stage.setScene(new Scene(layout, 400, 300));
    }
}
